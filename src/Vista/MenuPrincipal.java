
package Vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @kaiserkey
 * 
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private InmuebleVista inmuebleVista;
    private PropietarioVista propietarioVista;
    private InquilinoVista inquilinoVista;
    /**
     * Creates new form VistaInmobiliaria
     */
    public  MenuPrincipal() {
        initComponents();
        setTitle("Inmobiliaria");
        setSize(850,800);
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        
        
        //setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jlblLogo = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bMenu = new javax.swing.JMenuBar();
        menu0 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();
        menuContrato = new javax.swing.JMenu();
        mContrato = new javax.swing.JMenuItem();
        menuInmueble = new javax.swing.JMenu();
        mInmueble = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuPropietario = new javax.swing.JMenu();
        mPropietario = new javax.swing.JMenuItem();
        menuInquilino = new javax.swing.JMenu();
        mInquilino = new javax.swing.JMenuItem();
        menuTipoInmueble = new javax.swing.JMenu();
        mTipoInmueble = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(255, 255, 255));
        Escritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        jlblLogo.setBackground(new java.awt.Color(255, 255, 255));
        jlblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoGrupo.png"))); // NOI18N

        Escritorio.setLayer(jlblLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        jButton1.setToolTipText("Contratos");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/casa.png"))); // NOI18N
        jButton2.setToolTipText("Inmuebles");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vendedor.png"))); // NOI18N
        jButton3.setToolTipText("Propietarios");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inquilino.png"))); // NOI18N
        jButton4.setToolTipText("Inquilinos");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salida.png"))); // NOI18N
        jButton5.setToolTipText("Salir");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        menu0.setText("Archivo");

        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        menu0.add(mSalir);

        bMenu.add(menu0);

        menuContrato.setText("Contrato");

        mContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/contrato.png"))); // NOI18N
        mContrato.setText("Contrato");
        mContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mContratoActionPerformed(evt);
            }
        });
        menuContrato.add(mContrato);

        bMenu.add(menuContrato);

        menuInmueble.setText("Inmueble");

        mInmueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/casa.png"))); // NOI18N
        mInmueble.setText("Inmueble");
        mInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInmuebleActionPerformed(evt);
            }
        });
        menuInmueble.add(mInmueble);

        jMenuItem1.setText("Tipo de Inmuebles");
        menuInmueble.add(jMenuItem1);

        bMenu.add(menuInmueble);

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

        menuInquilino.setText("Inquilino");

        mInquilino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inquilino.png"))); // NOI18N
        mInquilino.setText("Inquilino");
        mInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInquilinoActionPerformed(evt);
            }
        });
        menuInquilino.add(mInquilino);

        bMenu.add(menuInquilino);

        menuTipoInmueble.setText("Tipo de Inmueble");

        mTipoInmueble.setText("Tipo de Inmueble");
        mTipoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTipoInmuebleActionPerformed(evt);
            }
        });
        menuTipoInmueble.add(mTipoInmueble);

        bMenu.add(menuTipoInmueble);

        jMenu1.setText("Ayuda");

        jMenuItem2.setText("Ayuda");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("A cerca de");
        jMenu1.add(jMenuItem3);

        bMenu.add(jMenu1);

        setJMenuBar(bMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
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
        Escritorio.removeAll();
            Escritorio.repaint();
            propietarioVista=new PropietarioVista();
            propietarioVista.setVisible(true);
            Escritorio.add(propietarioVista);
            Escritorio.moveToFront(propietarioVista);

        
    }//GEN-LAST:event_mPropietarioActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    private void mInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInquilinoActionPerformed
            Escritorio.removeAll();
            Escritorio.repaint();
            InquilinoVista inquilino=new InquilinoVista();
            inquilino.setVisible(true);
            Escritorio.add(inquilino);
            Escritorio.moveToFront(inquilino);
    }//GEN-LAST:event_mInquilinoActionPerformed

    private void mContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mContratoActionPerformed
        // TODO add your handling code here:
            Escritorio.removeAll();
            Escritorio.repaint();
            ContratoVista contrato=new ContratoVista();
            contrato.setVisible(true);
            Escritorio.add(contrato);
            Escritorio.moveToFront(contrato);
        
        
    }//GEN-LAST:event_mContratoActionPerformed

    private void mTipoInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTipoInmuebleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mTipoInmuebleActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if((JOptionPane.showConfirmDialog(null, "Esta seguro que desea Salir de la Aplicación? ", "Confirmar Salir",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE))==0)
        {
             System.exit(0);
        }
        
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          //  Escritorio.removeAll();
          //  Escritorio.repaint();
          
            ContratoVista contrato=new ContratoVista();
            contrato.setVisible(true);
            Escritorio.add(contrato);
            Escritorio.moveToFront(contrato);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Escritorio.removeAll();
            Escritorio.repaint();
            InmuebleVista inmueble=new InmuebleVista();
            inmueble.setVisible(true);
            Escritorio.add(inmueble);
            Escritorio.moveToFront(inmueble);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
           Escritorio.removeAll();
            Escritorio.repaint();
            PropietarioVista propietario=new PropietarioVista();
            propietario.setVisible(true);
            Escritorio.add(propietario);
            Escritorio.moveToFront(propietario);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
            Escritorio.repaint();
            InquilinoVista inquilino=new InquilinoVista();
            inquilino.setVisible(true);
            Escritorio.add(inquilino);
            Escritorio.moveToFront(inquilino);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    public javax.swing.JMenuBar bMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel jlblLogo;
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
