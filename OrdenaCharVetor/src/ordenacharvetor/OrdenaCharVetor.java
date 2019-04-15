/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacharvetor;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class OrdenaCharVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long tInicio = System.currentTimeMillis();

        char[] nome = {'g', 'a', 'b', 'r', 'i', 'e', 'l'};
        char[] ordena = {'a', 'r', 'b', 'l', 'g', 'i', 'e'};

        String [][] a = new String[1][2];
        
        a[0][0] = "00";
        a[0][1] = "01";
        a[0][2] = "02";
        a[1][0] = "10";
        a[1][1] = "11";
        a[1][2] = "12";
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        
        
        
        //char[] nome = {'l', 'u', 'c', 'a', 's'};
        //char[] ordena = {'s', 'a', 'c', 'u', 'l'};
        //               l                    s       
        char aux;

        //como são as meemas palavras os for são de mesmo tamanho
        for (int i = 0; i < nome.length; i++) {
            if (Arrays.toString(nome).equals(Arrays.toString(ordena))) {
                break;
            }

            //aux = ordena[i];
            for (int j = 0; j < nome.length; j++) {
                if (nome[i] == ordena[j]) {
                    aux = ordena[j];
                    ordena[j] = nome[j];
                    ordena[i] = aux;
                }
            }

        }

        for (int i = 0; i < nome.length; i++) {
            System.out.print(ordena[i] + " ");
        }

        System.out.println(" ");

        long tFim = System.currentTimeMillis();

        System.out.println("Tempo execução: " + (tFim - tInicio));

    }

}
