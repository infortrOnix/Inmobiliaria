
package Vista;

import Modelo.*;
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @kaiserkey
 * 
 */
public class InmuebleVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form Inmueble
     */
    
    Inmueble inmueble;
    Propietario propietario;
    tipoInmueble tipoInmueble;
    Conexion con;
    InmuebleData inmuebleData;
    PropietarioData propietarioData;
    tipoInmuebleData tipoInmuebleData;
    
    public InmuebleVista() {
        initComponents();
        setTitle("Inmueble");
        setSize(800,600);
        buttonGroup1.add(rbDisponibleY);
        buttonGroup1.add(rbDisponibleN);
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCargar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnComprobarGuardar.setEnabled(false);
        btnComprobarActualizar.setEnabled(false);
        btnComprobarEliminar.setEnabled(false);
        btnComprobarBuscar.setEnabled(false);
        tbAltura.setEditable(false);
        tbCodigoZona.setEditable(false);
        tbDireccion.setEditable(false);
        tbSuperficie.setEditable(false);
        cbIdTipo.setEditable(false);
        cbIdTipo.removeAllItems();
        cbIdInmueble.setEditable(false);
        cbIdInmueble.removeAllItems();
        cbCUITPropietario.setEditable(false);
        cbCUITPropietario.removeAllItems();
        tbPrecio.setEnabled(false);
        labelDisponible.setText(null);
        lavelAltura.setText(null);
        lavelCUIT.setText(null);
        lavelCodigoTipo.setText(null);
        lavelCodigoZona.setText(null);
        lavelDireccion.setText(null);
        lavelPrecioBase.setText(null);
        lavelCodigoInmueble.setText(null);
        lavelSuperficie.setText(null);
        cbxIDInmueble.setEnabled(false);
        cbxCUIT.setEnabled(false);
        cbxDireccion.setEnabled(false);
        cbxPrecio.setEnabled(false);
        cbxDisponible.setEnabled(false);
        rbDisponibleN.setEnabled(false);
        rbDisponibleY.setEnabled(false);
        cbxDisponible.setEnabled(false);

        setInicializarObjetos();
        setMostrarTabla(inmuebleData);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        lavelCUIT = new javax.swing.JLabel();
        lavelCodigoTipo = new javax.swing.JLabel();
        lavelDireccion = new javax.swing.JLabel();
        lavelAltura = new javax.swing.JLabel();
        lavelSuperficie = new javax.swing.JLabel();
        lavelPrecioBase = new javax.swing.JLabel();
        lavelCodigoZona = new javax.swing.JLabel();
        labelDisponible = new javax.swing.JLabel();
        tbDireccion = new javax.swing.JTextField();
        tbCodigoZona = new javax.swing.JTextField();
        tbSuperficie = new javax.swing.JTextField();
        tbAltura = new javax.swing.JTextField();
        rbDisponibleY = new javax.swing.JRadioButton();
        rbDisponibleN = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        menuNuevo = new javax.swing.JButton();
        menuBuscar = new javax.swing.JButton();
        menuEliminar = new javax.swing.JButton();
        menuActualizar = new javax.swing.JButton();
        menuCancelar = new javax.swing.JButton();
        lavelCodigoInmueble = new javax.swing.JLabel();
        cbxIDInmueble = new javax.swing.JCheckBox();
        cbxDireccion = new javax.swing.JCheckBox();
        cbxPrecio = new javax.swing.JCheckBox();
        cbxCUIT = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        cbxDisponible = new javax.swing.JCheckBox();
        scroll = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInmueble = new javax.swing.JTable();
        btnComprobarGuardar = new javax.swing.JButton();
        btnComprobarEliminar = new javax.swing.JButton();
        btnComprobarBuscar = new javax.swing.JButton();
        btnComprobarActualizar = new javax.swing.JButton();
        cbIdInmueble = new javax.swing.JComboBox();
        cbIdTipo = new javax.swing.JComboBox();
        cbCUITPropietario = new javax.swing.JComboBox();
        btnCargar = new javax.swing.JButton();
        tbPrecio = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setBackground(new java.awt.Color(156, 193, 118));
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        lavelCUIT.setForeground(new java.awt.Color(0, 0, 0));
        lavelCUIT.setText("CUIT del Propieario");

        lavelCodigoTipo.setForeground(new java.awt.Color(0, 0, 0));
        lavelCodigoTipo.setText("Codigo Tipo de Inmueble");

        lavelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lavelDireccion.setText("Direccion");

        lavelAltura.setForeground(new java.awt.Color(0, 0, 0));
        lavelAltura.setText("Altura");

        lavelSuperficie.setForeground(new java.awt.Color(0, 0, 0));
        lavelSuperficie.setText("Superficie");

        lavelPrecioBase.setForeground(new java.awt.Color(0, 0, 0));
        lavelPrecioBase.setText("Precio Base");

        lavelCodigoZona.setForeground(new java.awt.Color(0, 0, 0));
        lavelCodigoZona.setText("Codigo de Zona");

        labelDisponible.setForeground(new java.awt.Color(0, 0, 0));
        labelDisponible.setText("Disponible");

        tbDireccion.setForeground(new java.awt.Color(0, 0, 0));
        tbDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbDireccionKeyTyped(evt);
            }
        });

        tbCodigoZona.setForeground(new java.awt.Color(0, 0, 0));
        tbCodigoZona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbAlturaKeyTyped(evt);
            }
        });

        tbSuperficie.setForeground(new java.awt.Color(0, 0, 0));
        tbSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbSuperficieKeyTyped(evt);
            }
        });

        tbAltura.setForeground(new java.awt.Color(0, 0, 0));
        tbAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbAlturaKeyTyped(evt);
            }
        });

        rbDisponibleY.setBackground(new java.awt.Color(156, 193, 118));
        rbDisponibleY.setForeground(new java.awt.Color(0, 0, 0));
        rbDisponibleY.setText("Si");

        rbDisponibleN.setBackground(new java.awt.Color(156, 193, 118));
        rbDisponibleN.setForeground(new java.awt.Color(0, 0, 0));
        rbDisponibleN.setText("No");

        btnGuardar.setBackground(new java.awt.Color(116, 159, 243));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/savedoc.png"))); // NOI18N
        btnGuardar.setText("Guardar Inmueble");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(116, 159, 243));
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/updatedoc.png"))); // NOI18N
        btnActualizar.setText("Actualizar Inmueble");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(116, 159, 243));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/investigacion.png"))); // NOI18N
        btnBuscar.setText("Buscar Inmueble");

        btnEliminar.setBackground(new java.awt.Color(116, 159, 243));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar Inmueble");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(99, 184, 99));
        jToolBar1.setRollover(true);

        menuNuevo.setBackground(new java.awt.Color(153, 204, 255));
        menuNuevo.setForeground(new java.awt.Color(0, 0, 0));
        menuNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/newdoc.png"))); // NOI18N
        menuNuevo.setText("Nuevo");
        menuNuevo.setMaximumSize(new java.awt.Dimension(100, 60));
        menuNuevo.setMinimumSize(new java.awt.Dimension(100, 60));
        menuNuevo.setPreferredSize(new java.awt.Dimension(100, 60));
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
        menuBuscar.setMinimumSize(new java.awt.Dimension(100, 64));
        menuBuscar.setPreferredSize(new java.awt.Dimension(100, 64));
        menuBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(menuBuscar);

        menuEliminar.setBackground(new java.awt.Color(153, 204, 255));
        menuEliminar.setForeground(new java.awt.Color(0, 0, 0));
        menuEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/deletedoc.png"))); // NOI18N
        menuEliminar.setText("Borrar");
        menuEliminar.setFocusable(false);
        menuEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEliminar.setMaximumSize(new java.awt.Dimension(100, 60));
        menuEliminar.setMinimumSize(new java.awt.Dimension(100, 64));
        menuEliminar.setPreferredSize(new java.awt.Dimension(100, 64));
        menuEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(menuEliminar);

        menuActualizar.setBackground(new java.awt.Color(153, 204, 255));
        menuActualizar.setForeground(new java.awt.Color(0, 0, 0));
        menuActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/updatedoc.png"))); // NOI18N
        menuActualizar.setText("Actualizar");
        menuActualizar.setFocusable(false);
        menuActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuActualizar.setMaximumSize(new java.awt.Dimension(100, 60));
        menuActualizar.setMinimumSize(new java.awt.Dimension(100, 64));
        menuActualizar.setPreferredSize(new java.awt.Dimension(100, 64));
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
        menuCancelar.setMaximumSize(new java.awt.Dimension(100, 60));
        menuCancelar.setMinimumSize(new java.awt.Dimension(100, 60));
        menuCancelar.setPreferredSize(new java.awt.Dimension(100, 60));
        menuCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(menuCancelar);

        lavelCodigoInmueble.setForeground(new java.awt.Color(0, 0, 0));
        lavelCodigoInmueble.setText("Codigo Inmueble");

        cbxIDInmueble.setBackground(new java.awt.Color(156, 193, 118));

        cbxDireccion.setBackground(new java.awt.Color(156, 193, 118));

        cbxPrecio.setBackground(new java.awt.Color(156, 193, 118));

        cbxCUIT.setBackground(new java.awt.Color(156, 193, 118));

        btnCancelar.setBackground(new java.awt.Color(116, 159, 243));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/espalda.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbxDisponible.setBackground(new java.awt.Color(156, 193, 118));

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableInmueble.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tableInmueble.setForeground(new java.awt.Color(0, 0, 0));
        tableInmueble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Inmueble", "CUIT Propietario", "Direccion", "Altura", "Codigo de Zona", "Precio Base", "Superficie", "Codigo Tipo Inmueble", "Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInmueble);

        scroll.setViewportView(jScrollPane1);

        btnComprobarGuardar.setBackground(new java.awt.Color(203, 79, 79));
        btnComprobarGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnComprobarGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        btnComprobarGuardar.setText("Comprobar");
        btnComprobarGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarGuardarActionPerformed(evt);
            }
        });

        btnComprobarEliminar.setBackground(new java.awt.Color(203, 79, 79));
        btnComprobarEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnComprobarEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        btnComprobarEliminar.setText("Comprobar");
        btnComprobarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarEliminarActionPerformed(evt);
            }
        });

        btnComprobarBuscar.setBackground(new java.awt.Color(203, 79, 79));
        btnComprobarBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnComprobarBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        btnComprobarBuscar.setText("Comprobar");

        btnComprobarActualizar.setBackground(new java.awt.Color(203, 79, 79));
        btnComprobarActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnComprobarActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        btnComprobarActualizar.setText("Comprobar");
        btnComprobarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActualizarActionPerformed(evt);
            }
        });

        cbIdInmueble.setForeground(new java.awt.Color(0, 0, 0));

        cbIdTipo.setForeground(new java.awt.Color(0, 0, 0));

        cbCUITPropietario.setForeground(new java.awt.Color(0, 0, 0));

        btnCargar.setBackground(new java.awt.Color(203, 79, 79));
        btnCargar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(0, 0, 0));
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        tbPrecio.setForeground(new java.awt.Color(0, 0, 0));
        tbPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbSuperficieKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lavelCUIT)
                                    .addComponent(lavelCodigoTipo)
                                    .addComponent(lavelDireccion)
                                    .addComponent(lavelPrecioBase)
                                    .addComponent(lavelCodigoZona)
                                    .addComponent(labelDisponible)
                                    .addComponent(lavelSuperficie)
                                    .addComponent(lavelAltura)
                                    .addComponent(lavelCodigoInmueble))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbDisponibleY)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbDisponibleN)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tbDireccion)
                                    .addComponent(tbCodigoZona)
                                    .addComponent(tbSuperficie)
                                    .addComponent(tbAltura)
                                    .addComponent(cbIdInmueble, 0, 147, Short.MAX_VALUE)
                                    .addComponent(cbCUITPropietario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbIdTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbPrecio, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxDireccion)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbxCUIT))
                                    .addComponent(cbxDisponible, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbxIDInmueble))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnComprobarGuardar)
                                    .addComponent(btnComprobarBuscar)
                                    .addComponent(btnComprobarEliminar)
                                    .addComponent(btnComprobarActualizar))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(110, 110, 110)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar)
                            .addComponent(btnComprobarGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnComprobarBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(btnComprobarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnComprobarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lavelCodigoInmueble)
                                        .addComponent(cbIdInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbxIDInmueble))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lavelCUIT)
                                            .addComponent(cbCUITPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lavelCodigoTipo)
                                            .addComponent(cbIdTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cbxCUIT)))
                            .addComponent(btnCargar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lavelDireccion)
                                    .addComponent(tbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lavelAltura))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lavelSuperficie)
                                    .addComponent(tbSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lavelPrecioBase)
                                    .addComponent(tbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(cbxPrecio)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lavelCodigoZona)
                            .addComponent(tbCodigoZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxDisponible)
                            .addComponent(labelDisponible)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbDisponibleY)
                                .addComponent(rbDisponibleN)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        btnGuardar.setEnabled(false);
        lavelCodigoInmueble.setText(null);
        tbAltura.setEditable(true);
        tbCodigoZona.setEditable(true);
        tbDireccion.setEditable(true);
        cbIdTipo.setEditable(true);
        cbIdTipo.removeAllItems();
        cbIdTipo.setEditable(false);
        cbIdInmueble.setEditable(false);
        cbIdInmueble.removeAllItems();
        cbIdInmueble.setEditable(false);
        cbCUITPropietario.setEditable(true);
        cbCUITPropietario.removeAllItems();
        cbCUITPropietario.setEditable(false);
        tbSuperficie.setEditable(true);
        tbPrecio.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCargar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnComprobarGuardar.setEnabled(true);
        btnComprobarActualizar.setEnabled(false);
        btnComprobarEliminar.setEnabled(false);
        btnComprobarBuscar.setEnabled(false);
        cbxIDInmueble.setEnabled(false);
        cbxCUIT.setEnabled(false);
        cbxDireccion.setEnabled(false);
        cbxPrecio.setEnabled(false);
        cbxDisponible.setEnabled(false);
        rbDisponibleN.setEnabled(true);
        rbDisponibleY.setEnabled(true);
        tbAltura.setText(null);
        tbCodigoZona.setText(null);
        tbDireccion.setText(null);
        tbSuperficie.setText(null);
        tbPrecio.setText(null);
        buttonGroup1.clearSelection();
        cbxIDInmueble.setSelected(false);
        cbxCUIT.setSelected(false);
        cbxDireccion.setSelected(false);
        cbxPrecio.setSelected(false);
        cbxDisponible.setSelected(false);
        cbxDisponible.setSelected(false);
        cbIdTipo.removeAllItems();
        cbIdInmueble.removeAllItems();
        cbCUITPropietario.removeAllItems();
        btnComprobarEliminar.setBackground(Color.red.darker());
        btnComprobarBuscar.setBackground(Color.red.darker());
        btnComprobarActualizar.setBackground(Color.red.darker());
        btnComprobarGuardar.setBackground(Color.red.darker());
            
        lavelCUIT.setText("CUIT del Propieario");
        lavelCodigoTipo.setText("Codigo Tipo de Inmueble");
        lavelDireccion.setText("Direccion");
        lavelAltura.setText("Altura");
        lavelSuperficie.setText("Superficie");
        lavelPrecioBase.setText("Precio Base");
        lavelCodigoZona.setText("Codigo de Zona");
        labelDisponible.setText("Disponible");
        setCamposEditables(true);
        setComboBox(2);
        setComboBox(3);
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarActionPerformed
        tbAltura.setEditable(false);
        tbCodigoZona.setEditable(false);
        tbDireccion.setEditable(true);
        tbSuperficie.setEditable(false);
        cbIdTipo.setEditable(false);
        cbIdTipo.removeAllItems();
        cbIdTipo.setEditable(false);
        cbIdInmueble.setEditable(true);
        cbIdInmueble.removeAllItems();
        cbIdInmueble.setEditable(false);
        cbCUITPropietario.setEditable(true);
        cbCUITPropietario.removeAllItems();
        cbCUITPropietario.setEditable(false);
        tbPrecio.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnCargar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnComprobarGuardar.setEnabled(false);
        btnComprobarActualizar.setEnabled(false);
        btnComprobarEliminar.setEnabled(false);
        btnComprobarBuscar.setEnabled(true);
        rbDisponibleN.setEnabled(true);
        rbDisponibleY.setEnabled(true);
        tbAltura.setText(null);
        tbCodigoZona.setText(null);
        tbDireccion.setText(null);
        tbSuperficie.setText(null);
        tbPrecio.setText(null);
        buttonGroup1.clearSelection();
        cbIdTipo.removeAllItems();
        cbIdInmueble.removeAllItems();
        cbCUITPropietario.removeAllItems();
        setColorREDComprobacion();
        setCheckBocx(true);
        setCheckBoxSelected(false);
            
        lavelCUIT.setText("CUIT del Propieario");
        lavelCodigoTipo.setText("Codigo Tipo de Inmueble");
        lavelDireccion.setText("Direccion");
        lavelAltura.setText("Altura");
        lavelSuperficie.setText("Superficie");
        lavelPrecioBase.setText("Precio Base");
        lavelCodigoZona.setText("Codigo de Zona");
        labelDisponible.setText("Disponible");
        lavelCodigoInmueble.setText("Codigo Inmueble");
            
        lavelAltura.setText(null);
        lavelCodigoTipo.setText(null);
        lavelCodigoZona.setText(null);
        lavelSuperficie.setText(null);
    }//GEN-LAST:event_menuBuscarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        btnEliminar.setEnabled(false);
        tbAltura.setEditable(false);
        tbCodigoZona.setEditable(false);
        btnCargar.setEnabled(false);
        tbDireccion.setEditable(false);
        tbSuperficie.setEditable(false);
        cbIdTipo.setEditable(false);
        cbIdTipo.removeAllItems();
        cbIdTipo.setEditable(false);
        cbIdInmueble.setEditable(true);
        cbIdInmueble.removeAllItems();
        cbIdInmueble.setEditable(false);
        cbCUITPropietario.setEditable(false);
        cbCUITPropietario.removeAllItems();
        cbCUITPropietario.setEditable(false);
        tbPrecio.setEnabled(false);
        labelDisponible.setText(null);
        lavelAltura.setText(null);
        lavelCUIT.setText(null);
        lavelCodigoTipo.setText(null);
        lavelCodigoZona.setText(null);
        lavelDireccion.setText(null);
        lavelPrecioBase.setText(null);
        lavelSuperficie.setText(null);
        btnCancelar.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnComprobarGuardar.setEnabled(false);
        btnComprobarActualizar.setEnabled(false);
        btnComprobarEliminar.setEnabled(true);
        btnComprobarBuscar.setEnabled(false);
        btnActualizar.setEnabled(false);
        cbxIDInmueble.setEnabled(false);
        cbxCUIT.setEnabled(false);
        cbxDireccion.setEnabled(false);
        cbxPrecio.setEnabled(false);
        cbxDisponible.setEnabled(false);
        btnGuardar.setEnabled(false);
        rbDisponibleN.setEnabled(false);
        rbDisponibleY.setEnabled(false);
        tbAltura.setText(null);
        tbCodigoZona.setText(null);
        tbDireccion.setText(null);
        tbSuperficie.setText(null);
        tbPrecio.setText(null);
        buttonGroup1.clearSelection();
        cbxIDInmueble.setSelected(false);
        cbxCUIT.setSelected(false);
        cbxDireccion.setSelected(false);
        cbxPrecio.setSelected(false);
        cbxDisponible.setSelected(false);
        cbxDisponible.setSelected(false);
        cbIdTipo.removeAllItems();
        cbIdInmueble.removeAllItems();
        cbCUITPropietario.removeAllItems();
        btnComprobarEliminar.setBackground(Color.red.darker());
        btnComprobarBuscar.setBackground(Color.red.darker());
        btnComprobarActualizar.setBackground(Color.red.darker());
        btnComprobarGuardar.setBackground(Color.red.darker());
        lavelCodigoInmueble.setText("Codigo Inmueble");
        setComboBox(1);
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        btnGuardar.setEnabled(false);
        lavelCodigoInmueble.setText(null);
        tbAltura.setEditable(true);
        tbCodigoZona.setEditable(true);
        tbDireccion.setEditable(true);
        tbSuperficie.setEditable(true);
        cbIdTipo.setEditable(true);
        cbIdTipo.removeAllItems();
        cbIdTipo.setEditable(false);
        cbIdInmueble.setEditable(true);
        cbIdInmueble.removeAllItems();
        cbIdInmueble.setEditable(false);
        cbCUITPropietario.setEditable(true);
        cbCUITPropietario.removeAllItems();
        cbCUITPropietario.setEditable(false);
        tbPrecio.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnComprobarGuardar.setEnabled(false);
        btnComprobarActualizar.setEnabled(false);
        btnComprobarEliminar.setEnabled(false);
        btnComprobarBuscar.setEnabled(false);
        btnCargar.setEnabled(true);
        cbxIDInmueble.setEnabled(false);
        cbxCUIT.setEnabled(false);
        cbxDireccion.setEnabled(false);
        cbxPrecio.setEnabled(false);
        cbxDisponible.setEnabled(false);
        rbDisponibleN.setEnabled(true);
        rbDisponibleY.setEnabled(true);
        tbAltura.setText(null);
        tbCodigoZona.setText(null);
        tbDireccion.setText(null);
        tbSuperficie.setText(null);
        tbPrecio.setText(null);
        buttonGroup1.clearSelection();
        cbxIDInmueble.setSelected(false);
        cbxCUIT.setSelected(false);
        cbxDireccion.setSelected(false);
        cbxPrecio.setSelected(false);
        cbxDisponible.setSelected(false);
        cbxDisponible.setSelected(false);
        cbIdTipo.removeAllItems();
        cbIdInmueble.removeAllItems();
        cbCUITPropietario.removeAllItems();
        btnComprobarEliminar.setBackground(Color.red.darker());
        btnComprobarBuscar.setBackground(Color.red.darker());
        btnComprobarActualizar.setBackground(Color.red.darker());
        btnComprobarGuardar.setBackground(Color.red.darker());
        lavelCodigoInmueble.setText("Codigo Inmueble");
        lavelCUIT.setText("CUIT del Propieario");
        lavelCodigoTipo.setText("Codigo Tipo de Inmueble");
        lavelDireccion.setText("Direccion");
        lavelAltura.setText("Altura");
        lavelSuperficie.setText("Superficie");
        lavelPrecioBase.setText("Precio Base");
        lavelCodigoZona.setText("Codigo de Zona");
        labelDisponible.setText("Disponible");
        setCamposEditables(true);
        setComboBox(1);
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void menuCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCancelarActionPerformed
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnCargar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnComprobarGuardar.setEnabled(false);
        btnComprobarActualizar.setEnabled(false);
        btnComprobarEliminar.setEnabled(false);
        btnComprobarBuscar.setEnabled(false);
        tbAltura.setEditable(false);
        tbCodigoZona.setEditable(false);
        tbDireccion.setEditable(false);
        tbSuperficie.setEditable(false);
        cbIdTipo.setEditable(false);
        cbIdTipo.removeAllItems();
        cbIdTipo.setEditable(false);
        cbIdInmueble.setEditable(false);
        cbIdInmueble.removeAllItems();
        cbIdInmueble.setEditable(false);
        cbCUITPropietario.setEditable(false);
        cbCUITPropietario.removeAllItems();
        cbCUITPropietario.setEditable(false);
        tbPrecio.setEnabled(false);
        labelDisponible.setText(null);
        lavelAltura.setText(null);
        lavelCUIT.setText(null);
        lavelCodigoTipo.setText(null);
        lavelCodigoZona.setText(null);
        lavelDireccion.setText(null);
        lavelPrecioBase.setText(null);
        lavelCodigoInmueble.setText(null);
        lavelSuperficie.setText(null);
        cbxIDInmueble.setEnabled(false);
        cbxCUIT.setEnabled(false);
        cbxDireccion.setEnabled(false);
        cbxPrecio.setEnabled(false);
        cbxDisponible.setEnabled(false);
        rbDisponibleN.setEnabled(false);
        rbDisponibleY.setEnabled(false);
        cbxDisponible.setEnabled(false);
        tbAltura.setText(null);
        tbCodigoZona.setText(null);
        tbDireccion.setText(null);
        tbSuperficie.setText(null);
        tbPrecio.setText(null);
        buttonGroup1.clearSelection();
        cbxIDInmueble.setSelected(false);
        cbxCUIT.setSelected(false);
        cbxDireccion.setSelected(false);
        cbxPrecio.setSelected(false);
        cbxDisponible.setSelected(false);
        cbxDisponible.setSelected(false);
        btnComprobarEliminar.setBackground(Color.red.darker());
        btnComprobarBuscar.setBackground(Color.red.darker());
        btnComprobarActualizar.setBackground(Color.red.darker());
        btnComprobarGuardar.setBackground(Color.red.darker());
    }//GEN-LAST:event_menuCancelarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clear();
        setColorREDComprobacion();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                setInicializarObjetos();
                propietario.setCuitPropietario(Integer.parseInt(cbCUITPropietario.getSelectedItem().toString()));
                tipoInmueble.setIdTipo(Integer.parseInt(cbIdTipo.getSelectedItem().toString()));
                inmueble.setAlturaInmueble(Integer.parseInt(tbAltura.getText()));
                inmueble.setCodigoZona(Integer.parseInt(tbCodigoZona.getText()));
                inmueble.setDireccion(tbDireccion.getText());
                inmueble.setPrecioBase(Double.parseDouble(tbPrecio.getText()));
                inmueble.setSuperficie(Double.parseDouble(tbSuperficie.getText()));
                if(buttonGroup1.getSelection()==rbDisponibleN.getModel()){
                    inmueble.setDisponible(rbDisponibleN.getText());
                }
                if(buttonGroup1.getSelection()==rbDisponibleY.getModel()){
                    inmueble.setDisponible(rbDisponibleY.getText());
                }
                
                if(inmuebleData.guardarInmueble(inmueble, propietario, tipoInmueble)){
                    btnGuardar.setEnabled(false);
                    clear();
                    setCamposEditables(true);
                    setComboBox(2);
                    setComboBox(3);
                    setBTNComprobar(false);
                    setColorREDComprobacion();
                    setMostrarTabla(inmuebleData);
                    JOptionPane.showMessageDialog(null,"Se guardo el inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
                }else{
                    btnGuardar.setEnabled(false);
                    clear();
                    setCamposEditables(true);
                    setComboBox(2);
                    setComboBox(3);
                    setBTNComprobar(false);
                    setColorREDComprobacion();
                    setMostrarTabla(inmuebleData);
                    JOptionPane.showMessageDialog(null,"No se puede guardar el inmueble","Información",JOptionPane.INFORMATION_MESSAGE );
                }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnComprobarGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarGuardarActionPerformed
        boolean habilitar = true;
        String toString = "";
        
        if(tbDireccion.getText().length()<3){
            habilitar = false;
            toString = toString +" "+"Direccion.";
        }else if(tbSuperficie.getText().length()<1){
            habilitar = false;
            toString = toString +" "+"Superficie.";
        }else if(tbPrecio.getText().length()<1){
            habilitar = false;
            toString = toString +" "+"Precio Base.";
        }else if(tbAltura.getText().length()<1){
            habilitar = false;
            toString = toString +" "+"Altura.";
        }else if(tbCodigoZona.getText().length()<1){
            habilitar = false;
            toString = toString +" "+"Codigo de Zona.";
        }else if(buttonGroup1.isSelected(null)){
            habilitar = false;
            toString = toString +" "+"Disponible.";
        }
        
        if(habilitar){
            btnGuardar.setEnabled(true);
            setCamposEditables(false);
            btnComprobarGuardar.setBackground(Color.GREEN.darker());
        }else{
            JOptionPane.showMessageDialog(null,"Debe rellenar los siguientes campos: "+toString,"Advertencia",JOptionPane.WARNING_MESSAGE );
        }
        
        
    }//GEN-LAST:event_btnComprobarGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        setInicializarObjetos();
        if(inmuebleData.borrarInmueble(Integer.parseInt(cbIdInmueble.getSelectedItem().toString()))){
            btnEliminar.setEnabled(false);
            clear();
            setCamposEditables(true);
            setComboBox(1);
            setColorREDComprobacion();
            setMostrarTabla(inmuebleData);
            JOptionPane.showMessageDialog(null,"Se elimino el inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
        }else{
            btnEliminar.setEnabled(false);
            clear();
            setCamposEditables(true);
            setComboBox(1);
            setColorREDComprobacion();
            setMostrarTabla(inmuebleData);
            JOptionPane.showMessageDialog(null,"No se puede eliminar el inmueble","Información",JOptionPane.INFORMATION_MESSAGE );
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnComprobarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarEliminarActionPerformed
        boolean habilitar = true;
        String toString = "";
        
        if(cbIdInmueble.getSelectedObjects() == null){
            habilitar = false;
            toString = "Codigo Inmueble";
        }
        
        if(habilitar){
            btnEliminar.setEnabled(true);
            setCamposEditables(false);
            btnComprobarEliminar.setBackground(Color.GREEN.darker());
        }else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar un Codigo a eliminar: "+toString,"Advertencia",JOptionPane.WARNING_MESSAGE );
        }
    }//GEN-LAST:event_btnComprobarEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        setInicializarObjetos();
        inmueble.setIdInmueble(Integer.parseInt(cbIdInmueble.getSelectedItem().toString()));
        propietario.setCuitPropietario(Integer.parseInt(cbCUITPropietario.getSelectedItem().toString()));
        tipoInmueble.setIdTipo(Integer.parseInt(cbIdTipo.getSelectedItem().toString()));
        inmueble.setAlturaInmueble(Integer.parseInt(tbAltura.getText()));
        inmueble.setCodigoZona(Integer.parseInt(tbCodigoZona.getText()));
        inmueble.setDireccion(tbDireccion.getText());
        inmueble.setPrecioBase(Double.parseDouble(tbPrecio.getText()));
        inmueble.setSuperficie(Double.parseDouble(tbSuperficie.getText()));
        if(buttonGroup1.getSelection()==rbDisponibleN.getModel()){
            inmueble.setDisponible(rbDisponibleN.getText());
        }
        if(buttonGroup1.getSelection()==rbDisponibleY.getModel()){
            inmueble.setDisponible(rbDisponibleY.getText());
        }
        
        if(inmuebleData.actualizarInmueble(inmueble, propietario, tipoInmueble)){
            btnActualizar.setEnabled(false);
            clear();
            setCamposEditables(true);
            setColorREDComprobacion();
            setBTNComprobar(false);
            setMostrarTabla(inmuebleData);
            JOptionPane.showMessageDialog(null,"Se actualizo el inmueble correctamente","Información",JOptionPane.INFORMATION_MESSAGE );
        }else{
            btnActualizar.setEnabled(false);
            clear();
            setCamposEditables(true);
            setColorREDComprobacion();
            setBTNComprobar(false);
            setMostrarTabla(inmuebleData);
            JOptionPane.showMessageDialog(null,"No se puede actualizar el inmueble","Información",JOptionPane.INFORMATION_MESSAGE );
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnComprobarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActualizarActionPerformed
        boolean habilitar = true;
        String toString = "";
        
        if(tbDireccion.getText().length()<3){
            habilitar = false;
            toString = toString +" "+"Direccion.";
        }else if(tbSuperficie.getText().length()<1){
            habilitar = false;
            toString = toString +" "+"Superficie.";
        }else if(tbPrecio.getText().length()<1){
            habilitar = false;
            toString = toString +" "+"Precio Base.";
        }else if(tbAltura.getText().length()<1){
            habilitar = false;
            toString = toString +" "+"Altura.";
        }else if(tbCodigoZona.getText().length()<1){
            habilitar = false;
            toString = toString +" "+"Codigo de Zona.";
        }else if(buttonGroup1.isSelected(null)){
            habilitar = false;
            toString = toString +" "+"Disponible.";
        }
        
        if(habilitar){
            btnActualizar.setEnabled(true);
            btnComprobarActualizar.setBackground(Color.GREEN.darker());
            setCamposEditables(false);
        }else{
            JOptionPane.showMessageDialog(null,"Debe rellenar los siguientes campos: "+toString,"Advertencia",JOptionPane.WARNING_MESSAGE );
        }
    }//GEN-LAST:event_btnComprobarActualizarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        setInicializarObjetos();
        setComboBox(2);
        setComboBox(3);
        inmueble.setIdInmueble(Integer.parseInt(cbIdInmueble.getSelectedItem().toString()));
        inmuebleData.buscarInmueble(inmueble);
        cbCUITPropietario.setSelectedItem(inmueble.getIdPropietario());
        cbIdTipo.setSelectedItem(inmueble.getIdTipoInmueble());
        tbDireccion.setText(inmueble.getDireccion());
        tbAltura.setText(String.valueOf(inmueble.getAlturaInmueble()));
        tbSuperficie.setText(String.valueOf(inmueble.getSuperficie()));
        tbPrecio.setText(String.valueOf(inmueble.getPrecioBase()));
        tbCodigoZona.setText(String.valueOf(inmueble.getCodigoZona()));
        if(rbDisponibleN.getText().equals(inmueble.getDisponible())){
            buttonGroup1.setSelected(rbDisponibleN.getModel(), true);
        }
        if(rbDisponibleY.getText().equals(inmueble.getDisponible())){
            buttonGroup1.setSelected(rbDisponibleY.getModel(), true);
        }
        btnCargar.setBackground(Color.GREEN.darker());
        btnCargar.setEnabled(false);
        btnComprobarActualizar.setEnabled(true);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void tbDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDireccionKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla >= '0' && tecla <='9'){
            evt.consume();
        }
    }//GEN-LAST:event_tbDireccionKeyTyped

    private void tbAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAlturaKeyTyped
        char tecla = evt.getKeyChar();
        if(tecla < '0' || tecla >'9'){
            evt.consume();
        }
    }//GEN-LAST:event_tbAlturaKeyTyped

    private void tbSuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbSuperficieKeyTyped
        char tecla = evt.getKeyChar();
        if((tecla < '0' || tecla >'9')&& tecla != '.'){
            evt.consume();
        }
    }//GEN-LAST:event_tbSuperficieKeyTyped
    
    
    public void setInicializarObjetos(){
        con = new Conexion();
        con.getConnection();
        inmueble = new Inmueble();
        inmuebleData = new InmuebleData(con);
        propietario = new Propietario();
        propietarioData = new PropietarioData(con);
        tipoInmueble = new tipoInmueble();
        tipoInmuebleData = new tipoInmuebleData(con);
    }
    public void clear(){
        tbAltura.setText(null);
        tbCodigoZona.setText(null);
        tbDireccion.setText(null);
        tbSuperficie.setText(null);
        tbPrecio.setText(null);
        buttonGroup1.clearSelection();
        cbxIDInmueble.setSelected(false);
        cbxCUIT.setSelected(false);
        cbxDireccion.setSelected(false);
        cbxPrecio.setSelected(false);
        cbxDisponible.setSelected(false);
        cbxDisponible.setSelected(false);
        cbIdTipo.removeAllItems();
        cbIdInmueble.removeAllItems();
        cbCUITPropietario.removeAllItems();
    }
    public void setCamposEditables(boolean valor){
        cbIdInmueble.setEnabled(valor);
        cbCUITPropietario.setEnabled(valor);
        cbIdTipo.setEnabled(valor);
        tbPrecio.setEnabled(valor);
        tbCodigoZona.setEditable(valor);
        tbDireccion.setEditable(valor);
        tbSuperficie.setEditable(valor);
        tbAltura.setEditable(valor);
        rbDisponibleN.setEnabled(valor);
        rbDisponibleY.setEnabled(valor);
    }
    public void setComboBox(int index){
        con = new Conexion();
        con.getConnection();
        inmuebleData = new InmuebleData(con); //index 1
        propietarioData = new PropietarioData(con);// index 2
        tipoInmuebleData = new tipoInmuebleData(con);// index 3
        
        
        if(index == 1){
            for(int x=0; x<inmuebleData.buscarTodosInmuebles().size(); x++){
                cbIdInmueble.addItem(inmuebleData.buscarTodosInmuebles().get(x).getIdInmueble());
            }
        }
        
        if(index == 2){
            for(int x=0; x<propietarioData.listarPropietario().size(); x++){
                cbCUITPropietario.addItem(propietarioData.listarPropietario().get(x).getCuitPropietario());
            }
        }
        
        if(index == 3){
            for(int x=0; x<tipoInmuebleData.buscarTodosLosTipos().size(); x++){
                cbIdTipo.addItem(tipoInmuebleData.buscarTodosLosTipos().get(x).getIdTipo());
            }
        }
    }
    public void setColorREDComprobacion(){
        btnComprobarEliminar.setBackground(Color.red.darker());
        btnComprobarBuscar.setBackground(Color.red.darker());
        btnComprobarActualizar.setBackground(Color.red.darker());
        btnComprobarGuardar.setBackground(Color.red.darker());
        btnCargar.setBackground(Color.red.darker());
    }
    public void setBTNComprobar(boolean valor){
        btnComprobarGuardar.setEnabled(valor);
        btnComprobarActualizar.setEnabled(valor);
        btnComprobarEliminar.setEnabled(valor);
        btnComprobarBuscar.setEnabled(valor);
    }
    public void setMostrarTabla(InmuebleData inmuebleData){
        String matris[][] = new String[inmuebleData.buscarTodosInmuebles().size()][9];
        
        for(int i = 0; i < inmuebleData.buscarTodosInmuebles().size(); i++){
            matris[i][0]= String.valueOf(inmuebleData.buscarTodosInmuebles().get(i).getIdInmueble());
            matris[i][1] = String.valueOf(inmuebleData.buscarTodosInmuebles().get(i).getIdPropietario());
            matris[i][2] = String.valueOf(inmuebleData.buscarTodosInmuebles().get(i).getDireccion());
            matris[i][3] = String.valueOf(inmuebleData.buscarTodosInmuebles().get(i).getAlturaInmueble());
            matris[i][4] = String.valueOf(inmuebleData.buscarTodosInmuebles().get(i).getCodigoZona());
            matris[i][5] = String.valueOf(inmuebleData.buscarTodosInmuebles().get(i).getPrecioBase());
            matris[i][6] = String.valueOf(inmuebleData.buscarTodosInmuebles().get(i).getSuperficie());
            matris[i][7] = String.valueOf(inmuebleData.buscarTodosInmuebles().get(i).getIdTipoInmueble());
            matris[i][8] = String.valueOf(inmuebleData.buscarTodosInmuebles().get(i).getDisponible());
        }
        tableInmueble.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Codigo Inmueble", "CUIT Propietario", "Direccion", "Altura", "Codigo de Zona", "Precio Base", "Superficie", "Codigo Tipo Inmueble", "Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }
    public void setCheckBocx(boolean valor){
        cbxIDInmueble.setEnabled(valor);
        cbxCUIT.setEnabled(valor);
        cbxDireccion.setEnabled(valor);
        cbxPrecio.setEnabled(valor);
        cbxDisponible.setEnabled(valor);

    }
    public void setCheckBoxSelected(boolean valor){
        cbxIDInmueble.setSelected(valor);
        cbxCUIT.setSelected(valor);
        cbxDireccion.setSelected(valor);
        cbxPrecio.setSelected(valor);
        cbxDisponible.setSelected(valor);
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnComprobarActualizar;
    private javax.swing.JButton btnComprobarBuscar;
    private javax.swing.JButton btnComprobarEliminar;
    private javax.swing.JButton btnComprobarGuardar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbCUITPropietario;
    private javax.swing.JComboBox cbIdInmueble;
    private javax.swing.JComboBox cbIdTipo;
    private javax.swing.JCheckBox cbxCUIT;
    private javax.swing.JCheckBox cbxDireccion;
    private javax.swing.JCheckBox cbxDisponible;
    private javax.swing.JCheckBox cbxIDInmueble;
    private javax.swing.JCheckBox cbxPrecio;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelDisponible;
    private javax.swing.JLabel lavelAltura;
    private javax.swing.JLabel lavelCUIT;
    private javax.swing.JLabel lavelCodigoInmueble;
    private javax.swing.JLabel lavelCodigoTipo;
    private javax.swing.JLabel lavelCodigoZona;
    private javax.swing.JLabel lavelDireccion;
    private javax.swing.JLabel lavelPrecioBase;
    private javax.swing.JLabel lavelSuperficie;
    private javax.swing.JButton menuActualizar;
    private javax.swing.JButton menuBuscar;
    private javax.swing.JButton menuCancelar;
    private javax.swing.JButton menuEliminar;
    private javax.swing.JButton menuNuevo;
    private javax.swing.JRadioButton rbDisponibleN;
    private javax.swing.JRadioButton rbDisponibleY;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tableInmueble;
    private javax.swing.JTextField tbAltura;
    private javax.swing.JTextField tbCodigoZona;
    private javax.swing.JTextField tbDireccion;
    private javax.swing.JTextField tbPrecio;
    private javax.swing.JTextField tbSuperficie;
    // End of variables declaration//GEN-END:variables
}
