/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeDadosfila;

/**
 *
 * @author EliezerAntonio-170351
 */
public class FilaPrincipal {

    public static void main(String[] args) {
        //classe que representa o tipo primitivo do java
        Fila<Integer> filaParaAutocarro = new Fila<>();

        // entra de 5 alunos em uma fila
        filaParaAutocarro.empilhar(5);
        filaParaAutocarro.empilhar(6);
        filaParaAutocarro.empilhar(7);
        filaParaAutocarro.empilhar(8);
        filaParaAutocarro.empilhar(9);
        System.out.println("/////////////////////////");
        System.out.println("Total de alunos na fila: " + filaParaAutocarro.tamanho());
        System.out.println("temos 5 elemementos na fila ");
        System.out.println("alunos organizados em ordem de chegada(): " + filaParaAutocarro.toString());
        System.out.println("Aluno atendido: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Alunos da fila do autocarro: " + filaParaAutocarro.tamanho());
        System.out.println("PRIMERO ALUNO ENTROU NO AUTOCARRO, AGORA FICAMOS COM 4 ELEMENTOS NA FILA");
        System.out.println("/////////////////////////");
        System.out.println("");

        System.out.println("Total de alunos na fila: " + filaParaAutocarro.tamanho());
        System.out.println("temos 4 elemementos na fila ");
        System.out.println("alunos organizados em ordem de chegada: " + filaParaAutocarro.toString());
        System.out.println("Aluno atendido: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Total de alunos na fila: " + filaParaAutocarro.tamanho());
        System.out.println("PRIMERO ALUNO ENTROU NO AUTOCARRO, AGORA FICAMOS COM 3 ELEMENTOS NA FILA");

        System.out.println("");
        System.out.println("/////////////////////////");

        System.out.println("Total de alunos na fila: " + filaParaAutocarro.tamanho());
        System.out.println("temos 3 elemementos na fila ");
        System.out.println("alunos organizados em ordem de chegada: " + filaParaAutocarro.toString());
        System.out.println("Aluno atendido: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Total de alunos na fila: " + filaParaAutocarro.tamanho());
        System.out.println("PRIMERO ALUNO ENTROU NO AUTOCARRO, AGORA FICAMOS COM 2 ELEMENTOS NA FILA");
        System.out.println("/////////////////////////");
        System.out.println("");

        System.out.println("Total de alunos na  filaParaAutocarro: " + filaParaAutocarro.tamanho());
        System.out.println("temos 2 elemementos na fila filaParaAutocarro ");
        System.out.println("alunos organizados em ordem de chegada: " + filaParaAutocarro.toString());
        System.out.println("Aluno atendido: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Total de alunos na fila filaParaAutocarro: " + filaParaAutocarro.tamanho());
        System.out.println("PRIMERO ALUNO ENTROU NO AUTOCARRO, AGORA FICAMOS COM 1 ELEMENTOS NA FILA");
        System.out.println("/////////////////////////");
        System.out.println("");
        System.out.println("Total de alunos na filaParaAutocarro: " + filaParaAutocarro.tamanho());
        System.out.println("temos 1 elememento na  filaParaAutocarro ");
        System.out.println("alunos organizados em ordem de chegada: " + filaParaAutocarro.toString());
        System.out.println("Aluno atendido: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Total de alunos na  filaParaAutocarro: " + filaParaAutocarro.tamanho());
        System.out.println("Alunos entram com sucesso ja nao existe elemtnos na  filaParaAutocarro");

        System.out.println("Para resolucao do problema usei FIFO");
    }

}
