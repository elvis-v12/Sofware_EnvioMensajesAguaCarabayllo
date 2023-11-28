
package Sofware_EnvioMensajesAguaCarabayllo.view;

/**
 *
 * @author Oliver
 */
public class Conductor extends javax.swing.JFrame {

    
    public Conductor() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPrincipal = new javax.swing.JPanel();
        Cabecera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoPrincipal.setBackground(new java.awt.Color(33, 45, 62));
        FondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cabecera.setBackground(new java.awt.Color(201, 50, 0));
        Cabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("entregas");
        Cabecera.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel10.setText("municipalidad distrital de carabayllo");
        Cabecera.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 410, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel11.setText("registrar");
        Cabecera.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        FondoPrincipal.add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 60));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        FondoPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 270, 130));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton1.setText("Subir Registro");
        FondoPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 130, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ubicaciones");
        FondoPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sourse/284-F5-1300 (1).jpg"))); // NOI18N
        FondoPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 140));

        jButton2.setBackground(new java.awt.Color(245, 71, 9));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sourse/ver-lista.png"))); // NOI18N
        jButton2.setText("Ver ");
        FondoPrincipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 110, 40));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton3.setText("Registrar");
        FondoPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 110, 30));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton4.setText("Eliminar");
        FondoPrincipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 110, 30));
        FondoPrincipal.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 100, 30));

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("registrar entrega");
        FondoPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel5.setText("DNI");
        FondoPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));
        FondoPrincipal.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 100, 30));

        jLabel6.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel6.setText("telefono");
        FondoPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel7.setText("usuarios registrados");
        FondoPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));
        FondoPrincipal.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 100, 30));
        FondoPrincipal.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 100, 30));

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel8.setText("apellidos");
        FondoPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));
        FondoPrincipal.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 100, 30));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel9.setText("condición");
        FondoPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel12.setText("nombres");
        FondoPrincipal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        FondoPrincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 430, 120));

        getContentPane().add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    private javax.swing.JPanel FondoPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
