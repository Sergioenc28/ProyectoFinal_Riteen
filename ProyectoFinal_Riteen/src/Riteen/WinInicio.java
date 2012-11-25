/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import org.omg.CORBA.WCharSeqHelper;

/**
 *
 * @author Harim Tejada
 */
public class WinInicio extends javax.swing.JFrame {

    /**
     * Creates new form WinInicio
     */
    public WinInicio() {
        initComponents();
        PanelInicio pn = new  PanelInicio();
        this.add(pn, BorderLayout.CENTER);                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        salirSistema = new javax.swing.JMenuItem();
        jMenuRegistrar = new javax.swing.JMenu();
        RegEmpleado = new javax.swing.JMenuItem();
        RegCliente = new javax.swing.JMenuItem();
        RegProveedor = new javax.swing.JMenuItem();
        RegReparacion = new javax.swing.JMenuItem();
        RegGasto = new javax.swing.JMenuItem();
        RegPedido = new javax.swing.JMenuItem();
        RegProducto = new javax.swing.JMenuItem();
        RegDeuda = new javax.swing.JMenuItem();
        jMenuItemCuentaXCobrar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuEditar = new javax.swing.JMenu();
        edtEmpleado = new javax.swing.JMenuItem();
        edtPedido = new javax.swing.JMenuItem();
        edtProveedor = new javax.swing.JMenuItem();
        edtGasto = new javax.swing.JMenuItem();
        edtCxP = new javax.swing.JMenuItem();
        edtCxC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Riteen - Inicio");
        setPreferredSize(new java.awt.Dimension(850, 600));
        setResizable(false);

        jMenuArchivo.setText("Archivo");

        jMenuItem9.setText("Cerrar Sesión");
        jMenuArchivo.add(jMenuItem9);

        salirSistema.setText("Salir del Sistema");
        salirSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirSistemaMousePressed(evt);
            }
        });
        jMenuArchivo.add(salirSistema);

        jMenuBar1.add(jMenuArchivo);

        jMenuRegistrar.setText("Registrar");

        RegEmpleado.setText("Empleado");
        RegEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegEmpleadoActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(RegEmpleado);

        RegCliente.setText("Cliente");
        RegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegClienteActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(RegCliente);

        RegProveedor.setText("Proveedor");
        RegProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegProveedorActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(RegProveedor);

        RegReparacion.setText("Reparación");
        RegReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegReparacionActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(RegReparacion);

        RegGasto.setText("Gasto");
        RegGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegGastoActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(RegGasto);

        RegPedido.setText("Pedido");
        RegPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegPedidoActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(RegPedido);

        RegProducto.setText("Producto");
        RegProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegProductoActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(RegProducto);

        RegDeuda.setText("Deuda");
        RegDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegDeudaActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(RegDeuda);

        jMenuItemCuentaXCobrar.setText("Cuenta por Cobrar");
        jMenuItemCuentaXCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCuentaXCobrarActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(jMenuItemCuentaXCobrar);

        jMenuItem1.setText("Producto");
        jMenuRegistrar.add(jMenuItem1);

        jMenuBar1.add(jMenuRegistrar);
        jMenuBar1.add(jMenu3);

        jMenuEditar.setText("Editar");

        edtEmpleado.setText("Empleado");
        edtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEmpleadoActionPerformed(evt);
            }
        });
        jMenuEditar.add(edtEmpleado);

        edtPedido.setText("Pedido");
        edtPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPedidoActionPerformed(evt);
            }
        });
        jMenuEditar.add(edtPedido);

        edtProveedor.setText("Proveedor");
        edtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtProveedorActionPerformed(evt);
            }
        });
        jMenuEditar.add(edtProveedor);

        edtGasto.setText("Gasto");
        edtGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtGastoActionPerformed(evt);
            }
        });
        jMenuEditar.add(edtGasto);

        edtCxP.setText("Cuenta Por Pagar");
        edtCxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCxPActionPerformed(evt);
            }
        });
        jMenuEditar.add(edtCxP);

        edtCxC.setText("Cuenta Por Cobrar");
        edtCxC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCxCActionPerformed(evt);
            }
        });
        jMenuEditar.add(edtCxC);

        jMenuBar1.add(jMenuEditar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegEmpleadoActionPerformed
       WinEmpleado we = new WinEmpleado();
       we.setVisible(true);
    }//GEN-LAST:event_RegEmpleadoActionPerformed

    private void RegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegClienteActionPerformed
       WinCliente wc = new WinCliente();
       wc.setVisible(true);
    }//GEN-LAST:event_RegClienteActionPerformed

    private void RegGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegGastoActionPerformed
       WinGastos wg = new WinGastos();
       wg.setVisible(true);
    }//GEN-LAST:event_RegGastoActionPerformed

    private void RegProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegProductoActionPerformed
       WinProducto wp = new WinProducto();
       wp.setVisible(true);
    }//GEN-LAST:event_RegProductoActionPerformed

    private void RegProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegProveedorActionPerformed
       WinProveedor wp = new WinProveedor();
       wp.setVisible(true);
    }//GEN-LAST:event_RegProveedorActionPerformed

    private void RegPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegPedidoActionPerformed
       WinPedido wpedido = new WinPedido();
       wpedido.setVisible(true);
    }//GEN-LAST:event_RegPedidoActionPerformed

    private void jMenuItemCuentaXCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCuentaXCobrarActionPerformed
        WinCxC wc = new WinCxC();
        wc.setVisible(true);
    }//GEN-LAST:event_jMenuItemCuentaXCobrarActionPerformed

    private void RegDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegDeudaActionPerformed
      WinCxP wxp = new WinCxP();
      wxp.setVisible(true);
    }//GEN-LAST:event_RegDeudaActionPerformed

    private void RegReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegReparacionActionPerformed
        WinReciboDeReparacion wrdp = new WinReciboDeReparacion();
        wrdp.setVisible(true);   
    }//GEN-LAST:event_RegReparacionActionPerformed

    private void salirSistemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirSistemaMousePressed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Seguro que desea salir del sistema");
        
        if(opc == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_salirSistemaMousePressed

    private void edtEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEmpleadoActionPerformed
        WinEditEmpleado wee = new WinEditEmpleado();
        wee.setVisible(true);
        
    }//GEN-LAST:event_edtEmpleadoActionPerformed

    private void edtPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPedidoActionPerformed

    private void edtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtProveedorActionPerformed

    private void edtGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtGastoActionPerformed

    private void edtCxPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCxPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCxPActionPerformed

    private void edtCxCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCxCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCxCActionPerformed

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
            java.util.logging.Logger.getLogger(WinInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WinInicio wInicio = new WinInicio();
                //wInicio.setSize(850, 600);
                //wInicio.setLocationRelativeTo(null);
                //Estaba probando centralizarla atraves de este metodo, pero no funcionó... Dejenmela asi mismo esto
                wInicio.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem RegCliente;
    private javax.swing.JMenuItem RegDeuda;
    private javax.swing.JMenuItem RegEmpleado;
    private javax.swing.JMenuItem RegGasto;
    private javax.swing.JMenuItem RegPedido;
    private javax.swing.JMenuItem RegProducto;
    private javax.swing.JMenuItem RegProveedor;
    private javax.swing.JMenuItem RegReparacion;
    private javax.swing.JMenuItem edtCxC;
    private javax.swing.JMenuItem edtCxP;
    private javax.swing.JMenuItem edtEmpleado;
    private javax.swing.JMenuItem edtGasto;
    private javax.swing.JMenuItem edtPedido;
    private javax.swing.JMenuItem edtProveedor;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCuentaXCobrar;
    private javax.swing.JMenu jMenuRegistrar;
    private javax.swing.JMenuItem salirSistema;
    // End of variables declaration//GEN-END:variables
}
