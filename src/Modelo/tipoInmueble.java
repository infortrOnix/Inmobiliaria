
package Modelo;

/**
 *
 * @author 
 * 
 */
public class tipoInmueble {
    private int idTipo;
    private String descripcion;

    public tipoInmueble(int idTipo, 
                        String descripcion) 
    {
        this.idTipo = idTipo;
        this.descripcion = descripcion;
    }

    public tipoInmueble() {}

    public int getIdTipo() {return idTipo;}
        
    public void setIdTipo(int idTipo) {this.idTipo = idTipo;}
        
    public String getDescripcion() {return descripcion;}
        

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
        
}
