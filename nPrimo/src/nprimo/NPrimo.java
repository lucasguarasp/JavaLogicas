/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nprimo;

/**
 *
 * @author lucas
 */
public class NPrimo {

    /**
     * gerar numeros primos
     */
    public static void main(String[] args) {
        int primo = 50;
        int cont;

        for (int i = 1, aux; i <= primo; i++) {
            cont = 0;
            aux = 1;

            while (aux <= i) {
                if (i % aux == 0) {
                    cont++;
                }
                aux++;
            }

            if (cont == 2 && i != 1) {
                System.out.print(i + " ");
            }

        }
        System.out.println("");

    }

}
