
package Sofware_EnvioMensajesAguaCarabayll.Controler;


public class Horario {
<<<<<<< HEAD
=======
  
>>>>>>> 1c22aefb01ac57a0eed258cefd8c430a92f0db4d
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

<<<<<<< HEAD
=======
    // Métodos para acceder a los atributos

>>>>>>> 1c22aefb01ac57a0eed258cefd8c430a92f0db4d
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
<<<<<<< HEAD
    
=======
   public Object[] RegistroHorarios(int numeracion){
        Object[] fila = {numeracion,dia,hora,mes,año};
        return fila;
    }


>>>>>>> 1c22aefb01ac57a0eed258cefd8c430a92f0db4d
}
  

