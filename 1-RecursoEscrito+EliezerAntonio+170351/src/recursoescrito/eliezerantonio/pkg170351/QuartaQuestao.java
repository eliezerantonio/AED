/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoescrito.eliezerantonio.pkg170351;

import EstruturaDeDadosfila.Fila;

/**
 *
 * @author eliezer
 */
public class QuartaQuestao {

    public static void main(String[] args) {
        Fila<Integer> filaParaAutocarro = new Fila<>();

        filaParaAutocarro.empilhar(21);
        filaParaAutocarro.empilhar(12);
        filaParaAutocarro.empilhar(2);
        filaParaAutocarro.empilhar(4);
        filaParaAutocarro.empilhar(1);

        System.out.println("Total de Elementos : " + filaParaAutocarro.tamanho());
        System.out.println("alunos organizados em ordem de chegada(): " + filaParaAutocarro.toString());
        System.out.println("Aluno entrou: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Alunos da fila do autocarro: " + filaParaAutocarro.tamanho());
        System.out.println("PRIMERO ALUNO ENTROU NO AUTOCARRO, AGORA FICAMOS COM 4 ELEMENTOS NA FILA");
        System.out.println("1-------------------------------------------------------------");

        System.out.println("Total de alunos na fila: " + filaParaAutocarro.tamanho());
        System.out.println("temos 4 elemementos na fila ");
        System.out.println("alunos organizados em ordem de chegada: " + filaParaAutocarro.toString());
        System.out.println("Aluno entrou: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Total de alunos na fila: " + filaParaAutocarro.tamanho());
        System.out.println("PRIMERO ALUNO ENTROU NO AUTOCARRO, AGORA FICAMOS COM 3 ELEMENTOS NA FILA");
        System.out.println("2-------------------------------------------------------------");

        System.out.println("Total de alunos na fila: " + filaParaAutocarro.tamanho());
        System.out.println("temos 3 elemementos na fila ");
        System.out.println("alunos organizados em ordem de chegada: " + filaParaAutocarro.toString());
        System.out.println("Aluno entrou: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Total de alunos na fila: " + filaParaAutocarro.tamanho());
        System.out.println("PRIMERO ALUNO ENTROU NO AUTOCARRO, AGORA FICAMOS COM 2 ELEMENTOS NA FILA");
        System.out.println("3-------------------------------------------------------------");

        System.out.println("Total de alunos na  filaParaAutocarro: " + filaParaAutocarro.tamanho());
        System.out.println("temos 2 elemementos na fila filaParaAutocarro ");
        System.out.println("alunos organizados em ordem de chegada: " + filaParaAutocarro.toString());
        System.out.println("Aluno entrou: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Total de alunos na fila filaParaAutocarro: " + filaParaAutocarro.tamanho());
        System.out.println("PRIMERO ALUNO ENTROU NO AUTOCARRO, AGORA FICAMOS COM 1 ELEMENTOS NA FILA");
        System.out.println("4-------------------------------------------------------------");

        System.out.println("Total de alunos na filaParaAutocarro: " + filaParaAutocarro.tamanho());
        System.out.println("temos 1 elememento na  filaParaAutocarro ");
        System.out.println("alunos organizados em ordem de chegada: " + filaParaAutocarro.toString());
        System.out.println("Aluno entrou: " + filaParaAutocarro.remover());
        System.out.println("verificar o proximo aluno a entrar: " + filaParaAutocarro.verificar());
        System.out.println("Total de alunos na  filaParaAutocarro: " + filaParaAutocarro.tamanho());
        System.out.println("Alunos entram com sucesso ja nao existe elemtnos na  filaParaAutocarro");
        System.out.println("5-------------------------------------------------------------");
        System.out.println("Para resolucao do problema usei FIFO");
    }
}
