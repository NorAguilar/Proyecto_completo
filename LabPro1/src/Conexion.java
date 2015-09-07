/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basico
 */
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;




public class Conexion {

    /*
    public String usuario="sa";
    public String password="123";
    
    public String url="jdbc:sqlserver://localhost:1433;databaseName=UserGhost";
    
    public Connection cn=null;
    public Statement st=null;
    
    public Statement Conectar(){
        try{
            
            Connection cn=DriverManager.getConnection(url,usuario,password);
            st=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        }catch (SQLException ex)
        {
         JOptionPane.showMessageDialog(null, ex);
        }
        return st;
    }
    */

public static void main(String[]args){

 /*Connection conexion=null;
  try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String Url="jdbc:sqlserver://MAINORDA:1433;databaseName=UserGhost;user=sa;password=123";
        
             conexion=DriverManager.getConnection(Url);
        
        JOptionPane.showMessageDialog(null, "Esta conectado");
           
            Conexion conectar=new Conexion();
            //Statement st=conectar.Conectar();
            //ResultSet rs= st.executeQuery("select *from login usuario='"+usuario+"' and password'"+password+"'");
                rs.last();
                int encontrado=rs.getRow();
                if(encontrado==1){
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña correcta", "Usuario y contraseá correcta",JOptionPane.INFORMATION_MESSAGE);
                
                    Principal pl=new Principal();
                    pl.setVisible(true);
                  
                }else{
                    Log.Textuser.setText("");
                    Log.Password.setText("");
                    JOptionPane.showMessageDialog(null, "ERROR", "Usuario o contraseá incorrecta",JOptionPane.INFORMATION_MESSAGE);
                }
        
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex,"Error al conectar" + ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
         */
}
}