package Sofware_EnvioMensajesAguaCarabayll.Controler;
public class Administrador {

    private String correo;
    private String contrasena;

    public Administrador(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Métodos de acceso (getters y setters)
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}