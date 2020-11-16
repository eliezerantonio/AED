package EstruturaDadosPilha.labs;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);
        // ciclo que vai fazer a leitura do numero

        for (int i = 1; i <= 10; i++) {

            //Solicitando uma mensagem
            System.out.println("Digite um numero");

            int numero = scan.nextInt();

            if (numero == 0) {

                //pilha par
                Integer desempilhado = par.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vazia ");
                } else {
                    System.out.print("Desempilhando da pilha par: " + desempilhado);
                }

                //pilha impar
                desempilhado = impar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha impar vazia ");
                } else {
                    System.out.print("Desempilhando da pilha impar: " + desempilhado);
                }

            } else if (numero % 2 == 0) {
                System.out.println("Numero par, empilhando na pilha par: " + numero);
                par.empilhar(numero);
            } else {
                System.out.println("Numero impar, empilhando na pilha impar: " + numero);
                impar.empilhar(numero);
            }
        }

        System.out.println("Desempilhando todos os numeros da pilha par ");

        while (!par.estaVazia()) {
            System.out.println("Desempilhando da pilha par: " + par.desempilha());
        }
        
        System.out.println("Desempilhando todos os numeros da pilha impar");

        while (!impar.estaVazia()) {
            System.out.println("Desempilhando da pilha impar: " + impar.desempilha());
        }
    }
}
