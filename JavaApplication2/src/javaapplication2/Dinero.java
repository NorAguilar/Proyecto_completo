/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Basico
 */
public class Dinero { 
public static void main(String[] args) {
        double dinero = 10000; 
        int mes = 1; 
    for (;;) {
        dinero = dinero * 1.02; 
        if (dinero >= 20000){
            System.out.println(mes); 
            System.out.println(dinero);
        break;
        
        }
        mes++;
        } 

}
}

