package Vista;

import Modelo.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @kaiserkey
 * 
 */
public class tipoInmuebleVista extends javax.swing.JInternalFrame {
    private tipoInmuebleData tipoInmuebleData;
    private tipoInmueble tipoInmueble;
    private Conexion con;
    
    
    
    public tipoInmuebleVista() {
        setTitle("Tipos de Inmueble");
        setSize(800,600);
        initComponents();
        setInicializarObjetos();
        labelCodigoTipo.setText("Codigo Tipo Inmueble");
        labelDescripcion.setText("Descripcion de Tipo de Inmueble");
        setOcultarElementos(false);
        setColorREDComprobacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        menuNuevo = new javax.swing.JButton();
        menuBuscar = new javax.swing.JButton();
        menuBorrar = new javax.swing.JButton();
        menuActualizar = new javax.swing.JButton();
        menuCancelar = new javax.swing.JButton();
        menuSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        labelCodigoTipo = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        tableTipoInmueble = new javax.swing.JTable();
        btnCargar = new javax.swing.JButton();
        cbCodigoTipo = new javax.swing.JComboBox<>();
        tbDescripcion = new javax.swing.JTextField();
        cbxCodigoTipo = new javax.swing.JCheckBox();
        cbxDescripcion = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(156, 193, 118));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jToolBar1.setBackground(new java.awt.Color(99, 184, 99));
        jToolBar1.setRollover(true);

        menuNuevo.setBackground(new java.awt.Color(153, 204, 255));
        menuNuevo.setForeground(new java.awt.Color(0, 0, 0));
        menuNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/newdoc.png"))); // NOI18N
        menuNuevo.setText("Nuevo");
        menuNuevo.setFocusable(false);
        menuNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuNuevo.setMaximumSize(new java.awt.Dimension(100, 60));
        menuNuevo.setMinimumSize(new java.awt.Dimension(100, 60));
        menuNuevo.setPreferredSize(new java.awt.Dimension(100, 60));
        menuNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(menuNuevo);

        menuBuscar.setBackground(new java.awt.Color(153, 204, 255));
        menuBuscar.setForeground(new java.awt.Color(0, 0, 0));
        menuBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/finddoc.png"))); // NOI18N
        menuBuscar.setText("Buscar");
        menuBuscar.setFocusable(false);
        menuBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuBuscar.setMaximumSize(new java.awt.Dimension(100, 60));
        menuBuscar.setMinimumSize(new java.awt.Dimension(100, 60));
        menuBuscar.setPreferredSize(new java.awt.Dimension(100, 60));
        menuBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(menuBuscar);

