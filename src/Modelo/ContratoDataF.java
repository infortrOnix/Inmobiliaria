package Modelo;

import java.sql.*;
import java.util.*;

public class ContratoDataF {
    
    private Connection con;
    
    
    public ContratoDataF(Conexion conexion)
    {
        try
        {
            con=conexion.getConnection();
        }
        catch(Exception ex)
        {
            System.out.println("error al conectar");
        }
    }
    
    public void guardar(ContratoF contrato)
    {
        String sql="INSERT INTO contrato (fechaInicial,fechaFinal,estado,idContrato,idInquilino,idInmueble)VALUES ?,?,?,?,?,?";
        try
        {
        PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setDate(1,contrato.getFechaInicial());
        ps.setDate(2,contrato.getFechaFinal());
        ps.setString(3,contrato.getEstado());
        ps.setInt(4,contrato.getIdContrato());
        ps.setInt(5,contrato.getIdInquilino().getCuilInquilino());
        ps.setInt(6,contrato.getIdInmueble().getIdInmueble());
        
        ps.executeUpdate();
        
        ResultSet rs= ps.getGeneratedKeys();
        
        if(rs.next())
        {
            contrato.setIdContrato(rs.getInt("idContrato"));
        }
        else
        {
            System.out.println("no se pudo obtener el id luego de ingresar");
        }
        
        ps.close();
        rs.close();
        
        System.out.println("Cargado Correctamente");
         
        }
        catch(SQLException ex)
        {
            System.out.println("No se ha podido ingresar el contrato");
        } 
        
    }
    
    public void eliminar(int idContrato)
    {
        String sql="DELETE FROM contrato WHERE idContrato=?";
        try
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idContrato);
            ps.executeUpdate();
            
            System.out.println("Se ha eliminado correctamente");
            
        }
        catch(SQLException ex)
        {
            System.out.println("No se ha podido eliminar");
        }
        
    }
    
    public void modificar(ContratoF contrato)
    {
        String sql = "UPDATE contrato SET fechaInicial=?,fechaFinal=?,estado=?,idInquilino=?,idInmueble=? WHERE idContrato=?";
        
        try
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, contrato.getFechaInicial());
            ps.setDate(2,contrato.getFechaFinal());
            ps.setString(3, contrato.getEstado());
            ps.setInt(4, contrato.getIdInquilino().getCuilInquilino());
            ps.setInt(5,contrato.getIdInmueble().getIdInmueble());
            ps.setInt(6,contrato.getIdContrato());
            ps.executeUpdate();
            
            System.out.println("Modificado correctamente");
            
        }
        catch(SQLException ex)
        {
            System.out.println("No se ha podido modificar");
        }
    } 
    
    public ContratoF buscar(int idContrato)
    {
        String sql="SELECT * FROM contrato WHERE idContrato=?";
        ContratoF contrato = new ContratoF();
        
        try
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idContrato);
            ResultSet rs =ps.executeQuery();

            Conexion conexion=null;                         //
            InquilinoData i = new InquilinoData(conexion);  //tuve que hacer para poder armar el contrato y retornanrlo
            InmuebleData in = new InmuebleData(conexion);   //revisar si pueden simplicarlo
            
            
            while(rs.next())
            {                   
                contrato.setFechaInicial(rs.getDate("fechaInicial"));
                contrato.setFechaFinal(rs.getDate("fechaFinal"));
                contrato.setestado(rs.getString("estado"));
                contrato.setIdInquilino(i.Buscar(rs.getInt("idInquilino")) );
                //contrato.setIdImueble(in.buscarInmueble(rs.getInt("idInmueble")));                                             
            }
            System.out.println("Se ha econtrado correctamente");
        }
        catch(SQLException ex)
        {
            System.out.println("No se encontrado el contrato");
        }
        return contrato;
        
    }
    
    public List<ContratoF> obtener()
    {
        String sql="SELECT * FROM contrato";
        List<ContratoF> lista = new ArrayList<ContratoF>();
        ContratoF c = new ContratoF();
        
        try
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            Conexion conexion=null;                         
            InquilinoData inquilino = new InquilinoData(conexion);  
            InmuebleData inmueble = new InmuebleData(conexion);   
            
            
            while(rs.next())
            {                   
                c.setFechaInicial(rs.getDate("fechaInicial"));
                c.setFechaFinal(rs.getDate("fechaFinal"));
                c.setestado(rs.getString("estado"));
                c.setIdInquilino(inquilino.Buscar(rs.getInt("idInquilino")) );
                c.setIdImueble(inmueble.buscarInmuebles(rs.getInt("idInmueble"))); 
                
                lista.add(c);
            }
            
            System.out.println("se ha obtenido la lista correctamente");
            
        }
        catch(SQLException ex)
        {
            System.out.println("No se ha podido obtener la lista");
        }
        
        return lista;
        
    }
    
}
