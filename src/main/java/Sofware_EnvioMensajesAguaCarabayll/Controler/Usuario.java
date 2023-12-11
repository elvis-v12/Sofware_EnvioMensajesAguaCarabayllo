
package Sofware_EnvioMensajesAguaCarabayll.Controler;

/**
 *
 * @author Elvis
 */
public class Usuario extends Persona {
    private String telefono;
    private String condicion;
   private String codigo_Usuario;

    public Usuario(String telefono, String condicion, String codigo_Usuario, String Nombre, String apellido, String dni) {
        super(Nombre, apellido, dni);
        this.telefono = telefono;
        this.condicion = condicion;
        this.codigo_Usuario = codigo_Usuario;
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

    public String getCodigo_Usuario() {
        return codigo_Usuario;
    }

    public void setCodigo_Usuario(String codigo_Usuario) {
        this.codigo_Usuario = codigo_Usuario;
    }

}