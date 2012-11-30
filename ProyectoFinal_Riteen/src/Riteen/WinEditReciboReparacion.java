/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Dioni Ripoll
 */
public class WinEditReciboReparacion extends javax.swing.JDialog {

    /**
     * Creates new form WinEditReciboReparacion
     */
    public WinEditReciboReparacion() {
        initComponents();
        PanelReciboDeReparacion prr = new PanelReciboDeReparacion();
        this.add(prr, BorderLayout.CENTER); 
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarReciboReparacionEdt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        reciboReparacionjTable = new javax.swing.JTable();
        verBoton = new javax.swing.JButton();
        reciboReparacionEdtText = new javax.swing.JTextField();
        buscarReciboReparacionBoton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelarReciboReparacionEdt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Recibo de Reparación");

        guardarReciboReparacionEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarReciboReparacionEdt.setText("Guardar");

        reciboReparacionjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Cliente", "Articulo", "Plazo", "Fecha de Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(reciboReparacionjTable);

        verBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verBoton.setText("Ver todos los Recibos Reparación");

        reciboReparacionEdtText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        reciboReparacionEdtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciboReparacionEdtTextActionPerformed(evt);
            }
        });

        buscarReciboReparacionBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarReciboReparacionBoton.setText("Buscar");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reparacion.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recibo de Reparación");
        jLabel1.setToolTipText("");

        cancelarReciboReparacionEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarReciboReparacionEdt.setText("Cancelar");
        cancelarReciboReparacionEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarReciboReparacionEdtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(reciboReparacionEdtText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarReciboReparacionBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(guardarReciboReparacionEdt)
                                .addGap(18, 18, 18)
                                .addComponent(cancelarReciboReparacionEdt))
                            .addComponent(verBoton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reciboReparacionEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarReciboReparacionBoton))
                .addGap(18, 18, 18)
                .addComponent(verBoton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarReciboReparacionEdt)
                    .addComponent(cancelarReciboReparacionEdt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reciboReparacionEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciboReparacionEdtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reciboReparacionEdtTextActionPerformed

    private void cancelarReciboReparacionEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarReciboReparacionEdtActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "Desea cancelar los cambios realizados", "Salir", JOptionPane.YES_NO_OPTION);

        if(opc == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_cancelarReciboReparacionEdtActionPerformed

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
            java.util.logging.Logger.getLogger(WinEditReciboReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEditReciboReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEditReciboReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEditReciboReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinEditReciboReparacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarReciboReparacionBoton;
    private javax.swing.JButton cancelarReciboReparacionEdt;
    private javax.swing.JButton guardarReciboReparacionEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField reciboReparacionEdtText;
    private javax.swing.JTable reciboReparacionjTable;
    private javax.swing.JButton verBoton;
    // End of variables declaration//GEN-END:variables
}
