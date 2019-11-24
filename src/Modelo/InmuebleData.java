
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @kaiserkey
 * 
 */
public class InmuebleData {
    private Connection con;

    public InmuebleData(Conexion conexion){
         try
        {
            con = conexion.getConnection();
        }
        catch(Exception ex)
        {
            System.out.println("Error de conexion1");
        }
    }
    
    public boolean guardarInmueble(Inmueble inmueble, Propietario propietario,tipoInmueble tipoInmueble){
        
        
        try {
            String sql = "INSERT INTO inmueble (idPropietario,"
                + "idTipoInmueble,"
                + "direccion,"
                + "alturaInmueble,"
                + "superficie,"
                + "precioBase,"
                + "codigoZona,"
                + "disponible) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, propietario.getCuitPropietario());
            ps.setInt(2, tipoInmueble.getIdTipo());
            ps.setString(3, inmueble.getDireccion());
            ps.setInt(4, inmueble.getAlturaInmueble());
            ps.setDouble(5, inmueble.getSuperficie());
            ps.setDouble(6, inmueble.getPrecioBase());
            ps.setInt(7, inmueble.getCodigoZona());
            ps.setString(8, inmueble.getDisponible());
            
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            if(count > 0){
                System.out.println("Se guardo el imueble correctamente!!");
                ps.close();//CERRAMOS EL STATEMENTS
                return true;
            }else{
                System.out.println("No se puede guardar el inmueble");
                ps.close();//CERRAMOS EL STATEMENTS
                return false;
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo insertar(GUARDAR)..."+ex.getMessage());
            return false;
        }
    }
    
    public boolean buscarInmueble(Inmueble inmueble){
        try{
            String sql = "SELECT * FROM inmueble WHERE idInmueble =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, inmueble.getIdInmueble());
            ResultSet rs=ps.executeQuery();//ejecuta la busqueda
            while(rs.next()){//Muestra los campos obtenidos
                
                System.out.println("\nID INMUEBLRE: "+rs.getInt("idInmueble"));
                System.out.println("ID PROPIETARIO: "+rs.getInt("idPropietario"));
                System.out.println("ID TIPO: "+rs.getInt("idTipoInmueble"));
                System.out.println("DIRECCION: "+rs.getString("direccion"));
                System.out.println("ALTURA INMUEBLE: "+rs.getInt("alturaInmueble"));
                System.out.println("SUPERFICIE: "+rs.getDouble("superficie"));
                System.out.println("PRECIO BASE: "+rs.getDouble("precioBase"));
                System.out.println("CODIGO DE ZONA:"+rs.getInt("codigoZona"));
                System.out.println("DISPONIBLE: "+rs.getString("disponible")+"\n");
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setIdPropietario(rs.getInt("idPropietario"));
                inmueble.setIdTipoInmueble(rs.getInt("idTipoInmueble"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAlturaInmueble(rs.getInt("alturaInmueble"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getDouble("precioBase"));
                inmueble.setCodigoZona(rs.getInt("codigoZona"));
                inmueble.setDisponible(rs.getString("disponible"));
            }
            ps.close();//CERRAMOS EL STATEMENTS
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar..."+ex.getMessage());
            return false;
        }
        return true;
    }
    
    public Inmueble buscarInmueble(int idInmueble){
        Inmueble inmueble=new Inmueble();
        String sql = "SELECT * FROM inmueble WHERE idInmueble =?";
        try
        {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInmueble);
            ResultSet rs=ps.executeQuery();//ejecuta la busqueda
            while(rs.next())
            {            
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setIdPropietario(rs.getInt("idPropietario"));
                inmueble.setIdTipoInmueble(rs.getInt("idTipoInmueble"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAlturaInmueble(rs.getInt("alturaInmueble"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getDouble("precioBase"));
                inmueble.setCodigoZona(rs.getInt("codigoZona"));
                inmueble.setDisponible(rs.getString("disponible"));
            }
            ps.close();//CERRAMOS EL STATEMENTS
            
        }
        catch(SQLException ex)
        {
            System.out.println( "ERROR: no se pudo buscar...");
        }
        return inmueble;
    }
    
    public ArrayList<Inmueble> buscarInmueblePor(String nombre, String valor){
        Inmueble inmueble = null;
        ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
        try{
            String sql = "SELECT * FROM inmueble WHERE"+nombre+"=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, valor);
            ResultSet rs=ps.executeQuery();//ejecuta la busqueda
            
            while(rs.next()){//Muestra los campos obtenidos
                inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setIdPropietario(rs.getInt("idPropietario"));
                inmueble.setIdTipoInmueble(rs.getInt("idTipoInmueble"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAlturaInmueble(rs.getInt("alturaInmueble"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getDouble("precioBase"));
                inmueble.setCodigoZona(rs.getInt("codigoZona"));
                inmueble.setDisponible(rs.getString("disponible"));
                inmuebles.add(inmueble);
            }
            ps.close();//CERRAMOS EL STATEMENTS
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar..."+ex.getMessage());
            
        }
        return inmuebles;
    }
    
        public ArrayList<Inmueble> buscarTodosInmuebles(){
            ArrayList<Inmueble> listarInmuebles = new ArrayList<Inmueble>();
            Inmueble inmueble = null;
            try{
            String sql = "SELECT * FROM inmueble";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();//ejecuta la busqueda
            
            while(rs.next()){//Muestra los campos obtenidos
                inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setIdPropietario(rs.getInt("idPropietario"));
                inmueble.setIdTipoInmueble(rs.getInt("idTipoInmueble"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setAlturaInmueble(rs.getInt("alturaInmueble"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecioBase(rs.getDouble("precioBase"));
                inmueble.setCodigoZona(rs.getInt("codigoZona"));
                inmueble.setDisponible(rs.getString("disponible"));
                listarInmuebles.add(inmueble);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar..."+ex.getMessage());
        }
        return listarInmuebles;
    }
    
    public boolean borrarInmueble(int idInmueble){
        try{
            String sql = "DELETE FROM inmueble WHERE idInmueble=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInmueble);
            int count = ps.executeUpdate();
            if(count > 0){
                System.out.println("Se ha borrado el inmueble con el ID: "+idInmueble);
                ps.close();//CERRAMOS EL STATEMENTS
                return true;
            }else{
                System.out.println("No se pudo borrar ya que el ID no existe");
                ps.close();//CERRAMOS EL STATEMENTS
                return false;
            }
            
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo borrar..."+ex.getMessage());
            return false;
        }
    }
    
    public boolean actualizarInmueble(Inmueble inmueble, Propietario propietario, tipoInmueble tipoInmueble){
        try{
            String sql = "UPDATE inmueble SET idPropietario=?,"
                + "idTipoInmueble=?,"
                + "direccion=?,"
                + "alturaInmueble=?,"
                + "superficie=?,"
                + "precioBase=?,"
                + "codigoZona=?,"
                + "disponible=?"
                + "WHERE idInmueble=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, propietario.getCuitPropietario());
            ps.setInt(2, tipoInmueble.getIdTipo());
            ps.setString(3, inmueble.getDireccion());
            ps.setInt(4, inmueble.getAlturaInmueble());
            ps.setDouble(5, inmueble.getSuperficie());
            ps.setDouble(6, inmueble.getPrecioBase());
            ps.setInt(7, inmueble.getCodigoZona());
            ps.setString(8, inmueble.getDisponible());
            ps.setInt(9, inmueble.getIdInmueble());
            
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            if(count > 0){
                System.out.println("Se actualizo correctamente");
                ps.close();//CERRAMOS EL STATEMENTS
                return true;
            }else{
                System.out.println("No se puede actualizar");
                ps.close();//CERRAMOS EL STATEMENTS
                return false;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo actualizar..."+ex.getMessage());
            return false;
        }
    }
}
