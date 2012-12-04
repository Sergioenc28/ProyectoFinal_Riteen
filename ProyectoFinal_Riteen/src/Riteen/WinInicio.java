/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Harim Tejada
 */
public class WinInicio extends javax.swing.JFrame implements VConexion, Runnable{
    /**
     * Creates new form WinInicio
     */
    
    String hora,minutos,segundos,ampm;
    Calendar calendario;    
    Thread h1;
    public WinInicio() {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        PanelInicio pn = new  PanelInicio();
        this.add(pn, BorderLayout.CENTER);
        
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

        horaDelReloj = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        crearUsuarioMenu = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        salirSistema = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        admGastos = new javax.swing.JMenuItem();
        adminNomina = new javax.swing.JMenuItem();
        jMenuRegistrar = new javax.swing.JMenu();
        RegEmpleado = new javax.swing.JMenuItem();
        RegCliente = new javax.swing.JMenuItem();
        jMenuItemCuentaXCobrar = new javax.swing.JMenuItem();
        RegDeuda = new javax.swing.JMenuItem();
        RegGasto = new javax.swing.JMenuItem();
        RegPedido = new javax.swing.JMenuItem();
        RegProducto = new javax.swing.JMenuItem();
        RegProveedor = new javax.swing.JMenuItem();
        RegReparacion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        clienteReporte = new javax.swing.JMenuItem();
        cxcReporte = new javax.swing.JMenuItem();
        cxpReporte = new javax.swing.JMenuItem();
        empleadoReporte = new javax.swing.JMenuItem();
        facturaReporte = new javax.swing.JMenuItem();
        gastoReporte = new javax.swing.JMenuItem();
        pedidoReporte = new javax.swing.JMenuItem();
        productoReporte = new javax.swing.JMenuItem();
        proveedorReporte = new javax.swing.JMenuItem();
        reciboReparacionReporte = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Riteen - Inicio");
        setPreferredSize(new java.awt.Dimension(846, 610));
        setResizable(false);

        horaDelReloj.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        horaDelReloj.setForeground(new java.awt.Color(255, 255, 255));
        horaDelReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMenuArchivo.setText("Archivo");

        crearUsuarioMenu.setText("Crear Usuario");
        crearUsuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioMenuActionPerformed(evt);
            }
        });
        jMenuArchivo.add(crearUsuarioMenu);

        jMenuItem9.setText("Cerrar Sesión");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItem9);

        salirSistema.setText("Salir del Sistema");
        salirSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirSistemaMousePressed(evt);
            }
        });
        jMenuArchivo.add(salirSistema);

        jMenuBar1.add(jMenuArchivo);

        jMenu1.setText("Administrar");

        admGastos.setText("Gastos");
        admGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admGastosActionPerformed(evt);
            }
        });
        jMenu1.add(admGastos);

        adminNomina.setText("Nomina");
        adminNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNominaActionPerformed(evt);
            }
        });
        jMenu1.add(adminNomina);

        jMenuBar1.add(jMenu1);

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

        jMenuItemCuentaXCobrar.setText("Cuenta por Cobrar");
        jMenuItemCuentaXCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCuentaXCobrarActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(jMenuItemCuentaXCobrar);

        RegDeuda.setText("Cuenta por Pagar");
        RegDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegDeudaActionPerformed(evt);
            }
        });
        jMenuRegistrar.add(RegDeuda);

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

        jMenuBar1.add(jMenuRegistrar);

        jMenu2.setText("Reportes");

        clienteReporte.setText("Clientes");
        clienteReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteReporteActionPerformed(evt);
            }
        });
        jMenu2.add(clienteReporte);

        cxcReporte.setText("Cuentas por Cobrar");
        cxcReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxcReporteActionPerformed(evt);
            }
        });
        jMenu2.add(cxcReporte);

        cxpReporte.setText("Cuentas por Pagar");
        cxpReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxpReporteActionPerformed(evt);
            }
        });
        jMenu2.add(cxpReporte);

        empleadoReporte.setText("Empleados");
        empleadoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoReporteActionPerformed(evt);
            }
        });
        jMenu2.add(empleadoReporte);

        facturaReporte.setText("Facturas");
        facturaReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaReporteActionPerformed(evt);
            }
        });
        jMenu2.add(facturaReporte);

        gastoReporte.setText("Gastos");
        gastoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastoReporteActionPerformed(evt);
            }
        });
        jMenu2.add(gastoReporte);

        pedidoReporte.setText("Pedidos");
        pedidoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoReporteActionPerformed(evt);
            }
        });
        jMenu2.add(pedidoReporte);

        productoReporte.setText("Productos");
        productoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoReporteActionPerformed(evt);
            }
        });
        jMenu2.add(productoReporte);

        proveedorReporte.setText("Proveedores");
        proveedorReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorReporteActionPerformed(evt);
            }
        });
        jMenu2.add(proveedorReporte);

        reciboReparacionReporte.setText("Reparaciones");
        reciboReparacionReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciboReparacionReporteActionPerformed(evt);
            }
        });
        jMenu2.add(reciboReparacionReporte);

        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(horaDelReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(horaDelReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 258, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegEmpleadoActionPerformed
       WinEmpleado we = new WinEmpleado();
       we.casoEmpleado = 1;
       we.setVisible(true);
    }//GEN-LAST:event_RegEmpleadoActionPerformed

    private void RegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegClienteActionPerformed
       WinCliente wc = new WinCliente(this, false);
       wc.casoCliente = 1;
       wc.setVisible(true);
    }//GEN-LAST:event_RegClienteActionPerformed

    private void RegGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegGastoActionPerformed
       WinGasto wg = new WinGasto();
       wg.setVisible(true);
    }//GEN-LAST:event_RegGastoActionPerformed

    private void RegProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegProductoActionPerformed
       WinProducto wp = new WinProducto();
       wp.casoProducto = 1;
       wp.setVisible(true);
    }//GEN-LAST:event_RegProductoActionPerformed

    private void RegProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegProveedorActionPerformed
       WinProveedor wp = new WinProveedor();
       wp.casoProveedor =1;
       wp.setVisible(true);
    }//GEN-LAST:event_RegProveedorActionPerformed

    private void RegPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegPedidoActionPerformed
       WinPedido wpedido = new WinPedido();
       wpedido.casoPedido = 1;
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
        wrdp.casoReciboReparacion = 1;
        wrdp.setVisible(true);   
    }//GEN-LAST:event_RegReparacionActionPerformed

    private void salirSistemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirSistemaMousePressed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Seguro que desea salir del sistema", "Salir", JOptionPane.YES_NO_OPTION);

        if(opc == JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }//GEN-LAST:event_salirSistemaMousePressed

    private void admGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admGastosActionPerformed
        WinEditGasto weg = new WinEditGasto();
        weg.setVisible(true);
    }//GEN-LAST:event_admGastosActionPerformed

    private void adminNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNominaActionPerformed
        GeneraNomina gn = new GeneraNomina(this, true);
        gn.setVisible(true);
    }//GEN-LAST:event_adminNominaActionPerformed

    private void proveedorReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorReporteActionPerformed
       Connection conexion;
       WinAgregaProducto wa = new WinAgregaProducto();
           
           //Mostrar el reporte
            JasperReport report;
        try {
             conexion = DriverManager.getConnection(url,login,password);
            report = JasperCompileManager.compileReport("ReporteProveedores.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,conexion);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Reporte de Proveedores");
            visor.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_proveedorReporteActionPerformed

    private void clienteReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteReporteActionPerformed
       Connection conexion;
       WinAgregaProducto wa = new WinAgregaProducto();
           
           //Mostrar el reporte
            JasperReport report;
        try {
             conexion = DriverManager.getConnection(url,login,password);
            report = JasperCompileManager.compileReport("ReporteClientes.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,conexion);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Reporte de Clientes");
            visor.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
            
    }//GEN-LAST:event_clienteReporteActionPerformed

    private void cxcReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxcReporteActionPerformed
       Connection conexion;
       WinAgregaProducto wa = new WinAgregaProducto();
           
           //Mostrar el reporte
            JasperReport report;
        try {
             conexion = DriverManager.getConnection(url,login,password);
            report = JasperCompileManager.compileReport("ReporteCuentasPorCobrar.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,conexion);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Reporte de Cuentas por Cobrar");
            visor.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cxcReporteActionPerformed

    private void cxpReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxpReporteActionPerformed
       Connection conexion;
       WinAgregaProducto wa = new WinAgregaProducto();
           
           //Mostrar el reporte
            JasperReport report;
        try {
             conexion = DriverManager.getConnection(url,login,password);
            report = JasperCompileManager.compileReport("ReporteCuentasPorPagar.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,conexion);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Reporte de Cuentas por Pagar");
            visor.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }//GEN-LAST:event_cxpReporteActionPerformed

    private void empleadoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoReporteActionPerformed
     Connection conexion;
       WinAgregaProducto wa = new WinAgregaProducto();
           
           //Mostrar el reporte
            JasperReport report;
        try {
             conexion = DriverManager.getConnection(url,login,password);
            report = JasperCompileManager.compileReport("ReporteEmpleados.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,conexion);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Reporte de Empleados");
            visor.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }   
    }//GEN-LAST:event_empleadoReporteActionPerformed

    private void facturaReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facturaReporteActionPerformed

    private void gastoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastoReporteActionPerformed
       Connection conexion;
       WinAgregaProducto wa = new WinAgregaProducto();
           
           //Mostrar el reporte
            JasperReport report;
        try {
             conexion = DriverManager.getConnection(url,login,password);
            report = JasperCompileManager.compileReport("ReporteGastos.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,conexion);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Reporte de Gastos");
            visor.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_gastoReporteActionPerformed

    private void pedidoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoReporteActionPerformed
       Connection conexion;
       WinAgregaProducto wa = new WinAgregaProducto();
           
           //Mostrar el reporte
            JasperReport report;
        try {
             conexion = DriverManager.getConnection(url,login,password);
            report = JasperCompileManager.compileReport("ReportePedidos.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,conexion);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Reporte de Pedidos");
            visor.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_pedidoReporteActionPerformed

    private void productoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoReporteActionPerformed
        Connection conexion;
       WinAgregaProducto wa = new WinAgregaProducto();
           
           //Mostrar el reporte
            JasperReport report;
        try {
             conexion = DriverManager.getConnection(url,login,password);
            report = JasperCompileManager.compileReport("ReporteAlmacen.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,conexion);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Reporte de Productos");
            visor.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_productoReporteActionPerformed

    private void reciboReparacionReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciboReparacionReporteActionPerformed
     Connection conexion;
       WinAgregaProducto wa = new WinAgregaProducto();
           
           //Mostrar el reporte
            JasperReport report;
        try {
             conexion = DriverManager.getConnection(url,login,password);
            report = JasperCompileManager.compileReport("RerporteReparaciones.jrxml");
            JasperPrint jasperprint = JasperFillManager.fillReport(report,null,conexion);
            JasperViewer visor = new JasperViewer(jasperprint,false);
            visor.setTitle("Riteen - Reporte de Reparaciones");
            visor.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_reciboReparacionReporteActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
         this.setVisible(false);
        WinLoging wl = new WinLoging();
        wl.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void crearUsuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioMenuActionPerformed
      WinCrearUsuario wcu = new WinCrearUsuario(this, true);
        wcu.setVisible(true);
    }//GEN-LAST:event_crearUsuarioMenuActionPerformed

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
            @Override
            public void run() {
                WinInicio wInicio = new WinInicio();
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
    private javax.swing.JMenuItem admGastos;
    private javax.swing.JMenuItem adminNomina;
    private javax.swing.JMenuItem clienteReporte;
    private javax.swing.JMenuItem crearUsuarioMenu;
    private javax.swing.JMenuItem cxcReporte;
    private javax.swing.JMenuItem cxpReporte;
    private javax.swing.JMenuItem empleadoReporte;
    private javax.swing.JMenuItem facturaReporte;
    private javax.swing.JMenuItem gastoReporte;
    private javax.swing.JLabel horaDelReloj;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCuentaXCobrar;
    private javax.swing.JMenu jMenuRegistrar;
    private javax.swing.JMenuItem pedidoReporte;
    private javax.swing.JMenuItem productoReporte;
    private javax.swing.JMenuItem proveedorReporte;
    private javax.swing.JMenuItem reciboReparacionReporte;
    private javax.swing.JMenuItem salirSistema;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while(ct == h1) 
        {   
              calcula();
              horaDelReloj.setText(hora + ":" + minutos + ":" + segundos);
              try {
               Thread.sleep(1000);
              }
              catch(InterruptedException e) {}
        }
    }
    
    public void calcula () 
    {        
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();


        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";

        if(ampm.equals("PM"))
        {
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
        }
        else
        {
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);            
        }
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
    }
}