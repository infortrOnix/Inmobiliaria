package Modelo;


import java.sql.*;
import java.util.*;

public class InquilinoData 
{
    
    Connection con=null;
    
    public InquilinoData(Conexion conexion)
    {
        try
        {
            con = conexion.getConnection();
        }
        catch(Exception ex)
        {
            System.out.println("Error de conexion1");
        }
    }
    
    public void Guardar(Inquilino inquilino)
    {
        try
        {
        String sql="INSERT INTO inquilino (cuilInquilino,nombre,apellido,lugarTrabajo,nombreGarante,dniGarante) VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, inquilino.getCuilInquilino());
        ps.setString(2,inquilino.getNombre());
        ps.setString(3,inquilino.getApellido());
        ps.setString(4,inquilino.getLugarTrabajo());
        ps.setString(5,inquilino.getNombreGarante());
        ps.setInt(6,inquilino.getDniGarante());
        
        ps.executeUpdate();
        
        ResultSet rs= ps.getGeneratedKeys();
        
        if(rs.next())
        {
            inquilino.setCuilInquilino(rs.getInt("cuilInquilino"));
        }
        else
        {
            System.out.println("no se pudo obtener el id luego de ingresar");
        }
        
        ps.close();
        
        System.out.println("Cargado Correctamente");
        
        }
        catch(SQLException ex)
        {
            System.out.println("No se ha podido ingresar al alumno");
        }
    }
        
    public List<Inquilino> Obtener()
    {
            List<Inquilino> lista = new ArrayList<Inquilino>();
            
            String sql="SELECT * FROM inquilino;";
            try
            {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                Inquilino inquilino = new Inquilino();
                inquilino.setCuilInquilino(rs.getInt("cuilInquilino"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setLugarTrabajo(rs.getString("lugarTrabajo"));
                inquilino.setNombreGarante(rs.getString("nombreGarante"));
                inquilino.setDniGarante(rs.getInt("dniGarante"));
                
                
                lista.add(inquilino);
                
            }
            
            ps.close();
        
            }
            catch(SQLException ex)
            {
                System.out.println("No se ha podido hacer la consulta");
            }
            
            return lista;
        }
    
    public Inquilino Buscar(int cuilInquilino)
    {
        Inquilino inquilino = new Inquilino();
        
        try
        {
            String sql = "SELECT * FROM inquilino WHERE cuilInquilino=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cuilInquilino);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                inquilino.setCuilInquilino(rs.getInt("cuilInquilino"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setLugarTrabajo(rs.getString("lugarTrabajo"));
                inquilino.setNombreGarante(rs.getString("nombreGarante"));
                inquilino.setDniGarante(rs.getInt("dniGarante"));
                
            }
            
            ps.close();
            
        }
        catch(SQLException ex)
        {
            System.out.println("Error al buscar a el alumno");
        }
        return inquilino;
    }
    
    public void Modificar(Inquilino inquilino)
    {
        try
        {
            String sql="UPDATE inquilino SET nombre=?,apellido=?,lugarTrabajo=?,nombreGarante=?.dniGarante=? WHERE cuilInquilino=?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,inquilino.getNombre());
            ps.setString(2,inquilino.getApellido());
            ps.setString(3,inquilino.getLugarTrabajo());
            ps.setString(4,inquilino.getNombreGarante());
            ps.setInt(5,inquilino.getDniGarante());
            ps.setInt(6,inquilino.getCuilInquilino());
            ps.executeUpdate();
            
            System.out.println("Actualuzado Correctamente");
            
            ps.close();
            
        }
        catch(SQLException ex)
        {
            System.out.println("Error al modificar");
        }
        
    }
    
    public void Eliminar(int cuilInquilino)
    {
        String sql = "DELETE FROM Inquilino WHERE cuilInquilino=?;";
        try
        {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cuilInquilino);
        ps.executeUpdate();
        ps.close();
        System.out.println("Eliminado Correctamente");
        }
        catch(SQLException ex)
        {
            System.out.println("Error al intentar eliminar");
        }
    }
    
}


