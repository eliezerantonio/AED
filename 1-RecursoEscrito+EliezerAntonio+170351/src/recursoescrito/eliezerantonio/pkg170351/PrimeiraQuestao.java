/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoescrito.eliezerantonio.pkg170351;

import QuartaQuestao.Pilha;
import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class PrimeiraQuestao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha<Integer> manha = new Pilha<Integer>();
        Pilha<Integer> tarde = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);
        // ciclo que vai fazer a leitura do numero

        for (int i = 1; i <= 10; i++) {

            //Solicitando uma mensagem
            System.out.println("Digite a idade");

            int numero = scan.nextInt();

            if (numero == 0) {

                //pilha par
                Integer desempilhado = manha.desempilha();

                if (desempilhado == null) {
                    System.out.println("A lista da manha econtra-se vazia ");
                } else {
                    System.out.print("Removendo alunos na lista da manha : " + desempilhado);
                }

                //pilha impar
                desempilhado = tarde.desempilha();
                if (desempilhado == null) {
                    System.out.println("Lista da tarde econtra-se vazia ");
                } else {
                    System.out.print("remover alunos na lista da tarde: " + desempilhado);
                }

            } else if (numero <= 15) {
                System.out.println("Numero par, empilhando na pilha manha: " + numero);

                manha.empilhar(numero);
                System.out.println("Alunos da lista da manha" + manha.toString());
                System.out.println("Total de alunos na lista da manha: " + manha.tamanho());
            } else {
                System.out.println("Numero impar, empilhando na pilha tarde: " + numero);
                tarde.empilhar(numero);
                System.out.println("Alunos na lista da tared" + tarde.toString());
                System.out.println("Total de alunos na lista da tarde: " + tarde.tamanho());
            }

        }
        //Total de alunos matriculados nas duas turmas 
        System.out.println("-----------------------------------------------------------");
        System.out.println("Total de alunos na lista da manha: " + manha.tamanho());
        System.out.println("Total de alunos na lista da tarde: " + tarde.tamanho());
    }
}
