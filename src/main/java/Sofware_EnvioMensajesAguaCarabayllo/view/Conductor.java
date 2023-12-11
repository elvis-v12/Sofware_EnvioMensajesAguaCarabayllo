
package Sofware_EnvioMensajesAguaCarabayllo.view;

import SoftwareMensagge.view.Dao.RegistroDAOImpl;
import Sofware_EnvioMensajesAguaCarabayll.Controler.Usuario;
import Sofware_EnvioMensajesAguaCarabayll.Controler.UbicacionesCarabayllo;
import Sofware_EnvioMensajesAguaCarabayllo.model.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Oliver
 */
public class Conductor extends javax.swing.JFrame {
private ConexionSQL conexionSQL;
private DefaultTableModel modeloTabla;
    public Conductor() {
        initComponents();
         conexionSQL = new ConexionSQL();
         modeloTabla = new DefaultTableModel(); // Agrega esta línea
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Condicion");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("codigoUsuario");
        jtRegistro.setModel(modeloTabla);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPrincipal = new javax.swing.JPanel();
        Cabecera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSubirRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtRegistro = new javax.swing.JTable();
        jcCondicion = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jDatosUbicacion1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();

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

        FondoPrincipal.add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 60));

        btnSubirRegistro.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnSubirRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargando.png"))); // NOI18N
        btnSubirRegistro.setText("Subir Registro");
        btnSubirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirRegistroActionPerformed(evt);
            }
        });
        FondoPrincipal.add(btnSubirRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 160, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ubicaciones");
        FondoPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/284-F5-1300 (1).jpg"))); // NOI18N
        FondoPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 140));

        jButton2.setBackground(new java.awt.Color(245, 71, 9));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver-lista.png"))); // NOI18N
        jButton2.setText("Ver ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        FondoPrincipal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 110, 40));

        btnRegistrar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro-en-linea.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        FondoPrincipal.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 130, 40));

        btnEliminar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/expediente.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        FondoPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 130, 40));
        FondoPrincipal.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 110, 30));

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("registrar entrega");
        FondoPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel5.setText("CODIGO ");
        FondoPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        FondoPrincipal.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 120, 30));

        jLabel6.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel6.setText("telefono");
        FondoPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        jLabel7.setText("usuarios registrados");
        FondoPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));
        FondoPrincipal.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 160, 30));

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel8.setText("apellidos");
        FondoPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        FondoPrincipal.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 170, 30));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel9.setText("condición");
        FondoPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel12.setText("nombres");
        FondoPrincipal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jtRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Telefono", "Condicion", "DNI", "codigo_Usuario"
            }
        ));
        jScrollPane2.setViewportView(jtRegistro);

        FondoPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 540, 120));

        jcCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "recibido", "no recibido" }));
        jcCondicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCondicionActionPerformed(evt);
            }
        });
        FondoPrincipal.add(jcCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 262, 110, 30));

        jDatosUbicacion1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jDatosUbicacion1);

        FondoPrincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 590, 120));

        jLabel13.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel13.setText("DNI");
        FondoPrincipal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));
        FondoPrincipal.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 70, 40));

        getContentPane().add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM conubicacion";

    try (Connection conexión = conexionSQL.getConnection();
         PreparedStatement declaración = conexión.prepareStatement(sql);
         ResultSet resultados = declaración.executeQuery()) {

        // Modificar el modelo de la tabla para agregar los encabezados
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Distrito");
        modelo.addColumn("Lote");
        modelo.addColumn("Manzana");
        modelo.addColumn("Etapa");

        // Iterar a través de los resultados y agregar las filas al modelo
        while (resultados.next()) {
            String distrito = resultados.getString("distrito");
            String lote = resultados.getString("lote");
            String manzana = resultados.getString("manzana");
            String etapa = resultados.getString("etapa");
       UbicacionesCarabayllo ubicacion = new UbicacionesCarabayllo(distrito, lote, manzana, etapa);

            modelo.addRow(new Object[]{distrito, lote, manzana, etapa});
        }

        // Establecer el modelo actualizado en la tabla
        jDatosUbicacion1.setModel(modelo);

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
String nombre = txtNombre.getText();
String apellido = txtApellido.getText();
String telefono = txtTelefono.getText();
String condicion = jcCondicion.getSelectedItem().toString();
String dni = txtDni.getText();
String codigoUsuario = txtCod.getText();

Usuario registro = new Usuario(telefono, condicion, codigoUsuario, nombre, apellido, dni);

// Validar si todos los campos están llenos antes de agregar a la tabla
if (!nombre.isEmpty() && !apellido.isEmpty() && !telefono.isEmpty() && !dni.isEmpty()&& !codigoUsuario.isEmpty()) {
    // Agregar fila temporal al modelo de la tabla
    Object[] datos = {nombre, apellido, telefono, dni, condicion, codigoUsuario};
    modeloTabla.addRow(datos);

    // Limpiar campos después de agregar a la tabla
    txtNombre.setText("");
    txtApellido.setText("");
    txtTelefono.setText("");
    txtDni.setText("");
    jcCondicion.setSelectedIndex(0);  // Reiniciar a la primera opción
    txtCod.setText("");
} else {
    JOptionPane.showMessageDialog(this, "Completa todos los campos antes de registrar.");
}
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
 int[] filasSeleccionadas = jtRegistro.getSelectedRows();

    if (filasSeleccionadas.length > 0) { // Verificar si hay filas seleccionadas
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar las filas seleccionadas?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Eliminar las filas seleccionadas en orden inverso para evitar problemas de índice
            for (int i = filasSeleccionadas.length - 1; i >= 0; i--) {
                modeloTabla.removeRow(filasSeleccionadas[i]);
            }

            JOptionPane.showMessageDialog(this, "Filas eliminadas correctamente.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione al menos una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    }       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSubirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirRegistroActionPerformed
        int filaSeleccionada = jtRegistro.getSelectedRow();
        if (filaSeleccionada != -1) {
            String nombre = jtRegistro.getValueAt(filaSeleccionada, 0).toString();
            String apellido = jtRegistro.getValueAt(filaSeleccionada, 1).toString();
            String telefono = jtRegistro.getValueAt(filaSeleccionada, 2).toString();
            String dni = jtRegistro.getValueAt(filaSeleccionada, 3).toString();
            String condicion = jtRegistro.getValueAt(filaSeleccionada, 4).toString();
            String cod_user = jtRegistro.getValueAt(filaSeleccionada, 5).toString();

            Usuario registro = new Usuario(telefono, condicion, cod_user, nombre, apellido, dni);

            // Instancia del DAO
            RegistroDAOImpl registroDAO = new RegistroDAOImpl();

            // Llamada al método DAO
            registroDAO.insertarUsuario(registro);

            // Remover la fila seleccionada del modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) jtRegistro.getModel();
            modelo.removeRow(filaSeleccionada);

            JOptionPane.showMessageDialog(this, "Datos insertados correctamente en la base de datos.");
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un registro para subir a la base de datos.");
        }
    }//GEN-LAST:event_btnSubirRegistroActionPerformed

    private void jcCondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCondicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCondicionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    private javax.swing.JPanel FondoPrincipal;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSubirRegistro;
    private javax.swing.JButton jButton2;
    private javax.swing.JTable jDatosUbicacion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcCondicion;
    private javax.swing.JTable jtRegistro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
