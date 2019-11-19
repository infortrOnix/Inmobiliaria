package Modelo;

import java.sql.*;

public class ContratoDataF {
    
    private Connection con;//es connection por que asi pide la conexion de Noberto
    
    
    public ContratoDataF(ConexionN conexion)
    {
        try
        {
            con=conexion.getConexion();
        }
        catch(Exception ex)
        {
            System.out.println("error al conectar");
        }
    }
    
    public void guardar()
    {
        String sql="INSERT INTO contrato (fechaInicial,fechaFinal,estado,idContrato,idInquilino,idInmueble)VALUES ?,?,?,?,?,?";
        try
        {

        }
        catch()
        {
            
        }    }
        
    }
    
}
