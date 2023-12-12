package SoftwareMensagge.view.Dao;

import Sofware_EnvioMensajesAguaCarabayll.Controler.ConductorR;
import java.util.List;

public interface ConductorDAO {
    boolean insertarConductor(ConductorR conductor);
    List<ConductorR> obtenerConductores();
}
