/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospares;

import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class Inteiros {

    private int pares;
    private int impares;
    int resultado;

    public int somar() {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt(), par = 1, impar = 1;

        System.out.println("Numero Pares");
        while (par <= numero) {
            if (par % 2 == 0) {
                System.out.println(par);
            }

            par++;

        }
        System.out.println("Numero impar");
        while (impar < numero) {
            if (par % 2 != 0) {
                System.out.println(impar);
            }

            impar++;

            return 0;

        }
        return 0;
        

    }

    public int getPares() {
        return pares;
    }

    public void setPares(int pares) {
        this.pares = pares;
    }

    public int getImpares() {
        return impares;
    }

    public void setImpares(int impares) {
        this.impares = impares;
    }

}
