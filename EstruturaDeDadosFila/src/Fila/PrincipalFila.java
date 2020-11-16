/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

/**
 *
 * @author eliezer
 */
public class PrincipalFila {



    public static void main(String [] args){
        
      Fila<Integer> fila = new Fila <>();
      
      //metdodo adicionar
      fila.adicionar(6);
      fila.adicionar(5);
      fila.adicionar(2);
      
        System.out.println("Fila esta vazia?" + fila.EstaVazia);
        System.out.println("Tamanh da fila"+fila.Tamanho);
        System.out.println("Elementos no vector organuzado"+fila.ToString());
        System.out.println("Proximo elemento da fila"+ fila.verficar());
              
    
    }

}
