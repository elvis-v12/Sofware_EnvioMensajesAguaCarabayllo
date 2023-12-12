
package Sofware_EnvioMensajesAguaCarabayll.Controler;


public class Persona {
    private String Nombre;
    private String apellido;
    private String dni;

    public Persona(String Nombre, String apellido, String dni) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
