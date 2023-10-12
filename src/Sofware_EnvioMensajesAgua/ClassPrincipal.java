package Sofware_EnvioMensajesAgua;

import Sofware_EnvioMensajesAguaCarabayllo.wiew.admi.frmRegistroAdministrador;

/**
 *
 * @author Elvis
 */
public class ClassPrincipal {
    public static void main(String []args){
        java.awt.EventQueue.invokeLater(() -> new frmRegistroAdministrador().setVisible(true));
    }
}
