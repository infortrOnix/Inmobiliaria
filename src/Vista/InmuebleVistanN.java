/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.Inmueble;
import Modelo.InmuebleData;
import Modelo.Propietario;
import Modelo.PropietarioData;
import Modelo.tipoInmueble;
import Modelo.tipoInmuebleData;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Merliques
 */
public class InmuebleVistanN extends javax.swing.JInternalFrame {
    private Conexion con;
    private Inmueble inmueble;
    private InmuebleData inmuebleData;
    private Propietario propietario;
    private PropietarioData propietarioData;
    private tipoInmueble tipoinmueble;
    private tipoInmuebleData tipoinmuebleData;
    
    public InmuebleVistanN() {
        initComponents();
        setInicializarObjetos();
       // con=new Conexion();
       // inmuebleData=new InmuebleData(con);
        
        this.setSize(840, 449);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) 
        this.getUI()).setNorthPane(null);
        
        jtInmuebles.getTableHeader().setFont(new Font("Courier New",Font.BOLD,12));
        jtInmuebles.getTableHeader().setOpaque(false);
        jtInmuebles.getTableHeader().setBackground(new Color(42, 62, 110));
        jtInmuebles.getTableHeader().setForeground(new Color(255, 255, 255));
       
       //***Propietarios comboBox
       
       
       
       
       //**fin prueba
      
       if(cbCUITPropietario.getItemCount()>0){
           cbCUITPropietario.removeAllItems();
            }
                for(int x=0; x<propietarioData.listarPropietario().size(); x++){
                cbCUITPropietario.setEnabled(true);
              //  cbCUITPropietario.addItem(propietarioData.listarPropietario().get(x).getCuitPropietario()+" / "+propietarioData.listarPropietario().get(x).getApellidoPropietario()+
              //          " "+propietarioData.listarPropietario().get(x).getNombrePropietario());
              cbCUITPropietario.addItem(propietarioData.listarPropietario().get(x).getCuitPropietario());
                
            }
       //***
       
       //*** comboBox tipo Inmueble
       
       if(cbCodigoTipo.getItemCount()>0){
                cbCodigoTipo.removeAllItems();
            }
            for(int x=0; x<tipoinmuebleData.buscarTodosLosTipos().size(); x++){
                cbCodigoTipo.setEnabled(true);
             //   cbCodigoTipo.addItem(Integer.toString(tipoinmuebleData.buscarTodosLosTipos().get(x).getIdTipo())+" "+tipoinmuebleData.buscarTodosLosTipos().get(x).getDescripcion());
             cbCodigoTipo.addItem(Integer.toString(tipoinmuebleData.buscarTodosLosTipos().get(x).getIdTipo()));
            }
       
       //***
        
        //********** Array to JTable****
        
        DefaultTableModel modeloTabla=new DefaultTableModel();
        
        modeloTabla.addColumn("ID Inmueble");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("CUIT Propietario");
        modeloTabla.addColumn("Domicilio");
        modeloTabla.addColumn("Altura");
        modeloTabla.addColumn("Superficie");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Zona");
        modeloTabla.addColumn("Disponible");
        
        //creamos el array
        String[] datoInmueble=new String[9];
        
        for(int i=0;i<inmuebleData.buscarTodosInmuebles().size();i++){
          
           datoInmueble[0]=Integer.toString(inmuebleData.buscarTodosInmuebles().get(i).getIdInmueble());
           datoInmueble[1]=Integer.toString(inmuebleData.buscarTodosInmuebles().get(i).getIdTipoInmueble());
           datoInmueble[2]=(inmuebleData.buscarTodosInmuebles().get(i).getIdPropietario());
           datoInmueble[3]=(inmuebleData.buscarTodosInmuebles().get(i).getDireccion());
           datoInmueble[4]=Double.toString(inmuebleData.buscarTodosInmuebles().get(i).getAlturaInmueble());
           datoInmueble[5]=Double.toString(inmuebleData.buscarTodosInmuebles().get(i).getSuperficie());
           datoInmueble[6]=Double.toString(inmuebleData.buscarTodosInmuebles().get(i).getPrecioBase());
           datoInmueble[7]=Integer.toString(inmuebleData.buscarTodosInmuebles().get(i).getCodigoZona());
           datoInmueble[8]=(inmuebleData.buscarTodosInmuebles().get(i).getDisponible());
           
            modeloTabla.addRow(datoInmueble);
        }
        
        jtInmuebles.setModel(modeloTabla);
        
        //********** Array to JTable****
        
        jtbCuitPropietario.setVisible(false);
        jtbIdTipo.setVisible(false);
        jtbZona.setVisible(false);
        
        //*iconos botones
        jlbtnGuardar.setEnabled(false);
        jlbtnActualizar.setEnabled(false);
        jlbtnBorrar.setEnabled(false);
        jlbtnNuevo.setEnabled(true);
        jlbtnBuscar.setEnabled(true);
        jlbtnCancelar.setEnabled(false);
        
    }
    
    //**prueba
    
    
       

    /**
     
      
     
     
     
     
     
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbtnNuevo = new javax.swing.JLabel();
        jlbtnGuardar = new javax.swing.JLabel();
        jlbtnCancelar = new javax.swing.JLabel();
        jlbtnActualizar = new javax.swing.JLabel();
        jlbtnBorrar = new javax.swing.JLabel();
        jlbtnBuscar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtbIdInmueble = new javax.swing.JTextField();
        jtbCuitPropietario = new javax.swing.JTextField();
        jtbIdTipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtbDireccion = new javax.swing.JTextField();
        jtbAltura = new javax.swing.JTextField();
        jtbSuperficie = new javax.swing.JTextField();
        jtbPrecio = new javax.swing.JTextField();
        jtbZona = new javax.swing.JTextField();
        jtbDisponible = new javax.swing.JTextField();
        cbCUITPropietario = new javax.swing.JComboBox<>();
        cbCodigoTipo = new javax.swing.JComboBox<>();
        cbCodigoZona = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInmuebles = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_add_file_32px.png"))); // NOI18N
        jlbtnNuevo.setToolTipText("Nuevo");
        jlbtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbtnNuevoMousePressed(evt);
            }
        });
        jPanel1.add(jlbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 11, 54, 43));

        jlbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_save_32px.png"))); // NOI18N
        jlbtnGuardar.setToolTipText("Guardar");
        jlbtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbtnGuardarMousePressed(evt);
            }
        });
        jPanel1.add(jlbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 11, 48, 43));

        jlbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_undo_32px.png"))); // NOI18N
        jlbtnCancelar.setToolTipText("Cancelar");
        jPanel1.add(jlbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 11, 47, 43));

        jlbtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_refresh_32px.png"))); // NOI18N
        jlbtnActualizar.setToolTipText("Actualizar");
        jPanel1.add(jlbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 11, 47, 43));

        jlbtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_trash_can_32px.png"))); // NOI18N
        jlbtnBorrar.setToolTipText("Borrar");
        jPanel1.add(jlbtnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 11, 70, 43));

        jlbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_search_property_32px.png"))); // NOI18N
        jlbtnBuscar.setToolTipText("Buscar");
        jPanel1.add(jlbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 11, 53, 43));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_close_window_32px_1.png"))); // NOI18N
        jLabel7.setToolTipText("Cerrar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 30, 43));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 838, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbIdInmueble.setBackground(new java.awt.Color(204, 204, 204));
        jtbIdInmueble.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbIdInmueble.setEnabled(false);
        jtbIdInmueble.setFocusable(false);
        jPanel2.add(jtbIdInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 60, 20));

        jtbCuitPropietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbCuitPropietario.setEnabled(false);
        jtbCuitPropietario.setFocusable(false);
        jPanel2.add(jtbCuitPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 140, 20));

        jtbIdTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbIdTipo.setEnabled(false);
        jtbIdTipo.setFocusable(false);
        jPanel2.add(jtbIdTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 70, 20));

        jLabel8.setText("ID Inmueble");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel9.setText("CUIT Propietario");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel10.setText("ID Tipo Inmueble");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel11.setText("Dirección");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel12.setText("Altura");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jLabel13.setText("Superficie");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel14.setText("Precio Base");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel15.setText("Codigo Zona");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel16.setText("Disponible ?");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jtbDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbDireccion.setEnabled(false);
        jPanel2.add(jtbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 210, 20));

        jtbAltura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbAltura.setEnabled(false);
        jPanel2.add(jtbAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 60, 20));

        jtbSuperficie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbSuperficie.setEnabled(false);
        jPanel2.add(jtbSuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 70, 20));

        jtbPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbPrecio.setEnabled(false);
        jPanel2.add(jtbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 70, 20));

        jtbZona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbZona.setEnabled(false);
        jPanel2.add(jtbZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 70, 20));

        jtbDisponible.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbDisponible.setEnabled(false);
        jPanel2.add(jtbDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 70, 20));

        cbCUITPropietario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCUITPropietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbCUITPropietario.setEnabled(false);
        cbCUITPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCUITPropietarioActionPerformed(evt);
            }
        });
        jPanel2.add(cbCUITPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 280, 20));

        cbCodigoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCodigoTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(cbCodigoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 20));

        cbCodigoZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "5700", "5750", "5755", "5757", "5759" }));
        cbCodigoZona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(cbCodigoZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 70, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 840, 220));

        jtInmuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtInmuebles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 840, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbtnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbtnGuardarMousePressed
        // TODO add your handling code here:
        inmueble=new Inmueble();
        propietario=new Propietario();
        tipoinmueble=new tipoInmueble();
        
        
        
        
              jtbCuitPropietario.setText(cbCUITPropietario.getSelectedItem().toString());
                propietario.setCuitPropietario(jtbCuitPropietario.getText());
              jtbIdTipo.setText((cbCodigoTipo.getSelectedItem().toString()));
                tipoinmueble.setIdTipo(Integer.parseInt((jtbIdTipo.getText())));
             //   tipoinmueble.setIdTipo(Integer.parseInt((String) cbCodigoTipo.getSelectedItem()));
                inmueble.setAlturaInmueble(Integer.parseInt(jtbAltura.getText()));
              jtbZona.setText((cbCodigoZona.getSelectedItem().toString()));
                inmueble.setCodigoZona(Integer.parseInt(jtbZona.getText()));
                inmueble.setDireccion(jtbDireccion.getText());
                inmueble.setPrecioBase(Double.parseDouble(jtbPrecio.getText()));
                inmueble.setSuperficie(Double.parseDouble(jtbSuperficie.getText()));
                inmueble.setDisponible(jtbDisponible.getText());
                
                
                
                if(inmuebleData.guardarInmueble(inmueble, propietario, tipoinmueble)){
                    
                    JOptionPane.showMessageDialog(null,"Se guardo el inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
                    listarInmuebles();
          
                    }
    }//GEN-LAST:event_jlbtnGuardarMousePressed

    private void jlbtnNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbtnNuevoMousePressed
        // TODO add your handling code here:
        jlbtnGuardar.setEnabled(true);
        jlbtnActualizar.setEnabled(false);
        jlbtnBorrar.setEnabled(false);
        jlbtnNuevo.setEnabled(false);
        jlbtnBuscar.setEnabled(false);
        jlbtnCancelar.setEnabled(true);
        
        
        //habilitar componentes
        
        jtbDireccion.setEnabled(true);
        jtbAltura.setEnabled(true);
        jtbSuperficie.setEnabled(true);
        jtbPrecio.setEnabled(true);
        jtbDisponible.setEnabled(true);
        
        //
        
        
        
    }//GEN-LAST:event_jlbtnNuevoMousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
        
        MenuPrincipalN.jlblIcon.setVisible(true);
        MenuPrincipalN.jlblIn.setVisible(false);
        MenuPrincipalN.jlblInfo.setText("INFORMACION");
        this.dispose();
    }//GEN-LAST:event_jLabel7MousePressed

    private void cbCUITPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCUITPropietarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbCUITPropietarioActionPerformed
public void listarInmuebles(){
    
    jtInmuebles.getTableHeader().setFont(new Font("Courier New",Font.BOLD,12));
        jtInmuebles.getTableHeader().setOpaque(false);
        jtInmuebles.getTableHeader().setBackground(new Color(42, 62, 110));
        jtInmuebles.getTableHeader().setForeground(new Color(255, 255, 255));
       
       
        
        //********** Array to JTable****
        
        DefaultTableModel modeloTabla=new DefaultTableModel();
        
        modeloTabla.addColumn("ID Inmueble");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("CUIT Propietario");
        modeloTabla.addColumn("Domicilio");
        modeloTabla.addColumn("Altura");
        modeloTabla.addColumn("Superficie");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Zona");
        modeloTabla.addColumn("Disponible");
        
        //creamos el array
        String[] datoInmueble=new String[9];
        
        for(int i=0;i<inmuebleData.buscarTodosInmuebles().size();i++){
          
           datoInmueble[0]=Integer.toString(inmuebleData.buscarTodosInmuebles().get(i).getIdInmueble());
           datoInmueble[1]=Integer.toString(inmuebleData.buscarTodosInmuebles().get(i).getIdTipoInmueble());
           datoInmueble[2]=(inmuebleData.buscarTodosInmuebles().get(i).getIdPropietario());
           datoInmueble[3]=(inmuebleData.buscarTodosInmuebles().get(i).getDireccion());
           datoInmueble[4]=Double.toString(inmuebleData.buscarTodosInmuebles().get(i).getAlturaInmueble());
           datoInmueble[5]=Double.toString(inmuebleData.buscarTodosInmuebles().get(i).getSuperficie());
           datoInmueble[6]=Double.toString(inmuebleData.buscarTodosInmuebles().get(i).getPrecioBase());
           datoInmueble[7]=Integer.toString(inmuebleData.buscarTodosInmuebles().get(i).getCodigoZona());
           datoInmueble[8]=(inmuebleData.buscarTodosInmuebles().get(i).getDisponible());
           
            modeloTabla.addRow(datoInmueble);
        }
        
        jtInmuebles.setModel(modeloTabla);
        
        //********** Array to JTable****
    
    
}

public void setInicializarObjetos(){
        con = new Conexion();
        con.getConnection();
        inmueble = new Inmueble();
        inmuebleData = new InmuebleData(con);
        propietario = new Propietario();
        propietarioData = new PropietarioData(con);
        tipoinmueble = new tipoInmueble();
        tipoinmuebleData = new tipoInmuebleData(con);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCUITPropietario;
    private javax.swing.JComboBox<String> cbCodigoTipo;
    private javax.swing.JComboBox<String> cbCodigoZona;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbtnActualizar;
    private javax.swing.JLabel jlbtnBorrar;
    private javax.swing.JLabel jlbtnBuscar;
    private javax.swing.JLabel jlbtnCancelar;
    private javax.swing.JLabel jlbtnGuardar;
    private javax.swing.JLabel jlbtnNuevo;
    private javax.swing.JTable jtInmuebles;
    private javax.swing.JTextField jtbAltura;
    private javax.swing.JTextField jtbCuitPropietario;
    private javax.swing.JTextField jtbDireccion;
    private javax.swing.JTextField jtbDisponible;
    private javax.swing.JTextField jtbIdInmueble;
    private javax.swing.JTextField jtbIdTipo;
    private javax.swing.JTextField jtbPrecio;
    private javax.swing.JTextField jtbSuperficie;
    private javax.swing.JTextField jtbZona;
    // End of variables declaration//GEN-END:variables
}
