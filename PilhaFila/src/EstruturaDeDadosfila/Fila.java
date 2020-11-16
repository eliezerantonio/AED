/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeDadosfila;

import SuperClass.EstruturaEstatica;

/**
 *
 * @author hp
 */
public class Fila <T> extends EstruturaEstatica<T>{
    //criar o metodo construtor
    public Fila(){
        super();
    }
    public Fila(int capacidade){
        super(capacidade);
    }
     //metodo para empilhar ou adicionar elemento na fila
    public void empilhar(T elemento){
        //usar o metodo adiciona que foi usado na classe EstruturaEstatica no caso a superClass
        super.adicionar(elemento);
    }
    //verifica se a pilha esta viaz. xer siperClass
    //verificar o ultimo elemento da pilha
    public T verificar(){
        //verificar se a pilha ta vizia
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[tamanho-1];
    }
      public T removerElemento(){
        //verifica se a fila esta vazia
        if (this.estaVazia()) {
            return null;
            
        }
       /* T elemento = this.elementos[tamanho-1];
        tamanho--;
        return elemento;*/
        return this.elementos[tamanho--];
    }
}
