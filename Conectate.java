
package testbd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conectate
{
    private String driver ="com.mysql.jdbc.Driver";
    private String cadenaConexion = "jdbc:mysql://127.0.0.1/jardines";
    private String usuario = "root";
    private String contraseña = "";
    public Connection con;
    
    public Conectate ()
    {
        try{
      Class.forName(driver);
      con = DriverManager.getConnection(cadenaConexion, usuario, contraseña);
        JOptionPane.showMessageDialog(null, "conexion a la BD exitosa");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion a la BD ..."+e.getMessage());
        }
    }
}
