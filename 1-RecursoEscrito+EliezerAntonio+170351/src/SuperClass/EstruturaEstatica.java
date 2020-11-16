package SuperClass;
//criar tipo de dados genericos para a classe

public class EstruturaEstatica<T> {

    protected T[] elementos;//armazena os elemntos do vetor
    protected int tamanho;//armazena o tamanho do vetor
    //construtor ue recebe elementos a nossa escolha

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0; 
       
    }
    //construtor que recebe elementos predefinidos

    public EstruturaEstatica() {
        this(10);
    }

    //metodo para adicionar
    /*metodo que verifica a quantidade de elementos na pilha e adicionar no final*/
    protected boolean adicionar(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiconar(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posicao invalida");

        }
        this.aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    //metodo para verificar o tamanho da pilha

    public int tamanho() {
        return this.tamanho; 
    }
    //metodo para verifica se a pilha esta vazia

    public boolean estaVazia() {
        return tamanho == 0;
    }
    
    // metodo remover
    protected  void romover(int posicao){
        if (posicao >=0 && posicao <tamanho) {
           // throw new illegal
        }
        for (int i = posicao; i < tamanho -1; i++) {
            elementos[i] = elementos[i+1]; 
        }
        tamanho--;
    }
    //Metodo ToString

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(",");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append(", ");
        return s.toString();
    }
        /*Criando o metodo para remover*/
    protected void remove (int posicao){
    if(!(posicao >=0 && posicao < tamanho)){
    throw new IllegalArgumentException ("Posição inválida");
    }
      for (int i= posicao;i<tamanho-1;i++){
      elementos[i] = elementos[i+1];
      } 
      tamanho--;
    }
  
    
}
