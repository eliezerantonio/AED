/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDadosPilha.labs;

import SuperClass.EstruturaEstatica;

/**
 *
 * @author hp
 * @param <T>
 */
public class Pilha <T> extends EstruturaEstatica<T>{
    //criando os construtores que chama a superClass
    //se noa for indicado um valor inicia o construtor com 10
    public Pilha(){
        super();
    }
    public Pilha(int capacidade){
        super(capacidade);
    }
    //metodo para empilhar ou adicionar
    public void empilhar(T elemento){
        //usar o metodo adiciona que foi usado na classe EstruturaEstatica no caso a superClass
        super.adicionar(elemento);
    }
    //verifica se a pilha esta viaz. xer siperClass
    //verificar o ultimo elemento da pilha
    public T topo(){
        //verificar se a pilha ta vizia
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[tamanho-1];
    }
    public T desempilha(){
        //verifica se a pilha esta vazia
        if (this.estaVazia()) {
            return null;
            
        }
       /* T elemento = this.elementos[tamanho-1];
        tamanho--;
        return elemento;*/
        return this.elementos[--tamanho];
    }
}
