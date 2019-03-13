/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Dam {
    
    // Método para crear un array
    public void crearArray(int[] alumnos){
        for (int i =0;i<alumnos.length;i++)
            alumnos[i]=darNotas();
    }
    
    // Método para introducir notas
    public int darNotas(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduza a nota: "));
    }
  
    
    // Método para visializar aprobados y suspensos
    public void numAproSusp(int[]alumnos){
        int aprobado = 0;
        int suspenso = 0;
        for (int i = 0; i<alumnos.length;i++){
            if (alumnos[i]>5.0){
                aprobado++;
            }
            else{
                suspenso++;
            }
        }
            JOptionPane.showMessageDialog(null, "Aprobados: " + aprobado + "\nSuspenso " + suspenso);
    }

    // Método para calcular y visializar la nota media de la clase
    public void NotaMedia(int[] alumnos){
        float totalNotas = 0;
        for (int i = 0; i < alumnos.length; i++) {
            totalNotas +=alumnos[i];
        }
        System.out.println("Nota Media: " + (totalNotas / alumnos.length));
    }

    // Método para mostrar la nota más alta
    public void NotaMasAlta(int[] alumnos) {
        double auxiliar = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (auxiliar < alumnos[i]) {
                auxiliar = alumnos[i];
            }

        }
        System.out.println("Nota más Alta: " + auxiliar);
    }


}



