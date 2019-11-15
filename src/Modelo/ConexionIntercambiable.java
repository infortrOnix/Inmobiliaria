
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @kaiserkey
 * 
 */
public class ConexionIntercambiable {
    private Connection con;
    private String bd = "crudjava";
    private String variables = "?useServerPrepStmts=true";
    private String url = "jdbc:mysql://localhost:3306/"+bd+variables;
    private String user = "root";
    private String password = "";
    private String driver = "org.mariadb.jdbc.Driver";
    
    public boolean crearConexion(){
        System.out.println("Conectando...");
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            System.out.println( "ERROR: Problema con la conexion a la BD...");
            e.printStackTrace();
            return false;
        }catch(ClassNotFoundException e){
            System.out.println( "ERROR: Problemas con el Driver de conexion...");
            e.printStackTrace();
            return false;
        }
        System.out.println("Conectado...");
        return true;
    }
    
    public Connection getConexion(){
        return this.con;
    }
    
    public void desconectarBD(){
        try {
            con.close();
            System.out.println("Se ha desconectado correctamente de la base de datos");
        }catch(SQLException e){
            System.out.println("No se puede desconectar de la base de datos");
            e.printStackTrace();
        }
        
    }
}
