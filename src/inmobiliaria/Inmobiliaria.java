
package inmobiliaria;

import Modelo.ConexionN;
import Modelo.Propietario;
import Modelo.PropietarioData;

/**
 *
 * @author Norberto
 */
public class Inmobiliaria {
    //Daniel-San ha estado por aqui!! :D
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        Propietario lazaro1=new Propietario(10000000,"Gutierrez","Martin","Paraguay s/n",23187066,"aguanteKris@hotmail.com");
        
        ConexionN con=new ConexionN();
        PropietarioData lazaroD=new PropietarioData(con);
        
       // lazaroD.guardarPropietario(lazaro1);//Ok
        lazaroD.actualizarPropietario(lazaro1);//Ok
       //lazaroD.borrarPropietario(20187066);//Ok
       
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
    }
    
}
