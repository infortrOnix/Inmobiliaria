
package inmobiliaria;

import Modelo.*;

/**
 *
 * @author GrupoCristina
 * 
 */
public class Inmobiliaria {

    
    public static void main(String[] args) {
        
       
        Propietario lazaro1=new Propietario(10000000,"Gutierrez","Martin","Paraguay s/n",23187066,"aguanteKris@hotmail.com");
        
        ConexionN con=new ConexionN();
        PropietarioData lazaroD=new PropietarioData(con);
        
       //lazaroD.guardarPropietario(lazaro1);//Ok
       //lazaroD.actualizarPropietario(lazaro1);//Ok
       //lazaroD.borrarPropietario(10000000);//Ok
       lazaroD.buscarPropietario(10000000);
       /*
       lazaroD.buscarPropietario(16456189);
       System.out.println(lazaroD.buscarPropietario(16456189).getApellidoPropietario());
       */
       
        /*
        lazaroD.listarPropietario();
        for(int i=0;i<lazaroD.listarPropietario().size();i++){
            
            System.out.println(lazaroD.listarPropietario().get(i).getCuilPropietario()+" "+
                    lazaroD.listarPropietario().get(i).getApellidoPropietario()+" "+
                    lazaroD.listarPropietario().get(i).getNombrePropietario()+" "+
                    lazaroD.listarPropietario().get(i).getDomicilioPropietario()+" "+
                    lazaroD.listarPropietario().get(i).getTelefono()+" "+
                    lazaroD.listarPropietario().get(i).getEmail());
        }
        */
        
        //Aqui agrego el codigo para probar lo que hice Daniel-San
        tipoInmueble tipo = new tipoInmueble();
        tipo.setIdTipo(1);
        
        Inmueble i = new Inmueble();
        i.setDireccion("Un lugar muy lejano");
        i.setAlturaInmueble(999);
        i.setCodigoZona(888);
        i.setDisponible("No");
        i.setPrecioBase(3000000);
        i.setSuperficie(88.8);
        
        InmuebleData id = new InmuebleData(con);
        id.guardarInmueble(i, lazaro1, tipo);
        //i.setIdInmueble(10);
        //id.buscarInmueble(i);
        //id.borrarInmueble(9);
        //id.actualizarInmueble(i, lazaro1, tipo);
    }
    
}
