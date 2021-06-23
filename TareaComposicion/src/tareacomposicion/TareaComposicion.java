/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacomposicion;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author kevin
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora compu1 = new Computadora("HP", "Pavillion",  
                new CPU("AMD", "Rizen", 4), new Monitor("SAMSUNG", "LU28R55", 28), 
                new Mouse("Logitech", "Mx MAster  2s", "Inalambrico"), new Teclado("Razer", "Quartz Pink", 104, 5));
        
        System.out.println(compu1.toString()); 
    }
}
