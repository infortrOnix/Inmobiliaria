
package Modelo;

/**
 *
 * @kaiserkey
 * 
 */
public class Inmueble {
    private int idInmueble,
            idPropietario,
            idTipoInmueble, 
            codigoZona,
            alturaInmueble;
    private String direccion,
            disponible;
    private double superficie, 
            precioBase;

    public Inmueble(int idPropietario, 
                    int idTipoInmueble, 
                    String direccion, 
                    int alturaInmueble, 
                    double superficie, 
                    double precioBase, 
                    int codigoZona, 
                    String disponible)
    {
        this.idPropietario = idPropietario;
        this.idTipoInmueble = idTipoInmueble;
        this.direccion = direccion;
        this.alturaInmueble = alturaInmueble;
        this.superficie = superficie;
        this.precioBase = precioBase;
        this.codigoZona = codigoZona;
        this.disponible = disponible;
    }

    public Inmueble(){}

    public int getIdInmueble() {return idInmueble;}

    public void setIdInmueble(int idInmueble) {this.idInmueble = idInmueble;}

    public int getIdPropietario() {return idPropietario;}

    public void setIdPropietario(int idPropietario) {this.idPropietario = idPropietario;}
        
    public int getIdTipoInmueble() {return idTipoInmueble;}    

    public void setIdTipoInmueble(int idTipoInmueble) {this.idTipoInmueble = idTipoInmueble;}
        
    public String getDireccion() {return direccion;}
    
    public void setDireccion(String direccion) {this.direccion = direccion;}
        
    public int getAlturaInmueble() {return alturaInmueble;}
        
    public void setAlturaInmueble(int alturaInmueble) {this.alturaInmueble = alturaInmueble;}
        
    public double getSuperficie() {return superficie;}
        
    public void setSuperficie(double superficie) {this.superficie = superficie;}
        
    public double getPrecioBase() {return precioBase;}
        
    public void setPrecioBase(double precioBase) {this.precioBase = precioBase;}
        
    public int getCodigoZona() {return codigoZona;}
        
    public void setCodigoZona(int codigoZona) {this.codigoZona = codigoZona;}
        
    public String getDisponible() {return disponible;}
        
    public void setDisponible(String disponible) {this.disponible = disponible;}
        
    
    
}
