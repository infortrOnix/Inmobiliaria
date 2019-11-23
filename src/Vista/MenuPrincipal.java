
package Vista;

/**
 *
 * @kaiserkey
 * 
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private InmuebleVista inmuebleVista;
    /**
     * Creates new form VistaInmobiliaria
     */
    public MenuPrincipal() {
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
        menuInmueble = new javax.swing.JMenu();
        mInmueble = new javax.swing.JMenuItem();
        menuInquilino = new javax.swing.JMenu();
        mInquilino = new javax.swing.JMenuItem();
        menuContrato = new javax.swing.JMenu();
        mContrato = new javax.swing.JMenuItem();
        menuPropietario = new javax.swing.JMenu();
        mPropietario = new javax.swing.JMenuItem();
        menuTipoInmueble = new javax.swing.JMenu();
        mTipoInmueble = new javax.swing.JMenuItem();

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
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        menu0.add(mSalir);

        bMenu.add(menu0);

        menuInmueble.setText("Inmueble");

        mInmueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/casa.png"))); // NOI18N
        mInmueble.setText("Inmueble");
        mInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInmuebleActionPerformed(evt);
            }
        });
        menuInmueble.add(mInmueble);

        bMenu.add(menuInmueble);

        menuInquilino.setText("Inquilino");

        mInquilino.setText("Inquilino");
        menuInquilino.add(mInquilino);

        bMenu.add(menuInquilino);

        menuContrato.setText("Contrato");

        mContrato.setText("Contrato");
        menuContrato.add(mContrato);

        bMenu.add(menuContrato);

        menuPropietario.setText("Propietario");

        mPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vendedor.png"))); // NOI18N
        mPropietario.setText("Propietario");
        mPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPropietarioActionPerformed(evt);
            }
        });
        menuPropietario.add(mPropietario);

        bMenu.add(menuPropietario);

        menuTipoInmueble.setText("Tipo de Inmueble");

        mTipoInmueble.setText("Tipo de Inmueble");
        menuTipoInmueble.add(mTipoInmueble);

        bMenu.add(menuTipoInmueble);

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
            Escritorio.removeAll();
            Escritorio.repaint();
            inmuebleVista=new InmuebleVista();
            inmuebleVista.setVisible(true);
            Escritorio.add(inmuebleVista);
            Escritorio.moveToFront(inmuebleVista);
    }//GEN-LAST:event_mInmuebleActionPerformed

    private void mPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPropietarioActionPerformed
        // TODO add your handling code here:
        

        
    }//GEN-LAST:event_mPropietarioActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Escritorio;
    public javax.swing.JMenuBar bMenu;
    private javax.swing.JMenuItem mContrato;
    public javax.swing.JMenuItem mInmueble;
    private javax.swing.JMenuItem mInquilino;
    public javax.swing.JMenuItem mPropietario;
    public javax.swing.JMenuItem mSalir;
    private javax.swing.JMenuItem mTipoInmueble;
    public javax.swing.JMenu menu0;
    public javax.swing.JMenu menuContrato;
    public javax.swing.JMenu menuInmueble;
    public javax.swing.JMenu menuInquilino;
    private javax.swing.JMenu menuPropietario;
    private javax.swing.JMenu menuTipoInmueble;
    // End of variables declaration//GEN-END:variables
}
