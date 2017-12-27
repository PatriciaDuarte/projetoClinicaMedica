package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;

/**
 *
 * @author patricia
 */
public class DaoUsuario 
{
 ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new  BeansUsuario();
    
    public void Salvar( BeansUsuario mod)
    {
        conex.conexao();
        try 
        {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios(usu_nome,usu_senha,usu_tipo) values(?,?,?)");
            pst.setString(1,mod.getUsuNome());
            pst.setString(2,mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario inserido com Sucesso!!");
        } catch (SQLException ex)
        {
          Logger.getLogger(DaoMedico.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, "Erro ao inserir usuário!\n Erro:"+ex);
        }
        conex.desconecta();
    }
    
    public BeansUsuario buscaUsuario(BeansUsuario mod)
    {
        conex.conexao();
        conex.executasql("select *from usuarios where usu_nome like'%"+ mod.getUsuPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("usu_codigo"));
            mod.setUsuNome(conex.rs.getString("usu_nome"));
            mod.setUsuTipo(conex.rs.getString("usu_tipo"));
            mod.setUsuSenha(conex.rs.getString("usu_senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Usuário não cadastrado!");
         }
        
        conex.desconecta();
        return mod;
    }
    
        public void Alterar(BeansUsuario mod)
    {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set usu_nome=?,usu_senha=?,usu_tipo=? where usu_codigo=?");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.setInt(4, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso.");
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro na alteração do usuario.\n Erro:"+ex);
        }
        
        conex.desconecta();
    }
        
            public void Excluir(BeansUsuario mod)
    {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where usu_codigo=?");
            pst.setInt(1, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuario excluido com sucesso." );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário.\n Erro:"+ex);
        }
        
        conex.desconecta();
    }
}
