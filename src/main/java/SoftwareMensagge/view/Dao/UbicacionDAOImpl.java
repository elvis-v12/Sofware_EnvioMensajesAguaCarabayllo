package SoftwareMensagge.view.Dao;
import SoftwareMensagge.view.Dao.UbicacionDAO;
import Sofware_EnvioMensajesAguaCarabayll.Controler.UbicacionesCarabayllo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class UbicacionDAOImpl implements UbicacionDAO {

    private Connection conexion;

    // Constructor que recibe la conexión
    public UbicacionDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean insertarUbicacion(UbicacionesCarabayllo ubicacion) {
        // Consulta SQL de inserción
        String sql = "INSERT INTO ubicaciones (distrito, lote, manzana, etapa) VALUES (?, ?, ?, ?)";
        try (PreparedStatement declaración = conexion.prepareStatement(sql)) {
            // Establecer los valores de los parámetros en la consulta
            declaración.setString(1, ubicacion.getDistrito());
            declaración.setString(2, ubicacion.getLote());
            declaración.setString(3, ubicacion.getManzana());
            declaración.setString(4, ubicacion.getEtapa());

            // Ejecutar la consulta de inserción
            int filasAfectadas = declaración.executeUpdate();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            // Manejar la excepción o propagarla para que el código cliente la maneje
            e.printStackTrace();
            return false;
        }
    }

  
    public DefaultTableModel obtenerUbicacionesTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Distrito");
        model.addColumn("Lote");
        model.addColumn("Manzana");
        model.addColumn("Etapa");

        String sql = "SELECT * FROM ubicaciones";

        try (PreparedStatement statement = conexion.prepareStatement(sql);
             ResultSet results = statement.executeQuery()) {

            while (results.next()) {
                String distrito = results.getString("distrito");
                String lote = results.getString("lote");
                String manzana = results.getString("manzana");
                String etapa = results.getString("etapa");

                model.addRow(new Object[]{distrito, lote, manzana, etapa});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return model;
    }

    // Implementación del método obtenerUbicaciones
    @Override
    public List<UbicacionesCarabayllo> obtenerUbicaciones() {
        List<UbicacionesCarabayllo> ubicaciones = new ArrayList<>();
        String sql = "SELECT * FROM ubicaciones";

        try (PreparedStatement declaración = conexion.prepareStatement(sql);
             ResultSet resultados = declaración.executeQuery()) {

            while (resultados.next()) {
                String distrito = resultados.getString("distrito");
                String lote = resultados.getString("lote");
                String manzana = resultados.getString("manzana");
                String etapa = resultados.getString("etapa");

                UbicacionesCarabayllo ubicacion = new UbicacionesCarabayllo(distrito, lote, manzana, etapa);
                ubicaciones.add(ubicacion);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ubicaciones;
    }
}