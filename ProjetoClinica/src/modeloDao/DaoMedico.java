/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;

/**
 *
 * @author patricia
 */
public class DaoMedico 
{
    ConexaoBD conex = new ConexaoBD();
    BeansMedico mod = new BeansMedico();
    
    public void Salvar(BeansMedico mod)
    {
        conex.conexao();
        try 
        {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicos(nome_medico,especialidade_medico,crm_medico) values(?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEspecialidade());
            pst.setInt(3, mod.getCrm());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!!");
        } catch (SQLException ex)
        {
          Logger.getLogger(DaoMedico.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, "Erro ao inserir dados!!\n Erro:"+ex);
        }
        conex.desconecta();
    }
    
    public void Editar(BeansMedico mod)
    {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update medicos set nome_medico=?,especialidade_medico=?,crm_medico=? where cod_medico=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecialidade());
            pst.setInt(3, mod.getCrm());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso.");
            
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro na alteração dos dados.\n Erro:"+ex);
        }
        
        conex.desconecta();
    }
    
    public void Excluir(BeansMedico mod)
    {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from medicos where cod_medico=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso." );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados.\n Erro:"+ex);
        }
        
        conex.desconecta();
    }
    
    public BeansMedico buscaMedico(BeansMedico mod)
    {
        conex.conexao();
        conex.executasql("select *from medicos where nome_medico like'%"+ mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_medico"));
            mod.setNome(conex.rs.getString("nome_medico"));
            mod.setEspecialidade(conex.rs.getString("especialidade_medico"));
            mod.setCrm(conex.rs.getInt("crm_medico"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Médico não cadastrado!");
         }
        
        conex.desconecta();
        return mod;
    }
    
}
