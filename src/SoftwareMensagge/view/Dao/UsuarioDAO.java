package SoftwareMensagge.view.Dao;

import Sofware_EnvioMensajesAguaCarabayll.Controler.Administrador;
import java.util.List;
public interface UsuarioDAO {
    boolean insertarUsuario(Administrador usuario);
    boolean autenticarUsuario(String correo, String contraseña);
    // Puedes agregar más métodos según tus necesidades, como obtener todos los usuarios, actualizar usuarios, etc.
}
