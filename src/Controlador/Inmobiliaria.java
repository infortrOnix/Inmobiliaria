
package Controlador;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @kaiserkey
 * implements ActionListener, MouseListener
 */
public class Inmobiliaria {
    /*private Conexion con;
    private MenuPrincipal menuPrincipal;
    private Inmueble inmueble;
    private InmuebleData inmuebleData;
    private InmuebleVista inmuebleVista;
    private Propietario propietario;
    private tipoInmueble tipo;
    private PropietarioData propietarioData;
    private PropietarioVista propietarioVista;
    

    public Inmobiliaria() {
        menuPrincipal = new MenuPrincipal();
        inmuebleVista = new InmuebleVista();
        menuPrincipal.setVisible(true);
        
        menuPrincipal.mInmueble.addActionListener(this);
        menuPrincipal.mSalir.addActionListener(this);
        menuPrincipal.mPropietario.addActionListener(this);
        inmuebleVista.menuNuevo.addActionListener(this);
        inmuebleVista.menuBuscar.addActionListener(this);
        inmuebleVista.menuEliminar.addActionListener(this);
        inmuebleVista.menuActualizar.addActionListener(this);
        inmuebleVista.menuBuscar.addActionListener(this);
        inmuebleVista.menuCancelar.addActionListener(this);
        
        inmuebleVista.btnGuardar.addActionListener(this);
        inmuebleVista.btnCancelar.addActionListener(this);
        
    }
    
    public static void main(String[] args) {
 
         Inmobiliaria inmobiliaria = new Inmobiliaria();
         
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==menuPrincipal.mPropietario){
            menuPrincipal.Escritorio.removeAll();
            menuPrincipal.Escritorio.repaint();
            propietarioVista=new PropietarioVista();
            propietarioVista.setVisible(true);
            menuPrincipal.Escritorio.add(propietarioVista);
            menuPrincipal.Escritorio.moveToFront(propietarioVista);
        }
        
        if(e.getSource()==inmuebleVista.menuNuevo){
            inmuebleVista.btnGuardar.setEnabled(true);
            inmuebleVista.tbIdInmueble.setEditable(false);
            inmuebleVista.lavelCodigoInmueble.setText(null);
            inmuebleVista.tbAltura.setEditable(true);
            inmuebleVista.tbCodigoZona.setEditable(true);
            inmuebleVista.tbDireccion.setEditable(true);
            inmuebleVista.tbIDTipo.setEditable(true);
            inmuebleVista.tbSuperficie.setEditable(true);
            inmuebleVista.tbIDPropietario.setEditable(true);
            inmuebleVista.spPrecio.setEnabled(true);
            inmuebleVista.btnBuscar.setEnabled(false);
            inmuebleVista.btnEliminar.setEnabled(false);
            inmuebleVista.btnActualizar.setEnabled(false);
            inmuebleVista.btnCancelar.setEnabled(true);
            inmuebleVista.cbIDInmueble.setEnabled(false);
            inmuebleVista.cbCUIT.setEnabled(false);
            inmuebleVista.cbDireccion.setEnabled(false);
            inmuebleVista.cbPrecio.setEnabled(false);
            inmuebleVista.cbDisponible.setEnabled(false);
            inmuebleVista.rbDisponibleN.setEnabled(true);
            inmuebleVista.rbDisponibleY.setEnabled(true);
            
            inmuebleVista.lavelCUIT.setText("CUIT del Propieario");
            inmuebleVista.lavelCodigoTipo.setText("Codigo Tipo de Inmueble");
            inmuebleVista.lavelDireccion.setText("Direccion");
            inmuebleVista.lavelAltura.setText("Altura");
            inmuebleVista.lavelSuperficie.setText("Superficie");
            inmuebleVista.lavelPrecioBase.setText("Precio Base");
            inmuebleVista.lavelCodigoZona.setText("Codigo de Zona");
            inmuebleVista.labelDisponible.setText("Disponible");
            
        }
        if(e.getSource()==inmuebleVista.menuEliminar){
            inmuebleVista.btnEliminar.setEnabled(true);
            inmuebleVista.tbIdInmueble.setEditable(true);
            inmuebleVista.tbAltura.setEditable(false);
            inmuebleVista.tbCodigoZona.setEditable(false);
            inmuebleVista.tbDireccion.setEditable(false);
            inmuebleVista.tbIDTipo.setEditable(false);
            inmuebleVista.tbSuperficie.setEditable(false);
            inmuebleVista.tbIDPropietario.setEditable(false);
            inmuebleVista.spPrecio.setEnabled(false);
            inmuebleVista.labelDisponible.setText(null);
            inmuebleVista.lavelAltura.setText(null);
            inmuebleVista.lavelCUIT.setText(null);
            inmuebleVista.lavelCodigoTipo.setText(null);
            inmuebleVista.lavelCodigoZona.setText(null);
            inmuebleVista.lavelDireccion.setText(null);
            inmuebleVista.lavelPrecioBase.setText(null);
            inmuebleVista.lavelSuperficie.setText(null);
            inmuebleVista.btnCancelar.setEnabled(true);
            inmuebleVista.btnBuscar.setEnabled(false);
            inmuebleVista.btnActualizar.setEnabled(false);
            inmuebleVista.cbIDInmueble.setEnabled(false);
            inmuebleVista.cbCUIT.setEnabled(false);
            inmuebleVista.cbDireccion.setEnabled(false);
            inmuebleVista.cbPrecio.setEnabled(false);
            inmuebleVista.cbDisponible.setEnabled(false);
            inmuebleVista.btnGuardar.setEnabled(false);
            inmuebleVista.rbDisponibleN.setEnabled(false);
            inmuebleVista.rbDisponibleY.setEnabled(false);
            inmuebleVista.lavelCodigoInmueble.setText("Codigo Inmueble");
        }
        
        if(e.getSource()==inmuebleVista.menuBuscar){
            
            inmuebleVista.tbIdInmueble.setEditable(true);
            inmuebleVista.tbAltura.setEditable(false);
            inmuebleVista.tbCodigoZona.setEditable(false);
            inmuebleVista.tbDireccion.setEditable(true);
            inmuebleVista.tbIDTipo.setEditable(false);
            inmuebleVista.tbSuperficie.setEditable(false);
            inmuebleVista.tbIDPropietario.setEditable(true);
            inmuebleVista.spPrecio.setEnabled(true);
            inmuebleVista.btnBuscar.setEnabled(true);
            inmuebleVista.btnGuardar.setEnabled(false);
            inmuebleVista.btnEliminar.setEnabled(false);
            inmuebleVista.btnActualizar.setEnabled(false);
            inmuebleVista.btnCancelar.setEnabled(true);
            inmuebleVista.cbIDInmueble.setEnabled(false);
            inmuebleVista.cbCUIT.setEnabled(false);
            inmuebleVista.cbDireccion.setEnabled(false);
            inmuebleVista.cbPrecio.setEnabled(false);
            inmuebleVista.rbDisponibleN.setEnabled(true);
            inmuebleVista.rbDisponibleY.setEnabled(true);
            inmuebleVista.cbIDInmueble.setEnabled(true);
            inmuebleVista.cbCUIT.setEnabled(true);
            inmuebleVista.cbDireccion.setEnabled(true);
            inmuebleVista.cbPrecio.setEnabled(true);
            inmuebleVista.cbDisponible.setEnabled(true);

            
            inmuebleVista.lavelCUIT.setText("CUIT del Propieario");
            inmuebleVista.lavelCodigoTipo.setText("Codigo Tipo de Inmueble");
            inmuebleVista.lavelDireccion.setText("Direccion");
            inmuebleVista.lavelAltura.setText("Altura");
            inmuebleVista.lavelSuperficie.setText("Superficie");
            inmuebleVista.lavelPrecioBase.setText("Precio Base");
            inmuebleVista.lavelCodigoZona.setText("Codigo de Zona");
            inmuebleVista.labelDisponible.setText("Disponible");
            inmuebleVista.lavelCodigoInmueble.setText("Codigo Inmueble");
            
            inmuebleVista.lavelAltura.setText(null);
            inmuebleVista.lavelCodigoTipo.setText(null);
            inmuebleVista.lavelCodigoZona.setText(null);
            inmuebleVista.lavelSuperficie.setText(null);
        }
        
        if(e.getSource()==inmuebleVista.menuActualizar){
            inmuebleVista.btnGuardar.setEnabled(false);
            inmuebleVista.tbIdInmueble.setEditable(false);
            inmuebleVista.lavelCodigoInmueble.setText(null);
            inmuebleVista.tbAltura.setEditable(true);
            inmuebleVista.tbCodigoZona.setEditable(true);
            inmuebleVista.tbDireccion.setEditable(true);
            inmuebleVista.tbIDTipo.setEditable(true);
            inmuebleVista.tbSuperficie.setEditable(true);
            inmuebleVista.tbIDPropietario.setEditable(true);
            inmuebleVista.spPrecio.setEnabled(true);
            inmuebleVista.btnBuscar.setEnabled(false);
            inmuebleVista.btnEliminar.setEnabled(false);
            inmuebleVista.btnActualizar.setEnabled(true);
            inmuebleVista.btnCancelar.setEnabled(true);
            inmuebleVista.cbIDInmueble.setEnabled(false);
            inmuebleVista.cbCUIT.setEnabled(false);
            inmuebleVista.cbDireccion.setEnabled(false);
            inmuebleVista.cbPrecio.setEnabled(false);
            inmuebleVista.cbDisponible.setEnabled(false);
            inmuebleVista.rbDisponibleN.setEnabled(true);
            inmuebleVista.rbDisponibleY.setEnabled(true);
            
            inmuebleVista.lavelCUIT.setText("CUIT del Propieario");
            inmuebleVista.lavelCodigoTipo.setText("Codigo Tipo de Inmueble");
            inmuebleVista.lavelDireccion.setText("Direccion");
            inmuebleVista.lavelAltura.setText("Altura");
            inmuebleVista.lavelSuperficie.setText("Superficie");
            inmuebleVista.lavelPrecioBase.setText("Precio Base");
            inmuebleVista.lavelCodigoZona.setText("Codigo de Zona");
            inmuebleVista.labelDisponible.setText("Disponible");
        }
        
        
        if(e.getSource()==menuPrincipal.mInmueble){
            menuPrincipal.Escritorio.removeAll();
            menuPrincipal.Escritorio.repaint();
            inmuebleVista.setVisible(true);
            menuPrincipal.Escritorio.add(inmuebleVista);
            menuPrincipal.Escritorio.moveToFront(inmuebleVista);
        }
        if(e.getSource()==inmuebleVista.menuCancelar){
            inmuebleVista.btnGuardar.setEnabled(false);
            inmuebleVista.btnEliminar.setEnabled(false);
            inmuebleVista.btnBuscar.setEnabled(false);
            inmuebleVista.btnActualizar.setEnabled(false);
            inmuebleVista.btnCancelar.setEnabled(true);
            inmuebleVista.tbIdInmueble.setEditable(true);
            inmuebleVista.tbAltura.setEditable(false);
            inmuebleVista.tbCodigoZona.setEditable(false);
            inmuebleVista.tbDireccion.setEditable(false);
            inmuebleVista.tbIDTipo.setEditable(false);
            inmuebleVista.tbSuperficie.setEditable(false);
            inmuebleVista.tbIDPropietario.setEditable(false);
            inmuebleVista.tbIdInmueble.setEditable(false);
            inmuebleVista.spPrecio.setEnabled(false);
            inmuebleVista.labelDisponible.setText(null);
            inmuebleVista.lavelAltura.setText(null);
            inmuebleVista. lavelCUIT.setText(null);
            inmuebleVista.lavelCodigoTipo.setText(null);
            inmuebleVista.lavelCodigoZona.setText(null);
            inmuebleVista.lavelDireccion.setText(null);
            inmuebleVista.lavelPrecioBase.setText(null);
            inmuebleVista.lavelCodigoInmueble.setText(null);
            inmuebleVista.lavelSuperficie.setText(null);
            inmuebleVista.cbIDInmueble.setEnabled(false);
            inmuebleVista.cbCUIT.setEnabled(false);
            inmuebleVista.cbDireccion.setEnabled(false);
            inmuebleVista.cbPrecio.setEnabled(false);
            inmuebleVista.cbDisponible.setEnabled(false);
            inmuebleVista.rbDisponibleN.setEnabled(false);
            inmuebleVista.rbDisponibleY.setEnabled(false);
            inmuebleVista.cbDisponible.setEnabled(false);
        }
        
        if(e.getSource()==inmuebleVista.btnCancelar){
            inmuebleVista.btnGuardar.setEnabled(false);
            inmuebleVista.btnEliminar.setEnabled(false);
            inmuebleVista.btnBuscar.setEnabled(false);
            inmuebleVista.btnActualizar.setEnabled(false);
            inmuebleVista.tbIdInmueble.setEditable(true);
            inmuebleVista.tbAltura.setEditable(false);
            inmuebleVista.tbCodigoZona.setEditable(false);
            inmuebleVista.tbDireccion.setEditable(false);
            inmuebleVista.tbIDTipo.setEditable(false);
            inmuebleVista.tbSuperficie.setEditable(false);
            inmuebleVista.tbIDPropietario.setEditable(false);
            inmuebleVista.tbIdInmueble.setEditable(false);
            inmuebleVista.spPrecio.setEnabled(false);
            inmuebleVista.labelDisponible.setText(null);
            inmuebleVista.lavelAltura.setText(null);
            inmuebleVista. lavelCUIT.setText(null);
            inmuebleVista.lavelCodigoTipo.setText(null);
            inmuebleVista.lavelCodigoZona.setText(null);
            inmuebleVista.lavelDireccion.setText(null);
            inmuebleVista.lavelPrecioBase.setText(null);
            inmuebleVista.lavelCodigoInmueble.setText(null);
            inmuebleVista.lavelSuperficie.setText(null);
            inmuebleVista.cbIDInmueble.setEnabled(false);
            inmuebleVista.cbCUIT.setEnabled(false);
            inmuebleVista.cbDireccion.setEnabled(false);
            inmuebleVista.cbPrecio.setEnabled(false);
            inmuebleVista.cbDisponible.setEnabled(false);
            inmuebleVista.rbDisponibleN.setEnabled(false);
            inmuebleVista.rbDisponibleY.setEnabled(false);
            inmuebleVista.cbDisponible.setEnabled(false);
        }
        if(e.getSource()==menuPrincipal.mSalir){
            System.exit(0);
        }

        if(e.getSource() == inmuebleVista.btnGuardar){
            
            if(inmuebleVista.tbIDPropietario.getText() == ""||
                    inmuebleVista.tbIDTipo.getText() == ""||
                    inmuebleVista.tbAltura.getText() == ""||
                    inmuebleVista.tbCodigoZona.getText() == ""||
                    inmuebleVista.tbDireccion.getText() == ""||
                    inmuebleVista.tbSuperficie.getText() == ""||
                    inmuebleVista.getButtonGroup1().isSelected(inmuebleVista.getButtonGroup1().getSelection()))
            {
                JOptionPane.showMessageDialog(null,"Rellene todos los campos vacios","Campo Vacio",JOptionPane.WARNING_MESSAGE );
            }else
            {
                inmueble = new Inmueble();
                propietario = new Propietario();
                tipo = new tipoInmueble();
                inmueble.setIdPropietario(Integer.parseInt(inmuebleVista.tbIDPropietario.getText()));
                inmueble.setIdTipoInmueble(Integer.parseInt(inmuebleVista.tbIDTipo.getText()));
                inmueble.setAlturaInmueble(Integer.parseInt(inmuebleVista.tbAltura.getText()));
                inmueble.setCodigoZona(Integer.parseInt(inmuebleVista.tbCodigoZona.getText()));
                inmueble.setDireccion(inmuebleVista.tbDireccion.getText());
                inmueble.setPrecioBase(Double.parseDouble(inmuebleVista.spPrecio.getValue().toString()));
                inmueble.setSuperficie(Double.parseDouble(inmuebleVista.tbSuperficie.getText()));
                inmueble.setDisponible(inmuebleVista.getButtonGroup1().getSelection().toString());
                con = new Conexion();
                con.getConnection();
                inmuebleData = new InmuebleData(con);
                
                inmuebleData.guardarInmueble(inmueble, null, null);
        
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    */
}
