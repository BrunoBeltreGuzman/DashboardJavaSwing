/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Ventana.Ventana;

/**
 *
 * @author diosl
 */
public class App {
    
    private static void iniciar(){
        new Ventana().setVisible(true);
    }
    
    
    public static void main(String[] args) {
        iniciar();
    }
    
}
