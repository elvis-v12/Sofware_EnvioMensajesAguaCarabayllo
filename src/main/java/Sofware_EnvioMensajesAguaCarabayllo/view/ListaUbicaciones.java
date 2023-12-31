/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sofware_EnvioMensajesAguaCarabayllo.view;
import SoftwareMensagge.view.Dao.UbicacionDAO;
import SoftwareMensagge.view.Dao.UbicacionDAOImpl;
import Sofware_EnvioMensajesAguaCarabayll.Controler.Ubicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Sofware_EnvioMensajesAguaCarabayllo.model.ConexionSQL;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvis
 */
public class ListaUbicaciones extends javax.swing.JFrame {
    
    private ConexionSQL conexionSQL;
    UbicacionDAO UbicacionDAO;
    public ListaUbicaciones() {
        initComponents();
        conexionSQL = new ConexionSQL();
      UbicacionDAO = new UbicacionDAOImpl(conexionSQL.getConnection());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPrincipal = new javax.swing.JPanel();
        Cabecera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDatosUbicacion = new javax.swing.JTable();
        txtLote = new javax.swing.JTextField();
        txtManzana = new javax.swing.JTextField();
        txtAtapa = new javax.swing.JTextField();
        txtdistrito = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        FondoPrincipal.add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 60));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ubicaciones");
        FondoPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/284-F5-1300 (1).jpg"))); // NOI18N
        FondoPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 140));

        btnAgregar.setBackground(new java.awt.Color(245, 71, 9));
        btnAgregar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        FondoPrincipal.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 120, 40));

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel4.setText("Listar ubicaciones");
        FondoPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel13.setText("Agregar ubicaciones");
        FondoPrincipal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jDatosUbicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Distrito", "Lote", "Manzana", "Etapa"
            }
        ));
        jScrollPane2.setViewportView(jDatosUbicacion);

        FondoPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 610, 190));
        FondoPrincipal.add(txtLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 90, 40));
        FondoPrincipal.add(txtManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 90, 40));
        FondoPrincipal.add(txtAtapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 90, 40));
        FondoPrincipal.add(txtdistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 112, 180, 30));

        Enviar.setBackground(new java.awt.Color(201, 50, 0));
        Enviar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviar-mensaje.png"))); // NOI18N
        Enviar.setText("Enviar ubicacion");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        FondoPrincipal.add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Etapa:");
        FondoPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Distrito:");
        FondoPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lote:");
        FondoPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Manzana:");
        FondoPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        btnVer.setBackground(new java.awt.Color(245, 71, 9));
        btnVer.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver-lista.png"))); // NOI18N
        btnVer.setText("Ver ");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        FondoPrincipal.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FondoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FondoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        try {
              int filaSeleccionada = jDatosUbicacion.getSelectedRow();
              if (filaSeleccionada != -1) {
             String distrito = jDatosUbicacion.getValueAt(filaSeleccionada, 0).toString();
            String lote = jDatosUbicacion.getValueAt(filaSeleccionada, 1).toString();
            String manzana = jDatosUbicacion.getValueAt(filaSeleccionada, 2).toString();
            String etapa = jDatosUbicacion.getValueAt(filaSeleccionada, 3).toString();
            Ubicacion Registro= new Ubicacion(distrito, lote, manzana, etapa);
            
               String sql = "INSERT INTO conubicacion (distrito, lote, manzana, etapa) VALUES (?, ?, ?, ?)";
                 try (Connection conexión = conexionSQL.getConnection();
                 PreparedStatement declaración = conexión.prepareStatement(sql)) {
                declaración.setString(1, distrito);
                declaración.setString(2, lote);
                declaración.setString(3, manzana);
                declaración.setString(4, etapa);
                 int filasAfectadas = declaración.executeUpdate();
                  if (filasAfectadas > 0) {
                    // Remover la fila seleccionada del modelo de la tabla
                    DefaultTableModel modelo = (DefaultTableModel) jDatosUbicacion.getModel();
                    modelo.removeRow(filaSeleccionada);

                    JOptionPane.showMessageDialog(this, "Ubicaciones enviadas al ADMINISTRADOR .");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al insertar datos en la base de datos. No se insertaron filas.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un registro para subir a la base de datos.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al insertar datos en la base de datos: " + e.getMessage());
    }

    }//GEN-LAST:event_EnviarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
  // Obtener la lista de ubicaciones
    List<Ubicacion> ubicaciones = UbicacionDAO.obtenerUbicaciones();

    // Crear un modelo de tabla
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Distrito");
    model.addColumn("Lote");
    model.addColumn("Manzana");
    model.addColumn("Etapa");

    // Llenar el modelo con los datos de la lista
    for (Ubicacion ubicacion : ubicaciones) {
        model.addRow(new Object[]{ubicacion.getDistrito(), ubicacion.getLote(), ubicacion.getManzana(), ubicacion.getEtapa()});
    }
    JOptionPane.showMessageDialog(null, "DATOS LISTADOS CORRECTAMENTE");
    // Asignar el modelon a la tabla
    jDatosUbicacion.setModel(model);

    }//GEN-LAST:event_btnVerActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      // Obtener los valores de las cajas de texto o componentes necesarios
    String distrito = txtdistrito.getText();
    String lote = txtLote.getText();
    String manzana = txtManzana.getText();
    String etapa = txtAtapa.getText();

    // Crear una instancia de UbicacionesCarabayllo con los valores ingresados
    Ubicacion ubicacion = new Ubicacion(distrito, lote, manzana, etapa);

// Crear una instancia de tu implementación de UbicacionesDAO (ajusta el nombre según tu implementación)
UbicacionDAO ubicacionDAO = new UbicacionDAOImpl(conexionSQL.getConnection());

    // Llamar al método insertarUbicacion para agregar la ubicación a la base de datos
    boolean insercionExitosa = ubicacionDAO.insertarUbicacion(ubicacion);

    if (insercionExitosa) {
        // Ubicación insertada correctamente
        JOptionPane.showMessageDialog(null, "Ubicación agregada exitosamente");
        // Puedes realizar otras acciones aquí, como actualizar la interfaz o limpiar los campos
        txtAtapa.setText("");
        txtLote.setText("");
        txtManzana.setText("");
        txtdistrito.setText("");
    } else {
        // Error al insertar la ubicación
        JOptionPane.showMessageDialog(null, "Error al agregar la ubicación");
    }
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    private javax.swing.JButton Enviar;
    private javax.swing.JPanel FondoPrincipal;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVer;
    private javax.swing.JTable jDatosUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAtapa;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtManzana;
    private javax.swing.JTextField txtdistrito;
    // End of variables declaration//GEN-END:variables
}
