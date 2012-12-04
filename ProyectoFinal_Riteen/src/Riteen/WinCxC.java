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
 * @author Sergio and Clary
 */
public class WinCxC extends javax.swing.JDialog {

    /**
     * Creates new form WinCxC
     */
    public WinCxC() {
        initComponents();
        PanelWinCxC pc = new PanelWinCxC();
        this.add(pc, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        Fecha f = new Fecha();
        f.setFechaActualDelSistema(null);
        fechaCxCText.setText(f.getFechaActualDelSistema());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        telefonoClienteText1 = new javax.swing.JFormattedTextField();
        guardarProducto = new javax.swing.JButton();
        cancelarProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fechaCxCText = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionCxCText = new javax.swing.JTextArea();
        cedulaCxCText = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        registrarCxC = new javax.swing.JButton();
        cancelarCxC = new javax.swing.JButton();
        conceptoCxCText = new javax.swing.JTextField();
        plazoCxCText = new javax.swing.JTextField();
        totalCxCText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreDeudorCxCText1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        telefonoCxCText = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Cedula:");

        try {
            telefonoClienteText1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonoClienteText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoClienteText1ActionPerformed(evt);
            }
        });

        guardarProducto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarProducto.setText("Guardar");

        cancelarProducto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarProducto.setText("Cancelar");

        setTitle("Riteen - Cuentas por Cobrar");
        setModal(true);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuentas por Cobrar");
        jLabel1.setToolTipText("");

        fechaCxCText.setEditable(false);
        fechaCxCText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        fechaCxCText.setEnabled(false);
        fechaCxCText.setFocusable(false);
        fechaCxCText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCxCTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Concepto:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripción:");

        descripcionCxCText.setColumns(20);
        descripcionCxCText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        descripcionCxCText.setRows(5);
        jScrollPane1.setViewportView(descripcionCxCText);

        try {
            cedulaCxCText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cedula:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Plazo:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("días");

        registrarCxC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registrarCxC.setText("Registrar");
        registrarCxC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCxCActionPerformed(evt);
            }
        });

        cancelarCxC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarCxC.setText("Cancelar");
        cancelarCxC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCxCActionPerformed(evt);
            }
        });

        conceptoCxCText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        plazoCxCText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        totalCxCText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        totalCxCText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCxCTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Deudor:");

        nombreDeudorCxCText1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        nombreDeudorCxCText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreDeudorCxCText1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefono:");

        try {
            telefonoCxCText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(totalCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nombreDeudorCxCText1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fechaCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cedulaCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11)
                                                .addGap(8, 8, 8)
                                                .addComponent(telefonoCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(plazoCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(conceptoCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registrarCxC)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarCxC)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fechaCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cedulaCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(telefonoCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombreDeudorCxCText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(plazoCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(conceptoCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCxCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarCxC)
                    .addComponent(cancelarCxC))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefonoClienteText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoClienteText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoClienteText1ActionPerformed

    private void totalCxCTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCxCTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCxCTextActionPerformed

    private void nombreDeudorCxCText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreDeudorCxCText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreDeudorCxCText1ActionPerformed

    int casoCxC = 0;
    String idCxC;
    private PreparedStatement add;
    private void registrarCxCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCxCActionPerformed
    int confirm = 1;
        if(nombreDeudorCxCText1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del Deudor");
            nombreDeudorCxCText1.requestFocus();
            confirm = 0;
        }
        else if(cedulaCxCText.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese la cédula del deudor");
            cedulaCxCText.requestFocus();
            confirm = 0;
        }
        else if(telefonoCxCText.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese el teléfono del deudor");
            telefonoCxCText.requestFocus();
            confirm = 0;
        }
        else if(totalCxCText.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese el total de esta cuenta");
            totalCxCText.requestFocus();
            confirm = 0;
        }
        
        else if(plazoCxCText.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Digite el plazo");
            plazoCxCText.requestFocus();
            confirm = 0;
        }
        
        else if(conceptoCxCText.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese el total de esta cuenta");
            conceptoCxCText.requestFocus();
            confirm = 0;
        }
        
        if(confirm == 1)
        {
        
        try {
           
            if(casoCxC == 1){
                int plazo = Integer.parseInt(plazoCxCText.getText());
                int total = Integer.parseInt(totalCxCText.getText());
                add = Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO cuentasxcobrar (Fecha, Descripcion, Concepto, Cedula, Telefono, Deudor, Plazo, Total) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            
                add.setString(1, fechaCxCText.getText().toUpperCase());
                add.setString(2, descripcionCxCText.getText().toUpperCase());
                add.setString(3, conceptoCxCText.getText().toUpperCase());
                add.setString(4, cedulaCxCText.getText().toUpperCase());
                add.setString(5, telefonoCxCText.getText().toUpperCase());
                add.setString(6, nombreDeudorCxCText1.getText().toUpperCase());
                add.setInt(7, plazo);
                add.setInt(8, total);
            }
            
            if(casoCxC == 2){
                add = Conexion.getInstancia().getConexion().prepareStatement("UPDATE cuentasxcobrar SET Descripcion = '"+descripcionCxCText.getText()+"', Concepto = '"
                      + conceptoCxCText.getText()+"', Cedula = '"+cedulaCxCText.getText()+"', Telefono = '"+telefonoCxCText.getText()+"', Deudor = '"+nombreDeudorCxCText1.getText()+"', Plazo = '"+plazoCxCText.getText()+"', total = '"+totalCxCText.getText()+"' WHERE idCuentaXCobrar =  "+ idCxC);
            }
            
            int exitoso = add.executeUpdate();
           
            if (exitoso > 0){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            fechaCxCText.setText("");
            telefonoClienteText1.setText("");
            descripcionCxCText.setText("");
            cedulaCxCText.setText("");
            conceptoCxCText.setText("");
            telefonoCxCText.setText("");
            nombreDeudorCxCText1.setText("");
            plazoCxCText.setText("");
            add.close();
            }
            else {
            
            JOptionPane.showMessageDialog(null, "No se puede registrar esta cuenta");
           
            }
            
           
        } 
         
       catch(NumberFormatException | SQLException e){
       
            JOptionPane.showMessageDialog(null, e.getMessage());
       }
        
       this.dispose();
        }
    }//GEN-LAST:event_registrarCxCActionPerformed

    private void fechaCxCTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCxCTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaCxCTextActionPerformed

    private void cancelarCxCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCxCActionPerformed
        if(evt.getSource() == cancelarCxC){
            this.dispose();
        }
    }//GEN-LAST:event_cancelarCxCActionPerformed

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
            java.util.logging.Logger.getLogger(WinCxC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinCxC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinCxC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinCxC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinCxC().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarCxC;
    private javax.swing.JButton cancelarProducto;
    public javax.swing.JFormattedTextField cedulaCxCText;
    public javax.swing.JTextField conceptoCxCText;
    public javax.swing.JTextArea descripcionCxCText;
    public javax.swing.JFormattedTextField fechaCxCText;
    private javax.swing.JButton guardarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField nombreDeudorCxCText1;
    public javax.swing.JTextField plazoCxCText;
    private javax.swing.JButton registrarCxC;
    private javax.swing.JFormattedTextField telefonoClienteText1;
    public javax.swing.JFormattedTextField telefonoCxCText;
    public javax.swing.JTextField totalCxCText;
    // End of variables declaration//GEN-END:variables
}
