package newpackage;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class configuracion extends javax.swing.JFrame {

    public configuracion() {
        initComponents();
        jRadioButtonAdmin.setSelected(true);
        jRadioButtonPrestador.setSelected(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        dtm = (DefaultTableModel) jTableMostrar.getModel();
        mostrarDatosPrestadoresTable();
        mostrarCombobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPaneDatos = new javax.swing.JTabbedPane();
        jPanelEliminar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        jTextFieldUsuario_eliminar = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jPasswordFieldConterseña_eliminar = new javax.swing.JPasswordField();
        jPanelReportes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();
        jComboBoxUsuarios = new javax.swing.JComboBox<>();
        jPanelRecuperacion = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonConfig_cuentas_crear_crear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jLabelConexion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFecha_reg = new javax.swing.JTextField();
        jTextFieldGeneracion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRadioButtonAdmin = new javax.swing.JRadioButton();
        jRadioButtonPrestador = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPaneDatos.setBackground(new java.awt.Color(255, 255, 255));

        jPanelEliminar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Usuario:");

        Contraseña.setText("Contraseña:");

        jTextFieldUsuario_eliminar.setBackground(new java.awt.Color(237, 237, 237));
        jTextFieldUsuario_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuario_eliminarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Aceptar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jPasswordFieldConterseña_eliminar.setBackground(new java.awt.Color(237, 237, 237));
        jPasswordFieldConterseña_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConterseña_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEliminarLayout = new javax.swing.GroupLayout(jPanelEliminar);
        jPanelEliminar.setLayout(jPanelEliminarLayout);
        jPanelEliminarLayout.setHorizontalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarLayout.createSequentialGroup()
                .addGroup(jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEliminarLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldUsuario_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contraseña)
                            .addComponent(jPasswordFieldConterseña_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEliminarLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButtonEliminar)))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        jPanelEliminarLayout.setVerticalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Contraseña))
                .addGap(18, 18, 18)
                .addGroup(jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldConterseña_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButtonEliminar)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPaneDatos.addTab("Eliminar", jPanelEliminar);

        jPanelReportes.setBackground(new java.awt.Color(255, 255, 255));

        jTableMostrar.setBackground(new java.awt.Color(204, 204, 204));
        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Usuario", "Reporte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMostrar);

        javax.swing.GroupLayout jPanelReportesLayout = new javax.swing.GroupLayout(jPanelReportes);
        jPanelReportes.setLayout(jPanelReportesLayout);
        jPanelReportesLayout.setHorizontalGroup(
            jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelReportesLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelReportesLayout.setVerticalGroup(
            jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneDatos.addTab("Reportes", jPanelReportes);

        jPanelRecuperacion.setBackground(new java.awt.Color(255, 255, 255));

        jTextField7.setBackground(new java.awt.Color(237, 237, 237));

        jLabel5.setText("Usuario:");

        jButton5.setText("Aceptar");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Ingresa el nombre de usuario para recuperar contraseña");

        javax.swing.GroupLayout jPanelRecuperacionLayout = new javax.swing.GroupLayout(jPanelRecuperacion);
        jPanelRecuperacion.setLayout(jPanelRecuperacionLayout);
        jPanelRecuperacionLayout.setHorizontalGroup(
            jPanelRecuperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecuperacionLayout.createSequentialGroup()
                .addGroup(jPanelRecuperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRecuperacionLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10))
                    .addGroup(jPanelRecuperacionLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanelRecuperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanelRecuperacionLayout.setVerticalGroup(
            jPanelRecuperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecuperacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(63, 63, 63)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPaneDatos.addTab("Recuperación", jPanelRecuperacion);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Crear Cuenta");

        jButtonConfig_cuentas_crear_crear.setText("Crear");
        jButtonConfig_cuentas_crear_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfig_cuentas_crear_crearActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre:");

        jLabel12.setText("Generación:");

        jLabel13.setText("Fecha Registro:");

        jLabel14.setText("Usuario:");

        jLabel15.setText("Contraseña:");

        jTextFieldNombre.setBackground(new java.awt.Color(237, 237, 237));

        jTextFieldUsuario.setBackground(new java.awt.Color(237, 237, 237));

        jPasswordFieldContraseña.setBackground(new java.awt.Color(237, 237, 237));

        jLabelConexion.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabelConexion.setText("Estado");

        jLabel1.setText("yyyy-mm-dd");

        jTextFieldFecha_reg.setBackground(new java.awt.Color(237, 237, 237));

        jTextFieldGeneracion.setBackground(new java.awt.Color(237, 237, 237));

        jLabel2.setText("yyyy-mm-dd");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecciona:"));

        jRadioButtonAdmin.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonAdmin);
        jRadioButtonAdmin.setText("Administrador");

        jRadioButtonPrestador.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonPrestador);
        jRadioButtonPrestador.setText("Prestador");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonAdmin)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonPrestador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPrestador)
                    .addComponent(jRadioButtonAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelConexion))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldUsuario)
                                        .addComponent(jPasswordFieldContraseña)
                                        .addComponent(jTextFieldFecha_reg)
                                        .addComponent(jTextFieldGeneracion)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonConfig_cuentas_crear_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldFecha_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonConfig_cuentas_crear_crear)
                .addGap(4, 4, 4)
                .addComponent(jLabelConexion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneDatos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneDatos)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    NewJFrame frame = new NewJFrame();
    static Usuarios arreglos[] = new Usuarios[20];
    DefaultTableModel dtm;
    Object[] o = new Object[3];
    String dato[] = new String[6];
    conexionSQL conexion = new conexionSQL();
    Connection con = conexion.conexion();
    Statement st;


    private void jTextFieldUsuario_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuario_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuario_eliminarActionPerformed

    public void mostrarDatosPrestadoresTable() {
        String sql = "SELECT * FROM datos_prestadores";
        try {
            st = con.createStatement();
            ResultSet result = st.executeQuery(sql);

            while (result.next()) {
                dato[0] = result.getString(5);
                dato[1] = result.getString(2);

                dtm.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean datosRepetidoSQL() {
        String sentencia = "SELECT tipo_usuario FROM datos_prestadores";
        String busca;
        try {
            st = con.createStatement();
            ResultSet result = st.executeQuery(sentencia);
            while (result.next()) {
                busca = result.getString(1);
                if ("1".equals(busca)) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    public void mostrarCombobox() {
        jComboBoxUsuarios.addItem(jTextFieldUsuario.getText());
        String usuario;
        String sql = "SELECT usuario FROM datos_prestadores";
        try {
            st = con.createStatement();
            ResultSet result = st.executeQuery(sql);

            while (result.next()) {

                usuario = result.getString(1);
                jComboBoxUsuarios.addItem(usuario);

            }
        } catch (SQLException ex) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void jButtonConfig_cuentas_crear_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfig_cuentas_crear_crearActionPerformed

        datosRepetidoSQL();
        boolean cuenta = false;
        try {
            if (jRadioButtonAdmin.isSelected() && datosRepetidoSQL() == false) {
                cuenta = true;
                arreglos[0] = new Usuarios(jTextFieldNombre.getText(), jTextFieldGeneracion.getText(), jTextFieldFecha_reg.getText(),
                        jTextFieldUsuario.getText(), jPasswordFieldContraseña.getText(), cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta creada como prestador de Administrador");
            } else if (jRadioButtonPrestador.isSelected() && datosRepetidoSQL() == false) {
                cuenta = false;
                arreglos[0] = new Usuarios(jTextFieldNombre.getText(), jTextFieldGeneracion.getText(), jTextFieldFecha_reg.getText(),
                        jTextFieldUsuario.getText(), jPasswordFieldContraseña.getText(), cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta creada como prestador de Servicio");
            } else {
                JOptionPane.showMessageDialog(null, "Cuenta creada como prestador de Servicio, ya exite Administrador");
            }

            PreparedStatement pps = con.prepareStatement("INSERT INTO datos_prestadores"
                    + "(nombre,generacion,fecha_registro,usuario,contrasena,tipo_usuario) VALUES(?,?,?,?,?,?)");
            pps.setString(1, jTextFieldNombre.getText());
            pps.setString(2, jTextFieldGeneracion.getText());
            pps.setString(3, jTextFieldFecha_reg.getText());
            pps.setString(4, jTextFieldUsuario.getText());
            pps.setString(5, jPasswordFieldContraseña.getText());
            pps.setBoolean(6, cuenta);
            pps.executeUpdate();

            o[0] = jTextFieldFecha_reg.getText();
            o[1] = jTextFieldUsuario.getText();
            o[2] = "prueba";//va el reporte del prestador de servicio

            dtm.addRow(o);
            mostrarCombobox();

        } catch (SQLException e) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButtonConfig_cuentas_crear_crearActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        String usuario = jTextFieldUsuario_eliminar.getText();
        String eliminarUsuario = "DELETE FROM datos_prestadores WHERE usuario='" + usuario + "'";
        int respuesta = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este usuario " + usuario + "?");
        try {
            PreparedStatement pps = con.prepareStatement(eliminarUsuario);
            if (respuesta == JOptionPane.YES_OPTION) {
                pps.execute();
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            }

        } catch (SQLException ex) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jPasswordFieldConterseña_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConterseña_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConterseña_eliminarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
                }
                new configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    public static javax.swing.JButton jButtonConfig_cuentas_crear_crear;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JComboBox<String> jComboBoxUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelConexion;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanelEliminar;
    public static javax.swing.JPanel jPanelRecuperacion;
    public static javax.swing.JPanel jPanelReportes;
    private javax.swing.JPasswordField jPasswordFieldConterseña_eliminar;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    public static javax.swing.JRadioButton jRadioButtonAdmin;
    private javax.swing.JRadioButton jRadioButtonPrestador;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTabbedPane jTabbedPaneDatos;
    private javax.swing.JTable jTableMostrar;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextFieldFecha_reg;
    private javax.swing.JTextField jTextFieldGeneracion;
    private javax.swing.JTextField jTextFieldNombre;
    public static javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldUsuario_eliminar;
    // End of variables declaration//GEN-END:variables
}
