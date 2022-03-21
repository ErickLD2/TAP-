/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg11.semana.pkg6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Actividad11Semana6 extends Thread {
    
    javax.swing.JLabel jLabel1;
    int contador;
    
    public Actividad11Semana6() {
        contador = 1;
    }
    
  
    public void run() {
        while (true) {
            jLabel1.setText("Ejecutando "+contador++ );
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Actividad11Semana6.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void recibejLabel(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }
    
}
