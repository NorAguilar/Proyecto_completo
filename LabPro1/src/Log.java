
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sun.security.util.Password;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basico
 */
public class Log extends javax.swing.JFrame {

    /**
     * Creates new form Log
     */
    
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst= null;
    Conexion conectar=new Conexion();
    //Statement st=conectar.Conectar();
    
    public Log() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Textuser = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Btniniciar = new javax.swing.JButton();
        Btnsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setType(java.awt.Window.Type.POPUP);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");
        jLabel2.setToolTipText("");

        Textuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextuserActionPerformed(evt);
            }
        });

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        Btniniciar.setText("Iniciar");
        Btniniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtniniciarMouseClicked(evt);
            }
        });
        Btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtniniciarActionPerformed(evt);
            }
        });

        Btnsalir.setText("Home");
        Btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnsalirMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Basico\\Documents\\NetBeansProjects\\ProyectoGhost\\src\\2q9kktv.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Textuser)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Textuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btniniciar)
                    .addComponent(Btnsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void TextuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextuserActionPerformed

    private void BtniniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtniniciarMouseClicked
       
        String user="admin";
        String user2="Nor";
        String pass="123";
        String pass2="1234";
        
        String Pass=new String(Password.getPassword());
        
        if(Textuser.getText().equals(user) && Pass.equals(pass)){
            Principal p=new Principal();
            p.setVisible(true);
            dispose();
            
        }else if(Textuser.getText().equals(user2) && Pass.equals(pass2)){
            Principal p=new Principal();
            p.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrecta");
            Home h=new Home();
            h.setVisible(true);
            dispose();
        }
        
       
        
        
        /*String usuario=Textuser.getText();
        String password=Password.getText();
        
        if(usuario.isEmpty() && password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un usuario y una contraseña");
            
        }else{
            Conexion conectar=new Conexion();
            Statement st=conectar.Conectar();
            
            try {
                ResultSet rs= st.executeQuery("select *from login usuario='"+usuario+"' and password'"+password+"'");
                rs.last();
                int encontrado=rs.getRow();
                if(encontrado==1){
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña correcta", "Usuario y contraseá correcta",JOptionPane.INFORMATION_MESSAGE);
                
                    Principal pl=new Principal();
                    pl.setVisible(true);
                    dispose();
                }else{
                    Textuser.setText("");
                    Password.setText("");
                    JOptionPane.showMessageDialog(null, "ERROR", "Usuario o contraseá incorrecta",JOptionPane.INFORMATION_MESSAGE);
                }
                
                        
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
                        
            }
        }
        
        */
        /*String sql="select *from login where usuario=? and password=?";
        Connection conexion=null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String Url="jdbc:sqlserver://MAINORDA:1433;databaseName=UserGhost;user=sa;password=123";
            conexion=DriverManager.getConnection(Url);
            pst.setString(1,Textuser.getText());
            pst.setString(2,Password.getText());
            rs=pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Usuario y Password Establecidos");
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
   */
    }//GEN-LAST:event_BtniniciarMouseClicked

    private void BtniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtniniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtniniciarActionPerformed

    private void BtnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnsalirMouseClicked
        // TODO add your handling code here:
        Home h =new Home();
        h.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BtnsalirMouseClicked

public static void main(String[]args){
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btniniciar;
    private javax.swing.JButton Btnsalir;
    public static javax.swing.JPasswordField Password;
    public static javax.swing.JTextField Textuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}