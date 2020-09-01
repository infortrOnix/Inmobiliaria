
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
    private Conexion con;
    private Inmueble inmueble;
    private Propietario propietario;
    private tipoInmueble tipoInmueble;
    private InmuebleData inmuebleData;
    private PropietarioData propietarioData;
    private tipoInmuebleData tipoInmuebleData;
    
    public InmuebleVista() {
        setTitle("Inmueble");
        setSize(800,600);
        initComponents();
        setInicializarObjetos();
        buttonGroup1.add(rbDisponibleY);
        buttonGroup1.add(rbDisponibleN);
        setOcultarElementos(false);
        labelCUITPropietario.setText("CUIT del Propieario");
        labelCodigoTipo.setText("Codigo Tipo de Inmueble");
        labelDireccion.setText("Direccion");
        labelAltura.setText("Altura");
        labelSuperficie.setText("Superficie");
        labelPrecioBase.setText("Precio Base");
        labelCodigoZona.setText("Codigo de Zona");
        labelDisponible.setText("Disponible");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        labelCUITPropietario = new javax.swing.JLabel();
        labelCodigoTipo = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        labelSuperficie = new javax.swing.JLabel();
        labelPrecioBase = new javax.swing.JLabel();
        labelCodigoZona = new javax.swing.JLabel();
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
        menuSalir = new javax.swing.JButton();
        labelCodigoInmueble = new javax.swing.JLabel();
        cbxCodigoInmueble = new javax.swing.JCheckBox();
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
        cbCodigoInmueble = new javax.swing.JComboBox();
        cbCodigoTipo = new javax.swing.JComboBox();
        cbCUITPropietario = new javax.swing.JComboBox();
        btnCargar = new javax.swing.JButton();
        tbPrecio = new javax.swing.JTextField();
        lavelBuscar = new javax.swing.JLabel();

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

        labelCUITPropietario.setText("CUIT del Propieario");

        labelCodigoTipo.setText("Codigo Tipo de Inmueble");

        labelDireccion.setText("Direccion");

        labelAltura.setText("Altura");

        labelSuperficie.setText("Superficie");

        labelPrecioBase.setText("Precio Base");

        labelCodigoZona.setText("Codigo de Zona");

        labelDisponible.setText("Disponible");

        tbDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbDireccionKeyTyped(evt);
            }
        });

        tbCodigoZona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbAlturaKeyTyped(evt);
            }
        });

        tbSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbSuperficieKeyTyped(evt);
            }
        });

        tbAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbAlturaKeyTyped(evt);
            }
        });

        rbDisponibleY.setBackground(new java.awt.Color(156, 193, 118));
        rbDisponibleY.setText("Si");

        rbDisponibleN.setBackground(new java.awt.Color(156, 193, 118));
        rbDisponibleN.setText("No");

        btnGuardar.setBackground(new java.awt.Color(116, 159, 243));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/savedoc.png"))); // NOI18N
        btnGuardar.setText("Guardar Inmueble");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(116, 159, 243));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/updatedoc.png"))); // NOI18N
        btnActualizar.setText("Actualizar Inmueble");
        btnActualizar.setMaximumSize(new java.awt.Dimension(155, 42));
        btnActualizar.setMinimumSize(new java.awt.Dimension(155, 42));
        btnActualizar.setPreferredSize(new java.awt.Dimension(155, 42));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(116, 159, 243));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/investigacion.png"))); // NOI18N
        btnBuscar.setText("Buscar Inmueble");
        btnBuscar.setMaximumSize(new java.awt.Dimension(155, 42));
        btnBuscar.setMinimumSize(new java.awt.Dimension(155, 42));
        btnBuscar.setPreferredSize(new java.awt.Dimension(155, 42));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(116, 159, 243));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar Inmueble");
        btnEliminar.setMaximumSize(new java.awt.Dimension(155, 42));
        btnEliminar.setMinimumSize(new java.awt.Dimension(155, 42));
        btnEliminar.setPreferredSize(new java.awt.Dimension(155, 42));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(99, 184, 99));
        jToolBar1.setRollover(true);

        menuNuevo.setBackground(new java.awt.Color(153, 204, 255));
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

        menuSalir.setBackground(new java.awt.Color(153, 204, 255));
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

        labelCodigoInmueble.setText("Codigo Inmueble");

        cbxCodigoInmueble.setBackground(new java.awt.Color(156, 193, 118));
        cbxCodigoInmueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxCodigoInmuebleMousePressed(evt);
            }
        });

        cbxDireccion.setBackground(new java.awt.Color(156, 193, 118));
        cbxDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxDireccionMousePressed(evt);
            }
        });

        cbxPrecio.setBackground(new java.awt.Color(156, 193, 118));
        cbxPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxPrecioMousePressed(evt);
            }
        });

        cbxCUIT.setBackground(new java.awt.Color(156, 193, 118));
        cbxCUIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxCUITMousePressed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(116, 159, 243));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/espalda.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(155, 42));
        btnCancelar.setMinimumSize(new java.awt.Dimension(155, 42));
        btnCancelar.setPreferredSize(new java.awt.Dimension(155, 42));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbxDisponible.setBackground(new java.awt.Color(156, 193, 118));
        cbxDisponible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxDisponibleMousePressed(evt);
            }
        });

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableInmueble.setBackground(new java.awt.Color(255, 255, 204));
        tableInmueble.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        btnComprobarGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        btnComprobarGuardar.setText("Comprobar");
        btnComprobarGuardar.setMaximumSize(new java.awt.Dimension(125, 42));
        btnComprobarGuardar.setMinimumSize(new java.awt.Dimension(125, 42));
        btnComprobarGuardar.setPreferredSize(new java.awt.Dimension(125, 42));
        btnComprobarGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarGuardarActionPerformed(evt);
            }
        });

        btnComprobarEliminar.setBackground(new java.awt.Color(203, 79, 79));
        btnComprobarEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        btnComprobarEliminar.setText("Comprobar");
        btnComprobarEliminar.setMaximumSize(new java.awt.Dimension(125, 42));
        btnComprobarEliminar.setMinimumSize(new java.awt.Dimension(125, 42));
        btnComprobarEliminar.setPreferredSize(new java.awt.Dimension(125, 42));
        btnComprobarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarEliminarActionPerformed(evt);
            }
        });

        btnComprobarBuscar.setBackground(new java.awt.Color(203, 79, 79));
        btnComprobarBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        btnComprobarBuscar.setText("Comprobar");
        btnComprobarBuscar.setMaximumSize(new java.awt.Dimension(125, 42));
        btnComprobarBuscar.setMinimumSize(new java.awt.Dimension(125, 42));
        btnComprobarBuscar.setPreferredSize(new java.awt.Dimension(125, 42));
        btnComprobarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarBuscarActionPerformed(evt);
            }
        });

        btnComprobarActualizar.setBackground(new java.awt.Color(203, 79, 79));
        btnComprobarActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        btnComprobarActualizar.setText("Comprobar");
        btnComprobarActualizar.setMaximumSize(new java.awt.Dimension(125, 42));
        btnComprobarActualizar.setMinimumSize(new java.awt.Dimension(125, 42));
        btnComprobarActualizar.setPreferredSize(new java.awt.Dimension(125, 42));
        btnComprobarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActualizarActionPerformed(evt);
            }
        });

        btnCargar.setBackground(new java.awt.Color(203, 79, 79));
        btnCargar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.setMaximumSize(new java.awt.Dimension(73, 24));
        btnCargar.setMinimumSize(new java.awt.Dimension(73, 24));
        btnCargar.setPreferredSize(new java.awt.Dimension(73, 24));
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        tbPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbSuperficieKeyTyped(evt);
            }
        });

        lavelBuscar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lavelBuscar.setText("Buscar Inmueble Por");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCUITPropietario)
                                    .addComponent(labelCodigoTipo)
                                    .addComponent(labelDireccion)
                                    .addComponent(labelPrecioBase)
                                    .addComponent(labelCodigoZona)
                                    .addComponent(labelDisponible)
                                    .addComponent(labelSuperficie)
                                    .addComponent(labelAltura)
                                    .addComponent(labelCodigoInmueble))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lavelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbDisponibleY)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbDisponibleN)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tbDireccion)
                                    .addComponent(tbCodigoZona)
                                    .addComponent(tbSuperficie)
                                    .addComponent(tbAltura)
                                    .addComponent(cbCodigoInmueble, 0, 147, Short.MAX_VALUE)
                                    .addComponent(cbCUITPropietario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCodigoTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbPrecio, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxDireccion)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbxCUIT))
                                    .addComponent(cbxDisponible, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbxCodigoInmueble))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnComprobarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnComprobarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnComprobarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnComprobarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lavelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCodigoInmueble)
                                .addComponent(cbCodigoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxCodigoInmueble)
                            .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCUITPropietario)
                                    .addComponent(cbCUITPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCodigoTipo)
                                    .addComponent(cbCodigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbxCUIT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDireccion)
                                    .addComponent(tbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAltura))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelSuperficie)
                                    .addComponent(tbSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPrecioBase)
                                    .addComponent(tbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxPrecio)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigoZona)
                            .addComponent(tbCodigoZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxDisponible)
                            .addComponent(labelDisponible)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbDisponibleY)
                                .addComponent(rbDisponibleN))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addComponent(btnComprobarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComprobarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComprobarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnComprobarEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        setInicializarObjetos();
        setOcultarElementosNuevo(true);
        btnGuardar.setEnabled(false);
        setColorREDComprobacion();
        setCamposEditables(true);
        setComboBox(2);
        setComboBox(3);
        setMostrarTabla(inmuebleData);
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarActionPerformed
        setInicializarObjetos();
        setOcultarElementosBuscar(true);
        btnBuscar.setEnabled(false);
        setCamposEditables(true);
        setColorREDComprobacion();
        setCheckBocx(true);
        setCheckBoxSelected(false);
        setComboBox(1); 
        setComboBox(2);
        setMostrarTabla(inmuebleData);
    }//GEN-LAST:event_menuBuscarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        setInicializarObjetos();
        setOcultarElementosEliminar(true);
        btnEliminar.setEnabled(false);
        setColorREDComprobacion();
        setComboBox(1);
        setMostrarTabla(inmuebleData);
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        setInicializarObjetos();
        setOcultarElementosActualizar(true);
        btnActualizar.setEnabled(false);
        setColorREDComprobacion();
        setCamposEditables(true);
        setComboBox(1);
        setMostrarTabla(inmuebleData);
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void menuCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCancelarActionPerformed
        setOcultarElementos(false);
    }//GEN-LAST:event_menuCancelarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clear();
        setColorREDComprobacion();
        setMostrarTabla(inmuebleData);
        setCamposEditables(true);
        setCheckBocx(true);
        setCheckBoxSelected(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                setInicializarObjetos();
                propietario.setCuitPropietario(cbCUITPropietario.getSelectedItem().toString());
                tipoInmueble.setIdTipo(Integer.parseInt(cbCodigoTipo.getSelectedItem().toString()));
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
        if(inmuebleData.borrarInmueble(Integer.parseInt(cbCodigoInmueble.getSelectedItem().toString()))){
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
        
        if(cbCodigoInmueble.getSelectedObjects() == null){
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
        inmueble.setIdInmueble(Integer.parseInt(cbCodigoInmueble.getSelectedItem().toString()));
        propietario.setCuitPropietario(cbCUITPropietario.getSelectedItem().toString());
        tipoInmueble.setIdTipo(Integer.parseInt(cbCodigoTipo.getSelectedItem().toString()));
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
        inmueble.setIdInmueble(Integer.parseInt(cbCodigoInmueble.getSelectedItem().toString()));
        inmuebleData.buscarInmueble(inmueble);
        cbCUITPropietario.setSelectedItem(inmueble.getIdPropietario());
        cbCodigoTipo.setSelectedItem(inmueble.getIdTipoInmueble());
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        setInicializarObjetos();
        if(cbxCodigoInmueble.isSelected()){
            setTabla(inmuebleData, "idInmueble", cbCodigoInmueble.getSelectedItem().toString());
        }
        if(cbxCUIT.isSelected()){
            setTabla(inmuebleData, "idPropietario", cbCUITPropietario.getSelectedItem().toString());
        }
        if(cbxDireccion.isSelected()){
            setTabla(inmuebleData, "direccion", tbDireccion.getText());
        }
        if(cbxPrecio.isSelected()){
            setTabla(inmuebleData, "precioBase", tbPrecio.getText());
        }
        if(cbxDisponible.isSelected()){

            if(buttonGroup1.getSelection()==rbDisponibleN.getModel()){
                    setTabla(inmuebleData, "disponible", rbDisponibleN.getText());
                }
            if(buttonGroup1.getSelection()==rbDisponibleY.getModel()){
                    setTabla(inmuebleData, "disponible", rbDisponibleY.getText());
                }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnComprobarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarBuscarActionPerformed
        if(cbxCodigoInmueble.isSelected()||
                cbxCUIT.isSelected()||
                cbxDireccion.isSelected()||
                cbxPrecio.isSelected()||
                cbxDisponible.isSelected())
        {
                if(cbxCodigoInmueble.isSelected())
            {
                btnBuscar.setEnabled(true);
                setCheckBocx(false);
                setCamposEditables(false);

            }

            if(cbxCUIT.isSelected())
            {
                btnBuscar.setEnabled(true);
                setCheckBocx(false);
                setCamposEditables(false);

            }

            if(cbxDireccion.isSelected())
            {
                if(cbxDireccion.getText().length()<1){
                    JOptionPane.showMessageDialog(null,"Debe rellenar el campo, Direccion","Información",JOptionPane.INFORMATION_MESSAGE );
                    setCamposEditables(true); 
                }else{
                    btnBuscar.setEnabled(true);
                    setCheckBocx(false); 
                    setCamposEditables(false);
                }
            }

            if(cbxPrecio.isSelected())
            {
                if(tbPrecio.getText().length()<1){
                    JOptionPane.showMessageDialog(null,"Debe rellenar el campo, Precio Base","Información",JOptionPane.INFORMATION_MESSAGE );
                    setCamposEditables(true); 
                }else{
                btnBuscar.setEnabled(true);
                setCheckBocx(false);
                setCamposEditables(false); 
                }

            }

            if(cbxDisponible.isSelected())
            {
                if(buttonGroup1.isSelected(null)){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar una opcion, Disponible","Información",JOptionPane.INFORMATION_MESSAGE );
                    setCamposEditables(true); 
                    
                }else{
                    btnBuscar.setEnabled(true);
                    setCheckBocx(false); 
                    setCamposEditables(false); 
                }

            }
            
        }else{
            JOptionPane.showMessageDialog(null,"No se ha seleccionado ningun campo para buscar","Información",JOptionPane.INFORMATION_MESSAGE );
        }
        

    }//GEN-LAST:event_btnComprobarBuscarActionPerformed

    private void cbxCodigoInmuebleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCodigoInmuebleMousePressed
        if(cbxCodigoInmueble.isSelected()){
            cbxCUIT.setEnabled(true);
            cbxDireccion.setEnabled(true);
            cbxPrecio.setEnabled(true);
            cbxDisponible.setEnabled(true);
        }
        if(!cbxCodigoInmueble.isSelected()){
            cbxCUIT.setEnabled(false);
            cbxDireccion.setEnabled(false);
            cbxPrecio.setEnabled(false);
            cbxDisponible.setEnabled(false);
            
        }
    }//GEN-LAST:event_cbxCodigoInmuebleMousePressed

    private void cbxCUITMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCUITMousePressed
        if(cbxCUIT.isSelected()){
            cbxCodigoInmueble.setEnabled(true);
            cbxDireccion.setEnabled(true);
            cbxPrecio.setEnabled(true);
            cbxDisponible.setEnabled(true);
        }
        if(!cbxCUIT.isSelected()){
            cbxCodigoInmueble.setEnabled(false);
            cbxDireccion.setEnabled(false);
            cbxPrecio.setEnabled(false);
            cbxDisponible.setEnabled(false);
            
        }
    }//GEN-LAST:event_cbxCUITMousePressed

    private void cbxDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxDireccionMousePressed
        if(cbxDireccion.isSelected()){
            cbxCodigoInmueble.setEnabled(true);
            cbxCUIT.setEnabled(true);
            cbxPrecio.setEnabled(true);
            cbxDisponible.setEnabled(true);
        }
        if(!cbxDireccion.isSelected()){
            cbxCodigoInmueble.setEnabled(false);
            cbxCUIT.setEnabled(false);
            cbxPrecio.setEnabled(false);
            cbxDisponible.setEnabled(false);
            
        }
    }//GEN-LAST:event_cbxDireccionMousePressed

    private void cbxPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxPrecioMousePressed
        if(cbxPrecio.isSelected()){
            cbxCodigoInmueble.setEnabled(true);
            cbxCUIT.setEnabled(true);
            cbxDireccion.setEnabled(true);
            cbxDisponible.setEnabled(true);
        }
        if(!cbxPrecio.isSelected()){
            cbxCodigoInmueble.setEnabled(false);
            cbxCUIT.setEnabled(false);
            cbxDireccion.setEnabled(false);
            cbxDisponible.setEnabled(false);
            
        }
    }//GEN-LAST:event_cbxPrecioMousePressed

    private void cbxDisponibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxDisponibleMousePressed
        if(cbxDisponible.isSelected()){
            cbxCodigoInmueble.setEnabled(true);
            cbxCUIT.setEnabled(true);
            cbxDireccion.setEnabled(true);
            cbxPrecio.setEnabled(true);
        }
        if(!cbxDisponible.isSelected()){
            cbxCodigoInmueble.setEnabled(false);
            cbxCUIT.setEnabled(false);
            cbxDireccion.setEnabled(false);
            cbxPrecio.setEnabled(false);
            
        }
    }//GEN-LAST:event_cbxDisponibleMousePressed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed
    
    
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
        cbxCodigoInmueble.setSelected(false);
        cbxCUIT.setSelected(false);
        cbxDireccion.setSelected(false);
        cbxPrecio.setSelected(false);
        cbxDisponible.setSelected(false);
        cbxDisponible.setSelected(false);
        cbCodigoTipo.setSelectedItem(null);
        cbCodigoInmueble.setSelectedItem(null);
        cbCUITPropietario.setSelectedItem(null);
    }
    public void setCamposEditables(boolean valor){
        cbCodigoInmueble.setEnabled(valor);
        cbCUITPropietario.setEnabled(valor);
        cbCodigoTipo.setEnabled(valor);
        tbPrecio.setEnabled(valor);
        tbCodigoZona.setEditable(valor);
        tbDireccion.setEditable(valor);
        tbSuperficie.setEditable(valor);
        tbAltura.setEditable(valor);
        rbDisponibleN.setEnabled(valor);
        rbDisponibleY.setEnabled(valor);
    }
    public void setComboBox(int index){

        if(index == 1){
            if(cbCodigoInmueble.getItemCount()>0){
                cbCodigoInmueble.removeAllItems();
            }
                for(int x=0; x<inmuebleData.buscarTodosInmuebles().size(); x++){
                cbCodigoInmueble.setEnabled(true);
                cbCodigoInmueble.addItem(inmuebleData.buscarTodosInmuebles().get(x).getIdInmueble());
            
            }

        }
        
        if(index == 2){
            if(cbCUITPropietario.getItemCount()>0){
                cbCUITPropietario.removeAllItems();
            }
                for(int x=0; x<propietarioData.listarPropietario().size(); x++){
                cbCUITPropietario.setEnabled(true);
                cbCUITPropietario.addItem(propietarioData.listarPropietario().get(x).getCuitPropietario());
            }

        }
        
        if(index == 3){
            if(cbCodigoTipo.getItemCount()>0){
                cbCodigoTipo.removeAllItems();
            }
            for(int x=0; x<tipoInmuebleData.buscarTodosLosTipos().size(); x++){
                cbCodigoTipo.setEnabled(true);
                cbCodigoTipo.addItem(tipoInmuebleData.buscarTodosLosTipos().get(x).getIdTipo());
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
    public void setTabla(InmuebleData inmuebleData, String nombre, String valor){
        String matris[][] = new String[inmuebleData.buscarInmueblePor(nombre, valor).size()][9];
        
        for(int i = 0; i < inmuebleData.buscarInmueblePor(nombre, valor).size(); i++){
            matris[i][0]= String.valueOf(inmuebleData.buscarInmueblePor(nombre, valor).get(i).getIdInmueble());
            matris[i][1] = String.valueOf(inmuebleData.buscarInmueblePor(nombre, valor).get(i).getIdPropietario());
            matris[i][2] = String.valueOf(inmuebleData.buscarInmueblePor(nombre, valor).get(i).getDireccion());
            matris[i][3] = String.valueOf(inmuebleData.buscarInmueblePor(nombre, valor).get(i).getAlturaInmueble());
            matris[i][4] = String.valueOf(inmuebleData.buscarInmueblePor(nombre, valor).get(i).getCodigoZona());
            matris[i][5] = String.valueOf(inmuebleData.buscarInmueblePor(nombre, valor).get(i).getPrecioBase());
            matris[i][6] = String.valueOf(inmuebleData.buscarInmueblePor(nombre, valor).get(i).getSuperficie());
            matris[i][7] = String.valueOf(inmuebleData.buscarInmueblePor(nombre, valor).get(i).getIdTipoInmueble());
            matris[i][8] = String.valueOf(inmuebleData.buscarInmueblePor(nombre, valor).get(i).getDisponible());
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
        cbxCodigoInmueble.setEnabled(valor);
        cbxCUIT.setEnabled(valor);
        cbxDireccion.setEnabled(valor);
        cbxPrecio.setEnabled(valor);
        cbxDisponible.setEnabled(valor);

    }
    public void setCheckBoxSelected(boolean valor){
        cbxCodigoInmueble.setSelected(valor);
        cbxCUIT.setSelected(valor);
        cbxDireccion.setSelected(valor);
        cbxPrecio.setSelected(valor);
        cbxDisponible.setSelected(valor);
    }
    public void setOcultarElementos(boolean valor){
        btnGuardar.setVisible(valor);
        btnBuscar.setVisible(valor);
        btnEliminar.setVisible(valor);
        btnCancelar.setVisible(valor);
        btnActualizar.setVisible(valor);
        btnCargar.setVisible(valor);
        btnComprobarGuardar.setVisible(valor);
        btnComprobarActualizar.setVisible(valor);
        btnComprobarEliminar.setVisible(valor);
        btnComprobarBuscar.setVisible(valor);
        cbxCodigoInmueble.setVisible(valor);
        cbxCUIT.setVisible(valor);
        cbxPrecio.setVisible(valor);
        cbxDisponible.setVisible(valor);
        cbxDireccion.setVisible(valor);
        cbCodigoInmueble.setVisible(valor);
        cbCodigoTipo.setVisible(valor);
        cbCUITPropietario.setVisible(valor);
        tbDireccion.setVisible(valor);
        tbAltura.setVisible(valor);
        tbPrecio.setVisible(valor);
        tbSuperficie.setVisible(valor);
        tbCodigoZona.setVisible(valor);
        rbDisponibleY.setVisible(valor);
        rbDisponibleN.setVisible(valor);
        lavelBuscar.setVisible(valor);
        labelCodigoInmueble.setVisible(valor);
        labelCUITPropietario.setVisible(valor);
        labelCodigoTipo.setVisible(valor);
        labelDireccion.setVisible(valor);
        labelPrecioBase.setVisible(valor);
        labelSuperficie.setVisible(valor);
        labelAltura.setVisible(valor);
        labelDisponible.setVisible(valor);
        labelCodigoZona.setVisible(valor);
        scroll.setVisible(valor);
    }
    public void setOcultarElementosNuevo(boolean valor){
        btnGuardar.setVisible(valor);
        btnBuscar.setVisible(false);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(valor);
        btnActualizar.setVisible(false);
        btnCargar.setVisible(false);
        btnComprobarGuardar.setVisible(valor);
        btnComprobarActualizar.setVisible(false);
        btnComprobarEliminar.setVisible(false);
        btnComprobarBuscar.setVisible(false);
        cbxCodigoInmueble.setVisible(false);
        cbxCUIT.setVisible(false);
        cbxPrecio.setVisible(false);
        cbxDisponible.setVisible(false);
        cbxDireccion.setVisible(false);
        cbCodigoInmueble.setVisible(false);
        cbCodigoTipo.setVisible(valor);
        cbCUITPropietario.setVisible(valor);
        tbDireccion.setVisible(valor);
        tbAltura.setVisible(valor);
        tbPrecio.setVisible(valor);
        tbSuperficie.setVisible(valor);
        tbCodigoZona.setVisible(valor);
        rbDisponibleY.setVisible(valor);
        rbDisponibleN.setVisible(valor);
        lavelBuscar.setVisible(false);
        labelCodigoInmueble.setVisible(false);
        labelCUITPropietario.setVisible(valor);
        labelCodigoTipo.setVisible(valor);
        labelDireccion.setVisible(valor);
        labelPrecioBase.setVisible(valor);
        labelSuperficie.setVisible(valor);
        labelAltura.setVisible(valor);
        labelDisponible.setVisible(valor);
        labelCodigoZona.setVisible(valor);
        scroll.setVisible(valor);
    }
    public void setOcultarElementosBuscar(boolean valor){
        btnGuardar.setVisible(false);
        btnBuscar.setVisible(valor);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(valor);
        btnActualizar.setVisible(false);
        btnCargar.setVisible(false);
        btnComprobarGuardar.setVisible(false);
        btnComprobarActualizar.setVisible(false);
        btnComprobarEliminar.setVisible(false);
        btnComprobarBuscar.setVisible(valor);
        cbxCodigoInmueble.setVisible(valor);
        cbxCUIT.setVisible(valor);
        cbxPrecio.setVisible(valor);
        cbxDisponible.setVisible(valor);
        cbxDireccion.setVisible(valor);
        cbCodigoInmueble.setVisible(valor);
        cbCodigoTipo.setVisible(false);
        cbCUITPropietario.setVisible(valor);
        tbDireccion.setVisible(valor);
        tbAltura.setVisible(false);
        tbPrecio.setVisible(valor);
        tbSuperficie.setVisible(false);
        tbCodigoZona.setVisible(false);
        rbDisponibleY.setVisible(valor);
        rbDisponibleN.setVisible(valor);
        lavelBuscar.setVisible(valor);
        labelCodigoInmueble.setVisible(valor);
        labelCUITPropietario.setVisible(valor);
        labelCodigoTipo.setVisible(false);
        labelDireccion.setVisible(valor);
        labelPrecioBase.setVisible(valor);
        labelSuperficie.setVisible(false);
        labelAltura.setVisible(false);
        labelDisponible.setVisible(valor);
        labelCodigoZona.setVisible(false);
        scroll.setVisible(valor);
    }
    public void setOcultarElementosEliminar(boolean valor){
        btnGuardar.setVisible(false);
        btnBuscar.setVisible(false);
        btnEliminar.setVisible(valor);
        btnCancelar.setVisible(valor);
        btnActualizar.setVisible(false);
        btnCargar.setVisible(false);
        btnComprobarGuardar.setVisible(false);
        btnComprobarActualizar.setVisible(false);
        btnComprobarEliminar.setVisible(valor);
        btnComprobarBuscar.setVisible(false);
        cbxCodigoInmueble.setVisible(false);
        cbxCUIT.setVisible(false);
        cbxPrecio.setVisible(false);
        cbxDisponible.setVisible(false);
        cbxDireccion.setVisible(false);
        cbCodigoInmueble.setVisible(valor);
        cbCodigoTipo.setVisible(false);
        cbCUITPropietario.setVisible(false);
        tbDireccion.setVisible(false);
        tbAltura.setVisible(false);
        tbPrecio.setVisible(false);
        tbSuperficie.setVisible(false);
        tbCodigoZona.setVisible(false);
        rbDisponibleY.setVisible(false);
        rbDisponibleN.setVisible(false);
        lavelBuscar.setVisible(false);
        labelCodigoInmueble.setVisible(valor);
        labelCUITPropietario.setVisible(false);
        labelCodigoTipo.setVisible(false);
        labelDireccion.setVisible(false);
        labelPrecioBase.setVisible(false);
        labelSuperficie.setVisible(false);
        labelAltura.setVisible(false);
        labelDisponible.setVisible(false);
        labelCodigoZona.setVisible(false);
        scroll.setVisible(valor);
    }
    public void setOcultarElementosActualizar(boolean valor){
        btnGuardar.setVisible(false);
        btnBuscar.setVisible(false);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(valor);
        btnActualizar.setVisible(valor);
        btnCargar.setVisible(valor);
        btnComprobarGuardar.setVisible(false);
        btnComprobarActualizar.setVisible(valor);
        btnComprobarEliminar.setVisible(false);
        btnComprobarBuscar.setVisible(false);
        cbxCodigoInmueble.setVisible(false);
        cbxCUIT.setVisible(false);
        cbxPrecio.setVisible(false);
        cbxDisponible.setVisible(false);
        cbxDireccion.setVisible(false);
        cbCodigoInmueble.setVisible(valor);
        cbCodigoTipo.setVisible(valor);
        cbCUITPropietario.setVisible(valor);
        tbDireccion.setVisible(valor);
        tbAltura.setVisible(valor);
        tbPrecio.setVisible(valor);
        tbSuperficie.setVisible(valor);
        tbCodigoZona.setVisible(valor);
        rbDisponibleY.setVisible(valor);
        rbDisponibleN.setVisible(valor);
        lavelBuscar.setVisible(false);
        labelCodigoInmueble.setVisible(valor);
        labelCUITPropietario.setVisible(valor);
        labelCodigoTipo.setVisible(valor);
        labelDireccion.setVisible(valor);
        labelPrecioBase.setVisible(valor);
        labelSuperficie.setVisible(valor);
        labelAltura.setVisible(valor);
        labelDisponible.setVisible(valor);
        labelCodigoZona.setVisible(valor);
        scroll.setVisible(valor);
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
    private javax.swing.JComboBox cbCodigoInmueble;
    private javax.swing.JComboBox cbCodigoTipo;
    private javax.swing.JCheckBox cbxCUIT;
    private javax.swing.JCheckBox cbxCodigoInmueble;
    private javax.swing.JCheckBox cbxDireccion;
    private javax.swing.JCheckBox cbxDisponible;
    private javax.swing.JCheckBox cbxPrecio;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelCUITPropietario;
    private javax.swing.JLabel labelCodigoInmueble;
    private javax.swing.JLabel labelCodigoTipo;
    private javax.swing.JLabel labelCodigoZona;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDisponible;
    private javax.swing.JLabel labelPrecioBase;
    private javax.swing.JLabel labelSuperficie;
    private javax.swing.JLabel lavelBuscar;
    private javax.swing.JButton menuActualizar;
    private javax.swing.JButton menuBuscar;
    private javax.swing.JButton menuCancelar;
    private javax.swing.JButton menuEliminar;
    private javax.swing.JButton menuNuevo;
    private javax.swing.JButton menuSalir;
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
