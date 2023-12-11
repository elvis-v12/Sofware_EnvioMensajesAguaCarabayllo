package SoftwareMensagge.view.Dao;
import Sofware_EnvioMensajesAguaCarabayll.Controler.UbicacionesCarabayllo;
import Sofware_EnvioMensajesAguaCarabayllo.model.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UbicacionADDAOImpl implements UbicacionADDAO {

    @Override
    public List<UbicacionesCarabayllo> obtenerUbicaciones() {
        List<UbicacionesCarabayllo> ubicaciones = new ArrayList<>();

        String sql = "SELECT * FROM conubicacion";

        try (Connection conexión = new ConexionSQL().getConnection();
             PreparedStatement declaración = conexión.prepareStatement(sql);
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