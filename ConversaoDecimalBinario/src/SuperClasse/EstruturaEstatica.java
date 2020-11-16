
package SuperClasse;


//criar um tipo de dado generico para a class
public class EstruturaEstatica<T> {
    protected T[] elementos;//armazena os elementos do vector
    protected int tamanho;// armazena o tamanho do vector
    
    //construtor que recebe elementos a nossa escolha
    
    public EstruturaEstatica(int capacidade){
    this.elementos= (T[]) new Object[capacidade];
    this.tamanho=0;
    }
    //construtor que recebe elementos predefinidos
    public EstruturaEstatica(){
    this(10);
    }
    
    //Metodos para adicionar
//Metodo que verifica a quantidade de elementos na pilha e adiciona no final
    protected  boolean adicionar(T elemento){
    this.aumentaCapacidade();
    if(this.tamanho<this.elementos.length){
    this.elementos[this.tamanho]=elemento;
    this.tamanho++;
    return true;
    }
    return false;
    }
    //Metodo que adiciona elemento na pilha verificando a primeira posição
    protected boolean adicionar(int posicao,T elemento){
    //verificar a posição
        if(!(posicao>=0 && posicao<tamanho)){
        throw new IllegalArgumentException("Posição invalida"); 
        }
        this.aumentaCapacidade();
        for(int i=this.tamanho-1;i>=posicao;i--){
            this.elementos[i+1]=this.elementos[i];
        }
        this.elementos[posicao]=elemento;
        this.tamanho++;
        return true;
        
    }
    //Metodo para aumentar a capacidade da pilha
    protected void aumentaCapacidade(){
    if(this.tamanho==this.elementos.length){
    T[] elementosNovos=(T[])new Object[this.elementos.length*2];
    for(int i=0; i<this.elementos.length; i++){
    elementosNovos[i]=this.elementos[i];
   
    }
    this.elementos=elementosNovos;
    }
    }
    //Metodo para verificar o tamanho da pilha
    public int tamanho(){
    return this.tamanho;
    }
    //Metodo para verificar se a pilha esta vazia
    public boolean estaVazia(){
    return tamanho==0;
    }
            
            
            
    //Metodo toString
    public String toString(){
    StringBuilder s= new StringBuilder();
    s.append("[");
    for(int i=0; i<this.tamanho-1;i++){
    s.append(this.elementos[i]);
    s.append(",");
    }
    if(this.tamanho>0){
    s.append(this.elementos[this.tamanho-1]);
    }
    s.append("]");
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
