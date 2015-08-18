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
public class Boro {
    public static void main(String []ar){
        Scanner lea=new Scanner(System.in);
        int cont=0,sumR=0, sumM=0,sumN=0;
        System.out.print("1.-Ronaldo\n"+"2.-Messi\n"+"3.-Neymar\n");
        String op;
        String res="si";
		
		while(res.equalsIgnoreCase("Si")){
			System.out.print("voto?: ");
                        op=lea.next();
                        
                        System.out.println("Quiere ingresar otro nombre?");
                        res=lea.next();
                        
                    if(op.equalsIgnoreCase("Ronaldo")){
                            sumR+=1;
                        }else if(op.equalsIgnoreCase("Messi")){
                                sumM+=1;
                                }else if(op.equalsIgnoreCase("Neymar")){
                                    sumN+=1;
                    }
			cont++;
                }
                if(sumR>sumM && (sumM>=sumN || sumM<sumN)){
                    if(sumR>sumN){
                      System.out.println("El ganador es Ronaldo");  
                    }
                }else if(sumM>sumR && (sumR>=sumN || sumR<sumN)){
                    if(sumM>sumN){
                      System.out.println("El ganador es Messi");  
                    }
                }else if(sumN>sumM && (sumM>=sumR || sumM<sumR)){
                    if(sumN>sumR){
                       System.out.println("El ganador es Neymar");
                    }
                    
                }
    }
    
}
