/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sergio and Clary
 */
public class Fecha {
    
    public String fechaActualDelSistema;
             
    public String getFechaActualDelSistema() 
    {
        return fechaActualDelSistema;
    }

    public void setFechaActualDelSistema(String paFechaActualDelSistema) 
    {
        Date fecha =new Date(); 
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        paFechaActualDelSistema = sdf.format(fecha);
        
        this.fechaActualDelSistema = paFechaActualDelSistema;
    }
}
