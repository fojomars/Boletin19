/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Notas {
    
    
    public int darNota() {
        return Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
    }

    public String darNome() {
        return JOptionPane.showInputDialog("Nombre alumno: ");
    }
    
    public void aprobados(int[] notas, String[] nomes) {

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5.0) {
                System.out.println(nomes[i]);
            }
        }
    }
    
    public void notasAlumnos(int[] notas, String[] nomes) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = darNota();
            nomes[i] = darNome();
        }
    }
    
     public void lista(int[] notas, String[] nomes) {

        int aux;
        String aux2;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    aux2 = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = aux2;
                }
            }
        }
    }


    public void mostrarAlumnos(int[] notas, String[] nomes) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("\nAlumno: " + nomes[i]);
            System.out.println("Nota: " + notas[i]);

        }
    }

    public void mostrarNota(int[] notas, String[] nomes) {
        String alumno = darNome();
        for (int i = 0; i < nomes.length; i++) {
            if (alumno == nomes[i]) {
                System.out.println("Nota: " + notas[i]);
            }
        }
    }
}
