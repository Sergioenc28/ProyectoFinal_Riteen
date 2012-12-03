/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

/**
 *
 * @author Sergio and Clary
 */
public class ControlDeLoggin {
    String pass;
    String user;

    public ControlDeLoggin(String pass, String user) {
        this.pass = pass;
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
