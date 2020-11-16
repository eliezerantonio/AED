/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeDadosfila;

/**
 *
 * @author hp
 */
public class FilaPrincipal {
    public static void main(String[] args) {
        //classe que representa o tipo primitivo do java
        Fila<Integer> fila = new Fila<>();
        
        //
        fila.empilhar(6);
        fila.empilhar(3);
        fila.empilhar(12);
        
        System.out.println("Fila esta vazia: " +fila.estaVazia());
        System.out.println("Tamanho da fila: " +fila.tamanho());
        System.out.println("Elemntos organizados na fila: " +fila.toString());
        
        System.out.println("Verificar proximo Elemento da fila: " + fila.verificar());
        
        System.out.println("Remover o Elemento da fila:" + fila.removerElemento());
        
         System.out.println("Fila esta vazia: " +fila.estaVazia());
        System.out.println("Tamanho da fila: " +fila.tamanho());
        System.out.println("Elemntos organizados na fila: " +fila.toString());
        
        System.out.println("Fila esta vazia: " +fila.estaVazia());
        System.out.println("Tamanho da fila: " +fila.tamanho());
        System.out.println("Elemntos organizados na fila: " +fila.toString());
        
        System.out.println("Verificar proximo Elemento da fila: " + fila.verificar());
        
        System.out.println("Remover o Elemento da fila:" + fila.removerElemento());
        
         System.out.println("Fila esta vazia: " +fila.estaVazia());
        System.out.println("Tamanho da fila: " +fila.tamanho());
        System.out.println("Elemntos organizados na fila: " +fila.toString());
        
        
        System.out.println("Fila esta vazia: " +fila.estaVazia());
        System.out.println("Tamanho da fila: " +fila.tamanho());
        System.out.println("Elemntos organizados na fila: " +fila.toString());
        
        System.out.println("Verificar proximo Elemento da fila: " + fila.verificar());
        
        System.out.println("Remover o Elemento da fila:" + fila.removerElemento());
        
         System.out.println("Fila esta vazia: " +fila.estaVazia());
        System.out.println("Tamanho da fila: " +fila.tamanho());
        System.out.println("Elemntos organizados na fila: " +fila.toString());
    }
    
}
