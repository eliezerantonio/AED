/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoescrito.eliezerantonio.pkg170351;

import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class Segunda {

    public static void main(String[] args) {

        System.out.println(" Digite a palavra ");
        String palavra = new Scanner(System.in).nextLine();
        String saida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            saida = saida + palavra.charAt(i);
        }
///se a minha saida for diferente da palavra nao é um palindromo
//caso contrario é
        if (!saida.equals(palavra)) {
            System.out.println("nao é um palidormo ");

        } else {
            System.out.println(" è um palitrommo  ");

        }
    }

}
