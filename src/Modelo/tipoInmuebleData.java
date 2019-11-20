
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
    
    public tipoInmuebleData(Conexion con){
        this.con = con.getConnection();
        if (con == null){
            System.out.println("ERROR la conexion no se ha establecido en tipoInmuebleData");
        }else{
            System.out.println("tipoInmuebleData Conexion establecida");
        }
    }
    
    /*public void guardarTipo(tipoInmueble tipoInmueble){
        try{
            
        }catch{
            
        }
    }*/
}
