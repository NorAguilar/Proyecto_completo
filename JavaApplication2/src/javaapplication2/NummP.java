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
import java.util.*;
public class NummP {
    public static void main(String[]arg){
        Scanner lea=new Scanner(System.in);
        int cont=0,mayor=0,prome, suma=0;
        int num, acum=0;
        
        do{
            System.out.print("ingrese un numero: ");
            num=lea.nextInt();
            if(num%2==0){
                acum+=1;
                suma+=num;
                if(num>mayor){
                    mayor=num;
                }
            }
            cont++;
        }while(acum<10);
        prome=suma/cont;
        System.out.println("El numero par mayor es: "+mayor);
        System.out.println("El promedio es: "+prome);
    }
    
}
