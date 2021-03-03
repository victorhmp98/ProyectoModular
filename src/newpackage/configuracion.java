package newpackage;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
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
        mostrarListaUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPaneDatos = new javax.swing.JTabbedPane();
        jPanelUsuarios = new javax.swing.JPanel();
        jPanel_eliminar = new javax.swing.JPanel();
        jButtonEliminar = new javax.swing.JButton();
        jTextFieldUsuario_eliminar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel_recuperar_contraseña = new javax.swing.JPanel();
        jButton_recuperacion_aceptar = new javax.swing.JButton();
        jTextField_recuperacion_cuenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelmostrar_contraseña = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMostrarUsuarios = new javax.swing.JList<>();
        jPanelReportes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();
        jButtonEliminar_registros = new javax.swing.JButton();
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
        jPanel5 = new javax.swing.JPanel();
        jRadioButtonAdmin = new javax.swing.JRadioButton();
        jRadioButtonPrestador = new javax.swing.JRadioButton();
        jFormattedTextFieldGeneracion = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFechaRegistro = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPaneDatos.setBackground(new java.awt.Color(255, 255, 255));

        jPanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_eliminar.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar:"));
        jPanel_eliminar.setPreferredSize(new java.awt.Dimension(200, 200));

        jButtonEliminar.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButtonEliminar.setText("Aceptar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTextFieldUsuario_eliminar.setBackground(new java.awt.Color(237, 237, 237));
        jTextFieldUsuario_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuario_eliminarActionPerformed(evt);
            }
        });

        jLabel11.setText("Usuario:");

        javax.swing.GroupLayout jPanel_eliminarLayout = new javax.swing.GroupLayout(jPanel_eliminar);
        jPanel_eliminar.setLayout(jPanel_eliminarLayout);
        jPanel_eliminarLayout.setHorizontalGroup(
            jPanel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_eliminarLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_eliminarLayout.createSequentialGroup()
                        .addComponent(jTextFieldUsuario_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar)))
                .addContainerGap())
        );
        jPanel_eliminarLayout.setVerticalGroup(
            jPanel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel_recuperar_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_recuperar_contraseña.setBorder(javax.swing.BorderFactory.createTitledBorder("Recuperar contraseña:"));
        jPanel_recuperar_contraseña.setPreferredSize(new java.awt.Dimension(200, 200));

        jButton_recuperacion_aceptar.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton_recuperacion_aceptar.setText("Aceptar");
        jButton_recuperacion_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_recuperacion_aceptarActionPerformed(evt);
            }
        });

        jTextField_recuperacion_cuenta.setBackground(new java.awt.Color(237, 237, 237));

        jLabel6.setText("Usuario:");

        javax.swing.GroupLayout jPanel_recuperar_contraseñaLayout = new javax.swing.GroupLayout(jPanel_recuperar_contraseña);
        jPanel_recuperar_contraseña.setLayout(jPanel_recuperar_contraseñaLayout);
        jPanel_recuperar_contraseñaLayout.setHorizontalGroup(
            jPanel_recuperar_contraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_recuperar_contraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_recuperar_contraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_recuperar_contraseñaLayout.createSequentialGroup()
                        .addComponent(jTextField_recuperacion_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_recuperacion_aceptar))
                    .addGroup(jPanel_recuperar_contraseñaLayout.createSequentialGroup()
                        .addGroup(jPanel_recuperar_contraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabelmostrar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_recuperar_contraseñaLayout.setVerticalGroup(
            jPanel_recuperar_contraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_recuperar_contraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel_recuperar_contraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_recuperacion_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_recuperacion_aceptar))
                .addGap(39, 39, 39)
                .addComponent(jLabelmostrar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Usuarios"));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        jListMostrarUsuarios.setBackground(new java.awt.Color(237, 237, 237));
        jScrollPane2.setViewportView(jListMostrarUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_recuperar_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addComponent(jPanel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_recuperar_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPaneDatos.addTab("Usuarios", jPanelUsuarios);

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

        jButtonEliminar_registros.setText("Eliminar");
        jButtonEliminar_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar_registrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelReportesLayout = new javax.swing.GroupLayout(jPanelReportes);
        jPanelReportes.setLayout(jPanelReportesLayout);
        jPanelReportesLayout.setHorizontalGroup(
            jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar_registros)))
                .addContainerGap())
        );
        jPanelReportesLayout.setVerticalGroup(
            jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEliminar_registros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneDatos.addTab("Reportes", jPanelReportes);

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

        jFormattedTextFieldGeneracion.setBackground(new java.awt.Color(237, 237, 237));
        try {
            jFormattedTextFieldGeneracion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jFormattedTextFieldFechaRegistro.setBackground(new java.awt.Color(237, 237, 237));
        try {
            jFormattedTextFieldFechaRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setText("Nota: captura fechas iniciando por año, mes y dia");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(113, 113, 113))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUsuario)
                    .addComponent(jPasswordFieldContraseña)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jFormattedTextFieldGeneracion, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldFechaRegistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfig_cuentas_crear_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jFormattedTextFieldGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jFormattedTextFieldFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButtonConfig_cuentas_crear_crear)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
    PreparedStatement pps;
    ResultSet result;

    public void mostrarDatosPrestadoresTable() {
        String sql = "SELECT * FROM reportes";
        try {
            st = con.createStatement();
            result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(2);
                dato[1] = result.getString(1);
                dato[2] = result.getString(3);
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
            result = st.executeQuery(sentencia);
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


    private void jButtonConfig_cuentas_crear_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfig_cuentas_crear_crearActionPerformed
        datosRepetidoSQL();
        boolean cuenta = false;
        try {
            if (jRadioButtonAdmin.isSelected() && datosRepetidoSQL() == false) {
                cuenta = true;
                arreglos[0] = new Usuarios(jTextFieldNombre.getText(), jFormattedTextFieldGeneracion.getText(), jFormattedTextFieldFechaRegistro.getText(),
                        jTextFieldUsuario.getText(), jPasswordFieldContraseña.getText(), cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta creada como prestador de Administrador");
            } else if (jRadioButtonPrestador.isSelected() && datosRepetidoSQL() == false) {
                cuenta = false;
                arreglos[0] = new Usuarios(jTextFieldNombre.getText(), jFormattedTextFieldGeneracion.getText(), jFormattedTextFieldFechaRegistro.getText(),
                        jTextFieldUsuario.getText(), jPasswordFieldContraseña.getText(), cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta creada como prestador de Servicio");
            } else {
                JOptionPane.showMessageDialog(null, "Cuenta creada como prestador de Servicio, ya exite Administrador");
            }

            PreparedStatement pps = con.prepareStatement("INSERT INTO datos_prestadores"
                    + "(nombre,generacion,fecha_registro,usuario,contrasena,tipo_usuario) VALUES(?,?,?,?,?,?)");
            pps.setString(1, jTextFieldNombre.getText());
            pps.setString(2, jFormattedTextFieldGeneracion.getText());
            pps.setString(3, jFormattedTextFieldFechaRegistro.getText());
            pps.setString(4, jTextFieldUsuario.getText());
            pps.setString(5, jPasswordFieldContraseña.getText());
            pps.setBoolean(6, cuenta);
            pps.executeUpdate();

            o[0] = jFormattedTextFieldFechaRegistro.getText();
            o[1] = jTextFieldUsuario.getText();
            o[2] = "prueba";//va el reporte del prestador de servicio
            dtm.addRow(o);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Formato Incorrecto, vuelva a intentar");
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButtonConfig_cuentas_crear_crearActionPerformed

    private void jButtonEliminar_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar_registrosActionPerformed
        eliminarRegistros();
    }//GEN-LAST:event_jButtonEliminar_registrosActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        String usuario = jTextFieldUsuario_eliminar.getText();
        String eliminarUsuario = "DELETE FROM datos_prestadores WHERE usuario='" + usuario + "'";
        int respuesta = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este usuario " + usuario + "?");
        try {
            pps = con.prepareStatement(eliminarUsuario);
            if (respuesta == JOptionPane.YES_OPTION) {
                pps.execute();
                mostrarListaUsuarios();
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            }

        } catch (SQLException ex) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldUsuario_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuario_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuario_eliminarActionPerformed

    private void jButton_recuperacion_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_recuperacion_aceptarActionPerformed
        recuperacionCuentas();
    }//GEN-LAST:event_jButton_recuperacion_aceptarActionPerformed

    public void recuperacionCuentas() {
        String usuario = jTextField_recuperacion_cuenta.getText();
        String sql = "SELECT * FROM datos_prestadores "
                + "WHERE usuario='" + usuario + "'";
        try {
            st = con.createStatement();
            result = st.executeQuery(sql);
            while (result.next()) {
                jLabelmostrar_contraseña.setText(dato[1] = result.getString(3));
            }
            //JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        } catch (SQLException ex) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarRegistros() {
        String eliminar_registros = "DELETE FROM reportes";
        try {

            int respuesta = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar todos los registros?");
            if (respuesta == JOptionPane.YES_OPTION) {
                pps = con.prepareStatement(eliminar_registros);
                pps.executeUpdate();
                mostrarDatosPrestadoresTable();
                JOptionPane.showMessageDialog(null, "Registros Eliminados");
            }
        } catch (SQLException e) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void mostrarListaUsuarios() {
        DefaultListModel modelo = new DefaultListModel();
        jListMostrarUsuarios.setModel(modelo);
        String traer_usuarios = "SELECT usuario FROM datos_prestadores";
        String usuario;
        try {
            st = con.createStatement();
            result = st.executeQuery(traer_usuarios);
            while (result.next()) {
                usuario = result.getString(1);
                modelo.addElement(usuario);
            }

        } catch (SQLException e) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, e);
        }

    }

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
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JButton jButtonConfig_cuentas_crear_crear;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminar_registros;
    private javax.swing.JButton jButton_recuperacion_aceptar;
    private javax.swing.JFormattedTextField jFormattedTextFieldFechaRegistro;
    private javax.swing.JFormattedTextField jFormattedTextFieldGeneracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelmostrar_contraseña;
    public static javax.swing.JList<String> jListMostrarUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanelReportes;
    public static javax.swing.JPanel jPanelUsuarios;
    public static javax.swing.JPanel jPanel_eliminar;
    public static javax.swing.JPanel jPanel_recuperar_contraseña;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    public static javax.swing.JRadioButton jRadioButtonAdmin;
    private javax.swing.JRadioButton jRadioButtonPrestador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTabbedPane jTabbedPaneDatos;
    private javax.swing.JTable jTableMostrar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldUsuario_eliminar;
    private javax.swing.JTextField jTextField_recuperacion_cuenta;
    // End of variables declaration//GEN-END:variables
}
