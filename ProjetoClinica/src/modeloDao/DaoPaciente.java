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
            JOptionPane.showMessageDialog(null,"Paciente salvo com sucesso");
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao salvar paciente."+ex);
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
    
}
