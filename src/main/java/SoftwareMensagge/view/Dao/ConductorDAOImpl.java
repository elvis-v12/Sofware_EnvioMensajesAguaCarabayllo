package SoftwareMensagge.view.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Sofware_EnvioMensajesAguaCarabayll.Controler.ConductorR;


// Implementación del DAO que utiliza la interfaz
public class ConductorDAOImpl implements ConductorDAO {

    private Connection conexion;

    // Constructor que recibe la conexión
    public ConductorDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean insertarConductor(ConductorR conductor) {
       String sql = "INSERT INTO conductor (edad, numero_licencia, nombre, apellido, dni) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement declaración =  conexion.prepareStatement(sql)) {
            declaración.setInt(1, conductor.getEdad());
            declaración.setString(2, conductor.getNumero_licencia());
            declaración.setString(3, conductor.getNombre());
            declaración.setString(4, conductor.getApellido());
            declaración.setString(5, conductor.getDni());

            int filasAfectadas = declaración.executeUpdate();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

 @Override
public List<ConductorR> obtenerConductores() {
    List<ConductorR> conductores = new ArrayList<>();
    String sql = "SELECT * FROM conductor";

    try (PreparedStatement declaración = conexion.prepareStatement(sql);
         ResultSet resultados = declaración.executeQuery()) {

        while (resultados.next()) {
            int edad = resultados.getInt("edad");
            String numero_licencia = resultados.getString("numero_licencia");
            String nombre = resultados.getString("nombre");
            String apellido = resultados.getString("apellido");
            String dni = resultados.getString("dni");

            ConductorR conductor = new ConductorR(edad, numero_licencia, nombre, apellido, dni);
            conductores.add(conductor);
        }

    } catch (SQLException e) {
        throw new RuntimeException("Error al obtener conductores", e);
    }

    return conductores;
}

}
