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
public class Contador {
    public static void main(String[]arg){
        Scanner lea=new Scanner(System.in);
        int n;
        //String res="Si";
        
        /*while(n<=10){
            System.out.println(n);
            n++;
        }
                */
        /*do{
            System.out.println(n);
            n++;
        }while(n<=100);
               */
       /* for(int i=1;i<=10;i++){
            System.out.println(i);
         */
        /*while(n>=1){
            System.out.println(n);
            n--;
          */
        /*do{
            System.out.println(n);
            n--;
         }while(n>=1);
                */
        /*for(int i=10;i>=1;i--){
            System.out.println(i);
        }
                */
        
        
      /*  do{
            System.out.print("Quiere ingresar una edad?: ");
                res=lea.next();
                System.out.print("Ingrese una edad: ");
                int n=lea.nextInt();
            
            if(n<=18){
                System.out.println("Usted puede estudiar Medicina!!");
            }else if(n<=28){
                System.out.println("Usted puede estudiar Sistemas!!");
            }else if(n<=40){
                 System.out.println("Usted puede estudiar Mercadeo!!");
                
            }else{
                 System.out.println("Usted ya está muy viejo!!");
            }
            
            con++;
            
        }while(res.equalsIgnoreCase("si"));
        */
        for(int i=1;i<=5;i++){
            System.out.print(i+"-");
            while(i==5){
                System.out.print(6+".");
                i++;
            }
            
        }
    }
    
}
