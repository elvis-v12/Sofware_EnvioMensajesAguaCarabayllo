
package Sofware_EnvioMensajesAguaCarabayll.Controler;

import Sofware_EnvioMensajesAguaCarabayllo.view.Conductor;

/**
 *
 * @author Elvis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conductor().setVisible(true);
            }
        });
    }
    
}
