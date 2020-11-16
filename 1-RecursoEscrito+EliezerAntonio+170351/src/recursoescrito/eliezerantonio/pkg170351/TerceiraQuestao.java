/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoescrito.eliezerantonio.pkg170351;

import java.util.Stack;

/**
 *
 * @author eliezer
 */
public class TerceiraQuestao {

    public static void main(String[] args) {
        Stack<Cliente> pilha = new Stack<Cliente>();

        Cliente cliente = new Cliente("Eliezer Antonio", "Toyota", 1);
        Cliente cliente2 = new Cliente("Angela Vasco", "Hiundai", 2);
        Cliente cliente3 = new Cliente(" Catarina ", "Toyota", 3);
        Cliente cliente4 = new Cliente("Andreia ", "Hiundai", 4);
        Cliente cliente5 = new Cliente("Eliany", "Mitsubish", 5);

        System.out.println("Pilha de livro criada, pilha vazia? " + pilha.isEmpty());

        //Mensagem de livros na pilha
        System.out.println("Empilhando livros na pilha:");

        //empilhando os livros na pilha
        pilha.push(cliente);
        pilha.push(cliente2);
        pilha.push(cliente3);
        pilha.push(cliente4);
        pilha.push(cliente5);

        System.out.println(pilha.size() + " todos os carros  entraram ");
        System.out.println(pilha);

        //Mostra que de novo esta vazia
        
        System.out.println("---------------------------------------------");
        System.out.println("Verificando se o estacionamento esta vazio " + pilha.isEmpty());
        System.out.println("---------------------------------------------");

        //Aqui espiei o topo da pilha
        
        System.out.println("Espiando o ultimo a chegar: " + pilha.peek());
        System.out.println("--------------------------------------------");
        System.out.println("Retirando os automoveis do estacionamento usando a regra"
                + "o Ultimo e entrar é primeiro a :");
 
        System.out.println("Retirando:");
        //Metodo para desempilhar o topo da pilha atravez o metodo desempilha
        while (!pilha.isEmpty()) {
            System.out.println("Retirando carros: " + pilha.pop().toString());
        }

        //Aqui verifiquei de novo se esta vazia pra ter certeza
        System.out.println("Todos os carros sairam sem acindente nem um , Estacionamento vazio: " + pilha.isEmpty());
        System.out.println("Para resolucao do problema usei LIFO");

    }
    

}


