
package Modelo;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @kaiserkey
 * 
 */
public class tipoInmuebleData {
    private Connection con;
    private ArrayList<tipoInmueble> tipos;
    
    public tipoInmuebleData(ConexionD con){
        this.con = con.getConexion();
        if (con == null){
            System.out.println("ERROR la conexion no se ha establecido en tipoInmuebleData");
        }else{
            System.out.println("tipoInmuebleData Conexion establecida");
        }
    }
    
    
}
