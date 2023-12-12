package Sofware_EnvioMensajesAguaCarabayllo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL implements AutoCloseable {
    private String url = "jdbc:mysql://localhost:3306/enviomensaje";
    private String usuario = "root";
    private String contraseña = "";
    private Connection conexion = null;

    public ConexionSQL() {
        try {
            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.err.println("La conexión a la base de datos ha fallado.");
            }
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
            // Podrías lanzar una excepción aquí si lo prefieres
        }
    }

    public Connection getConnection() {
        return conexion;
    }

    @Override
    public void close() throws SQLException {
        cerrarConexion();
    }

    public void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Usar try-with-resources para asegurar que la conexión se cierre automáticamente
        try (ConexionSQL conexionSQL = new ConexionSQL()) {
            // Obtener la conexión
            Connection conexion = conexionSQL.getConnection();

            // Verificar si la conexión es nula o no
            if (conexion != null) {
                // Aquí puedes realizar operaciones con la conexión a la base de datos
                // Por ejemplo, ejecutar consultas SQL, insertar datos, etc.
            } else {
                System.err.println("La conexión a la base de datos no se estableció correctamente.");
            }
        } catch (SQLException e) {
            // Manejar la excepción, por ejemplo, imprimir el mensaje de error
            System.err.println("Error: " + e.getMessage());
        }
    }
}
