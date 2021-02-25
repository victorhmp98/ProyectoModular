package newpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class hacer_reporte extends javax.swing.JFrame {

    public hacer_reporte() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jLabelMostrarUsuario.setText("Bienvenido(a) " + usuario);
        //cronometro crono = new cronometro();
        //crono.tiempoRestante();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCrearReporte = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMostrarUsuario = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaReporte = new javax.swing.JTextArea();
        jButtonGuardarReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCrearReporte.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Fecha hoy:");

        jLabel2.setText("yyyy-mm-dd");

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

        javax.swing.GroupLayout jPanelCrearReporteLayout = new javax.swing.GroupLayout(jPanelCrearReporte);
        jPanelCrearReporte.setLayout(jPanelCrearReporteLayout);
        jPanelCrearReporteLayout.setHorizontalGroup(
            jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarReportes)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCrearReporteLayout.setVerticalGroup(
            jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearReporteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanelCrearReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCrearReporteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardarReportes)))
                .addContainerGap())
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

    conexionSQL conexion = new conexionSQL();
    Connection con = conexion.conexion();
    Statement st;
    String dato[] = new String[3];
    PreparedStatement pps;
    String usuario = NewJFrame.usuario;

    public void reportes() {
        try {
            pps = con.prepareStatement("INSERT INTO reportes(usuario,fecha,reporte) VALUES(?,?,?)");
            pps.setString(1, usuario);
            pps.setString(2, jTextFieldFecha.getText());
            pps.setString(3, jTextAreaReporte.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Reporte enviado");
        } catch (SQLException e) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    private void jButtonGuardarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarReportesActionPerformed
        reportes();
    }//GEN-LAST:event_jButtonGuardarReportesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hacer_reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardarReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMostrarUsuario;
    public static javax.swing.JPanel jPanelCrearReporte;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaReporte;
    private javax.swing.JTextField jTextFieldFecha;
    // End of variables declaration//GEN-END:variables
}
