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
public class WinReciboDeReparacion extends javax.swing.JDialog {

    /**
     * Creates new form WinReciboDeReparacion
     */
    public WinReciboDeReparacion() {
        initComponents();
        PanelReciboDeReparacion pdr = new PanelReciboDeReparacion();
        this.add(pdr, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        Fecha fecha = new Fecha();
        fecha.setFechaActualDelSistema(null);
        fechaReparacionText.setText(fecha.getFechaActualDelSistema());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        articuloReparacionText4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fechaReparacionText = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        guardarReparacion = new javax.swing.JButton();
        cancelarReparacion = new javax.swing.JButton();
        articuloReparacionText = new javax.swing.JTextField();
        modeloReparacionText = new javax.swing.JTextField();
        clienteReparacionText = new javax.swing.JTextField();
        marcaReparacionText = new javax.swing.JTextField();
        telefonoReparacionText = new javax.swing.JFormattedTextField();
        plazoTextfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setTitle("Riteen - Recibo de Reparación");
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recibo de Reparación");
        jLabel1.setToolTipText("");

        fechaReparacionText.setEditable(false);
        fechaReparacionText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Articulo:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modelo:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre del Cliente:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono del Cliente:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Plazo:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("días");

        guardarReparacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guardarReparacion.setText("Guardar");
        guardarReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarReparacionActionPerformed(evt);
            }
        });

        cancelarReparacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelarReparacion.setText("Cancelar");
        cancelarReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarReparacionActionPerformed(evt);
            }
        });

        articuloReparacionText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        modeloReparacionText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        clienteReparacionText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        marcaReparacionText.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        try {
            telefonoReparacionText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        plazoTextfield.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        plazoTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plazoTextfieldActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reparacion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(fechaReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(articuloReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marcaReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modeloReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clienteReparacionText))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(guardarReparacion)
                                        .addGap(18, 18, 18)
                                        .addComponent(cancelarReparacion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(8, 8, 8)
                                        .addComponent(telefonoReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plazoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fechaReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(articuloReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(modeloReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(clienteReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(telefonoReparacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plazoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarReparacion)
                    .addComponent(cancelarReparacion))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plazoTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plazoTextfieldActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_plazoTextfieldActionPerformed

    private void cancelarReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarReparacionActionPerformed
         if(evt.getSource() == cancelarReparacion){
            this.dispose();
        }
    }//GEN-LAST:event_cancelarReparacionActionPerformed

     int casoReciboReparacion=0;
     String idReciboReparacion;
     private PreparedStatement add;
    private void guardarReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarReparacionActionPerformed
           
            try {
           
            if(casoReciboReparacion == 1)
            {               
                add = Conexion.getInstancia().getConexion().prepareStatement("INSERT INTO recibos_de_reparacion (FechaDeEntrega, Articulo, Marca, Modelo, NombreCliente, TelefonoCliente, plazo) VALUES ( ?, ?, ?, ?, ?, ?, ?)");
                add.setString(1, fechaReparacionText.getText());
                add.setString(2, articuloReparacionText.getText());
                add.setString(3, marcaReparacionText.getText());
                add.setString(4, modeloReparacionText.getText());
                add.setString(5, clienteReparacionText.getText());
                add.setString(6, telefonoReparacionText.getText());
                add.setString(7, plazoTextfield.getText());
            }
            
            if(casoReciboReparacion == 2)
            {                
                add = Conexion.getInstancia().getConexion().prepareStatement("UPDATE recibos_de_reparacion SET FechaDeEntrega = '"+fechaReparacionText.getText()+"', Articulo = '"
                + articuloReparacionText.getText()+"', Marca = '"+marcaReparacionText.getText()+"', Modelo = '"+modeloReparacionText.getText()+"', NombreCliente = '"+clienteReparacionText.getText()+"'"
                + ", TelefonoCliente = '"+telefonoReparacionText.getText()+"' , Plazo = '"+plazoTextfield.getText()+"'" + " WHERE idRecibo =  "+ idReciboReparacion); 
            }                                                           
            
            int exitoso = add.executeUpdate();
            
            if (exitoso == 1){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            fechaReparacionText.setText("");
            articuloReparacionText.setText("");
            marcaReparacionText.setText("");
            modeloReparacionText.setText("");
            clienteReparacionText.setText("");
            telefonoReparacionText.setText("");
            plazoTextfield.setText("");
            }
            else {
            
            JOptionPane.showMessageDialog(null, "No se puede registrar el recibo");
           
            }
        } 
         
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
            
        this.dispose();
    }//GEN-LAST:event_guardarReparacionActionPerformed

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
            java.util.logging.Logger.getLogger(WinReciboDeReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinReciboDeReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinReciboDeReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinReciboDeReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinReciboDeReparacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField articuloReparacionText;
    private javax.swing.JTextField articuloReparacionText4;
    private javax.swing.JButton cancelarReparacion;
    public javax.swing.JTextField clienteReparacionText;
    public javax.swing.JFormattedTextField fechaReparacionText;
    private javax.swing.JButton guardarReparacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField marcaReparacionText;
    public javax.swing.JTextField modeloReparacionText;
    public javax.swing.JTextField plazoTextfield;
    public javax.swing.JFormattedTextField telefonoReparacionText;
    // End of variables declaration//GEN-END:variables
}
