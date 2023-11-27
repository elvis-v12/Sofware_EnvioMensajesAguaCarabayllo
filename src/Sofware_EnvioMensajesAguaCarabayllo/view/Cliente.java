
package Sofware_EnvioMensajesAguaCarabayllo.view;

/**
 *
 * @author JANNET
 */
public class Cliente extends javax.swing.JFrame {

 
    public Cliente() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPrincipal = new javax.swing.JPanel();
        Cabecera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ImagenSisterna = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cabecera.setBackground(new java.awt.Color(201, 50, 0));
        Cabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONFIRMACION DE MENSAJE");
        Cabecera.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 30));

        FondoPrincipal.add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 60));

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenSisterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sourse/284-F5-1300 (1).jpg"))); // NOI18N
        jPanel1.add(ImagenSisterna, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, 140));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Recibido");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 160, 40));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 290, 130));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mensaje Emitido: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 220, 30));

        FondoPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 660, 360));

        getContentPane().add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    private javax.swing.JPanel FondoPrincipal;
    private javax.swing.JLabel ImagenSisterna;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
