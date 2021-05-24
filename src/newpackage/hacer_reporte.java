package newpackage;

import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class hacer_reporte extends javax.swing.JFrame {
    
    conexionSQL conexion = new conexionSQL();
    Connection con = conexion.conexion();
    Statement st;
    String dato[] = new String[3];
    PreparedStatement pps;
    String usuario = NewJFrame.usuario;
    ImageIcon imagenicon;
    TrayIcon trayicon;
    SystemTray systemtray;
    
    public hacer_reporte() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jLabelMostrarUsuario.setText("Bienvenido(a) " + usuario);
        //cronometro crono = new cronometro();
        //crono.delaySegundo();
        imagenicon = new ImageIcon(this.getClass().getResource("/imagenes/servicio-social-icono.jpg"));
        this.setIconImage(imagenicon.getImage());
        trayIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new java.awt.PopupMenu();
        sesion = new java.awt.MenuItem();
        jPanelCrearReporte = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMostrarUsuario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaReporte = new javax.swing.JTextArea();
        jButtonGuardarReportes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        popup.setLabel("Menú");
        popup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupActionPerformed(evt);
            }
        });

        sesion.setLabel("Sesión");
        sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionActionPerformed(evt);
            }
        });
        popup.add(sesion);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelCrearReporte.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Fecha hoy:");

        jLabelMostrarUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jTextAreaReporte.setBackground(new java.awt.Color(237, 237, 237));
        jTextAreaReporte.setColumns(20);
        jTextAreaReporte.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextAreaReporte.setRows(5);
        jScrollPane2.setViewportView(jTextAreaReporte);

        jButtonGuardarReportes.setText("Guardar");
        jButtonGuardarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarReportesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setText("Nota: captura fechas iniciando por año, mes y dia");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelCrearReporteLayout = new javax.swing.GroupLayout(jPanelCrearReporte);
        jPanelCrearReporte.setLayout(jPanelCrearReporteLayout);
        jPanelCrearReporteLayout.setHorizontalGroup(
            jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarReportes)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCrearReporteLayout.setVerticalGroup(
            jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearReporteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearReporteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(jButtonGuardarReportes)
                        .addContainerGap())
                    .addGroup(jPanelCrearReporteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCrearReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCrearReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void trayIcon() {
        trayicon = new TrayIcon(imagenicon.getImage(), "Tooltip de Icono", popup);
        trayicon.setImageAutoSize(true);
        systemtray = SystemTray.getSystemTray();
    }
    
    public void reportes() {
        try {
            pps = con.prepareStatement("INSERT INTO reportes(usuario,fecha,reporte) VALUES(?,?,?)");
            pps.setString(1, usuario);
            pps.setString(2, jFormattedTextField1.getText());
            pps.setString(3, jTextAreaReporte.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reporte enviado");
        } catch (SQLException e) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    private void jButtonGuardarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarReportesActionPerformed
        reportes();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGuardarReportesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            systemtray.add(trayicon);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formWindowClosing

    private void sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionActionPerformed
        systemtray.remove(trayicon);
        //this.setVisible(true);
        NewJFrame abrir = new NewJFrame();
        abrir.setVisible(true);
    }//GEN-LAST:event_sesionActionPerformed

    private void popupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hacer_reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardarReportes;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelMostrarUsuario;
    public static javax.swing.JPanel jPanelCrearReporte;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaReporte;
    private java.awt.PopupMenu popup;
    private java.awt.MenuItem sesion;
    // End of variables declaration//GEN-END:variables
}
