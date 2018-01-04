package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansAuxiliar;

public class DaoAuxiliar 
{
    ConexaoBD conex = new ConexaoBD();
    BeansAuxiliar mod = new BeansAuxiliar();
    
    public void Salvar(BeansAuxiliar mod)
    {
        conex.conexao();
        try 
        {
            PreparedStatement pst = conex.con.prepareStatement("insert into auxiliares(nome_auxiliar,idade_auxiliar,cnh_auxiliar) values(?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setInt(2,mod.getIdade());
            pst.setString(3, mod.getCnh());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!!");
        } catch (SQLException ex)
        {
          Logger.getLogger(DaoAuxiliar.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, "Erro ao inserir dados!!\n Erro:"+ex);
        }
        conex.desconecta();
    }
    
    public void Editar(BeansAuxiliar mod)
    {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update auxiliares set nome_auxiliar=?,idade_auxiliar=?,cnh_auxiliar=? where cod_auxiliar=?");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getIdade());
            pst.setString(3, mod.getCnh());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso.");
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro na alteração dos dados.\n Erro:"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Excluir(BeansAuxiliar mod)
    {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from auxiliares where cod_auxiliar=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso." );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados.\n Erro:"+ex);
        }
        
        conex.desconecta();
    }
    
    public BeansAuxiliar buscaAuxiliar(BeansAuxiliar mod)//Chamava buscaMedico
    {
        conex.conexao();
        conex.executasql("select *from auxiliares where nome_auxiliar like'%"+ mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_auxiliar"));
            mod.setNome(conex.rs.getString("nome_auxiliar"));
            mod.setIdade(conex.rs.getInt("idade_auxiliar"));
            mod.setCnh(conex.rs.getString("cnh_auxiliar"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Auxiliar veterinário não cadastrado!");
         }
        
        conex.desconecta();
        return mod;
    }
    
    
}
