package EstruturaDadosPilha.labs;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um numero");

            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando o numero " + num);
                pilha.empilhar(num);

            } else {

                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha vazia");
                } else {
                    System.out.println("Numero impar, desempilhando um elemento da pilha: "
                            + desempilhado);
                }
            }
        }

        System.out.println("Todos os numeros foram lidos, desempilhando numeros da pilha");

        while (!pilha.estaVazia()) {
            
            Integer desempilhado = pilha.desempilha();

            if (desempilhado == null) {
                System.out.println("Pilha vazia");
            } else {
                System.out.println("Desempilhando um elemento da pilha: "
                        + pilha.desempilha());
            }

        }
        System.out.println("Todos os elementos foram desempilhados");
    }

}
