/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Harim Tejada
 */
public class PanelCliente extends javax.swing.JPanel {

    /**
     * Creates new form PanelCliente
     */
    public PanelCliente() {
        initComponents();
        this.setSize(850, 600);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
