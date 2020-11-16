package EstruturaDadosPilha;

import SuperClasse.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    //Criando construtor que chama a super classe
    //Se não for indicado um valor inicia o construtor com 10
    public Pilha() {
        super();//que no caso recebe 10 como capacidade

    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    // Metodo para impilhar ou adicionar
    public void empilha(T elemento) {
        //usar o metodo adiciona que foi usADO NA CLASSE ESTRUTURA ESTATUICA NO CASO A SUPER CLASSE
        super.adicionar(elemento);
    }

    //Metodo para verificar se a pilha esta vazia. ver super classe
    //Verificar o ultimo elemento da pilha
    public T topo() {
        //Verificar se a pilha esta vazia
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    public T desempilha() {
        //Verificar se a pilha esta vazia 
        if (this.estaVazia()) {
            return null;
        }
        //T elemento = this.elementos[tamanho-1];
        //tamanho--;
        return this.elementos[--tamanho];
    }
}
