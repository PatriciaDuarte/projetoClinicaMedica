package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansPaciente;
import modeloConection.ConexaoBD;

/**
 *
 * @author patricia
 */
public class DaoPaciente 
{
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexBairro = new ConexaoBD();
    String nomeBairro;
    int codBai;
    
    public void Alterar(BeansPaciente pac)
    {
        buscaBaiCod(pac.getNomeBairro());
        //Abrindo a conexão
        conex.conexao();
        try {
            //Fazer um insert
            PreparedStatement pst = conex.con.prepareStatement("update pacientes set paci_nome=?,paci_rg=?,paci_telefone=?,paci_rua=?,paci_cep=?,paci_complemento=?,paci_baicodigo=?,paci_nasc=? where paci_codigo=?");//Passando as colunas e parametros
            pst.setString(1, pac.getNomePac());
            pst.setString(2, pac.getRg());
            pst.setString(3, pac.getTelefone());
            pst.setString(4, pac.getRua());
            pst.setString(5, pac.getCep());
            pst.setString(6, pac.getComplemento());
            pst.setInt(7, codBai);
            pst.setString(8, pac.getNasc());
            pst.setInt(9, pac.getCodPac());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Paciente alterado com sucesso");
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao alterar paciente."+ex);
        }
        conex.desconecta();
    }
    
    
    public void Salvar(BeansPaciente pac)
    {
        buscaBaiCod(pac.getNomeBairro());
        //Abrindo a conexão
        conex.conexao();
        try {
            //Fazer um insert
            PreparedStatement pst = conex.con.prepareStatement("insert into pacientes(paci_nome,paci_rg,paci_telefone,paci_rua,paci_cep,paci_complemento,paci_baicodigo,paci_nasc) values (?,?,?,?,?,?,?,?)");//Passando as colunas e parametros
            pst.setString(1, pac.getNomePac());
            pst.setString(2, pac.getRg());
            pst.setString(3, pac.getTelefone());
            pst.setString(4, pac.getRua());
            pst.setString(5, pac.getCep());
            pst.setString(6, pac.getComplemento());
            pst.setInt(7, codBai);
            pst.setString(8, pac.getNasc());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cliente salvo com sucesso");
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao salvar cliente."+ex);
        }
        conex.desconecta();
    }
    
    public void buscaBaiCod(String nome)
    {
        conex.conexao();
        conex.executasql("select *from bairro where bainome = '"+nome+"'");
        try 
        {
            conex.rs.first();
            codBai = conex.rs.getInt("baicodigo");
            
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Erro ao buscar bairro"+ex);
        }
        conex.desconecta();
            
    }
    
    public BeansPaciente buscaPaciente(BeansPaciente pac)
    {
        conex.conexao();
        try 
        {
            conex.executasql("select *from pacientes where paci_nome like '%"+pac.getPesquisar()+"%'");
            conex.rs.first();
            buscaNomeBairro(conex.rs.getInt("paci_baicodigo"));
            pac.setNomePac(conex.rs.getString("paci_nome"));
            pac.setCep(conex.rs.getString("paci_cep"));
            pac.setCodPac(conex.rs.getInt("paci_codigo"));
            pac.setComplemento(conex.rs.getString("paci_complemento"));
            pac.setNasc(conex.rs.getString("paci_nasc"));
            pac.setRg(conex.rs.getString("paci_rg"));
            pac.setTelefone(conex.rs.getString("paci_telefone"));
            pac.setRua(conex.rs.getString("paci_rua"));
            pac.setNomeBairro(nomeBairro);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado!");//Mensagem original: Erro ao buscar cliente!
        }
        
        conex.desconecta();
        return pac;
    }
    
    public void buscaNomeBairro(int cod)
    {
        conexBairro.conexao();
        try
        {
            conexBairro.executasql("select *from bairro where baicodigo="+cod);
            conexBairro.rs.first();
            nomeBairro = conexBairro.rs.getString("bainome");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome bairro"+ex);
        }
        
        conexBairro.desconecta();       
    }
    
    public void Excluir(BeansPaciente pac)
    {
        conex.conexao();
        try 
        {
            PreparedStatement pst = conex.con.prepareStatement("delete from pacientes where paci_codigo=? ");
            pst.setInt(1, pac.getCodPac());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cliente excluído com sucesso!");//Paciente salvo com sucesso

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir Cliente."+ex);
        }
        
        conex.desconecta();
        
    }
    
}
