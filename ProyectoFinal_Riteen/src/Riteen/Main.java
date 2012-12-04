/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;



/**
 *
 * @author Harim Tejada
 */
public class Main implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       WinLoging wl = new WinLoging();
       wl.setVisible(true);
       
       
       RelojRiteen reloj = new RelojRiteen();
       System.out.println("El reloj esta listopara iniciar");
       reloj.run();
       
       
    }

    @Override
    public void run() {
        
    }
}
