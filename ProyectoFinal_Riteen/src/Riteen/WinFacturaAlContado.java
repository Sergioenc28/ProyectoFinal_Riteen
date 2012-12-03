/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sergio and Clary
 */
public class WinFacturaAlContado extends javax.swing.JDialog implements VConexion{
    private JasperReport JasperReport;
    private String DRIVER;

    /**
     * Creates new form FacturaAlContado
     */
    public WinFacturaAlContado(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents(); 
        limpiarTabla();
        carrito();
        PanelFacturaAlContado fac = new PanelFacturaAlContado();
        this.add(fac, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        
        Fecha f = new Fecha();
        f.setFechaActualDelSistema(null);
        
       
        fechaActualJLabel.setText(f.getFechaActualDelSistema());
        
        
    }
    ArrayList<String> losClientes = new ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finalizarFacturaAlContadoJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        totalFacturaAlContadoText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeFacturaAlContado = new javax.swing.JTable();
        clienteFacturaAlContadoComboBox = new javax.swing.JComboBox();
        agregaProductoFacturaAlContadoButton = new javax.swing.JButton();
        nuevoClienteFacturaAlContadoJButton = new javax.swing.JButton();
        clienteExisteFacturaAlContadoJCheckBox = new javax.swing.JCheckBox();
        cancelarFacturaAlContadoJButton = new javax.swing.JButton();
        tituloJLabel = new javax.swing.JLabel();
        clienteFacturaAlContadoText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fechaActualJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Riteen - Factura al Contado");
        setPreferredSize(new java.awt.Dimension(680, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        finalizarFacturaAlContadoJButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        finalizarFacturaAlContadoJButton.setText("Facturar");
        finalizarFacturaAlContadoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarFacturaAlContadoJButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total:");

        totalFacturaAlContadoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        totalFacturaAlContadoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFacturaAlContadoTextActionPerformed(evt);
            }
        });

