/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dioni Ripoll
 */
public class WinDetalleFacturaCredito extends javax.swing.JDialog {

    /**
     * Creates new form WinDetalleFacturaCredito
     */
    public WinDetalleFacturaCredito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        detalleFacturaCreditoText = new javax.swing.JTextField();
        buscarFacturaCredito = new javax.swing.JButton();
        nuevaFactura = new javax.swing.JButton();
        verFacturas = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboBoxDetalleFacturaCredito = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalleFacturaCredito = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detalle de Factura a Crédito");
        jLabel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Busqueda");

        detalleFacturaCreditoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                detalleFacturaCreditoTextKeyTyped(evt);
            }
        });

        buscarFacturaCredito.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarFacturaCredito.setText("Buscar");
        buscarFacturaCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFacturaCreditoActionPerformed(evt);
            }
        });

        nuevaFactura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nuevaFactura.setText("Nueva Factura");
        nuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaFacturaActionPerformed(evt);
            }
        });

        verFacturas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verFacturas.setText("Ver Facturas");
        verFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFacturasActionPerformed(evt);
            }
        });

        finalizar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalizar.setText("Finalizar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Generar Informe");

        comboBoxDetalleFacturaCredito.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboBoxDetalleFacturaCredito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hoy", "7 Días", "15 Días", "30 Días" }));

        jTableDetalleFacturaCredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Factura", "Fecha", "Cliente", "Plazo", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDetalleFacturaCredito);
        jTableDetalleFacturaCredito.getColumnModel().getColumn(0).setResizable(false);
        jTableDetalleFacturaCredito.getColumnModel().getColumn(1).setResizable(false);
        jTableDetalleFacturaCredito.getColumnModel().getColumn(2).setResizable(false);
        jTableDetalleFacturaCredito.getColumnModel().getColumn(3).setResizable(false);
        jTableDetalleFacturaCredito.getColumnModel().getColumn(4).setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(detalleFacturaCreditoText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarFacturaCredito))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nuevaFactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(verFacturas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxDetalleFacturaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(detalleFacturaCreditoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarFacturaCredito))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevaFactura)
                    .addComponent(verFacturas)
                    .addComponent(comboBoxDetalleFacturaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(finalizar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private PreparedStatement read;
    private ResultSet rs;
    private DefaultTableModel dtm;
    
    void limpiarTabla(){
    
        while(jTableDetalleFacturaCredito.getRowCount()>0){
            ((DefaultTableModel)jTableDetalleFacturaCredito.getModel()).removeRow(0);        
        }
    }      
    
     void buscarFacturasACredito(){
     try {      
                       
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idFactura, Fecha, NombreCliente, Plazo, Total  FROM factura_credito WHERE NombreCliente LIKE '%"+ detalleFacturaCreditoText.getText() +"%'");
            rs = (ResultSet) read.executeQuery();                       
            dtm = (DefaultTableModel) this.jTableDetalleFacturaCredito.getModel();
            
            while (rs.next()) {            
                Object [] fila = new Object[5]; 
                        
                for (int i=0;i<fila.length;i++) {
                    fila[i] = rs.getObject(i+1);
                } 
             
                dtm.addRow(fila);
            
            if(fila.length == 0){                         
                JOptionPane.showMessageDialog(null, "no se encontro nada");            
            }           
}       
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void detalleFacturaCreditoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detalleFacturaCreditoTextKeyTyped
        int enter = evt.getKeyChar();
        
        if (enter == KeyEvent.VK_ENTER) {
             limpiarTabla();
             buscarFacturasACredito();
        }
    }//GEN-LAST:event_detalleFacturaCreditoTextKeyTyped

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "Desea cancelar los cambios realizados", "Salir", JOptionPane.YES_NO_OPTION);
        
        if(opc == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_finalizarActionPerformed

    private void buscarFacturaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFacturaCreditoActionPerformed
        limpiarTabla();
        buscarFacturasACredito();
    }//GEN-LAST:event_buscarFacturaCreditoActionPerformed

    private void nuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaFacturaActionPerformed
        
    }//GEN-LAST:event_nuevaFacturaActionPerformed

    private void verFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFacturasActionPerformed
        detalleFacturaCreditoText.setText("");
        limpiarTabla();
        buscarFacturasACredito();
    }//GEN-LAST:event_verFacturasActionPerformed

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
            java.util.logging.Logger.getLogger(WinDetalleFacturaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinDetalleFacturaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinDetalleFacturaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinDetalleFacturaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                WinDetalleFacturaCredito dialog = new WinDetalleFacturaCredito(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarFacturaCredito;
    private javax.swing.JComboBox comboBoxDetalleFacturaCredito;
    private javax.swing.JTextField detalleFacturaCreditoText;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetalleFacturaCredito;
    private javax.swing.JButton nuevaFactura;
    private javax.swing.JButton verFacturas;
    // End of variables declaration//GEN-END:variables
}
