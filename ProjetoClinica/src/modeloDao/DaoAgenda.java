package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansAgenda;
import modeloConection.ConexaoBD;

/**
 *
 * @author patricia
 */
public class DaoAgenda 
{
    BeansAgenda agenda = new BeansAgenda();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexPaciente = new  ConexaoBD();//abrindo conexao p buscar o codigo do paciente
    ConexaoBD conexMedico = new ConexaoBD();
    
    //Armazena os codigos
    int codMed;
    int codPac;
    
    public void Salvar(BeansAgenda agenda)
    {
        BuscaMedico(agenda.getNomeMed());
        BuscaPaciente(agenda.getNomePac());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into agenda (agenda_codpac, agenda_codmedico, agenda_motivo, agenda_turno, agenda_data, agenda_status) values (?,?,?,?,?,?)");
            pst.setInt(1, codPac);
            pst.setInt(2, codMed);
            pst.setString(3, agenda.getMotivo());
            pst.setString(4, agenda.getTurno());
            pst.setDate(5, new java.sql.Date(agenda.getData().getTime()));
            pst.setString(6, agenda.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Agendamento marcado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar agendamento!"+ex);
        }
        conex.desconecta();
    }
    
    public void BuscaMedico(String nomeMedico)
    {
        conexMedico.conexao();
        conexMedico.executasql("select *from medicos where nome_medico='"+nomeMedico+"'");
        try {
            conexMedico.rs.first();
            codMed = conexMedico.rs.getInt("cod_medico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Médico não encontrado.");
        }
 
        conexMedico.desconecta();
        
    }
    
    public int BuscaCodMedico(String nomeMedico)
    {
        conexMedico.conexao();
        conexMedico.executasql("select *from medicos where nome_medico='"+nomeMedico+"'");
        try {
            conexMedico.rs.first();
            codMed = conexMedico.rs.getInt("cod_medico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Médico não encontrado.");
        }
 
        return codMed;
        
    }
    
    public void BuscaPaciente(String nomePaciente)
    {
        conexPaciente.conexao();
        conexPaciente.executasql("select *from pacientes where paci_nome='"+nomePaciente+"'");
        try {
            conexPaciente.rs.first();
            codPac = conexPaciente.rs.getInt("paci_codigo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Paciente não encontrado.");
        }
 
        conexPaciente.desconecta();
    }
    public void Alterar(BeansAgenda agenda)
    {
        conex.conexao();
        try {
            //Fazer um insert
            PreparedStatement pst = conex.con.prepareStatement("update agenda set agenda_status=? where agenda_cod=?");//Passando as colunas e parametros
            pst.setString(1, agenda.getStatus());
            pst.setInt(2, agenda.getAgendaCod());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Agendamento em atendimento");
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao atender agendamento."+ex);
        }
        conex.desconecta();
    }
    
    
}
