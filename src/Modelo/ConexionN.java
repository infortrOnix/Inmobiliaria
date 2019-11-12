
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Norberto
 */
public class ConexionN {
    private final String url="jdbc:mysql://localhost:3306/inmobiliaria";
    private final String user="root";
    private final String pass="";
    
    private Connection con;
            
    
    public Connection getConexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion Exitosa...");
            
        }
        catch (SQLException | ClassNotFoundException e){
                    
                    System.out.println("NO logra CONECTAR !!!");
                    //e.printStackTrace();
    }
        return con;
    }
}
