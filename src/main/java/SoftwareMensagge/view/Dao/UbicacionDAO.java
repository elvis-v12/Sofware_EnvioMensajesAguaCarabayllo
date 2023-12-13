package SoftwareMensagge.view.Dao;

import Sofware_EnvioMensajesAguaCarabayll.Controler.Ubicacion;
import java.util.List;

public interface UbicacionDAO {
    boolean insertarUbicacion(Ubicacion ubicacion);
    List<Ubicacion> obtenerUbicaciones();
    // Otros métodos para manejar ubicaciones...
}