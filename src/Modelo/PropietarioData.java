
package Modelo;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Norberto
 */
public class PropietarioData {
  
   //crea conexion 
    Connection con = null;
    
    public PropietarioData(Conexion conexion){
        con=conexion.getConnection();//obtengo conexion
    }

    public PropietarioData() {
    }

    
    //Cargar
    public void guardarPropietario(Propietario propietario){
        String sql="INSERT INTO propietario(cuitPropietario,apellido,nombre,domicilio, telefono, email) VALUES(?,?,?,?,?,?);";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, propietario.getCuitPropietario());
            ps.setString(2, propietario.getApellidoPropietario());
            ps.setString(3,propietario.getNombrePropietario());
            ps.setString(4,propietario.getDomicilioPropietario());
            ps.setString(5,propietario.getTelefono());
            ps.setString(6,propietario.getEmail());
            
            ps.executeUpdate();
            System.out.println("Propietario ID : "+propietario.getCuitPropietario()+" almacenado.");
            JOptionPane.showMessageDialog(null,"Propietario ID : "+propietario.getCuitPropietario()+" almacenado.","Información",JOptionPane.INFORMATION_MESSAGE );
            ResultSet rs=ps.getGeneratedKeys();
                                
            ps.close();
            
        }
        catch (SQLException ex){
            System.out.println("Error al Inserta Propietario !");
            JOptionPane.showMessageDialog(null,"Error al Inserta Propietario !","Advertencia",JOptionPane.WARNING_MESSAGE );
            Logger.getLogger(PropietarioData.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    //Fin Cargar
    
    //Modificar
    
        public void actualizarPropietario(Propietario propietario){
        String sql="UPDATE propietario SET apellido=?,nombre=?,domicilio=?,telefono=?,email=? WHERE cuitPropietario=?;";
         
        
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            
            ps.setString(1, propietario.getApellidoPropietario());
            ps.setString(2,propietario.getNombrePropietario());
            ps.setString(3,propietario.getDomicilioPropietario());
            ps.setString(4,propietario.getTelefono());
            ps.setString(5,propietario.getEmail());
            ps.setString(6, propietario.getCuitPropietario());
            
            
            ps.executeUpdate();
            
            System.out.println("Propietario CUIT : "+propietario.getCuitPropietario()+" actualizado.");
            JOptionPane.showMessageDialog(null,"Propietario CUIT : "+propietario.getCuitPropietario()+" actualizado.","Información",JOptionPane.INFORMATION_MESSAGE );
            ps.close();
            
        }
        catch (SQLException ex){
            System.out.println("no se pudo Actualizar el Propietario");
            JOptionPane.showMessageDialog(null,"no se pudo Actualizar el Propietario","Advertencia",JOptionPane.WARNING_MESSAGE );
            Logger.getLogger(PropietarioData.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
        
        //FIN MODIFICAR
        
        // Borrar Propietario
        public void borrarPropietario(String idPropietario){
            
            String sql="DELETE FROM propietario WHERE cuitPropietario=?";
           
            try{
                PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, idPropietario);
            
                ps.executeUpdate();
            
                System.out.println("Propietario :"+idPropietario+"  fue eliminado.");
                JOptionPane.showMessageDialog(null,"Propietario CUIL : "+idPropietario+" fue eliminado.","Información",JOptionPane.INFORMATION_MESSAGE );
            
                ps.close();
            
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"no se pudo borrar el Propietario "+idPropietario,"Advertencia",JOptionPane.WARNING_MESSAGE );
            Logger.getLogger(PropietarioData.class.getName()).log(Level.SEVERE, null,ex);
        }
            
        }
        
        // FIN Borrar
        
       // BUSCAR Propietario
        
      public Propietario buscarPropietario(String idPropietario){
          
          Propietario propietario = null;
        try {
            
           String sql = "SELECT * FROM propietario  WHERE cuitPropietario=?;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, idPropietario);
            ResultSet resultSet = ps.executeQuery();//no modifica la BD solo saca informacion
             
            
            while(resultSet.next()){//el while recorre toda la BD
                
                propietario = new Propietario();
                propietario.setCuitPropietario(resultSet.getString("cuitPropietario"));
                propietario.setApellidoPropietario(resultSet.getString("apellido"));
                propietario.setNombrePropietario(resultSet.getString("nombre"));
                propietario.setDomicilioPropietario(resultSet.getString("domicilio"));
                propietario.setTelefono(resultSet.getString("telefono"));
                propietario.setEmail(resultSet.getString("email"));
                
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo encontrar el Propietario ID :"+idPropietario);
            JOptionPane.showMessageDialog(null,"No se pudo encontrar el Propietario ID :"+idPropietario,"Advertencia",JOptionPane.WARNING_MESSAGE );
            Logger.getLogger(PropietarioData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return propietario;
      }
      //Fin Buscar
      
  
        //LISTAR TODOS
     
        
      public List<Propietario> listarPropietario(){
        
        List<Propietario> listaPropietario=new ArrayList<>();
        
        Propietario propietario = null;
        try {
            
           String sql = "SELECT * FROM propietario ;";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet resultSet = ps.executeQuery();//no modifica la BD solo saca informacion
            
            
            while(resultSet.next()){//el while recorre toda la BD
                propietario=new Propietario();
                
                propietario.setCuitPropietario(resultSet.getString("cuitPropietario"));
                propietario.setApellidoPropietario(resultSet.getString("apellido"));
                propietario.setNombrePropietario(resultSet.getString("nombre"));
                propietario.setDomicilioPropietario(resultSet.getString("domicilio"));
                propietario.setTelefono(resultSet.getString("telefono"));
                propietario.setEmail(resultSet.getString("email"));
                
                listaPropietario.add(propietario);
                
            }
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"No se pudo listar los Propietarios ","Advertencia",JOptionPane.WARNING_MESSAGE );
            Logger.getLogger(PropietarioData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaPropietario;
        
      }  
      //FIN LISTAR     
      
}
    
    
