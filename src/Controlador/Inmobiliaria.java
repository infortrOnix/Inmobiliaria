
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
 * 
 */
public class Inmobiliaria implements ActionListener, MouseListener{
    private ConexionD con;
    private VistaInmobiliaria v;
    private Inmueble inmueble;
    private InmuebleData inmuebleData;
    private FormularioInmueble fInmueble;
    private Propietario propietario;
    private tipoInmueble tipo;
    private PropietarioData propietarioData;
    

    public Inmobiliaria() {
        v = new VistaInmobiliaria();
        v.setVisible(true);
        v.mInmueble.addActionListener(this);
        v.mSalir.addActionListener(this);
        v.mActualizarInmueble.addActionListener(this);
        v.mBuscarInmueble.addActionListener(this);
        fInmueble = new FormularioInmueble();
        fInmueble.btCargar.addActionListener(this);
        
        
    }
    
    public static void main(String[] args) {
 
         Inmobiliaria i = new Inmobiliaria();
         
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==v.mInmueble){
            v.Escritorio.removeAll();
            v.Escritorio.repaint();
            fInmueble.setVisible(true);
            v.Escritorio.add(fInmueble);
            v.Escritorio.moveToFront(fInmueble);
        }
        if(e.getSource()==v.mSalir){
            System.exit(0);
        }
        if(e.getSource() == fInmueble.btCargar){
            if(fInmueble.tbIDPropietario.getText() == ""||
                    fInmueble.tbIDTipo.getText() == ""||
                    fInmueble.tbAltura.getText() == ""||
                    fInmueble.tbCodigoZona.getText() == ""||
                    fInmueble.tbDireccion.getText() == ""||
                    fInmueble.tbSuperficie.getText() == ""||
                    fInmueble.getButtonGroup1().isSelected(fInmueble.getButtonGroup1().getSelection()))
            {
                JOptionPane.showMessageDialog(null,"Rellene todos los campos vacios","Campo Vacio",JOptionPane.WARNING_MESSAGE );
            }else{
                inmueble = new Inmueble();
                propietario = new Propietario();
                tipo = new tipoInmueble();
                inmueble.setIdPropietario(Integer.parseInt(fInmueble.tbIDPropietario.getText()));
                inmueble.setIdTipoInmueble(Integer.parseInt(fInmueble.tbIDTipo.getText()));
                inmueble.setAlturaInmueble(Integer.parseInt(fInmueble.tbAltura.getText()));
                inmueble.setCodigoZona(Integer.parseInt(fInmueble.tbCodigoZona.getText()));
                inmueble.setDireccion(fInmueble.tbDireccion.getText());
                inmueble.setPrecioBase(Double.parseDouble(fInmueble.spPrecio.getValue().toString()));
                inmueble.setSuperficie(Double.parseDouble(fInmueble.tbSuperficie.getText()));
                inmueble.setDisponible(fInmueble.getButtonGroup1().getSelection().toString());
                con = new ConexionD();
                con.crearConexion();
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
    
}
