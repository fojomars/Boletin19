/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

/**
 *
 * @author fojomars
 */
public class Boletin19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here         
        int[] notas=new int[3];
        String[] alumnos=new String[3];
        Notas obx=new Notas();
        obx.notasAlumnos(notas,alumnos);
        obx.mostrarAlumnos(notas, alumnos);
        obx.lista(notas, alumnos);
        obx.mostrarAlumnos(notas, alumnos);
        obx.mostrarNota(notas, alumnos);

    }
    
}
