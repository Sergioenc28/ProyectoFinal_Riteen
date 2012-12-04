/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class WinEmpleado extends javax.swing.JDialog {

    /**
     * Creates new form WinEempleado
     */
    public WinEmpleado() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreEmpleadoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccionEmpleadoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        horarioEmpleadoJComboBox = new javax.swing.JComboBox();
        guardarEmpleado = new javax.swing.JButton();
        cancelarEmpleado = new javax.swing.JButton();
        telefonoEmpleadoText = new javax.swing.JFormattedTextField();
        cedulaEmpleadoText = new javax.swing.JFormattedTextField();
        sueldoEmpleadoText = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel00 = new javax.swing.JLabel();
        cargoEmpleadoText = new javax.swing.JTextField();

        setTitle("Reteen - Registro de Empleados");
        setBackground(new java.awt.Color(204, 204, 204));
        setModal(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empleado");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cedula:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sueldo:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Horario:");

        horarioEmpleadoJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        horarioEmpleadoJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia Completo", "Matutina", "Vespertina", " " }));
        horarioEmpleadoJComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                horarioEmpleadoJComboBoxMousePressed(evt);
            }
        });
        horarioEmpleadoJComboBox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                horarioEmpleadoJComboBoxMouseMoved(evt);
            }
        });
        horarioEmpleadoJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioEmpleadoJComboBoxActionPerformed(evt);
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_accounts_256.png"))); // NOI18N

        jLabel00.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel00.setForeground(new java.awt.Color(255, 255, 255));
        jLabel00.setText("Cargo");

        cargoEmpleadoText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cargoEmpleadoText.setMinimumSize(new java.awt.Dimension(3, 20));
        cargoEmpleadoText.setPreferredSize(new java.awt.Dimension(4, 20));
        cargoEmpleadoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoEmpleadoTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel00)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sueldoEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(horarioEmpleadoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(direccionEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargoEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreEmpleadoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(telefonoEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cedulaEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(guardarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarEmpleado)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(horarioEmpleadoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sueldoEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel00)
                    .addComponent(cargoEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(direccionEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarEmpleado)
                    .addComponent(cancelarEmpleado))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void direccionEmpleadoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionEmpleadoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionEmpleadoTextActionPerformed

    private void nombreEmpleadoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleadoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleadoTextActionPerformed

    private void horarioEmpleadoJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioEmpleadoJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioEmpleadoJComboBoxActionPerformed

    private void horarioEmpleadoJComboBoxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horarioEmpleadoJComboBoxMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioEmpleadoJComboBoxMouseMoved
    
    String id;
    double sueldo;
    int casoEmpleado = 0;    
    private PreparedStatement add;    
    private void guardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEmpleadoActionPerformed
        int prueba = 1;
        if(nombreEmpleadoText.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del Empleado");
            nombreEmpleadoText.requestFocus();
            prueba = 0;
        }
        
        else if(telefonoEmpleadoText.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese el Teléfono");
            telefonoEmpleadoText.requestFocus();
            prueba = 0;
        }
        
        else if(cedulaEmpleadoText.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese la Cédula");
            cedulaEmpleadoText.requestFocus();
            prueba = 0;
        }
        
        else if(sueldoEmpleadoText.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "Ingrese el Sueldo");
            sueldoEmpleadoText.requestFocus();
            prueba = 0;
        }
        
        if(prueba == 1)
        {
        try {
           
            sueldo= Double.parseDouble(sueldoEmpleadoText.getText());
            String comboBoxHorarioEmpleado = (String) horarioEmpleadoJComboBox.getSelectedItem();
            
            if (casoEmpleado == 1 ){
                add = Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO empleados (Nombre, Telefono, Direccion, Cedula, Sueldo, Horario, Cargo) VALUES (?, ?, ?, ?, ?, ?, ?)");
            
                add.setString(1, nombreEmpleadoText.getText().toUpperCase());
                add.setString(2, telefonoEmpleadoText.getText().toUpperCase());
                add.setString(3, direccionEmpleadoText.getText().toUpperCase());
                add.setString(4, cedulaEmpleadoText.getText().toUpperCase());
                add.setDouble(5, sueldo);
                add.setString(6, comboBoxHorarioEmpleado);
                add.setString(7, cargoEmpleadoText.getText().toUpperCase());
            }
            
            if (casoEmpleado == 2){
                add = Conexion.getInstancia().getConexion().prepareStatement("UPDATE empleados SET Nombre = '"+
                    nombreEmpleadoText.getText()+"',Telefono = '"+telefonoEmpleadoText.getText()+
                    "',Direccion = '"+ direccionEmpleadoText.getText()+"', Cedula = '"+ cedulaEmpleadoText.getText()+
                    "',Sueldo = "+sueldo+",Horario = '"+ comboBoxHorarioEmpleado +", Cargo = '"+ cargoEmpleadoText.getText() +"' WHERE idEmpleado="+id);
            }
            
            int exitoso = add.executeUpdate();
           
            if (exitoso == 1){
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                nombreEmpleadoText.setText("");
                direccionEmpleadoText.setText("");
                cedulaEmpleadoText.setText("");
                telefonoEmpleadoText.setText("");
                sueldoEmpleadoText.setText("");
                cargoEmpleadoText.setText("");
                add.close();
            }
            
            else {            
                JOptionPane.showMessageDialog(null, "No se puede registrar el empleado");           
            }                       
        } 
         
       catch(NumberFormatException | SQLException e){       
            JOptionPane.showMessageDialog(null, e.getMessage());
       }
       
       this.dispose();       
        }
    }//GEN-LAST:event_guardarEmpleadoActionPerformed

    private void horarioEmpleadoJComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horarioEmpleadoJComboBoxMousePressed
               
    }//GEN-LAST:event_horarioEmpleadoJComboBoxMousePressed

    private void cancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEmpleadoActionPerformed
        if(evt.getSource() == cancelarEmpleado){
            this.dispose();
        }               
    }//GEN-LAST:event_cancelarEmpleadoActionPerformed

    private void cargoEmpleadoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoEmpleadoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoEmpleadoTextActionPerformed

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
            @Override
            public void run() {
                new WinEmpleado().setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarEmpleado;
    public javax.swing.JTextField cargoEmpleadoText;
    public javax.swing.JFormattedTextField cedulaEmpleadoText;
    public javax.swing.JTextField direccionEmpleadoText;
    public javax.swing.JButton guardarEmpleado;
    public javax.swing.JComboBox horarioEmpleadoJComboBox;
    private javax.swing.JLabel jLabel00;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JTextField nombreEmpleadoText;
    public javax.swing.JFormattedTextField sueldoEmpleadoText;
    public javax.swing.JFormattedTextField telefonoEmpleadoText;
    // End of variables declaration//GEN-END:variables
}