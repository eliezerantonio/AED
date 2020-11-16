/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDadosPilha.labs;

import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class Ultima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        mostraResultado(" ((A+B) ou A+B(");
        mostraResultado(" )A+B (-C ou (A+B))-(C+D");
        mostraResultado(" ((A+B)+D)");
        mostraResultado(" A +(B +(C+D))");
        
        mostraResultado(" (A + (B + D))");

    }

    public static void mostraResultado(String expressao) {
        System.out.println(verificandoSimbolos(expressao)
                + expressao + "");
    }

    final static String ABRIR = "([{";
    final static String FECHAR = ")]}";

    public static boolean verificandoSimbolos(String expressao) {
//VERIFICAR SE A PÇIHA ESTA VAZIA
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);
////verificar as posicoes dos parenteses
            if (ABRIR.indexOf(simbolo) > -1) {
                pilha.empilhar(simbolo);

            } else if (FECHAR.indexOf(simbolo) > -1) {

                if (pilha.estaVazia()) {
                    return false;
                } else {
                    //desempilhar
                    topo = pilha.desempilha();
//verficara as posiscoes dos indeces no topo da pilha
                    if (ABRIR.indexOf(topo) != FECHAR.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            index++;
        }

        return true;
    }

}
