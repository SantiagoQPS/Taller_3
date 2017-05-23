/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.*;
import java.util.*;

/**
 *
 * @author santiago
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Image getIoonImage(){
        Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.jpg"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jTextFieldUser = new javax.swing.JTextField();
        jButtonSesion = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(42, 16, 51));
        jButton1.setForeground(new java.awt.Color(248, 247, 247));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("URW Palladio L", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("LecturaParaCracks");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 450, 60));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("URW Palladio L", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 242, 242));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("URW Palladio L", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jPassword.setBackground(new java.awt.Color(77, 13, 98));
        jPassword.setFont(new java.awt.Font("URW Palladio L", 0, 14)); // NOI18N
        jPassword.setForeground(new java.awt.Color(253, 251, 251));
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 190, -1));

        jTextFieldUser.setBackground(new java.awt.Color(54, 18, 69));
        jTextFieldUser.setFont(new java.awt.Font("URW Palladio L", 0, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 190, -1));

        jButtonSesion.setBackground(new java.awt.Color(41, 11, 47));
        jButtonSesion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButtonSesion.setForeground(new java.awt.Color(254, 238, 238));
        jButtonSesion.setText("Iniciar Sesion");
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jButtonCrear.setBackground(new java.awt.Color(47, 9, 56));
        jButtonCrear.setForeground(new java.awt.Color(253, 248, 248));
        jButtonCrear.setText("Crear cuenta");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 639, 362));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void buscarEnLista(){
        
    }
    
    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
        /*VistaUser a = new VistaUser();
        a.setVisible(true);
        this.setVisible(false);*/
        
        
        String pass= new String(jPassword.getPassword());
        
        String UsuarioAdmin= "admin";
        String ContrasenaAdmin= "123";
        /*String Usuario= "client";
        String Contrasena = "321";*/
        
        
        Biblioteca x = new Biblioteca();
        if(jTextFieldUser.getText().equalsIgnoreCase(UsuarioAdmin) && pass.equals(ContrasenaAdmin)){
            VistaAdmin a = new VistaAdmin();
            a.setVisible(true);
            this.setVisible(false);
        }else{
            if(x.ConsultarUser(jTextFieldUser.getText(), jPassword.getText())){
            VistaUser a = new VistaUser();
            a.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Usuario o contraseña invalida");
            jTextFieldUser.setText("");
            jPassword.setText("");
            }
        }
    }//GEN-LAST:event_jButtonSesionActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        CrearCuenta a = new CrearCuenta();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCrearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}