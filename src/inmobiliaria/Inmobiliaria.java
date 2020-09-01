
package inmobiliaria;

import Modelo.*;
import Vista.MenuPrincipal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Norberto
 */
public class Inmobiliaria {

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal;
        menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        
        
        Conexion con = new Conexion();
        con.getConnection();
        
        Inmueble inmueble = new Inmueble();
        Propietario propietario = new Propietario();
        tipoInmueble tipo = new tipoInmueble();
        Inquilino inquilino = new Inquilino(); 
        Contrato contrato  = new Contrato();
        
        InmuebleData inmuebleData = new InmuebleData(con);
        PropietarioData propietarioData = new PropietarioData(con);
        tipoInmuebleData tipoData = new tipoInmuebleData(con);
        InquilinoData inquilinoData = new InquilinoData(con);
        ContratoData contratoData = new ContratoData(con);
        
       //** TEST Contrato
         
          inquilino.setCuilInquilino("20222222229");
          inmueble.setIdInmueble(30);
          
          contrato.setFechaInicial(LocalDate.parse("2019-12-10"));
          contrato.setFechaFinal(LocalDate.parse("2020-12-10"));
          contrato.setEstado("No Disponible");
          contratoData.guardarContratoN(inmueble, inquilino, contrato);
         
         
        
        
        //****Fin test Contrato
        
         /**
         * 
         * 
         * TEST INMUEBLE
         *
         * 
         **/
        
       /* 
        propietario.setCuitPropietario("20222222222");
        tipo.setIdTipo(5);
        inmueble.setDireccion("LUGAR");
        inmueble.setAlturaInmueble(2200);
        inmueble.setCodigoZona(5759);
        inmueble.setDisponible("Si");
        inmueble.setPrecioBase(10);
        inmueble.setSuperficie(50);
        inmuebleData.guardarInmueble(inmueble, propietario, tipo);
       // inmuebleData.borrarInmueble(28);
       // inmueble.setIdInmueble(2);
      //  inmuebleData.actualizarInmueble(inmueble, propietario, tipo);
       // inmuebleData.buscarInmueble(inmueble);
        */
         /**
         * 
         * 
         * TEST PROPIETARIO
         *
         * 
         **/

        /*Propietario lazaro1=new Propietario(); 
        lazaro1.setCuitPropietario("11000000");
        lazaro1.setApellidoPropietario("Gutierrez");
        lazaro1.setNombrePropietario("Martin");
        lazaro1.setDomicilioPropietario("Paraguay s/n");
        lazaro1.setTelefono(23187066);
        lazaro1.setEmail("aguanteKris@hotmail.com");
        
        PropietarioData lazaroD=new PropietarioData(con); 
        //lazaroD.guardarPropietario(lazaro1);
        //lazaroD.actualizarPropietario(lazaro1);
        //lazaroD.borrarPropietario("11000000");
        //lazaroD.buscarPropietario("11000000"); 
        //System.out.println(lazaroD.buscarPropietario("11000000").getApellidoPropietario()); 
        //lazaroD.listarPropietario(); 
        for(int i=0;i<lazaroD.listarPropietario().size();i++){ 
            System.out.println(lazaroD.listarPropietario().get(i).getCuitPropietario()+" "+
                    lazaroD.listarPropietario().get(i).getApellidoPropietario()+" "+
                    lazaroD.listarPropietario().get(i).getNombrePropietario()+" "+ 
                    lazaroD.listarPropietario().get(i).getDomicilioPropietario()+" "+ 
                    lazaroD.listarPropietario().get(i).getTelefono()+" "+ 
                    lazaroD.listarPropietario().get(i).getEmail()); 
        }*/
        
        /**
         * 
         * 
         * TEST INQUILINO
         *
         * 
         **/
        
        /*

       
        inquilino.setCuilInquilino("12345678911"); 
        inquilino.setNombre("Fernando"); 
        inquilino.setApellido("Novara"); 
        inquilino.setLugarTrabajo("La toma"); 
        inquilino.setNombreGarante("Daniel"); 
        inquilino.setDniGarante(12345678); 
        inquilinoData.Guardar(inquilino); 
        
        Inquilino usuario = inquilinoData.Buscar("12345678911"); 
        System.out.println("cuil="+usuario.getCuilInquilino());
        System.out.println("Nombre"+usuario.getNombre()); 
        System.out.println("Apellido"+usuario.getApellido()); 
        System.out.println("Lugar de trabajo"+usuario.getLugarTrabajo()); 
        System.out.println("Nombre Garante"+usuario.getNombreGarante());
        System.out.println("Dni Garanre"+usuario.getDniGarante());
        inquilino.setCuilInquilino("1234567891"); 
        inquilino.setNombre("Fernando Ariel"); 
        inquilino.setApellido("Novara"); 
        inquilino.setLugarTrabajo("La Punta");
        inquilino.setNombreGarante("Norberto"); 
        inquilino.setDniGarante(12345678); 
        inquilinoData.Modificar(inquilino); 
        System.out.println("cuil="+usuario.getCuilInquilino());
        System.out.println("Nombre"+usuario.getNombre()); 
        System.out.println("Apellido"+usuario.getApellido()); 
        System.out.println("Lugar de trabajo"+usuario.getLugarTrabajo());
        System.out.println("Nombre Garante"+usuario.getNombreGarante()); 
        System.out.println("Dni Garanre"+usuario.getDniGarante()); 
        inquilinoData.Eliminar("12345678911");
        */
        
         /**
         * 
         * 
         * TEST CONTRATO
         *
         * 
         **/
        
        /*
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fecha;
        contrato.setFechaInicial(LocalDate.parse("1999/05/12", formatter));
        contrato.setFechaFinal(LocalDate.parse("1999/05/12", formatter));
        inmueble.setIdInmueble(29);
        contrato.setInmueble(inmueble);
        inquilino.setCuilInquilino("20222222229");        
        contrato.setInquilino(inquilino);
        contrato.setEstado("disponible");
        contratoData.guardarContrato(contrato);
        contrato.setIdContrato(2);
        contratoData.buscarContrato(contrato, inquilinoData, inmuebleData);
        System.out.println(contrato.getInmueble().getIdInmueble());
        contratoData.borrarContrato(2);
        contratoData.actualizarContrato(contrato);*/
        
         /**
         * 
         * 
         * TEST TIPOINMUEBLE
         *
         * 
         **/
        /*
        tipo.setDescripcion("inmueble nuevo");
        tipoData.guardarTipo(tipo);
        tipo.setIdTipo(3);
        tipoData.actualizarTipo(tipo);
        tipoData.borrarTipo(4);
        tipoData.buscarTipo(tipo);
                */
    }
    
}
