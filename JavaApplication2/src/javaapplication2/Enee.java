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
public class Enee {
    public static void main(String[]ar){
        Scanner lea=new Scanner(System.in);
        String name,tipo;
        double desc=0, sub=0, combus, total,pago;

        System.out.print("Ingrese un nombre: ");
        name=lea.next();
        System.out.print("Ingrese la zona: ");
        char zona=lea.next().charAt(0);
        System.out.print("Ingrese un tipo: ");
        tipo=lea.next();
        System.out.print("Ingrese la cantidad de Kv: ");
        int kv=lea.nextInt();
        
        
        if(kv<=100){
              if(zona=='a'){
                sub=50;
                }else if(zona=='b'){
                    sub=30;
                    }else if(zona=='c'){
                        sub=20;
                    }
        }else if((kv>100 && kv<=1000)){
                if(zona=='a'){
                    sub=100;
                    }else if(zona=='b'){
                        sub=60;
                        }else if(zona=='c'){
                            sub=40;
                        } 
        }else if((kv>1000)){
                if(zona=='a'){
                    sub=200;
                    }else if(zona=='b'){
                        sub=120;
                        }else if(zona=='c'){
                            sub=80;
                        }   
        }
        
        if(tipo.equalsIgnoreCase("diplomatico")){
            desc=sub*0.5;
        }
      combus=sub*0.3;      
      
      total=(sub - desc + combus);
      
      System.out.println("El subtotal es: "+sub);
      System.out.println("El descuento es: "+desc);
      System.out.println("El total a pagar es: "+total);
      
    }
    
}
