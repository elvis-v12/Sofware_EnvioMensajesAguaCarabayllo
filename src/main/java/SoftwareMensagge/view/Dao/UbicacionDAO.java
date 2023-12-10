package SoftwareMensagge.view.Dao;

import Sofware_EnvioMensajesAguaCarabayll.Controler.UbicacionesCarabayllo;
import java.util.List;

public interface UbicacionDAO {
    boolean insertarUbicacion(UbicacionesCarabayllo ubicacion);
    List<UbicacionesCarabayllo> obtenerUbicaciones();
    // Otros métodos para manejar ubicaciones...
}