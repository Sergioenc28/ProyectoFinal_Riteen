/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dioni Ripoll
 */
public class WinEditPedido extends javax.swing.JDialog {

    /**
     * Creates new form WinEditPedido
     */
    public WinEditPedido() {
        initComponents();
        PanelWinPedido pwp = new PanelWinPedido();
        this.add(pwp, BorderLayout.CENTER);  
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pedidoEdtText = new javax.swing.JTextField();
        buscarPedidosBoton = new javax.swing.JButton();
        verPedidosEdtBoton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jToggleButtonAgregarPedido = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Pedidos");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(750, 510));
        setResizable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shoping_basket.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pedidos");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Busqueda:");

        pedidoEdtText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        pedidoEdtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoEdtTextActionPerformed(evt);
            }
        });
        pedidoEdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pedidoEdtTextKeyTyped(evt);
            }
        });

        buscarPedidosBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarPedidosBoton.setText("Buscar");
        buscarPedidosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPedidosBotonActionPerformed(evt);
            }
        });

        verPedidosEdtBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verPedidosEdtBoton.setText("Ver todos los pedidos");
        verPedidosEdtBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPedidosEdtBotonActionPerformed(evt);
            }
        });

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre del Producto", "Proveedor", "Cantidad"
            }
        ));
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePedidos);

        jToggleButtonAgregarPedido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleButtonAgregarPedido.setText("Agregar Pedido");
        jToggleButtonAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAgregarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(verPedidosEdtBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButtonAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pedidoEdtText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarPedidosBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedidoEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(buscarPedidosBoton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verPedidosEdtBoton)
                    .addComponent(jToggleButtonAgregarPedido))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pedidoEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoEdtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedidoEdtTextActionPerformed

    private void verPedidosEdtBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPedidosEdtBotonActionPerformed
        limpiarTabla();
        buscarPedidos();
    }//GEN-LAST:event_verPedidosEdtBotonActionPerformed

    private void buscarPedidosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPedidosBotonActionPerformed
        verPedidosEdtBotonActionPerformed(null);
    }//GEN-LAST:event_buscarPedidosBotonActionPerformed

    private void pedidoEdtTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pedidoEdtTextKeyTyped
        int enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER){
        verPedidosEdtBotonActionPerformed(null);
        }
    }//GEN-LAST:event_pedidoEdtTextKeyTyped

    private void jToggleButtonAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAgregarPedidoActionPerformed
       WinPedido wp = new WinPedido();
       wp.casoPedido = 1;
       wp.setVisible(true);
    }//GEN-LAST:event_jToggleButtonAgregarPedidoActionPerformed

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
         if( jTablePedidos.getSelectedRows().length > 0 ) { 
          
           WinPedido wp = new WinPedido();
           wp.casoPedido = 2;           
          
           wp.idPedido = (dtm.getValueAt(jTablePedidos.getSelectedRow(), 0).toString() );
           wp.productoPedidoText.setText(dtm.getValueAt(jTablePedidos.getSelectedRow(), 1).toString());
           wp.proveedorPedidoText.setText(dtm.getValueAt(jTablePedidos.getSelectedRow(), 2).toString());
           wp.CantidadPedidoText.setText(dtm.getValueAt(jTablePedidos.getSelectedRow(), 3).toString());
           wp.setVisible(true);
         }
        
    }//GEN-LAST:event_jTablePedidosMouseClicked
     private PreparedStatement read;
     private ResultSet rs;
     private DefaultTableModel dtm;
     
    void limpiarTabla(){
    
        while(jTablePedidos.getRowCount()>0){
        ((DefaultTableModel)jTablePedidos.getModel()).removeRow(0);
        
        }
    }
    
     void buscarPedidos(){
     try {                              
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idPedido, producto, proveedor, cantidad FROM pedidos WHERE proveedor LIKE '%"+pedidoEdtText.getText() +"%'");           
            rs = (ResultSet) read.executeQuery();                       
            dtm = (DefaultTableModel) this.jTablePedidos.getModel();
            
            while (rs.next()) {            
                Object [] fila = new Object[4]; 
            
           
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
            java.util.logging.Logger.getLogger(WinEditPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEditPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEditPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEditPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinEditPedido().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarPedidosBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JToggleButton jToggleButtonAgregarPedido;
    private javax.swing.JTextField pedidoEdtText;
    private javax.swing.JButton verPedidosEdtBoton;
    // End of variables declaration//GEN-END:variables
}
