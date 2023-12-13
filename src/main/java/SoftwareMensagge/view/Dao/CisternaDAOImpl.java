package SoftwareMensagge.view.Dao;
import Sofware_EnvioMensajesAguaCarabayll.Controler.Cisterna;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CisternaDAOImpl implements CisternaDAO {

    private Connection conexion;

    // Constructor que recibe la conexión
    public CisternaDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }
    @Override
    public boolean insertarCisterna(Cisterna cisterna) {
        String sql = "INSERT INTO cisterna (placa, capacidad, grifos) VALUES (?, ?, ?)";
        try (PreparedStatement declaración = conexion.prepareStatement(sql)) {
            declaración.setString(1, cisterna.getPlaca());
            declaración.setDouble(2, cisterna.getCapacidad());
            declaración.setInt(3, cisterna.getGrifos());

            int filasAfectadas = declaración.executeUpdate();

            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Cisterna> obtenerCisternas() {
        List<Cisterna> cisternas = new ArrayList<>();
        String sql = "SELECT * FROM cisterna";

        try (PreparedStatement declaración = conexion.prepareStatement(sql);
             ResultSet resultados = declaración.executeQuery()) {

            while (resultados.next()) {
                String placa = resultados.getString("placa");
                double capacidad = resultados.getDouble("capacidad");
                int grifos = resultados.getInt("grifos");

                Cisterna cisterna = new Cisterna(placa, capacidad, grifos);
                cisternas.add(cisterna);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cisternas;
    }
}
