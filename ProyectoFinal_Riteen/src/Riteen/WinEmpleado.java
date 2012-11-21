/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class WinEmpleado extends javax.swing.JDialog {

    /**
     * Creates new form WinEempleado
     */
    public WinEmpleado() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreEmpleadoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccionEmpleadoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxHorarioEmpleado = new javax.swing.JComboBox();
        guardarEmpleado = new javax.swing.JButton();
        cancelarEmpleado = new javax.swing.JButton();
        telefonoEmpleadoText = new javax.swing.JFormattedTextField();
        cedulaEmpleadoText = new javax.swing.JFormattedTextField();
        sueldoEmpleadoText = new javax.swing.JFormattedTextField();

        setTitle("Reteen - Registro de Empleados");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Empleado");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        nombreEmpleadoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        nombreEmpleadoText.setMinimumSize(new java.awt.Dimension(4, 20));
        nombreEmpleadoText.setPreferredSize(new java.awt.Dimension(5, 20));
        nombreEmpleadoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpleadoTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Telefono:");

        direccionEmpleadoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        direccionEmpleadoText.setMinimumSize(new java.awt.Dimension(3, 20));
        direccionEmpleadoText.setPreferredSize(new java.awt.Dimension(4, 20));
        direccionEmpleadoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionEmpleadoTextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Cedula:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Sueldo:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Horario:");

        jComboBoxHorarioEmpleado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxHorarioEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia Completo", "Matutina", "Vespertina", " " }));
        jComboBoxHorarioEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxHorarioEmpleadoMousePressed(evt);
            }
        });
        jComboBoxHorarioEmpleado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxHorarioEmpleadoMouseMoved(evt);
            }
        });
        jComboBoxHorarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorarioEmpleadoActionPerformed(evt);
            }
        });

        guardarEmpleado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarEmpleado.setText("Guardar");
        guardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEmpleadoActionPerformed(evt);
            }
        });

        cancelarEmpleado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarEmpleado.setText("Cancelar");
        cancelarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEmpleadoActionPerformed(evt);
            }
        });

        try {
            telefonoEmpleadoText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cedulaEmpleadoText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        sueldoEmpleadoText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telefonoEmpleadoText, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cedulaEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombreEmpleadoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sueldoEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(120, 120, 120))
                                    .addComponent(jComboBoxHorarioEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(direccionEmpleadoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(guardarEmpleado)
                .addGap(18, 18, 18)
                .addComponent(cancelarEmpleado)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreEmpleadoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(telefonoEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedulaEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxHorarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sueldoEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(direccionEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarEmpleado)
                    .addComponent(cancelarEmpleado))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void direccionEmpleadoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionEmpleadoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionEmpleadoTextActionPerformed

    private void nombreEmpleadoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleadoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleadoTextActionPerformed

    private void jComboBoxHorarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorarioEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHorarioEmpleadoActionPerformed

    private void jComboBoxHorarioEmpleadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxHorarioEmpleadoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHorarioEmpleadoMouseMoved

    private PreparedStatement add;
    private void guardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEmpleadoActionPerformed
     
        try {
           
            float sueldo= Float.parseFloat(sueldoEmpleadoText.getText());
            String comboBoxHorarioEmpleado = (String) jComboBoxHorarioEmpleado.getSelectedItem();
          
            add = Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO empleados (Nombre, Telefono, Direccion, Cedula, Sueldo, Horario) VALUES (?, ?, ?, ?, ?, ?)");
            
            add.setString(1, nombreEmpleadoText.getText());
            add.setString(2, telefonoEmpleadoText.getText());
            add.setString(3, direccionEmpleadoText.getText());
            add.setString(4, cedulaEmpleadoText.getText());
            add.setFloat(5, sueldo);
            add.setString(6, comboBoxHorarioEmpleado);
            
            int exitoso = add.executeUpdate();
           
            if (exitoso == 1){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            nombreEmpleadoText.setText("");
            direccionEmpleadoText.setText("");
            cedulaEmpleadoText.setText("");
            telefonoEmpleadoText.setText("");
            sueldoEmpleadoText.setText("");
            add.close();
            }
            else {
            
            JOptionPane.showMessageDialog(null, "No se puede registrar el empleado");
           
            }
            
           
        } 
         
       catch(NumberFormatException | SQLException e){
       
            JOptionPane.showMessageDialog(null, "No se puede registrar el empleado");
       }
       
              
       
    }//GEN-LAST:event_guardarEmpleadoActionPerformed

    private void jComboBoxHorarioEmpleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxHorarioEmpleadoMousePressed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_jComboBoxHorarioEmpleadoMousePressed

    private void cancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEmpleadoActionPerformed
        // TODO add your handling code here:
         
      
    }//GEN-LAST:event_cancelarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(WinEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinEmpleado().setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarEmpleado;
    private javax.swing.JFormattedTextField cedulaEmpleadoText;
    private javax.swing.JTextField direccionEmpleadoText;
    private javax.swing.JButton guardarEmpleado;
    private javax.swing.JComboBox jComboBoxHorarioEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombreEmpleadoText;
    private javax.swing.JFormattedTextField sueldoEmpleadoText;
    private javax.swing.JFormattedTextField telefonoEmpleadoText;
    // End of variables declaration//GEN-END:variables
}
