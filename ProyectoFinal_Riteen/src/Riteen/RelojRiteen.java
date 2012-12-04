/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio and Clary
 */
public class RelojRiteen extends JFrame implements Runnable{
    int segundo,minuto,hora;
    Calendar calendario = new GregorianCalendar();
    String paraLaHora;
    String paSet;
    PanelInicio pi = new PanelInicio();

    public String getParaLaHora() {
        return paraLaHora;
    }

    public void setParaLaHora(String paraLaHora) {
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND);
        paraLaHora = hora+":"+minuto+":"+segundo;
        this.paraLaHora = paraLaHora;
    }
    
    @Override
    public void run() {
        Thread reloj = new Thread();
        
        while(true)
        {
            setParaLaHora(paSet);
            
            try {
                reloj.sleep(1000);
                segundo=0;
                minuto=0;
                hora=0;
                System.out.println("Todo en cero");
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "El reloj no funciona, contacte con su soporte tecnico");
            }
            
            System.out.println("La hora actual es: "+getParaLaHora());
            pi.relojInicio.setText(getParaLaHora());
            pi.relojInicio.updateUI();
            
            
        }
    }
}
