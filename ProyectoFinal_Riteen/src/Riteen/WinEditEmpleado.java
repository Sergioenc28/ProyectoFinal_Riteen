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
public class WinEditEmpleado extends javax.swing.JDialog {

    /**
     * Creates new form WinEditEmpleado
     */
    public WinEditEmpleado() {
        initComponents();
        PanelWinEmpleado pwe = new PanelWinEmpleado();
        this.add(pwe, BorderLayout.CENTER);
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        empleadoEdtText = new javax.swing.JTextField();
        buscarEmpleadoBoton = new javax.swing.JButton();
        verEmpleadosBoton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        guardarEdtEmpleadoBoton = new javax.swing.JButton();
        cancelarEdtEmpleadoBoton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setTitle("Riteen - Empleados");
        setModal(true);
        setPreferredSize(new java.awt.Dimension(750, 501));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empleados");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_accounts_256.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar empleado:");

        empleadoEdtText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        empleadoEdtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoEdtTextActionPerformed(evt);
            }
        });
        empleadoEdtText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empleadoEdtTextKeyTyped(evt);
            }
        });

        buscarEmpleadoBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buscarEmpleadoBoton.setText("Buscar");
        buscarEmpleadoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEmpleadoBotonActionPerformed(evt);
            }
        });

        verEmpleadosBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        verEmpleadosBoton.setText("Ver todos los empleados");
        verEmpleadosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEmpleadosBotonActionPerformed(evt);
            }
        });

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Dirección", "Cédula", "Sueldo", "Horario"
            }
        ));
        jTableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableEmpleados);

        guardarEdtEmpleadoBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarEdtEmpleadoBoton.setText("Guardar");

        cancelarEdtEmpleadoBoton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarEdtEmpleadoBoton.setText("Cancelar");
        cancelarEdtEmpleadoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEdtEmpleadoBotonActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar Empleado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(verEmpleadosBoton)
                                        .addGap(109, 109, 109)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(empleadoEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buscarEmpleadoBoton))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(guardarEdtEmpleadoBoton)
                        .addGap(29, 29, 29)
                        .addComponent(cancelarEdtEmpleadoBoton)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(empleadoEdtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarEmpleadoBoton))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verEmpleadosBoton)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarEdtEmpleadoBoton)
                    .addComponent(cancelarEdtEmpleadoBoton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empleadoEdtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoEdtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoEdtTextActionPerformed

    private void cancelarEdtEmpleadoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEdtEmpleadoBotonActionPerformed
           this.dispose();    
    }//GEN-LAST:event_cancelarEdtEmpleadoBotonActionPerformed

    private void buscarEmpleadoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEmpleadoBotonActionPerformed
       limpiarTabla();
       buscarEmpleados();
    }//GEN-LAST:event_buscarEmpleadoBotonActionPerformed

    private void empleadoEdtTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empleadoEdtTextKeyTyped
       int enter = evt.getKeyChar();
      if (enter == KeyEvent.VK_ENTER) {
          limpiarTabla();  
          buscarEmpleados();
        }
    }//GEN-LAST:event_empleadoEdtTextKeyTyped

    private void verEmpleadosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEmpleadosBotonActionPerformed
     empleadoEdtText.setText("");
     limpiarTabla();
     buscarEmpleados();
    }//GEN-LAST:event_verEmpleadosBotonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        WinEmpleado we = new WinEmpleado();
        we.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadosMouseClicked
      if( jTableEmpleados.getSelectedRows().length > 0 ) { 
          
           WinEmpleado wp = new WinEmpleado();
           wp.casoEmpleado = 2;           
          
           wp.id = (dtm.getValueAt(jTableEmpleados.getSelectedRow(), 0).toString() );
           wp.nombreEmpleadoText.setText(dtm.getValueAt(jTableEmpleados.getSelectedRow(), 1).toString());
           wp.telefonoEmpleadoText.setText(dtm.getValueAt(jTableEmpleados.getSelectedRow(), 2).toString());
           wp.direccionEmpleadoText.setText(dtm.getValueAt(jTableEmpleados.getSelectedRow(), 3).toString());
           wp.cedulaEmpleadoText.setText(dtm.getValueAt(jTableEmpleados.getSelectedRow(), 4).toString());
           wp.sueldoEmpleadoText.setText(dtm.getValueAt(jTableEmpleados.getSelectedRow(), 5).toString());
           wp.setVisible(true);
         }
    }//GEN-LAST:event_jTableEmpleadosMouseClicked
     
     private PreparedStatement read;
     private ResultSet rs;
     private DefaultTableModel dtm;
     
     
     void limpiarTabla(){
    
        while(jTableEmpleados.getRowCount()>0){
        ((DefaultTableModel)jTableEmpleados.getModel()).removeRow(0);
        
        }
    }
     void buscarEmpleados(){
     try {      
           
            read = (PreparedStatement) Conexion.getInstancia().getConexion().prepareStatement("SELECT idEmpleado, nombre, telefono, direccion, cedula, sueldo, horario FROM empleados WHERE nombre LIKE '%"+ empleadoEdtText.getText() +"%'");
           
            rs = (ResultSet) read.executeQuery();
           
            
            dtm = (DefaultTableModel) this.jTableEmpleados.getModel();
            
            while (rs.next()) {
            
            Object [] fila = new Object[7]; 
            
           
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
            java.util.logging.Logger.getLogger(WinEditEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEditEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEditEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEditEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinEditEmpleado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarEmpleadoBoton;
    private javax.swing.JButton cancelarEdtEmpleadoBoton;
    private javax.swing.JTextField empleadoEdtText;
    private javax.swing.JButton guardarEdtEmpleadoBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JButton verEmpleadosBoton;
    // End of variables declaration//GEN-END:variables
}
