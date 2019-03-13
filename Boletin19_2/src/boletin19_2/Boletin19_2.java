/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

/**
 *
 * @author fojomars
 */
public class Boletin19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] notas=new int[30];
        Dam clase=new Dam();
        clase.crearArray(notas);
        clase.numAproSusp(notas);
        clase.NotaMedia(notas);
        clase.NotaMasAlta(notas);
    }
    
}
