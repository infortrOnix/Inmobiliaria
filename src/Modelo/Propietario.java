
package Modelo;

/**
 *
 * @author Norberto
 */
public class Propietario {
    
    private int cuilPropietario;
    private String apellidoPropietario;
    private String nombrePropietario;
    private String domicilioPropietario;
    private int telefono;
    private String email;
    
    public Propietario(){
        
    }

    public Propietario(int cuilPropietario, String apellidoPropietario, String nombrePropietario, String domicilioPorpietario, int telefono, String email) {
        this.cuilPropietario = cuilPropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilioPropietario = domicilioPorpietario;
        this.telefono = telefono;
        this.email = email;
    }

    public int getCuilPropietario() {
        return cuilPropietario;
    }

    public void setCuilPropietario(int cuilPropietario) {
        this.cuilPropietario = cuilPropietario;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getDomicilioPropietario() {
        return domicilioPropietario;
    }

    public void setDomicilioPropietario(String domicilioPorpietario) {
        this.domicilioPropietario = domicilioPorpietario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
}
