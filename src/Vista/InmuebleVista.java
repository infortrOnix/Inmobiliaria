
package Vista;

import javax.swing.ButtonGroup;


/**
 *
 * @kaiserkey
 * 
 */
public class InmuebleVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form Inmueble
     */
    public InmuebleVista() {
        initComponents();
        setTitle("Inmueble");
        setSize(1280,650);
        buttonGroup1.add(rbDisponibleY);
        buttonGroup1.add(rbDisponibleN);
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnCancelar.setEnabled(false);
        tbIdInmueble.setEditable(true);
        tbAltura.setEditable(false);
        tbCodigoZona.setEditable(false);
        tbDireccion.setEditable(false);
        tbIDTipo.setEditable(false);
        tbSuperficie.setEditable(false);
        tbIDPropietario.setEditable(false);
        tbIdInmueble.setEditable(false);
        spPrecio.setEnabled(false);
        labelDisponible.setText(null);
        lavelAltura.setText(null);
        lavelCUIT.setText(null);
        lavelCodigoTipo.setText(null);
        lavelCodigoZona.setText(null);
        lavelDireccion.setText(null);
        lavelPrecioBase.setText(null);
        lavelCodigoInmueble.setText(null);
        lavelSuperficie.setText(null);
        cbIDInmueble.setEnabled(false);
        cbCUIT.setEnabled(false);
        cbDireccion.setEnabled(false);
        cbPrecio.setEnabled(false);
        cbDisponible.setEnabled(false);
        rbDisponibleN.setEnabled(false);
        rbDisponibleY.setEnabled(false);

    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
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
        tbIDPropietario = new javax.swing.JTextField();
        tbIDTipo = new javax.swing.JTextField();
        tbDireccion = new javax.swing.JTextField();
        spPrecio = new javax.swing.JSpinner();
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
        tbIdInmueble = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbIDInmueble = new javax.swing.JCheckBox();
        cbDireccion = new javax.swing.JCheckBox();
        cbPrecio = new javax.swing.JCheckBox();
        cbCUIT = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        cbDisponible = new javax.swing.JCheckBox();

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

        setPreferredSize(new java.awt.Dimension(1024, 768));

        lavelCUIT.setText("CUIT del Propieario");

        lavelCodigoTipo.setText("Codigo Tipo de Inmueble");

        lavelDireccion.setText("Direccion");

        lavelAltura.setText("Altura");

        lavelSuperficie.setText("Superficie");

        lavelPrecioBase.setText("Precio Base");

        lavelCodigoZona.setText("Codigo de Zona");

        labelDisponible.setText("Disponible");

        spPrecio.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), null, null, Double.valueOf(1.0d)));

        rbDisponibleY.setText("Si");

        rbDisponibleN.setText("No");

        btnGuardar.setText("Guardar Inmueble");

        btnActualizar.setText("Actualizar Inmueble");

        btnBuscar.setText("Buscar Inmueble");

        btnEliminar.setText("Eliminar Inmueble");

        jToolBar1.setRollover(true);

        menuNuevo.setText("Nuevo");
        jToolBar1.add(menuNuevo);

        menuBuscar.setText("Buscar");
        menuBuscar.setFocusable(false);
        menuBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(menuBuscar);

        menuEliminar.setText("Borrar");
        menuEliminar.setFocusable(false);
        menuEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(menuEliminar);

        menuActualizar.setText("Actualizar");
        menuActualizar.setFocusable(false);
        menuActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(menuActualizar);

        menuCancelar.setText("Cancelar");
        jToolBar1.add(menuCancelar);

        lavelCodigoInmueble.setText("Codigo Inmueble");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Inmueble", "CUIT Propietario", "Codigo Tipo Inmueble", "Direccion", "Altura", "Superficie", "Precio Base", "Codigo de Zona", "Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnCancelar.setText("Cancelar");

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
                            .addComponent(lavelCUIT)
                            .addComponent(lavelCodigoTipo)
                            .addComponent(lavelDireccion)
                            .addComponent(lavelPrecioBase)
                            .addComponent(lavelCodigoZona)
                            .addComponent(labelDisponible)
                            .addComponent(lavelSuperficie)
                            .addComponent(lavelAltura)
                            .addComponent(lavelCodigoInmueble))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbDisponibleY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbDisponibleN))
                            .addComponent(tbIDPropietario)
                            .addComponent(tbIDTipo)
                            .addComponent(tbDireccion)
                            .addComponent(spPrecio)
                            .addComponent(tbCodigoZona)
                            .addComponent(tbSuperficie)
                            .addComponent(tbAltura)
                            .addComponent(tbIdInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbIDInmueble)
                                    .addComponent(cbDireccion)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbCUIT)))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(cbDisponible))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(19, 19, 19)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lavelCodigoInmueble)
                            .addComponent(tbIdInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbIDInmueble))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lavelCUIT)
                            .addComponent(tbIDPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCUIT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lavelCodigoTipo)
                            .addComponent(tbIDTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavelDireccion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbDireccion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lavelAltura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lavelSuperficie)
                            .addComponent(tbSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lavelPrecioBase)
                            .addComponent(spPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lavelCodigoZona)
                            .addComponent(tbCodigoZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDisponible)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbDisponibleY)
                                .addComponent(rbDisponibleN)
                                .addComponent(cbDisponible)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JCheckBox cbCUIT;
    public javax.swing.JCheckBox cbDireccion;
    public javax.swing.JCheckBox cbDisponible;
    public javax.swing.JCheckBox cbIDInmueble;
    public javax.swing.JCheckBox cbPrecio;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel labelDisponible;
    public javax.swing.JLabel lavelAltura;
    public javax.swing.JLabel lavelCUIT;
    public javax.swing.JLabel lavelCodigoInmueble;
    public javax.swing.JLabel lavelCodigoTipo;
    public javax.swing.JLabel lavelCodigoZona;
    public javax.swing.JLabel lavelDireccion;
    public javax.swing.JLabel lavelPrecioBase;
    public javax.swing.JLabel lavelSuperficie;
    public javax.swing.JButton menuActualizar;
    public javax.swing.JButton menuBuscar;
    public javax.swing.JButton menuCancelar;
    public javax.swing.JButton menuEliminar;
    public javax.swing.JButton menuNuevo;
    public javax.swing.JRadioButton rbDisponibleN;
    public javax.swing.JRadioButton rbDisponibleY;
    public javax.swing.JSpinner spPrecio;
    public javax.swing.JTextField tbAltura;
    public javax.swing.JTextField tbCodigoZona;
    public javax.swing.JTextField tbDireccion;
    public javax.swing.JTextField tbIDPropietario;
    public javax.swing.JTextField tbIDTipo;
    public javax.swing.JTextField tbIdInmueble;
    public javax.swing.JTextField tbSuperficie;
    // End of variables declaration//GEN-END:variables
}
