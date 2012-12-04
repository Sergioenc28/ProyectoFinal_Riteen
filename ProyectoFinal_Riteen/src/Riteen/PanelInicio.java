/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Harim Tejada
 */
public class PanelInicio extends javax.swing.JPanel {

    /**
     * Creates new form PanelInicio
     */
    public PanelInicio() {
        initComponents();
        this.setSize(850, 600);
        UsuarioActual us = new UsuarioActual();
        us.setUsuarioActivo();
        usuarioActualJLabel.setText(us.getUsuarioActivo());
        
    }
    
    
    
    @Override
     public void paintComponent(Graphics g){
    
        Dimension tam = getSize();
        ImageIcon Imagen = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/fondoInicio1.jpg")).getImage());
        g.drawImage(Imagen.getImage(), 0, 0, tam.width, tam.height, null );
        
        super.paintComponents(g);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientesButton = new javax.swing.JToggleButton();
        empleadosButton = new javax.swing.JToggleButton();
        proveedoresButton = new javax.swing.JToggleButton();
        almacenButton = new javax.swing.JToggleButton();
        facturasButton = new javax.swing.JToggleButton();
        reparacionesButton = new javax.swing.JToggleButton();
        ayudaButton = new javax.swing.JToggleButton();
        cuentasButton = new javax.swing.JToggleButton();
        pedidosButton = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        crearFacturaButton = new javax.swing.JButton();
        CrearReciboButton = new javax.swing.JButton();
        notificacionesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();
        usuarioActualJLabel = new javax.swing.JLabel();

        clientesButton.setOpaque(false);
        clientesButton.setContentAreaFilled(false);
        clientesButton.setBorderPainted(false);
        clientesButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        clientesButton.setForeground(new java.awt.Color(204, 204, 204));
        clientesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group2.png"))); // NOI18N
        clientesButton.setText("CLIENTES");
        clientesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clientesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientesButtonMouseExited(evt);
            }
        });
        clientesButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                clientesButtonMouseMoved(evt);
            }
        });
        clientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButtonActionPerformed(evt);
            }
        });

        empleadosButton.setOpaque(false);
        empleadosButton.setContentAreaFilled(false);
        empleadosButton.setBorderPainted(false);
        empleadosButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        empleadosButton.setForeground(new java.awt.Color(204, 204, 204));
        empleadosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_accounts_256.png"))); // NOI18N
        empleadosButton.setText("EMPLEADOS");
        empleadosButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        empleadosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empleadosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empleadosButtonMouseExited(evt);
            }
        });
        empleadosButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                empleadosButtonMouseMoved(evt);
            }
        });
        empleadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosButtonActionPerformed(evt);
            }
        });

        proveedoresButton.setOpaque(false);
        proveedoresButton.setContentAreaFilled(false);
        proveedoresButton.setBorderPainted(false);
        proveedoresButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        proveedoresButton.setForeground(new java.awt.Color(204, 204, 204));
        proveedoresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        proveedoresButton.setText("PROVEEDORES");
        proveedoresButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        proveedoresButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proveedoresButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proveedoresButtonMouseExited(evt);
            }
        });
        proveedoresButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                proveedoresButtonMouseMoved(evt);
            }
        });
        proveedoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresButtonActionPerformed(evt);
            }
        });

        almacenButton.setOpaque(false);
        almacenButton.setContentAreaFilled(false);
        almacenButton.setBorderPainted(false);
        almacenButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        almacenButton.setForeground(new java.awt.Color(204, 204, 204));
        almacenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacen.png"))); // NOI18N
        almacenButton.setText("ALMACEN");
        almacenButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        almacenButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        almacenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                almacenButtonMouseExited(evt);
            }
        });
        almacenButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                almacenButtonMouseMoved(evt);
            }
        });
        almacenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenButtonActionPerformed(evt);
            }
        });

        facturasButton.setOpaque(false);
        facturasButton.setContentAreaFilled(false);
        facturasButton.setBorderPainted(false);
        facturasButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        facturasButton.setForeground(new java.awt.Color(204, 204, 204));
        facturasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/task_completed_256.png"))); // NOI18N
        facturasButton.setText("FACTURAS");
        facturasButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        facturasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facturasButtonMouseExited(evt);
            }
        });
        facturasButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                facturasButtonMouseMoved(evt);
            }
        });
        facturasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturasButtonActionPerformed(evt);
            }
        });

        reparacionesButton.setOpaque(false);
        reparacionesButton.setContentAreaFilled(false);
        reparacionesButton.setBorderPainted(false);
        reparacionesButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        reparacionesButton.setForeground(new java.awt.Color(204, 204, 204));
        reparacionesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reparacion.png"))); // NOI18N
        reparacionesButton.setText("REPARACIONES");
        reparacionesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reparacionesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reparacionesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reparacionesButtonMouseExited(evt);
            }
        });
        reparacionesButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                reparacionesButtonMouseMoved(evt);
            }
        });
        reparacionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reparacionesButtonActionPerformed(evt);
            }
        });

        ayudaButton.setOpaque(false);
        ayudaButton.setContentAreaFilled(false);
        ayudaButton.setBorderPainted(false);
        ayudaButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ayudaButton.setForeground(new java.awt.Color(204, 204, 204));
        ayudaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        ayudaButton.setText("AYUDA");
        ayudaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ayudaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ayudaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ayudaButtonMouseExited(evt);
            }
        });
        ayudaButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ayudaButtonMouseMoved(evt);
            }
        });
        ayudaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaButtonActionPerformed(evt);
            }
        });

        cuentasButton.setOpaque(false);
        cuentasButton.setContentAreaFilled(false);
        cuentasButton.setBorderPainted(false);
        cuentasButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cuentasButton.setForeground(new java.awt.Color(204, 204, 204));
        cuentasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        cuentasButton.setText("CUENTAS");
        cuentasButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuentasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuentasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cuentasButtonMouseExited(evt);
            }
        });
        cuentasButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cuentasButtonMouseMoved(evt);
            }
        });
        cuentasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentasButtonActionPerformed(evt);
            }
        });

        pedidosButton.setOpaque(false);
        pedidosButton.setContentAreaFilled(false);
        pedidosButton.setBorderPainted(false);
        pedidosButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        pedidosButton.setForeground(new java.awt.Color(204, 204, 204));
        pedidosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shoping_basket.png"))); // NOI18N
        pedidosButton.setText("PEDIDOS");
        pedidosButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pedidosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedidosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pedidosButtonMouseExited(evt);
            }
        });
        pedidosButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pedidosButtonMouseMoved(evt);
            }
        });
        pedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Inicio");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");

        crearFacturaButton.setOpaque(false);
        crearFacturaButton.setContentAreaFilled(false);
        crearFacturaButton.setBorderPainted(false);
        crearFacturaButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        crearFacturaButton.setForeground(new java.awt.Color(255, 255, 255));
        crearFacturaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facturar.png"))); // NOI18N
        crearFacturaButton.setText("Crear Factura");
        crearFacturaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        crearFacturaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearFacturaButtonMouseExited(evt);
            }
        });
        crearFacturaButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                crearFacturaButtonMouseMoved(evt);
            }
        });
        crearFacturaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFacturaButtonActionPerformed(evt);
            }
        });

        CrearReciboButton.setOpaque(false);
        CrearReciboButton.setContentAreaFilled(false);
        CrearReciboButton.setBorderPainted(false);
        CrearReciboButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CrearReciboButton.setForeground(new java.awt.Color(255, 255, 255));
        CrearReciboButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/217.png"))); // NOI18N
        CrearReciboButton.setText("Crear Recibo");
        CrearReciboButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        CrearReciboButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearReciboButtonMouseExited(evt);
            }
        });
        CrearReciboButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CrearReciboButtonMouseMoved(evt);
            }
        });
        CrearReciboButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearReciboButtonActionPerformed(evt);
            }
        });

        notificacionesButton.setOpaque(false);
        notificacionesButton.setContentAreaFilled(false);
        notificacionesButton.setBorderPainted(false);
        notificacionesButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        notificacionesButton.setForeground(new java.awt.Color(255, 255, 255));
        notificacionesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Notification.png"))); // NOI18N
        notificacionesButton.setText("Notificaciones");
        notificacionesButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        notificacionesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notificacionesButtonMouseExited(evt);
            }
        });
        notificacionesButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                notificacionesButtonMouseMoved(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("R i t e e n");

        salirButton.setOpaque(false);
        salirButton.setContentAreaFilled(false);
        salirButton.setBorderPainted(false);
        salirButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        salirButton.setForeground(new java.awt.Color(255, 255, 255));
        salirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/139.png"))); // NOI18N
        salirButton.setText("Salir");
        salirButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        salirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirButtonMouseExited(evt);
            }
        });
        salirButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                salirButtonMouseMoved(evt);
            }
        });
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        usuarioActualJLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usuarioActualJLabel.setForeground(new java.awt.Color(255, 255, 255));
        usuarioActualJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(almacenButton)
                                        .addComponent(clientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pedidosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empleadosButton)
                                    .addComponent(facturasButton)
                                    .addComponent(cuentasButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CrearReciboButton)
                                    .addComponent(crearFacturaButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proveedoresButton)
                            .addComponent(reparacionesButton)
                            .addComponent(ayudaButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(notificacionesButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioActualJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salirButton)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(crearFacturaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CrearReciboButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(notificacionesButton)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clientesButton)
                            .addComponent(proveedoresButton))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reparacionesButton)
                            .addComponent(almacenButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empleadosButton)
                        .addGap(69, 69, 69)
                        .addComponent(facturasButton)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cuentasButton)
                            .addComponent(ayudaButton)
                            .addComponent(pedidosButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(salirButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usuarioActualJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void empleadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosButtonActionPerformed
        WinEditEmpleado wee = new WinEditEmpleado();
        wee.setVisible(true);
    }//GEN-LAST:event_empleadosButtonActionPerformed

    private void crearFacturaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFacturaButtonActionPerformed
        WinEligeFactura wef = new WinEligeFactura();
        wef.setVisible(true);                
    }//GEN-LAST:event_crearFacturaButtonActionPerformed

    private void CrearReciboButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearReciboButtonActionPerformed
       WinReciboDeReparacion wrd = new WinReciboDeReparacion();
       wrd.setVisible(true);       
    }//GEN-LAST:event_CrearReciboButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
     int opc = JOptionPane.showConfirmDialog(null, "Seguro que desea salir del sistema", "Salir", JOptionPane.YES_NO_OPTION);
        
        if(opc == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_salirButtonActionPerformed

    private void clientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButtonActionPerformed
        WinEditCliente wec = new WinEditCliente();
        wec.setVisible(true);
    }//GEN-LAST:event_clientesButtonActionPerformed

    private void proveedoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresButtonActionPerformed
        WinEditProveedor wepd = new WinEditProveedor();
       wepd.setVisible(true);
    }//GEN-LAST:event_proveedoresButtonActionPerformed

    private void almacenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenButtonActionPerformed
         WinEditProducto wepr = new WinEditProducto();
        wepr.setVisible(true);
    }//GEN-LAST:event_almacenButtonActionPerformed

    private void reparacionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reparacionesButtonActionPerformed
        WinEditReciboReparacion werr = new WinEditReciboReparacion();
        werr.setVisible(true);
    }//GEN-LAST:event_reparacionesButtonActionPerformed

    private void pedidosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosButtonActionPerformed
        WinEditPedido wepd = new WinEditPedido();
        wepd.setVisible(true);
    }//GEN-LAST:event_pedidosButtonActionPerformed

    private void cuentasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentasButtonActionPerformed
        WinEligeCuenta welc = new WinEligeCuenta();
        welc.setVisible(true);
    }//GEN-LAST:event_cuentasButtonActionPerformed

    private void ayudaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ayudaButtonActionPerformed

    private void facturasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturasButtonActionPerformed
        WinInicio wi = new WinInicio();
        WinDetalleFacturaContado wdfc = new WinDetalleFacturaContado(wi, false);
        wdfc.setVisible(true);
    }//GEN-LAST:event_facturasButtonActionPerformed

    private void clientesButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesButtonMouseMoved
        clientesButton.setBorderPainted(true);
        clientesButton.setForeground(Color.white);
    }//GEN-LAST:event_clientesButtonMouseMoved

    private void clientesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesButtonMouseExited
        clientesButton.setBorderPainted(false);
        clientesButton.setForeground(Color.GRAY);
    }//GEN-LAST:event_clientesButtonMouseExited

    private void empleadosButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosButtonMouseMoved
        empleadosButton.setBorderPainted(true);
        empleadosButton.setForeground(Color.white);
    }//GEN-LAST:event_empleadosButtonMouseMoved

    private void empleadosButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosButtonMouseExited
        empleadosButton.setBorderPainted(false);
        empleadosButton.setForeground(Color.GRAY);
    }//GEN-LAST:event_empleadosButtonMouseExited

    private void proveedoresButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresButtonMouseExited
        proveedoresButton.setBorderPainted(false);
        proveedoresButton.setForeground(Color.GRAY);
    }//GEN-LAST:event_proveedoresButtonMouseExited

    private void proveedoresButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresButtonMouseMoved
        proveedoresButton.setBorderPainted(true);
        proveedoresButton.setForeground(Color.white);
    }//GEN-LAST:event_proveedoresButtonMouseMoved

    private void almacenButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_almacenButtonMouseExited
        almacenButton.setBorderPainted(false);
        almacenButton.setForeground(Color.GRAY);
    }//GEN-LAST:event_almacenButtonMouseExited

    private void almacenButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_almacenButtonMouseMoved
        almacenButton.setBorderPainted(true);
        almacenButton.setForeground(Color.white);
    }//GEN-LAST:event_almacenButtonMouseMoved

    private void reparacionesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reparacionesButtonMouseExited
        reparacionesButton.setBorderPainted(false);
        reparacionesButton.setForeground(Color.GRAY);
    }//GEN-LAST:event_reparacionesButtonMouseExited

    private void reparacionesButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reparacionesButtonMouseMoved
        reparacionesButton.setBorderPainted(true);
        reparacionesButton.setForeground(Color.white);
    }//GEN-LAST:event_reparacionesButtonMouseMoved

    private void facturasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasButtonMouseExited
        facturasButton.setBorderPainted(false);
        facturasButton.setForeground(Color.GRAY);
    }//GEN-LAST:event_facturasButtonMouseExited

    private void facturasButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasButtonMouseMoved
        facturasButton.setBorderPainted(true);
        facturasButton.setForeground(Color.white);
    }//GEN-LAST:event_facturasButtonMouseMoved

    private void pedidosButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidosButtonMouseExited
        pedidosButton.setBorderPainted(false);
        pedidosButton.setForeground(Color.GRAY);
    }//GEN-LAST:event_pedidosButtonMouseExited

    private void pedidosButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidosButtonMouseMoved
        pedidosButton.setBorderPainted(true);
        pedidosButton.setForeground(Color.white);
    }//GEN-LAST:event_pedidosButtonMouseMoved

    private void cuentasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentasButtonMouseExited
        cuentasButton.setBorderPainted(false);
        cuentasButton.setForeground(Color.GRAY);
    }//GEN-LAST:event_cuentasButtonMouseExited

    private void cuentasButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentasButtonMouseMoved
        cuentasButton.setBorderPainted(true);
        cuentasButton.setForeground(Color.white);
    }//GEN-LAST:event_cuentasButtonMouseMoved

    private void ayudaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaButtonMouseExited
        ayudaButton.setBorderPainted(false);
        ayudaButton.setForeground(Color.GRAY);
    }//GEN-LAST:event_ayudaButtonMouseExited

    private void ayudaButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaButtonMouseMoved
        ayudaButton.setBorderPainted(true);
        ayudaButton.setForeground(Color.white);
    }//GEN-LAST:event_ayudaButtonMouseMoved

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        jLabel10.setForeground(Color.white);
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabel10MouseExited

    private void salirButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButtonMouseMoved
        salirButton.setBorderPainted(true);
    }//GEN-LAST:event_salirButtonMouseMoved

    private void salirButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButtonMouseExited
        salirButton.setBorderPainted(false);
    }//GEN-LAST:event_salirButtonMouseExited

    private void crearFacturaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearFacturaButtonMouseExited
        crearFacturaButton.setBorderPainted(false);
    }//GEN-LAST:event_crearFacturaButtonMouseExited

    private void crearFacturaButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearFacturaButtonMouseMoved
        crearFacturaButton.setBorderPainted(true);
    }//GEN-LAST:event_crearFacturaButtonMouseMoved

    private void CrearReciboButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearReciboButtonMouseExited
        CrearReciboButton.setBorderPainted(false);
    }//GEN-LAST:event_CrearReciboButtonMouseExited

    private void CrearReciboButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearReciboButtonMouseMoved
        CrearReciboButton.setBorderPainted(true);
    }//GEN-LAST:event_CrearReciboButtonMouseMoved

    private void notificacionesButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificacionesButtonMouseMoved
        notificacionesButton.setBorderPainted(true);
    }//GEN-LAST:event_notificacionesButtonMouseMoved

    private void notificacionesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificacionesButtonMouseExited
        notificacionesButton.setBorderPainted(false);
    }//GEN-LAST:event_notificacionesButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearReciboButton;
    private javax.swing.JToggleButton almacenButton;
    private javax.swing.JToggleButton ayudaButton;
    private javax.swing.JToggleButton clientesButton;
    private javax.swing.JButton crearFacturaButton;
    private javax.swing.JToggleButton cuentasButton;
    private javax.swing.JToggleButton empleadosButton;
    private javax.swing.JToggleButton facturasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton notificacionesButton;
    private javax.swing.JToggleButton pedidosButton;
    private javax.swing.JToggleButton proveedoresButton;
    private javax.swing.JToggleButton reparacionesButton;
    private javax.swing.JButton salirButton;
    public javax.swing.JLabel usuarioActualJLabel;
    // End of variables declaration//GEN-END:variables
}