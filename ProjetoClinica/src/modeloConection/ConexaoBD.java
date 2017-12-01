package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author patricia
 */
public class ConexaoBD 
{
    public Statement stm;//Responsável por realizar a pesquisa no banco de dados
    public ResultSet rs;//Armazenar o resultado dessa pesquisa
    private String driver = "org.postgresql.Driver";//Identifica o nosso serviço de banco de dados
    private String caminho = "jdbc:postgresql://localhost:5433/projetoclinica";//caminho do banco de dados, onde está o local
    private String usuario="postgres";//usuario do banco de dados
    private String senha = "admin";//senha do banco de dados
    public Connection con; //variavel q vai fazer conexão com banco

    public void conexao()//conectar com o banco
    {
        
        try 
        {
            System.setProperty("jdbc.Drivers", driver);//Seta a propriedade do driver  de conexao 
            con = DriverManager.getConnection(caminho,usuario,senha);
   
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o Banco de Dados:\n"+ex.getMessage());
        }  
    }
    
    public void executasql(String sql)
    {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ExecutaSql:\n"+ex.getMessage());
        }
        
    }
    
    
    public void desconecta()//desconecta com o banco
    {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com BD:\n"+ex.getMessage());
        }
    }
}
