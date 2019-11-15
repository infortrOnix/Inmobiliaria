
package Modelo;

/**
 *
 * @author Norberto
 */
public class Propietario {
    
    private int cuitPropietario;
    private String apellidoPropietario;
    private String nombrePropietario;
    private String domicilioPropietario;
    private int telefono;
    private String email;
    
    public Propietario(){
        
    }

    public Propietario(int cuilPropietario, String apellidoPropietario, String nombrePropietario, String domicilioPorpietario, int telefono, String email) {
        this.cuitPropietario = cuilPropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilioPropietario = domicilioPorpietario;
        this.telefono = telefono;
        this.email = email;
    }

    public int getCuitPropietario() {
        return cuitPropietario;
    }

    public void setCuitPropietario(int cuilPropietario) {
        this.cuitPropietario = cuilPropietario;
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
