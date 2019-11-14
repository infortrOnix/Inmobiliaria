
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
            Class.forName("org.mariadb.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion Exitosa");
            
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();//Nos dice qué sucedió y en qué parte del código sucedió el error
            System.out.println( "ERROR: Problema con la conexion a la BD..."+e.getMessage());
    }
        return con;
    }
}
