
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
public class tipoInmuebleData {
    private Connection con;

    public tipoInmuebleData(Conexion con){
        this.con = con.getConnection();
        if (con == null){
            System.out.println("ERROR la conexion no se ha establecido en tipoInmuebleData");
        }else{
            System.out.println("tipoInmuebleData Conexion establecida");
        }
    }
    
    public boolean guardarTipo(tipoInmueble tipo){
        try{
            String sql = "INSERT INTO tipoinmueble (descripcion) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo.getDescripcion());
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            if(count > 0){
                System.out.println("Se guardo el tipoInmueble correctamente!!");
                ps.close();//CERRAMOS EL STATEMENTS
                return true;
            }else{
                System.out.println("No se puede guardar el tipoInmueble");
                ps.close();//CERRAMOS EL STATEMENTS
                return false;
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo insertar(GUARDAR)..."+ex.getMessage());
            return false;
        }
    }
    
    public boolean buscarTipo(tipoInmueble tipo){
        try{
            String sql = "SELECT * FROM tipoInmueble WHERE idTipo =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, tipo.getIdTipo());
            ResultSet rs=ps.executeQuery();//ejecuta la busqueda
            while(rs.next()){//Muestra los campos obtenidos
                System.out.println("\nID INMUEBLRE: "+rs.getInt("idTipo"));
                System.out.println("ID PROPIETARIO: "+rs.getString("descripcion"));
                tipo.setIdTipo(rs.getInt("idTipo"));
                tipo.setDescripcion(rs.getString("descripcion"));
            }
            ps.close();//CERRAMOS EL STATEMENTS
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar..."+ex.getMessage());
            return false;
        }
        
        return true;
    }
    
    public ArrayList<tipoInmueble> buscarTipoPor(String nombre, String valor){
        tipoInmueble tipo = null;
        ArrayList<tipoInmueble> tipos = new ArrayList<tipoInmueble>();
        try{
            String sql = "SELECT * FROM tipoInmueble WHERE "+nombre+" =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, valor);
            ResultSet rs=ps.executeQuery();//ejecuta la busqueda
            while(rs.next()){//Muestra los campos obtenidos
                tipo = new tipoInmueble();
                tipo.setIdTipo(rs.getInt("idTipo"));
                tipo.setDescripcion(rs.getString("descripcion"));
                tipos.add(tipo);
            }
            ps.close();//CERRAMOS EL STATEMENTS
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar..."+ex.getMessage());
        }
        return tipos;
    }
    
    public ArrayList<tipoInmueble> buscarTodosLosTipos(){
        ArrayList<tipoInmueble> listarTipos = new ArrayList<tipoInmueble>();
        tipoInmueble tipo = null;
        try{
            String sql = "SELECT * FROM tipoInmueble";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();//ejecuta la busqueda
            
            
            while(rs.next()){//Muestra los campos obtenidos
                tipo = new tipoInmueble();
                tipo.setIdTipo(rs.getInt("idTipo"));
                tipo.setDescripcion(rs.getString("descripcion"));
                listarTipos.add(tipo);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo buscar..."+ex.getMessage());
        }
        return listarTipos;
    }
    
    public boolean borrarTipo(int idTipo){
        try{
            String sql = "DELETE FROM tipoInmueble WHERE idTipo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTipo);
            int count = ps.executeUpdate();
            if(count > 0){
                System.out.println("Se ha borrado el tipoInmueble con el ID: "+idTipo);
                ps.close();
                return true;
            }else{
                System.out.println("No se pudo borrar ya que el ID no existe");
                ps.close();
                return false;
            }
            
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo borrar..."+ex.getMessage());
            return false;
        }
    }
    
    public boolean actualizarTipo(tipoInmueble tipo){
        try{
            String sql = "UPDATE tipoInmueble SET descripcion=? WHERE idTipo=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo.getDescripcion());
            ps.setInt(2, tipo.getIdTipo());
            
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
