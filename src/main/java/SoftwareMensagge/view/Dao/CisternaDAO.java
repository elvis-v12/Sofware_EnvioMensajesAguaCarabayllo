package SoftwareMensagge.view.Dao;
import Sofware_EnvioMensajesAguaCarabayll.Controler.Cisterna;
import java.util.List;

public interface CisternaDAO {
    boolean insertarCisterna(Cisterna cisterna);
    List<Cisterna> obtenerCisternas();
    // Puedes agregar más métodos según tus necesidades (actualizar, eliminar, etc.)
}