        menuBorrar.setBackground(new java.awt.Color(153, 204, 255));
        menuBorrar.setForeground(new java.awt.Color(0, 0, 0));
        menuBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/deletedoc.png"))); // NOI18N
        menuBorrar.setText("Borrar");
        menuBorrar.setFocusable(false);
        menuBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuBorrar.setMaximumSize(new java.awt.Dimension(100, 60));
        menuBorrar.setMinimumSize(new java.awt.Dimension(100, 60));
        menuBorrar.setPreferredSize(new java.awt.Dimension(100, 60));
        menuBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBorrarActionPerformed(evt);
            }
        });
        jToolBar1.add(menuBorrar);

        menuActualizar.setBackground(new java.awt.Color(153, 204, 255));
        menuActualizar.setForeground(new java.awt.Color(0, 0, 0));
        menuActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/updatedoc.png"))); // NOI18N
        menuActualizar.setText("Actualizar");
        menuActualizar.setFocusable(false);
        menuActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuActualizar.setMaximumSize(new java.awt.Dimension(100, 60));
        menuActualizar.setMinimumSize(new java.awt.Dimension(100, 60));
        menuActualizar.setPreferredSize(new java.awt.Dimension(100, 60));
        menuActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(menuActualizar);

        menuCancelar.setBackground(new java.awt.Color(153, 204, 255));
        menuCancelar.setForeground(new java.awt.Color(0, 0, 0));
        menuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/canceldoc.png"))); // NOI18N
        menuCancelar.setText("Cancelar");
        menuCancelar.setFocusable(false);
        menuCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuCancelar.setMaximumSize(new java.awt.Dimension(100, 60));
        menuCancelar.setMinimumSize(new java.awt.Dimension(100, 60));
        menuCancelar.setPreferredSize(new java.awt.Dimension(100, 60));
        menuCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(menuCancelar);

        menuSalir.setBackground(new java.awt.Color(153, 204, 255));
        menuSalir.setForeground(new java.awt.Color(0, 0, 0));
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.setFocusable(false);
        menuSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuSalir.setMaximumSize(new java.awt.Dimension(100, 60));
        menuSalir.setMinimumSize(new java.awt.Dimension(100, 60));
        menuSalir.setPreferredSize(new java.awt.Dimension(100, 60));
        menuSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(menuSalir);

        btnGuardar.setBackground(new java.awt.Color(116, 159, 243));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar Tipo Inmueble");
        btnGuardar.setMaximumSize(new java.awt.Dimension(155, 42));
        btnGuardar.setMinimumSize(new java.awt.Dimension(155, 42));
        btnGuardar.setPreferredSize(new java.awt.Dimension(155, 42));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(116, 159, 243));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar Tipo Inmueble");
        btnBuscar.setMaximumSize(new java.awt.Dimension(155, 42));
        btnBuscar.setMinimumSize(new java.awt.Dimension(155, 42));
        btnBuscar.setPreferredSize(new java.awt.Dimension(155, 42));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(116, 159, 243));
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("Actualizar Tipo Inmueble");
        btnActualizar.setMaximumSize(new java.awt.Dimension(155, 42));
        btnActualizar.setMinimumSize(new java.awt.Dimension(155, 42));
        btnActualizar.setPreferredSize(new java.awt.Dimension(155, 42));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(116, 159, 243));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar Tipo Inmueble");
        btnEliminar.setMaximumSize(new java.awt.Dimension(155, 42));
        btnEliminar.setMinimumSize(new java.awt.Dimension(155, 42));
        btnEliminar.setPreferredSize(new java.awt.Dimension(155, 42));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(116, 159, 243));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(155, 42));
        btnCancelar.setMinimumSize(new java.awt.Dimension(155, 42));
        btnCancelar.setPreferredSize(new java.awt.Dimension(155, 42));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelCodigoTipo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigoTipo.setText("Codigo Tipo Inmueble");

        labelDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        labelDescripcion.setText("Descripcion de Tipo de Inmueble");

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableTipoInmueble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Codigo Tipo Inmueble", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll.setViewportView(tableTipoInmueble);

        btnCargar.setBackground(new java.awt.Color(203, 79, 79));
        btnCargar.setForeground(new java.awt.Color(0, 0, 0));
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        cbCodigoTipo.setForeground(new java.awt.Color(0, 0, 0));

        tbDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        tbDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbDescripcionKeyTyped(evt);
            }
        });

        cbxCodigoTipo.setBackground(new java.awt.Color(156, 193, 118));
        cbxCodigoTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxCodigoTipoMousePressed(evt);
            }
        });

        cbxDescripcion.setBackground(new java.awt.Color(156, 193, 118));
        cbxDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxDescripcionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scroll)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCodigoTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCodigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCargar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxCodigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelDescripcion)
                                        .addGap(4, 4, 4)
                                        .addComponent(tbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addComponent(cbxDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigoTipo)
                            .addComponent(btnCargar)
                            .addComponent(cbCodigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCodigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDescripcion)
                            .addComponent(tbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        setOcultarElementosNuevo(true);
        setColorREDComprobacion();
        setMostrarTabla(tipoInmuebleData);
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarActionPerformed
        setOcultarElementosBuscar(true);
        setComboBox();
        setColorREDComprobacion();
        setMostrarTabla(tipoInmuebleData);
    }//GEN-LAST:event_menuBuscarActionPerformed

    private void menuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBorrarActionPerformed
        setOcultarElementosEliminar(true);
        setComboBox();
        setColorREDComprobacion();
        setMostrarTabla(tipoInmuebleData);
    }//GEN-LAST:event_menuBorrarActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        setOcultarElementosActualizar(true);
        setComboBox();
        setColorREDComprobacion();
        setMostrarTabla(tipoInmuebleData);
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void menuCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCancelarActionPerformed
        setOcultarElementos(false);
        setColorREDComprobacion();
        setMostrarTabla(tipoInmuebleData);
    }//GEN-LAST:event_menuCancelarActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(ComprobarGuardar()){
            setInicializarObjetos();
            tipoInmueble.setDescripcion(tbDescripcion.getText());
            if(tipoInmuebleData.guardarTipo(tipoInmueble)){
                clear();
                setComboBox();
                setMostrarTabla(tipoInmuebleData);
                JOptionPane.showMessageDialog(null,"Se guardo el tipo de inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
            }else{
                clear();
                setComboBox();
                setMostrarTabla(tipoInmuebleData);
                JOptionPane.showMessageDialog(null,"No se pudo guardar el inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(ComprobarBuscar()){
            setInicializarObjetos();
            if(cbxDescripcion.isSelected()){
                setTabla(tipoInmuebleData, "descripcion", tbDescripcion.getText());
            }
            if(cbxCodigoTipo.isSelected()){
                setTabla(tipoInmuebleData, "idTipo", cbCodigoTipo.getSelectedItem().toString());
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(ComprobarActualizar()){
            setInicializarObjetos();
            tipoInmueble.setIdTipo(Integer.parseInt(cbCodigoTipo.getSelectedItem().toString()));
            tipoInmueble.setDescripcion(tbDescripcion.getText());
            if(tipoInmuebleData.actualizarTipo(tipoInmueble)){
                clear();
                setComboBox();
                setMostrarTabla(tipoInmuebleData);
                JOptionPane.showMessageDialog(null,"Se actualizo el tipo de inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
            }else{
                clear();
                setComboBox();
                setMostrarTabla(tipoInmuebleData);
                JOptionPane.showMessageDialog(null,"No se pudo actualizar el tipo de inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(ComprobarEliminar()){
            setInicializarObjetos();
            if(tipoInmuebleData.borrarTipo(Integer.parseInt(cbCodigoTipo.getSelectedItem().toString()))){
                clear();
                setComboBox();
                setMostrarTabla(tipoInmuebleData);
                JOptionPane.showMessageDialog(null,"Se elimino el tipo de inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
            }else{
                clear();
                setComboBox();
                setMostrarTabla(tipoInmuebleData);
                JOptionPane.showMessageDialog(null,"No se pudo eliminar el tipo de inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clear();
        setColorREDComprobacion();
        setMostrarTabla(tipoInmuebleData);
        setCamposEditables(true);
        setCheckBocx(true);
        setCheckBoxSelected(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbxCodigoTipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCodigoTipoMousePressed
        if(cbxCodigoTipo.isSelected()){
            cbxDescripcion.setEnabled(true);
        }
        if(!cbxCodigoTipo.isSelected()){
            cbxDescripcion.setEnabled(false);
 
        }
    }//GEN-LAST:event_cbxCodigoTipoMousePressed

    private void cbxDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxDescripcionMousePressed
        if(cbxDescripcion.isSelected()){
            cbxCodigoTipo.setEnabled(true);
        }
        if(!cbxDescripcion.isSelected()){
            cbxCodigoTipo.setEnabled(false);
 
        }
    }//GEN-LAST:event_cbxDescripcionMousePressed

    private void tbDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDescripcionKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla >= '0' && tecla <='9'){
            evt.consume();
        }
    }//GEN-LAST:event_tbDescripcionKeyTyped

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        tipoInmueble.setIdTipo(Integer.parseInt(cbCodigoTipo.getSelectedItem().toString()));
        tipoInmuebleData.buscarTipo(tipoInmueble);
        tbDescripcion.setText(tipoInmueble.getDescripcion());
        btnActualizar.setEnabled(true);
        btnCargar.setBackground(Color.GREEN.darker());
    }//GEN-LAST:event_btnCargarActionPerformed
    
   public void setInicializarObjetos(){
       con = new Conexion();
       con.getConnection();
       tipoInmuebleData = new tipoInmuebleData(con);
       tipoInmueble = new tipoInmueble();
       
   }
   public void clear(){
       cbCodigoTipo.setSelectedItem(null);
       tbDescripcion.setText(null);
   }
   public void setCamposEditables(boolean valor){
       cbCodigoTipo.setEditable(valor);
       tbDescripcion.setEditable(valor);
   }
   public void setColorREDComprobacion(){
       btnGuardar.setBackground(Color.red.darker());
       btnActualizar.setBackground(Color.red.darker());
       btnEliminar.setBackground(Color.red.darker());
       btnBuscar.setBackground(Color.red.darker());
       btnCargar.setBackground(Color.red.darker());
   }
   public void setMostrarTabla(tipoInmuebleData tipoInmuebleData){
        
       String matris[][] = new String[tipoInmuebleData.buscarTodosLosTipos().size()][9];
        
        for(int i = 0; i < tipoInmuebleData.buscarTodosLosTipos().size(); i++){
            matris[i][0]= String.valueOf(tipoInmuebleData.buscarTodosLosTipos().get(i).getIdTipo());
            matris[i][1] = tipoInmuebleData.buscarTodosLosTipos().get(i).getDescripcion();
        }
       
       
       tableTipoInmueble.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Codigo Tipo Inmueble", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
   }
   public void setTabla(tipoInmuebleData tipoInmuebleData, String nombre, String valor){
        
       String matris[][] = new String[tipoInmuebleData.buscarTipoPor(nombre, valor).size()][9];
        
        for(int i = 0; i < tipoInmuebleData.buscarTipoPor(nombre, valor).size(); i++){
            matris[i][0]= String.valueOf(tipoInmuebleData.buscarTipoPor(nombre, valor).get(i).getIdTipo());
            matris[i][1] = tipoInmuebleData.buscarTipoPor(nombre, valor).get(i).getDescripcion();
        }
       
       
       tableTipoInmueble.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Codigo Tipo Inmueble", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
   }
   public void setOcultarElementos(boolean valor){
       cbCodigoTipo.setVisible(valor);
       tbDescripcion.setVisible(valor);
       labelCodigoTipo.setVisible(valor);
       labelDescripcion.setVisible(valor);
       btnGuardar.setVisible(valor);
       btnEliminar.setVisible(valor);
       btnActualizar.setVisible(valor);
       btnBuscar.setVisible(valor);
       btnCargar.setVisible(valor);
       scroll.setVisible(valor);
       btnCancelar.setVisible(valor);
       cbxCodigoTipo.setVisible(valor);
       cbxDescripcion.setVisible(valor);
   }
   public void setOcultarElementosNuevo(boolean valor){
       cbCodigoTipo.setVisible(false);
       tbDescripcion.setVisible(valor);
       labelCodigoTipo.setVisible(false);
       labelDescripcion.setVisible(valor);
       btnGuardar.setVisible(valor);
       btnEliminar.setVisible(false);
       btnActualizar.setVisible(false);
       btnBuscar.setVisible(false);
       btnCargar.setVisible(false);
       scroll.setVisible(valor);
       btnCancelar.setVisible(valor);
       cbxCodigoTipo.setVisible(false);
       cbxDescripcion.setVisible(false);
   }
   public void setOcultarElementosBuscar(boolean valor){
       cbCodigoTipo.setVisible(valor);
       tbDescripcion.setVisible(valor);
       labelCodigoTipo.setVisible(valor);
       labelDescripcion.setVisible(valor);
       btnGuardar.setVisible(false);
       btnEliminar.setVisible(false);
       btnActualizar.setVisible(false);
       btnBuscar.setVisible(valor);
       btnCargar.setVisible(false);
       scroll.setVisible(valor);
       btnCancelar.setVisible(valor);
       cbxCodigoTipo.setVisible(valor);
       cbxDescripcion.setVisible(valor);
   }
   public void setOcultarElementosEliminar(boolean valor){
       cbCodigoTipo.setVisible(valor);
       tbDescripcion.setVisible(false);
       labelCodigoTipo.setVisible(valor);
       labelDescripcion.setVisible(false);
       btnGuardar.setVisible(false);
       btnEliminar.setVisible(valor);
       btnActualizar.setVisible(false);
       btnBuscar.setVisible(false);
       btnCargar.setVisible(false);
       scroll.setVisible(valor);
       btnCancelar.setVisible(valor);
       cbxCodigoTipo.setVisible(false);
       cbxDescripcion.setVisible(false);
   }
   public void setOcultarElementosActualizar(boolean valor){
       cbCodigoTipo.setVisible(valor);
       tbDescripcion.setVisible(valor);
       labelCodigoTipo.setVisible(valor);
       labelDescripcion.setVisible(valor);
       btnGuardar.setVisible(false);
       btnEliminar.setVisible(false);
       btnActualizar.setVisible(valor);
       btnBuscar.setVisible(false);
       btnCargar.setVisible(valor);
       scroll.setVisible(valor);
       btnCancelar.setVisible(valor);
       cbxCodigoTipo.setVisible(false);
       cbxDescripcion.setVisible(false);
   }
   public void setComboBox(){
        if(cbCodigoTipo.getItemCount()>0){
            cbCodigoTipo.removeAllItems();
        }
        for(int x=0; x<tipoInmuebleData.buscarTodosLosTipos().size(); x++){
            cbCodigoTipo.setEnabled(true);
            cbCodigoTipo.addItem(String.valueOf(tipoInmuebleData.buscarTodosLosTipos().get(x).getIdTipo()));
        }
   }
   public void setCheckBocx(boolean valor){
       cbxDescripcion.setEnabled(valor);
       cbxCodigoTipo.setEnabled(valor);
   }
   public void setCheckBoxSelected(boolean valor){
       cbxDescripcion.setSelected(valor);
       cbxCodigoTipo.setSelected(valor);
   }
   public boolean ComprobarGuardar(){
       boolean habilitar = true;
       String toString = "";
       if(tbDescripcion.getText().length()<3){
           habilitar = false;
           toString = toString +" "+"Descripcion.";
       }
       if(habilitar){
            btnGuardar.setBackground(Color.GREEN.darker());
        }else{
            JOptionPane.showMessageDialog(null,"Debe rellenar los siguientes campos: "+toString,"Advertencia",JOptionPane.WARNING_MESSAGE );
        }
       return habilitar;
   }
   public boolean ComprobarBuscar(){
       boolean habilitar = true;
       if(cbxDescripcion.isSelected() || cbxCodigoTipo.isSelected()){
           if(cbxDescripcion.isSelected()){
               setCheckBocx(false);
               btnBuscar.setBackground(Color.GREEN.darker());
           }
           if(cbxCodigoTipo.isSelected()){
               setCheckBocx(false);
               btnBuscar.setBackground(Color.GREEN.darker());
           }
           habilitar = true;
       }else{
            JOptionPane.showMessageDialog(null,"No se ha seleccionado ningun campo para buscar","Información",JOptionPane.INFORMATION_MESSAGE );
            habilitar = false;
       }
       return habilitar;
   }
   public boolean ComprobarEliminar(){
       boolean habilitar = true;
       String toString = "";
       if(cbCodigoTipo.getSelectedObjects() == null){
            habilitar = false;
            toString = "Codigo Tipo Inmueble";
            JOptionPane.showMessageDialog(null,"Debe seleccionar un Codigo a eliminar: "+toString,"Advertencia",JOptionPane.WARNING_MESSAGE );
        }else{
            btnEliminar.setBackground(Color.GREEN.darker());
            habilitar = true;
        }
       return habilitar;
   }
   public boolean ComprobarActualizar(){
       boolean habilitar = true;
       String toString = "";
       if(tbDescripcion.getText().length()<3){
           habilitar = false;
           toString = toString +" "+"Descripcion.";
       }
       if(habilitar){
            btnActualizar.setBackground(Color.GREEN.darker());
        }else{
            JOptionPane.showMessageDialog(null,"Debe rellenar los siguientes campos: "+toString,"Advertencia",JOptionPane.WARNING_MESSAGE );
        }
       return habilitar;
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbCodigoTipo;
    private javax.swing.JCheckBox cbxCodigoTipo;
    private javax.swing.JCheckBox cbxDescripcion;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelCodigoTipo;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JButton menuActualizar;
    private javax.swing.JButton menuBorrar;
    private javax.swing.JButton menuBuscar;
    private javax.swing.JButton menuCancelar;
    private javax.swing.JButton menuNuevo;
    private javax.swing.JButton menuSalir;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tableTipoInmueble;
    private javax.swing.JTextField tbDescripcion;
    // End of variables declaration//GEN-END:variables
}
