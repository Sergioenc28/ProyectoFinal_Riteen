/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

/**
 *
 * @author Sergio and Clary
 */
public class Notificaciones {
   String paIdProducto,nombreDelProducto,idProveedor;
   int cant;

    public Notificaciones(String paIdProducto, String nombreDelProducto, String Proveedor, int cant) {
        this.paIdProducto = paIdProducto;
        this.nombreDelProducto = nombreDelProducto;
        this.idProveedor = Proveedor;
        this.cant = cant;
    }

    public String getPaIdProducto() {
        return paIdProducto;
    }

    public void setPaIdProducto(String paIdProducto) {
        this.paIdProducto = paIdProducto;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public String getProveedor() {
        return idProveedor;
    }

    public void setProveedor(String Proveedor) {
        this.idProveedor = Proveedor;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
   
   
}
