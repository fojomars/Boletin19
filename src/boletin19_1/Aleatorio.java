/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_1;

import java.util.Arrays;



/**
 *
 * @author fojomars
 */
public class Aleatorio {
    int[] numeros = new int[6];
    
    public void mostrar(){
        for(int i=0;i<numeros.length;i++){
            numeros[i] = (int) ((Math.random()*50)+1);
            System.out.println(numeros[i]);
        }
    }
    
    public void ordenar(){
        System.out.println("**************************");
         for (int j=numeros.length-1;j>=0;j--){
             System.out.println(numeros[j]);
         }
    }
    
}
