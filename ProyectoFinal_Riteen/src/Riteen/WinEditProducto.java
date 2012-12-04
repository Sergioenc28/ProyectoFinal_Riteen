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
        agregarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Almacen");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(750, 510));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Almacén");

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
                "ID", "Nombre", "Proveedor", "Exist Almac", "Exist Min", "Costo", "Precio de Venta"
            }
        ));
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProductos);

        agregarProducto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        agregarProducto.setText("Agregar Producto");
        agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(verBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agregarProducto))
                            .addComponent(productoEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarProductoBoton)))
                .addGap(0, 67, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verBoton)
                    .addComponent(agregarProducto))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productoEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoEdtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoEdtTextActionPerformed

    private PreparedStatement read;
    private ResultSet rs;
    private DefaultTableModel dtm;
    
    void limpiarTabla(){
    
        while(jTableProductos.getRowCount()>0){
        ((DefaultTableModel)jTableProductos.getModel()).removeRow(0);
        
        }
    }
         
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

    private void agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoActionPerformed
        WinProducto wp = new WinProducto();
        wp.casoProducto = 1;
        wp.setVisible(true);
    }//GEN-LAST:event_agregarProductoActionPerformed

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        if( jTableProductos.getSelectedRows().length > 0 ) { 
          
           WinProducto wp = new WinProducto();
           wp.casoProducto = 2;           
          
           wp.idProducto = (dtm.getValueAt(jTableProductos.getSelectedRow(), 0).toString() );
           wp.productoText.setText(dtm.getValueAt(jTableProductos.getSelectedRow(), 1).toString());
           wp.existenciaActualDelProductoText.setText(dtm.getValueAt(jTableProductos.getSelectedRow(), 3).toString());
           wp.existenciaMinimaDelProductoText.setText(dtm.getValueAt(jTableProductos.getSelectedRow(), 4).toString());
           wp.costoProductoText.setText(dtm.getValueAt(jTableProductos.getSelectedRow(), 5).toString());
           wp.precioVentaProductoText.setText(dtm.getValueAt(jTableProductos.getSelectedRow(), 6).toString());
           wp.setVisible(true);
        
         }
    }//GEN-LAST:event_jTableProductosMouseClicked

    void buscarProductos(){
     try {                             
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idProducto, Nombre, idProveedor, Existencia,ExistenciaMinima, Costo, PrecioDeVenta FROM almacen WHERE nombre LIKE '%"
                    + productoEdtText.getText() +"%'");
           
            rs = (ResultSet) read.executeQuery();
           
            
            dtm = (DefaultTableModel) this.jTableProductos.getModel();
            
           while (rs.next()) {
                
                Object [] fila = new Object[7];
                  
                for (int i=0;i<fila.length;i++) {
                        fila[i] = rs.getObject(i+1);
                } 
             
                dtm.addRow(fila);
                if(fila.length == 0){                         
                    JOptionPane.showMessageDialog(null, "No se encontro nada");            
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
    private javax.swing.JButton agregarProducto;
    private javax.swing.JButton buscarProductoBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField productoEdtText;
    private javax.swing.JButton verBoton;
    // End of variables declaration//GEN-END:variables
}
