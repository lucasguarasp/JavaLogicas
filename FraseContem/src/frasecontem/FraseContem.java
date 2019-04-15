/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frasecontem;

/**
 *
 * @author lucas
 */

//entrada String frase = "ana banana";
//        String nome = "ana";
// saida > 3 "ana"

public class FraseContem {

    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        lucas();
        long fim = System.currentTimeMillis();

        System.out.println("Lucas: " + (fim - inicio));       

    }

    static void lucas() {
        String frase = "ana banana";
        String nome = "an";

        int cont = 0;
        int aux = 0;
        int n = 0;

        for (int i = 0, j = 0; i < frase.length(); i++) {
            if (nome.charAt(j) == frase.charAt(i)) {
                aux = i;
                for (j = 0; j < nome.length(); j++) {
                    if (i < frase.length()) {
                        if (nome.charAt(j) == frase.charAt(i)) {
                            cont++;
                        }
                        i++;
                    }

                }

                if (cont < nome.length()) {
                    cont = 0;
                } else {
                    cont = 0;
                    n++;
                }
                i = aux;
            }

            j = 0;
        }

        System.out.println(n);
    }    

}
