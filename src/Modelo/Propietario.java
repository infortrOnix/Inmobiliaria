
package Modelo;

/**
 *
 * @author Norberto
 */
public class Propietario {
    
    private String cuitPropietario;
    private String apellidoPropietario;
    private String nombrePropietario;
    private String domicilioPropietario;
    private String telefono;
    private String email;
    public Propietario(){
        
    }

    public Propietario(String cuilPropietario, String apellidoPropietario, String nombrePropietario, String domicilioPorpietario, String telefono, String email) {
        this.cuitPropietario = cuilPropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.domicilioPropietario = domicilioPorpietario;
        this.telefono = telefono;
        this.email = email;
    }
    
    public Propietario(String cuilPropietario, String apellidoPropietario, String nombrePropietario) {
        this.cuitPropietario = cuilPropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.nombrePropietario = nombrePropietario;
        
    }

    public String getCuitPropietario() {
        return cuitPropietario;
    }

    public void setCuitPropietario(String cuilPropietario) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
