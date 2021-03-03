package newpackage;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelImagen, "src/imagenes/servicio-social.png");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    conexionSQL conexion = new conexionSQL();
    Connection con = conexion.conexion();
    static String usuario;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFieldnewframe_Usuario = new javax.swing.JTextField();
        crearUsuario = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPasswordField_newframe_contraseña = new javax.swing.JPasswordField();
        jButtonIngresar = new javax.swing.JButton();
        jLabelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biracora");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Contraseña:");

        txtFieldnewframe_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldnewframe_UsuarioActionPerformed(evt);
            }
        });

        crearUsuario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        crearUsuario.setText("Crear Cuenta");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });

        jPasswordField_newframe_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_newframe_contraseñaActionPerformed(evt);
            }
        });

        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/servicio-social.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtFieldnewframe_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_newframe_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButtonIngresar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crearUsuario)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldnewframe_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField_newframe_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButtonIngresar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(crearUsuario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtFieldnewframe_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldnewframe_UsuarioActionPerformed
        //SI EL USUARIO Y LA CONTRASEÑA ES DEL ADMIN ABRE CONFIGURACION 
    }//GEN-LAST:event_txtFieldnewframe_UsuarioActionPerformed

    public void validarUsuario() {
        usuario = txtFieldnewframe_Usuario.getText();
        String contraseña = jPasswordField_newframe_contraseña.getText();
        String consulta_usuarios = "SELECT * FROM datos_prestadores "
                + "WHERE usuario='" + usuario + "' and"
                + " contrasena='" + contraseña + "' and"
                + " tipo_usuario='1'";
        int resultado = 0;
        try {
            Statement st = con.createStatement();
            ResultSet result_usuarios = st.executeQuery(consulta_usuarios);

            if (result_usuarios.next()) {
                resultado = 1;
                if (resultado == 1) {
                    configuracion abrir = new configuracion();
                    abrir.setVisible(true);
                    this.dispose();
                }
            }
            consulta_usuarios = "SELECT * FROM datos_prestadores "
                    + "WHERE usuario='" + usuario + "' and"
                    + " contrasena='" + contraseña + "'";
            result_usuarios = st.executeQuery(consulta_usuarios);

            if (result_usuarios.next()) {

                if (resultado == 0) {
                    hacer_reporte open = new hacer_reporte();
                    open.setVisible(true);
                    this.dispose();
                }
            } else {
                if (resultado == 0) {
                    JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        configuracion abrir = new configuracion();
        abrir.setVisible(true);
        this.setVisible(false);
        for (Component component : configuracion.jPanel_eliminar.getComponents()) {
            component.setEnabled(false);
        }
        for (Component component : configuracion.jPanelReportes.getComponents()) {
            component.setEnabled(false);
        }
        for (Component component : configuracion.jPanel_recuperar_contraseña.getComponents()) {
            component.setEnabled(false);
        }
        for (Component component : configuracion.jPanelUsuarios.getComponents()) {
            component.setEnabled(false);
        }
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void jPasswordField_newframe_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_newframe_contraseñaActionPerformed

    }//GEN-LAST:event_jPasswordField_newframe_contraseñaActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        validarUsuario();
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearUsuario;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPasswordField jPasswordField_newframe_contraseña;
    private javax.swing.JTextField txtFieldnewframe_Usuario;
    // End of variables declaration//GEN-END:variables
}
