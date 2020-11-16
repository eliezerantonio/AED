package EstruturaDadosPilha.labs;

import java.util.Scanner;

/**
 *
 * @author lourinhomassala
 */
public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite um numero");

            numero = scan.nextInt();

            conversao(numero);
        }

    }

    public static String decimalaParaBinario(int numero) {

        Pilha<Integer> pilha = new Pilha<>();
        String binario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.empilhar(resto);
            numero /= 2;
        }

        while (!pilha.estaVazia()) {
            binario += pilha.desempilha();
        }

        return binario;
    }

    public static void conversao(int numero) {
        System.out.println(numero + " em binário é: " + decimalaParaBinario(numero));
    }

}
