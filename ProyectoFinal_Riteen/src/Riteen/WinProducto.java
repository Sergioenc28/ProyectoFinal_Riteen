/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dioni Ripoll
 */
public class WinProducto extends javax.swing.JDialog {

    /**
     * Creates new form WinProductos
     */
    public WinProducto() {
        initComponents();
        PanelWinProducto pwp = new PanelWinProducto();
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        guardarProducto = new javax.swing.JButton();
        cancelarProducto = new javax.swing.JButton();
        productoText = new javax.swing.JTextField();
        costoProductoText = new javax.swing.JTextField();
        precioVentaProductoText = new javax.swing.JTextField();
        existenciaActualDelProductoText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionProductoTextArea = new javax.swing.JTextArea();
        existenciaMinimaDelProductoText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        proveedorProductoComboBox = new javax.swing.JComboBox();
        idProductoText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setTitle("Riteen - Agregar Productos");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Productos");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proveedor:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Costo:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio de Venta:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Existencia en Almacén:");

        guardarProducto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarProducto.setText("Guardar");
        guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoActionPerformed(evt);
            }
        });

        cancelarProducto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarProducto.setText("Cancelar");
        cancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarProductoActionPerformed(evt);
            }
        });

        productoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        productoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoTextActionPerformed(evt);
            }
        });

        costoProductoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        costoProductoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoProductoTextActionPerformed(evt);
            }
        });

        precioVentaProductoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        precioVentaProductoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioVentaProductoTextActionPerformed(evt);
            }
        });

        existenciaActualDelProductoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        existenciaActualDelProductoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existenciaActualDelProductoTextActionPerformed(evt);
            }
        });

        descripcionProductoTextArea.setColumns(20);
        descripcionProductoTextArea.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        descripcionProductoTextArea.setRows(5);
        jScrollPane1.setViewportView(descripcionProductoTextArea);

        existenciaMinimaDelProductoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        existenciaMinimaDelProductoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existenciaMinimaDelProductoTextActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Existencia en Minima Almacén:");

        proveedorProductoComboBox.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        idProductoText.setEditable(false);
        idProductoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        idProductoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProductoTextActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Id del Producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productoText, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proveedorProductoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(costoProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precioVentaProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(existenciaActualDelProductoText)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(existenciaMinimaDelProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarProducto)
                .addGap(192, 192, 192))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(productoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(proveedorProductoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(costoProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(precioVentaProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(existenciaActualDelProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(existenciaMinimaDelProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarProducto)
                    .addComponent(guardarProducto))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void costoProductoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoProductoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoProductoTextActionPerformed

    private void precioVentaProductoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioVentaProductoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaProductoTextActionPerformed

    private void existenciaActualDelProductoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existenciaActualDelProductoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciaActualDelProductoTextActionPerformed

    private void productoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoTextActionPerformed

    private void existenciaMinimaDelProductoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existenciaMinimaDelProductoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_existenciaMinimaDelProductoTextActionPerformed

    private void idProductoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProductoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProductoTextActionPerformed

    private void cancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarProductoActionPerformed
        if(evt.getSource() == cancelarProducto){
            this.dispose();
        }
    }//GEN-LAST:event_cancelarProductoActionPerformed
     int casoProducto=0;
     String idProducto;
     private java.sql.PreparedStatement add;
    private void guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoActionPerformed
      try {
            int costo = Integer.parseInt(costoProductoText.getText());
            int precio = Integer.parseInt(precioVentaProductoText.getText());
            int existencia = Integer.parseInt(existenciaActualDelProductoText.getText());
            int existenciaMinima = Integer.parseInt(existenciaMinimaDelProductoText.getText());
            
            if(casoProducto == 1)
            {               
                add = Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO almacen (Nombre, Descripcion, idProveedor, Costo, PrecioDeVenta, Existencia, ExistenciaMinima) VALUES (?, ?, ?, ?, ?, ?, ?)");
                add.setString(1, productoText.getText());
                add.setString(2, descripcionProductoTextArea.getText());
                add.setInt(3, 1);
                add.setInt(4, costo);
                add.setInt(5, precio);
                add.setInt(6, existencia);
                add.setInt(7, existenciaMinima);
            }
            if(casoProducto == 2)
            
            {                
                add = Conexion.getInstancia().getConexion().prepareStatement("UPDATE almacen SET Nombre = '"+productoText.getText()+"', Costo = '"
                +costo+"', PrecioDeVenta = '"+precio+"', Existencia = '"+existencia+"', ExistenciaMinima = '"+existenciaMinima+"' WHERE idProducto =  "+ idProducto); 
            }                                                                      
            
            int exitoso = add.executeUpdate();
           
            if (exitoso == 1){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            productoText.setText("");
            descripcionProductoTextArea.setText("");
            costoProductoText.setText("");
            precioVentaProductoText.setText("");
            existenciaActualDelProductoText.setText("");
            existenciaMinimaDelProductoText.setText("");
            add.close();
            }
            else {
            
            JOptionPane.showMessageDialog(null, "No se puede registrar el empleado");
           
            }                       
        } 
         
       catch(NumberFormatException | SQLException e){
       
            JOptionPane.showMessageDialog(null, e.getMessage());
       }
       
        
      
    }//GEN-LAST:event_guardarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(WinProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarProducto;
    public javax.swing.JTextField costoProductoText;
    public javax.swing.JTextArea descripcionProductoTextArea;
    public javax.swing.JTextField existenciaActualDelProductoText;
    public javax.swing.JTextField existenciaMinimaDelProductoText;
    private javax.swing.JButton guardarProducto;
    public javax.swing.JTextField idProductoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    public javax.swing.JTextField precioVentaProductoText;
    public javax.swing.JTextField productoText;
    public javax.swing.JComboBox proveedorProductoComboBox;
    // End of variables declaration//GEN-END:variables
}
