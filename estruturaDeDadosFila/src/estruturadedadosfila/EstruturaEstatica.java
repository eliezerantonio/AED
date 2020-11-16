/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedadosfila;

/**
 *
 * @author eliezer
 */
public class EstruturaEstatica<T> {

    protected T[] elementos;// armazena os elementos vetor
    protected int tamanho;// armazena o tamanho do vetor

    // constrtor  que recebe elementos a nossa escolha
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //construtor que recebe elemtnos predifinidos
    public EstruturaEstatica() {
        this(10);
    }

    // Metodo para adicionar
    //metdodo que verifica a quantidade de elementos na pilha eadicioan no final
    protected boolean adicionar(T elemento) {
        this.AumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

        }
        return true;
    }

    // metodo que adiciona elemtnos na pilha verficando primerio
    protected boolean adicionar(int posicao, T elemento) {
        //verificar a posicao
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao Invalida");
        }
        this.AumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    // metdodo para aumentar a capacidade da pilha
    protected void AumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {//
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    //metdodo para verificar o tamanho da pilha 
    public int tamanho() {
        return this.tamanho();
    }
    //metdo para verificar se apilha esta vazia[

    public boolean estaVazia() {
        return tamanho == 0;
    }

    //metodo ToString
    public String ToString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");

        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);

        }
        s.append(",");
        return s.toString();

    }

    protected void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posiciao Invalida");
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

}
