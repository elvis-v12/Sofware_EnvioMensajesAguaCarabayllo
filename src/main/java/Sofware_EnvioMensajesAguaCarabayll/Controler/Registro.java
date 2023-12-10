
package Sofware_EnvioMensajesAguaCarabayll.Controler;

/**
 *
 * @author Elvis
 */
public class Registro {
    private String nombre ;
   private String apellido;
  private  String telefono ;
    private String condicion;
   private String dni;

    public Registro(String nombre, String apellido, String telefono, String condicion, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.condicion = condicion;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
   
}
