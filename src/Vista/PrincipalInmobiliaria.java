
package Vista;

/**
 *
 * @kaiserkey
 * 
 */
public class PrincipalInmobiliaria extends javax.swing.JFrame {
    //private FormularioInmueble fInmueble;
    /**
     * Creates new form VistaInmobiliaria
     */
    public PrincipalInmobiliaria() {
        initComponents();
        setTitle("Inmobiliaria");
        setSize(800,600);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        bMenu = new javax.swing.JMenuBar();
        menu0 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();
        menu1 = new javax.swing.JMenu();
        mInmueble = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        mBuscarInmueble = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        mActualizarInmueble = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        menu0.setText("Archivo");

        mSalir.setText("Salir");
        menu0.add(mSalir);

        bMenu.add(menu0);

        menu1.setText("Formularios");

        mInmueble.setText("Inmueble");
        mInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInmuebleActionPerformed(evt);
            }
        });
        menu1.add(mInmueble);

        bMenu.add(menu1);

        menu2.setText("Busquedas");

        mBuscarInmueble.setText("Buscar Inmueble");
        menu2.add(mBuscarInmueble);

        bMenu.add(menu2);

        menu3.setText("Actualizar Datos");

        mActualizarInmueble.setText("Actualizar Inmueble");
        menu3.add(mActualizarInmueble);

        bMenu.add(menu3);

        setJMenuBar(bMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInmuebleActionPerformed

    }//GEN-LAST:event_mInmuebleActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Escritorio;
    public javax.swing.JMenuBar bMenu;
    public javax.swing.JMenuItem mActualizarInmueble;
    public javax.swing.JMenuItem mBuscarInmueble;
    public javax.swing.JMenuItem mInmueble;
    public javax.swing.JMenuItem mSalir;
    public javax.swing.JMenu menu0;
    public javax.swing.JMenu menu1;
    public javax.swing.JMenu menu2;
    public javax.swing.JMenu menu3;
    // End of variables declaration//GEN-END:variables
}
