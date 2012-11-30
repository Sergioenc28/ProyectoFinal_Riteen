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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dioni Ripoll
 */
public class WinEditProducto extends javax.swing.JDialog {

    /**
     * Creates new form WinEditProducto
     */
    public WinEditProducto() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productoEdtText = new javax.swing.JTextField();
        buscarProductoBoton = new javax.swing.JButton();
        verBoton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        guardarProductoEdt = new javax.swing.JButton();
        cancelarProductoEdt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Almacen");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Productos");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda:");

        productoEdtText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        productoEdtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoEdtTextActionPerformed(evt);
            }
        });
        productoEdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productoEdtTextKeyTyped(evt);
            }
        });

        buscarProductoBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarProductoBoton.setText("Buscar");
        buscarProductoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProductoBotonActionPerformed(evt);
            }
        });

        verBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verBoton.setText("Ver todos los Productos");
        verBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBotonActionPerformed(evt);
            }
        });

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Proveedor", "Exist Almac", "Costo", "Precio de Venta"
            }
        ));
        jScrollPane3.setViewportView(jTableProductos);

        guardarProductoEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarProductoEdt.setText("Guardar");
        guardarProductoEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoEdtActionPerformed(evt);
            }
        });

        cancelarProductoEdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarProductoEdt.setText("Cancelar");
        cancelarProductoEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarProductoEdtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verBoton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(productoEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarProductoBoton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(guardarProductoEdt)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarProductoEdt)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productoEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProductoBoton))
                .addGap(18, 18, 18)
                .addComponent(verBoton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarProductoEdt)
                    .addComponent(cancelarProductoEdt))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productoEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoEdtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoEdtTextActionPerformed

    private void cancelarProductoEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarProductoEdtActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "Desea cancelar los cambios realizados", "Salir", JOptionPane.YES_NO_OPTION);

        if(opc == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_cancelarProductoEdtActionPerformed

    private PreparedStatement read;
    private ResultSet rs;
    private DefaultTableModel dtm;
    
    void limpiarTabla(){
    
        while(jTableProductos.getRowCount()>0){
        ((DefaultTableModel)jTableProductos.getModel()).removeRow(0);
        
        }
    }
    
    private void guardarProductoEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoEdtActionPerformed
        
    }//GEN-LAST:event_guardarProductoEdtActionPerformed

    private void buscarProductoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProductoBotonActionPerformed
        limpiarTabla();
        buscarProductos();
    }//GEN-LAST:event_buscarProductoBotonActionPerformed

    private void verBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBotonActionPerformed
        productoEdtText.setText("");
        limpiarTabla();
        buscarProductos();
    }//GEN-LAST:event_verBotonActionPerformed

    private void productoEdtTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productoEdtTextKeyTyped
         int enter = evt.getKeyChar();
      if (enter == KeyEvent.VK_ENTER) {
          limpiarTabla();  
          buscarProductos();
        }
    }//GEN-LAST:event_productoEdtTextKeyTyped

    void buscarProductos(){
     try {      
           
            
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT Nombre, idProveedor, Existencia, Costo, PrecioDeVenta FROM almacen WHERE nombre LIKE '%"+ productoEdtText.getText() +"%'");
           
            rs = (ResultSet) read.executeQuery();
           
            
            dtm = (DefaultTableModel) this.jTableProductos.getModel();
            
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
            java.util.logging.Logger.getLogger(WinEditProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEditProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEditProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEditProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinEditProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarProductoBoton;
    private javax.swing.JButton cancelarProductoEdt;
    private javax.swing.JButton guardarProductoEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField productoEdtText;
    private javax.swing.JButton verBoton;
    // End of variables declaration//GEN-END:variables
}
