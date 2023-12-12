
package Sofware_EnvioMensajesAguaCarabayll.Controler;


public class Horario {
    private String dia;
    private String hora;
    private String mes;
    private String año;

    public Horario(String dia, String hora, String mes, String año) {
        this.dia = dia;
        this.hora = hora;
        this.mes = mes;
        this.año = año;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

   public Object[] RegistroHorarios(int numeracion){
        Object[] fila = {numeracion,dia,hora,mes,año};
        return fila;
    }
}
  

