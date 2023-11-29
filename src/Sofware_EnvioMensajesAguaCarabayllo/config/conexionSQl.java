
package Sofware_EnvioMensajesAguaCarabayllo.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexionSQl {
     private String url = "jdbc:mysql://localhost:3306/enviomensaje";
private String usuario = "root";
private String contraseña = "";
    private Connection conexion = null;
    
    public conexionSQl(){
        try {
            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // No cierres la conexión aquí
            } else {
                System.err.println("La conexión a la base de datos ha fallado.");
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
        
    }
    public Connection getConnection() {
        return conexion;
    }
    public static void main(String[] args) {
    // Crear una instancia de la clase conexionSQl
    conexionSQl conexionSQL = new conexionSQl();

    // Obtener la conexión
    Connection conexion = conexionSQL.getConnection();

    // Verificar si la conexión es nula o no
    if (conexion != null) {
        // Aquí puedes realizar operaciones con la conexión a la base de datos
        // Por ejemplo, ejecutar consultas SQL, insertar datos, etc.

        // No olvides cerrar la conexión cuando hayas terminado
        try {
            conexion.close();
            System.out.println("Conexión cerrada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    } else {
        System.err.println("La conexión a la base de datos no se estableció correctamente.");
    }
}
}