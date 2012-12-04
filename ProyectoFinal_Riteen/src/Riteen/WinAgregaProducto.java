/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harim Tejada
 */
public class WinAgregaProducto extends javax.swing.JDialog {
    private DefaultTableModel mm;

    /**
     * Creates new form WinAgregaProducto
     */
    public WinAgregaProducto() {
       
        initComponents();
        PanelAgregaProducto pap = new PanelAgregaProducto();
        this.add(pap, BorderLayout.CENTER);  
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgregarProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riteen - Agregar Productos a la Factura");
        setResizable(false);

        jTableAgregarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre Producto", "Descripción", "Precio de Venta", "Existencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAgregarProductos.setColumnSelectionAllowed(true);
        jTableAgregarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgregarProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAgregarProductos);
        jTableAgregarProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Buscar Producto:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Agregar Productos");

        jButton1.setText("Finalizar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarKeyTyped(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Ver todos los Productos");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton1)
                        .addGap(59, 59, 59)
                        .addComponent(cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cancelar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        buscar.setText("");
        limpiarTabla();
        buscarProductos();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyTyped
       int enter = evt.getKeyChar();
       if (enter == KeyEvent.VK_ENTER){
           limpiarTabla();
           buscarProductos();
           
       }
    }//GEN-LAST:event_buscarKeyTyped
   
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiarTabla();
        buscarProductos();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private PreparedStatement add;
    private void jTableAgregarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAgregarProductosMouseClicked
       
      if (jTableAgregarProductos.getSelectedRows().length > 0 ){
      
      int idProducto = Integer.parseInt(dtm.getValueAt(jTableAgregarProductos.getSelectedRow(), 0).toString()); 
      String producto = dtm.getValueAt(jTableAgregarProductos.getSelectedRow(), 1).toString();
      int precio = Integer.parseInt(dtm.getValueAt(jTableAgregarProductos.getSelectedRow(), 3).toString());
     
          WinCarrito wc = new WinCarrito(null, rootPaneCheckingEnabled);
          wc.setVisible(true);
          WinFacturaAlContado wa = new WinFacturaAlContado(null, rootPaneCheckingEnabled);
          try {
                
                if (wc.cantidad() > 0){
                
                int subtotal = wc.cantidad() * precio;
                
                add = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO carrito "
                        + "(idProducto, producto, precio, cantidad, subtotal) VALUES (?, ?, ?, ?, ?)");
                add.setInt(1, idProducto);
                add.setString(2, producto.toUpperCase());
                add.setInt(3, precio);
                add.setInt(4, wc.cantidad());
                add.setInt(5, subtotal); 
                int agregado =add.executeUpdate();
                if (agregado >= 1){
               
               String sql = "UPDATE almacen SET existencia = existencia-"+ wc.cantidad()+" WHERE idProducto="+ idProducto;
               PreparedStatement  actualizarCantidad;
               actualizarCantidad = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement(sql);
                int a = actualizarCantidad.executeUpdate();  
                if (a == 1){
                JOptionPane.showMessageDialog(this, "se ha descontado el producto del almancen");
                
                actualizarCantidad.close();
                }
                
                    
                    add.close();
                 
                
                }
                
                
              
                }
                
            } 
      catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
      catch (NumberFormatException e){
          JOptionPane.showMessageDialog(this,"Has ingresado algo extraño");
      }
      
      
       }
    }//GEN-LAST:event_jTableAgregarProductosMouseClicked
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        WinInicio wi = new WinInicio();        
        WinFacturaAlContado wf = new WinFacturaAlContado(wi, true);
        wf.setVisible(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
            this.dispose();                            
            WinFacturaAlContado wfc = new WinFacturaAlContado(null, rootPaneCheckingEnabled);
            wfc.setVisible(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
                 
                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed
    
    private PreparedStatement read;
    private ResultSet rs;
    private DefaultTableModel dtm;
    void buscarProductos(){
     try {                             
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idProducto, Nombre, Descripcion, PrecioDeVenta,Existencia FROM almacen WHERE nombre LIKE '%"
                    + buscar.getText() +"%'");
          
            rs = (ResultSet) read.executeQuery();
           
            
            dtm = (DefaultTableModel) this.jTableAgregarProductos.getModel();
            
           while (rs.next()) {
            
                Object [] fila = new Object[5];
                        
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
    void limpiarTabla(){
    
        while(jTableAgregarProductos.getRowCount()>0){
        ((DefaultTableModel)jTableAgregarProductos.getModel()).removeRow(0);
        
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
            java.util.logging.Logger.getLogger(WinAgregaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinAgregaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinAgregaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinAgregaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                WinAgregaProducto wa = new WinAgregaProducto();
                wa.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAgregarProductos;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
