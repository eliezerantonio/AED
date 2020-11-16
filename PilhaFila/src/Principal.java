
import EstruturaDadosPilha.labs.Pilha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class Principal {

    public static void main(String[] args) {
        //classe que representa o tipo primitivo do java
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println("Numero inicial de elemeto no vetor:" + pilha);
        System.out.println("Capacidade inicial da pilha:" + pilha.tamanho());

        //verificar se esta vazia
        System.out.println("Pilha vazia: 0:" + pilha.estaVazia());
        //adicionar
        for (int i = 1; i <= 10; i++) {
            pilha.empilhar(i);
        }
        System.out.println("Elementos da pilha:" + pilha);
        System.out.println("Capacidade da pilha:" + pilha.tamanho());

        //verifica se esta, aqui da falso porque a pilha ja preenchida
        System.out.println("Pilha vazia: /#0" + pilha.estaVazia());

        pilha.empilhar(2);

        //verifica se esta vazia
        System.out.println("Pilha vazia: 0:" + pilha.estaVazia());
        //adicionar
        for (int i = 1; i <= 15; i++) {
            pilha.empilhar(i);

        }

        System.out.println("Elemento da pilha:" + pilha);
        System.out.println("Capacidade da pilha:" + pilha.tamanho());

        //verifica se esta vazia, qui da falso porque a pilha ja ta preenchida
        System.out.println("Pilha vazia: /#0:" + pilha.estaVazia());

        pilha.empilhar(2);
        pilha.empilhar(5);
        pilha.empilhar(3);
        
        System.out.println("Elementos na pilha:" + pilha);
        System.out.println("Capacidade da pilha:" + pilha.tamanho());

        System.out.println("Elemento do topo da pilha:" + pilha.topo());

        System.out.println("Elemento retirado:" + pilha.desempilha());

        System.out.println("Elemento na pilha:" + pilha);
        System.out.println("Capacidade da pilha:" + pilha.tamanho());
        
        
        
        
        

    }
}
