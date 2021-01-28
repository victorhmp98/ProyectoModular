package newpackage;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionSQL {
    // Declaramos los datos de conexion a la bd
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/modular";
    // Reseteamos a null la conexion a la bd
    Connection conectar = null;
    public Connection conexion() {
        try {
            Class.forName(driver);
            conectar = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos: " + e.getMessage());
        }
        return conectar;
    }
}
