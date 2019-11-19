package Modelo;

import java.sql.*;

public class Conexion {
    
    Connection con=null;
    
    public Connection getConnection()
    {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/universidad","root","");   
            System.out.println("Conexion Exitosa!");
        }
        catch(ClassNotFoundException | SQLException ex )
        {
            System.out.println(ex.getMessage() );
            System.out.println("No se ha podido conectar con el servidor.");
        }
        
        return con;
        
        
    }
    
    public Conexion()
    {
        
    }
    
}
