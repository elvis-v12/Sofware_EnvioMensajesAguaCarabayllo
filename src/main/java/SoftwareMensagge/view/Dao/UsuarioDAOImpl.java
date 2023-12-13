package SoftwareMensagge.view.Dao;
import Sofware_EnvioMensajesAguaCarabayll.Controler.Administrador;
import Sofware_EnvioMensajesAguaCarabayll.Controler.Ubicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO {

    private Connection conexion;

    // Constructor que recibe la conexión
    public UsuarioDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean insertarUsuario(Administrador usuario) {
        String consultaSQL = "INSERT INTO registroadmi (correo, contraseña) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL)) {
            preparedStatement.setString(1, usuario.getCorreo());
            preparedStatement.setString(2, usuario.getContrasena());

            int filasAfectadas = preparedStatement.executeUpdate();

            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean autenticarUsuario(String correo, String contraseña) {
        String consultaSQL = "SELECT * FROM registroadmi WHERE correo = ? AND contraseña = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL)) {
            preparedStatement.setString(1, correo);
            preparedStatement.setString(2, contraseña);

            try (ResultSet resultado = preparedStatement.executeQuery()) {
                return resultado.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}