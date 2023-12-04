package Sofware_EnvioMensajesAguaCarabayll.Controler;
import java.util.Date;

public class Mensaje {
    private int numero;
    private String usuario;
    private String contenido;
    private Date fechaEnvio;

    public Mensaje(int numero, String usuario, String contenido) {
        this.numero = numero;
        this.usuario = usuario;
        this.contenido = contenido;
        this.fechaEnvio = new Date(); // La fecha de envío se establece al momento de la creación del objeto
    }

    @Override
    public String toString() {
        return String.format("Mensaje #%d - Usuario: %s, Fecha de envío: %s\nContenido: %s",
                             numero, usuario, fechaEnvio, contenido);
    }

    // Puedes agregar getters y setters según sea necesario

    public static void main(String[] args) {
        // Ejemplo de uso
        Mensaje mensaje1 = new Mensaje(1, "Usuario1", "Hola, ¿cómo estás?");
        System.out.println(mensaje1);
    }
}
