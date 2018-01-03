package modeloBeans;

import java.util.Date;

public class BeansAgenda 
{
    private int agendaCod;
    private String nomeMed;
    private String nomePac;
    private String turno;
    private Date data;
    private String status;
    private String motivo;

    /**
     * @return the agendaCod
     */
    public int getAgendaCod() {
        return agendaCod;
    }

    /**
     * @param agendaCod the agendaCod to set
     */
    public void setAgendaCod(int agendaCod) {
        this.agendaCod = agendaCod;
    }

    /**
     * @return the nomeMed
     */
    public String getNomeMed() {
        return nomeMed;
    }

    /**
     * @param nomeMed the nomeMed to set
     */
    public void setNomeMed(String nomeMed) {
        this.nomeMed = nomeMed;
    }

    /**
     * @return the nomePac
     */
    public String getNomePac() {
        return nomePac;
    }

    /**
     * @param nomePac the nomePac to set
     */
    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}
