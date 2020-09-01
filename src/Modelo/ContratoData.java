package Modelo;

import java.sql.*;
import java.util.*;
import java.sql.Date;

public class ContratoData {
    
private Connection con=null;
    
    
    public ContratoData(Conexion conexion)
    {
        try
        {
            con=conexion.getConnection();
        }
        catch(Exception ex)
        {
            System.out.println("error al conectar Contrato Data");
        }
    }
    
    public void guardarContrato(Contrato contrato)
    {
        String sql="INSERT INTO contrato (fechaInicial,fechaFinal,estado,idContrato,idInquilino,idInmueble) VALUES (?,?,?,?,?,?);";
        try
        {
        PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setDate(1,Date.valueOf(contrato.getFechaInicial()));
        ps.setDate(2,Date.valueOf(contrato.getFechaFinal()));
        ps.setString(3,contrato.getEstado());
        ps.setInt(4,contrato.getIdContrato());
        ps.setString(5,contrato.getInquilino().getCuilInquilino());
        ps.setInt(6,contrato.getInmueble().getIdInmueble());
        
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
            ex.printStackTrace();
            System.out.println("No se ha podido ingresar el contrato"+ex.getMessage());
        } 
        
    }
    
    public void borrarContrato(int idContrato)
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
            ex.printStackTrace();
            System.out.println("No se ha podido eliminar"+ex.getMessage());
        }
        
    }
    
    public void actualizarContrato(Contrato contrato)
    {
        String sql = "UPDATE contrato SET "
                + "fechaInicial=?,"
                + "fechaFinal=?,"
                + "estado=?,"
                + "idInquilino=?,"
                + "idInmueble=? "
                + "WHERE idContrato=?";
        
        try
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(contrato.getFechaInicial()));
            ps.setDate(2,Date.valueOf(contrato.getFechaFinal()));
            ps.setString(3, contrato.getEstado());
            ps.setString(4, contrato.getInquilino().getCuilInquilino());
            ps.setInt(5,contrato.getInmueble().getIdInmueble());
            ps.setInt(6,contrato.getIdContrato());
            ps.executeUpdate();
            
            System.out.println("Modificado correctamente");
            
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("No se ha podido modificar"+ex.getMessage());
        }
    } 
    
    public void buscarContrato(Contrato contratos, InquilinoData inquilinoData, InmuebleData inmuebleData)
    {
        String sql="SELECT * FROM contrato WHERE idContrato=?";
        try
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, contratos.getIdContrato());
            ResultSet rs =ps.executeQuery();

            while(rs.next())
            {                   
                contratos.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                contratos.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                contratos.setEstado(rs.getString("estado"));
                contratos.setInquilino(inquilinoData.BuscarInquilino(rs.getString("idInquilino")));
                contratos.setInmueble(inmuebleData.buscarInmueblesPorID(rs.getInt("idInmueble")));                                             
            }
            System.out.println("Se ha econtrado correctamente");
            ps.close();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("No se encontrado el contrato"+ex.getMessage());
        }
    }
    
    public List<Contrato> listarContratos()
    {
        String sql="SELECT * FROM contrato";
        List<Contrato> lista = new ArrayList<Contrato>();
        Contrato contrato;
        Inquilino inquilino;
        Inmueble inmueble;
        
        try
        {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {    
                contrato = new Contrato();
                inquilino = new Inquilino();
                inmueble = new Inmueble();
                
                contrato.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                contrato.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                contrato.setEstado(rs.getString("estado"));
                inquilino.setCuilInquilino(rs.getString("IdInquilino"));
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                contrato.setInquilino(inquilino);
                contrato.setInmueble(inmueble); 
                
                lista.add(contrato);
            }
            
            System.out.println("se ha obtenido la lista correctamente");
            
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("No se ha podido obtener la lista"+ex.getMessage());
        }
        
        return lista;
        
    }
    
    
    
    //************ nuevo guardar
    
        public boolean guardarContratoN(Inmueble inmueble, Inquilino inquilino,Contrato contrato){
        
    contrato=new Contrato();
    inquilino=new Inquilino();
    inmueble=new Inmueble();
   ContratoData contratoData;
    
        try {
            
            //INSERT INTO `contrato`( `idInquilino`, `idInmueble`, `fechaInicial`, `fechaFinal`, `estado`) VALUES ("20222222229",30,2019-10-10,2020-10-10,"No Disponible")
            String sql = "INSERT INTO contrato (idInquilino, idInmueble, fechaInicial, fechaFinal, estado) VALUES (?, ?, ?, ?, ? )";
            
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inquilino.getCuilInquilino());
            ps.setInt(2, inmueble.getIdInmueble());
            ps.setDate(3,Date.valueOf( contrato.getFechaInicial()));
            ps.setDate(4, Date.valueOf(contrato.getFechaFinal()));
            ps.setString(5, contrato.getEstado());
            
            
            int count = ps.executeUpdate();//Nos retorna un entero que equivale a la cantidad de campos afectados
            
            if(count > 0){
                System.out.println("Se guardo el contrato correctamente!!");
                ps.close();//CERRAMOS EL STATEMENTS
                return true;
            }else{
                System.out.println("No se puede guardar el contrato");
                ps.close();//CERRAMOS EL STATEMENTS
                return false;
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            System.out.println( "ERROR: no se pudo insertar(GUARDAR)..."+ex.getMessage());
            return false;
        }
    }
    
    
    //******** fin guardar nuevo
    
}