        tablaDeFacturaAlContado.setAutoCreateRowSorter(true);
        tablaDeFacturaAlContado.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tablaDeFacturaAlContado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Producto", "Precio", "Cant", "Sub-Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDeFacturaAlContado.setColumnSelectionAllowed(true);
        tablaDeFacturaAlContado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaDeFacturaAlContado.setEditingColumn(4);
        tablaDeFacturaAlContado.setName(""); // NOI18N
        tablaDeFacturaAlContado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDeFacturaAlContadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDeFacturaAlContado);
        tablaDeFacturaAlContado.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tablaDeFacturaAlContado.getColumnModel().getColumn(3).setPreferredWidth(5);

        clienteFacturaAlContadoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteFacturaAlContadoComboBoxActionPerformed(evt);
            }
        });

        agregaProductoFacturaAlContadoButton.setText("Agregar Producto");
        agregaProductoFacturaAlContadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaProductoFacturaAlContadoButtonActionPerformed(evt);
            }
        });

        nuevoClienteFacturaAlContadoJButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nuevoClienteFacturaAlContadoJButton.setText("Nuevo Cliente");
        nuevoClienteFacturaAlContadoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteFacturaAlContadoJButtonActionPerformed(evt);
            }
        });

        clienteExisteFacturaAlContadoJCheckBox.setOpaque(false);
        clienteExisteFacturaAlContadoJCheckBox.setContentAreaFilled(false);
        clienteExisteFacturaAlContadoJCheckBox.setBorderPainted(false);
        clienteExisteFacturaAlContadoJCheckBox.setBackground(new java.awt.Color(252, 252, 252));
        clienteExisteFacturaAlContadoJCheckBox.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        clienteExisteFacturaAlContadoJCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        clienteExisteFacturaAlContadoJCheckBox.setText("Cliente Existe");
        clienteExisteFacturaAlContadoJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteExisteFacturaAlContadoJCheckBoxActionPerformed(evt);
            }
        });

        cancelarFacturaAlContadoJButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cancelarFacturaAlContadoJButton.setText("Cancelar");
        cancelarFacturaAlContadoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFacturaAlContadoJButtonActionPerformed(evt);
            }
        });

        tituloJLabel.setBackground(new java.awt.Color(153, 0, 153));
        tituloJLabel.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        tituloJLabel.setForeground(new java.awt.Color(204, 204, 204));
        tituloJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJLabel.setText("Factura al Contado");
        tituloJLabel.setToolTipText("");

        clienteFacturaAlContadoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cliente:");

        fechaActualJLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fechaActualJLabel.setForeground(new java.awt.Color(255, 255, 255));
        fechaActualJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Para eliminar un producto de la factura presione Click Derecho");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(finalizarFacturaAlContadoJButton)
                .addGap(28, 28, 28)
                .addComponent(cancelarFacturaAlContadoJButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(agregaProductoFacturaAlContadoButton)
                            .addGap(35, 35, 35)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(clienteExisteFacturaAlContadoJCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clienteFacturaAlContadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clienteFacturaAlContadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nuevoClienteFacturaAlContadoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tituloJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaActualJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)
                        .addComponent(totalFacturaAlContadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloJLabel)
                    .addComponent(nuevoClienteFacturaAlContadoJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fechaActualJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteExisteFacturaAlContadoJCheckBox)
                    .addComponent(clienteFacturaAlContadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(clienteFacturaAlContadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregaProductoFacturaAlContadoButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalFacturaAlContadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalizarFacturaAlContadoJButton)
                    .addComponent(cancelarFacturaAlContadoJButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizarFacturaAlContadoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarFacturaAlContadoJButtonActionPerformed
          
        PreparedStatement add;
        PreparedStatement addFactFinal;
        
        tablaDeFacturaAlContado.getSelectionModel().setSelectionInterval(0, tablaDeFacturaAlContado.getRowCount() - 1);  
        
        int numeroDeFilas = tablaDeFacturaAlContado.getSelectedRows().length;
        try {
                int total = Integer.parseInt(totalFacturaAlContadoText.getText());
                Fecha f = new Fecha();
                f.setFechaActualDelSistema(null);
                String date = f.getFechaActualDelSistema();
                boolean reg = false ;
                if (reg == false){
                add = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO factura_cotando (Fecha, cliente, total) VALUES (?, ?, ?)");
                
                add.setString(1, date);
                
                if (clienteFacturaAlContadoText.getText().length() > 0){
                add.setString(2,clienteFacturaAlContadoText.getText());}
                
                else{
                add.setString(2,clienteFacturaAlContadoComboBox.getSelectedItem().toString());
                }
                add.setInt(3, total);
                
                int done = add.executeUpdate();
                add.close();
                if (done ==1){
                    reg = true;
                }
                }
        for (int i = 0; i < numeroDeFilas; i++) {
            
            
            int idproducto = ((Integer) tablaDeFacturaAlContado.getValueAt(i,0)).intValue();
            String producto =  ((String) tablaDeFacturaAlContado.getValueAt(i,1)).toString();
            int precio = ((Integer) tablaDeFacturaAlContado.getValueAt(i ,2)).intValue();
            int cantidad = ((Integer) tablaDeFacturaAlContado.getValueAt(i,3)).intValue();
            int subTotal = ((Integer) tablaDeFacturaAlContado.getValueAt(i,4)).intValue();
        
            
                
                
               
               /* 
                *  PreparedStatement del;
                * del = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("DElETE FROM carrito");
                del.executeUpdate();
                del.close();
                */
                
                ResultSet buscarID;
                buscarID = (ResultSet) Conexion.getInstancia().hacerConsulta("SELECT idFactura FROM factura_cotando");

                    int idFactura = 0;
                    while (buscarID.next()){
                        idFactura = buscarID.getInt(1);
                         
                    }
                buscarID.close();
                
                addFactFinal = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO detalles_facturas "
                        + "(idFact, idProducto, Nombre, Cantidad, Precio, Subtotal) VALUES (?, ?, ?, ?, ?,?)");
                addFactFinal.setInt(1, idFactura);
                addFactFinal.setInt(2, idproducto);
                addFactFinal.setString(3, producto);
                addFactFinal.setInt(4, cantidad);
                addFactFinal.setInt(5, precio);
                addFactFinal.setInt(6, cantidad * precio);
                addFactFinal.execute();
                
                   }
        this.dispose();
        try{
            Connection CONEXION;
           
            CONEXION = DriverManager.getConnection(url,login,password);
            
            System.out.println("Conexion establecida");       
       
          
           
            JasperReport report = JasperCompileManager.compileReport("ReporteFinal.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,CONEXION);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Factura");
            visor.setVisible(true);
          

        }catch(SQLException | JRException e){
          
           JOptionPane.showMessageDialog(this, e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "La factura se ha generado correctamente");
        
        
        }
            catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            catch (NumberFormatException nf){
            JOptionPane.showMessageDialog(this, "Parece que faltan datos para poder generar la factura");
            }
            
    
     
    }//GEN-LAST:event_finalizarFacturaAlContadoJButtonActionPerformed

    private void totalFacturaAlContadoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFacturaAlContadoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFacturaAlContadoTextActionPerformed

    private void clienteFacturaAlContadoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteFacturaAlContadoComboBoxActionPerformed
        
    }//GEN-LAST:event_clienteFacturaAlContadoComboBoxActionPerformed

    private void agregaProductoFacturaAlContadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaProductoFacturaAlContadoButtonActionPerformed
        this.dispose();
        WinAgregaProducto wap = new WinAgregaProducto();
        wap.setVisible(true);
       
        
    }//GEN-LAST:event_agregaProductoFacturaAlContadoButtonActionPerformed

    private void cancelarFacturaAlContadoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFacturaAlContadoJButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == cancelarFacturaAlContadoJButton){
                this.dispose();
            }
    }//GEN-LAST:event_cancelarFacturaAlContadoJButtonActionPerformed
    DefaultTableModel modeloTabla;
    
    private void clienteExisteFacturaAlContadoJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteExisteFacturaAlContadoJCheckBoxActionPerformed
        // TODO add your handling code here:
        if(clienteExisteFacturaAlContadoJCheckBox.isSelected())
        {
            cargarComboBoxClientes();
            clienteExisteFacturaAlContadoJCheckBox.enable();
            clienteFacturaAlContadoText.disable();
        }
        else
        {
            clienteFacturaAlContadoComboBox.removeAllItems();
            clienteExisteFacturaAlContadoJCheckBox.setSelected(false);
            clienteExisteFacturaAlContadoJCheckBox.disable();
            clienteFacturaAlContadoText.enable();
        }
        
    }//GEN-LAST:event_clienteExisteFacturaAlContadoJCheckBoxActionPerformed

    private void nuevoClienteFacturaAlContadoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteFacturaAlContadoJButtonActionPerformed
        // TODO add your handling code here:
        WinInicio wi = new WinInicio();
        WinCliente wc = new WinCliente(wi, true);
        wc.casoCliente = 1;
        wc.setVisible(true);
    }//GEN-LAST:event_nuevoClienteFacturaAlContadoJButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpiarTabla();
        buscarTotal();
        carrito();
    }//GEN-LAST:event_formWindowOpened

    private void tablaDeFacturaAlContadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDeFacturaAlContadoMouseClicked
     
        PreparedStatement add;
       int done = 0;
       if( tablaDeFacturaAlContado.getSelectedRows().length > 0 ) { 
            try {
                int id = Integer.parseInt(dtm.getValueAt(tablaDeFacturaAlContado.getSelectedRow(), 0).toString());
                add = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("DELETE FROM carrito "
                        + "WHERE idProducto = "+id);
                int ask = JOptionPane.showConfirmDialog(null,"Desea eliminar este producto de la factura","Confirmar", JOptionPane.YES_NO_OPTION);
                if (ask == JOptionPane.YES_OPTION){
                  done = add.executeUpdate();
                  add.close();
                }
              
               if (done == 1){
                    
                    JOptionPane.showMessageDialog(null, "Se elimino el producto correctamente");
                    limpiarTabla();
                     buscarTotal();
                    carrito();
                }
            } catch (SQLException ex) {
                Logger.getLogger(WinFacturaAlContado.class.getName()).log(Level.SEVERE, null, ex);
            }
      
      }
    }//GEN-LAST:event_tablaDeFacturaAlContadoMouseClicked
    
    private void cargarComboBoxClientes()
    {
        ResultSet clientes;
        String nombreDelcliente;
        Conexion conn = Conexion.getInstancia();
        conn.Conexion();
        
            try{
                 clientes = (ResultSet) Conexion.getInstancia().hacerConsulta("SELECT nombre FROM clientes");
                    
                 while(clientes.next()){
                 nombreDelcliente = clientes.getString(1).toString();
                 losClientes.add(nombreDelcliente);
                 
                 }
            }catch(SQLException ex){
                System.out.print("Error"+ ex.getMessage());
            }
            
            clienteFacturaAlContadoComboBox.addItem("Seleccione un Cliente");
            for (String s : losClientes) {
                clienteFacturaAlContadoComboBox.addItem(s);
            }
    }
    private void limpiarTabla(){
    
        while(tablaDeFacturaAlContado.getRowCount()>0){
        ((DefaultTableModel)tablaDeFacturaAlContado.getModel()).removeRow(0);
        
        }
    }
     
     
    
    
    private void buscarTotal(){
     
     try{
          ResultSet total;
                 total = (ResultSet) Conexion.getInstancia().hacerConsulta("SELECT SUM(subtotal) FROM carrito");

                    String totalText = "";
                    
                    if (total.next()){
                        totalText = total.getString(1);
                        totalFacturaAlContadoText.setText(totalText);  
                    }
                    
            }catch(SQLException ex){
               JOptionPane.showMessageDialog(this, ex.getMessage());
            }
     } 
     
     private PreparedStatement read;
     private ResultSet rs;
     private DefaultTableModel dtm;
     
     private void carrito(){
      
         try {      
            
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT * FROM carrito");
           
            rs = (ResultSet) read.executeQuery();
            
            
            dtm = (DefaultTableModel) this.tablaDeFacturaAlContado.getModel();
            
           
            while (rs.next()) {
            
            Object [] fila = new Object[5]; 
                       
            for (int i=0;i<fila.length;i++) {
                    fila[i] = rs.getObject(i+1);                                                 
                } 
            
            dtm.addRow(fila);
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
            java.util.logging.Logger.getLogger(WinFacturaAlContado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinFacturaAlContado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinFacturaAlContado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinFacturaAlContado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
             WinFacturaAlContado dialog = new WinFacturaAlContado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton agregaProductoFacturaAlContadoButton;
    private javax.swing.JButton cancelarFacturaAlContadoJButton;
    private javax.swing.JCheckBox clienteExisteFacturaAlContadoJCheckBox;
    private javax.swing.JComboBox clienteFacturaAlContadoComboBox;
    private javax.swing.JTextField clienteFacturaAlContadoText;
    public javax.swing.JLabel fechaActualJLabel;
    private javax.swing.JButton finalizarFacturaAlContadoJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevoClienteFacturaAlContadoJButton;
    public javax.swing.JTable tablaDeFacturaAlContado;
    private javax.swing.JLabel tituloJLabel;
    public javax.swing.JTextField totalFacturaAlContadoText;
    // End of variables declaration//GEN-END:variables
}
