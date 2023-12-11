package SoftwareMensagge.view.Dao;

import Sofware_EnvioMensajesAguaCarabayll.Controler.Usuario;
import Sofware_EnvioMensajesAguaCarabayllo.model.ConexionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroDAOImpl implements RegistroDAO {

    @Override
    public void insertarUsuario(Usuario usuario) {
        String sql = "INSERT INTO registro_entrega (nombre, apellido, telefono, dni, condicion, cod_user) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexión = new ConexionSQL().getConnection();
             PreparedStatement declaración = conexión.prepareStatement(sql)) {

            declaración.setString(1, usuario.getNombre());
            declaración.setString(2, usuario.getApellido());
            declaración.setString(3, usuario.getTelefono());
            declaración.setString(4, usuario.getDni());
            declaración.setString(5, usuario.getCondicion());
            declaración.setString(6, usuario.getCodigo_Usuario());

            int filasAfectadas = declaración.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Datos insertados correctamente en la base de datos.");
            } else {
                System.out.println("Error al insertar datos en la base de datos. No se insertaron filas.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar datos en la base de datos: " + e.getMessage());
        }
    }
}
