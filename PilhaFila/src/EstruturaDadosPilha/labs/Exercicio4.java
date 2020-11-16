package EstruturaDadosPilha.labs;

import java.util.Stack;

/**
 *
 * @author lourinhomassala
 */
public class Exercicio4 {

    public static void main(String[] args) {

        //Pilha com capacidade de 20 livros
        Stack<Livro> pilha = new Stack<Livro>();

        //Instanciando livro 1 na pilha
        Livro livro1 = new Livro();

        //Adicionando livro 1 na pilha
        livro1.setNome("A Jornada do Empreendedor");
        livro1.setAutor("Adriano Almeida & Vivian Matsui");
        livro1.setAnoLancamento(2016);
        livro1.setISBN(978 - 85 - 5519 - 201 - 2);

        //Instanciando livro 2 na pilha
        Livro livro2 = new Livro();

        //Adicionando livro 2 na pilha
        livro2.setNome("Xamarim Forms");
        livro2.setAutor("Adriano Almeida & Vivian Matsui");
        livro2.setAnoLancamento(2016);
        livro2.setISBN(978 - 85 - 5519 - 240 - 1);

        //Instanciando livro 3 na pilha
        Livro livro3 = new Livro();

        //Adicionando livro 3 na pilha
        livro3.setNome("Java Como Programar");
        livro3.setAutor("Paul Deitel e Harvey Deitel");
        livro3.setAnoLancamento(2017);
        livro3.setISBN(978 - 85 - 4301 - 905 - 5);

        //Instanciando livro 4 na pilha
        Livro livro4 = new Livro();

        //Adicionando livro 4 na pilha
        livro4.setNome("Morri Para Viver");
        livro4.setAutor("Andressa Urach");
        livro4.setAnoLancamento(2015);
        livro4.setISBN(978 - 85 - 422 - 0534 - 3);

        //Instanciando livro 5 na pilha
        Livro livro5 = new Livro();

        //Adicionando livro 5 na pilha
        livro5.setNome("Ensaboado & Enxaguado");
        livro5.setAutor("Jose Carlos de Almeida");
        livro5.setAnoLancamento(2011);
        livro5.setISBN(978 - 972 - 592 - 8434 - 12 - 0);

        //Instanciando livro 6 na pilha
        Livro livro6 = new Livro();

        //Adicionando livro 6 na pilha
        livro6.setNome("Algoritmos em Java");
        livro6.setAutor("Adriano Almeida & Vivian Matsui");
        livro6.setAnoLancamento(2017);
        livro6.setISBN(978 - 85 - 5519 - 243 - 2);

        //Metodo que testa se a pilha esta vazia
        System.out.println("Pilha de livro criada, pilha vazia? " + pilha.isEmpty());

        //Mensagem de livros na pilha
        System.out.println("Empilhando livros na pilha:");

        //empilhando os livros na pilha
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        pilha.push(livro6);

        //Aqui verifiquei o tamanho utilizando o toString
        System.out.println(pilha.size() + " livros foram empilhados");
        System.out.println(pilha);

        //Mostra que de novo esta vazia
        System.out.println("Pilha de livro criada, pilha vazia? " + pilha.isEmpty());

        //Aqui espiei o topo da pilha
        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desemplhando livros da pilha:");

        //Metodo para desempilhar o topo da pilha atravez o metodo desempilha
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livros: " + pilha.pop());
        }

        //Aqui verifiquei de novo se esta vazia pra ter certeza
        System.out.println("Todos os livros foram desempilhandos, pilha vazia: " + pilha.isEmpty());

    }
}
