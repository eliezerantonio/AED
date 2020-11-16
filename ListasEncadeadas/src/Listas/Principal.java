/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author eliezer
 */
public class Principal {
    //metodoPrincipal

    public static void main(String[] args) {
        ListaFuncões lista = new ListaFuncões();
        NoPessoa p = new NoPessoa();
        p.setNome("Eliezer");
        //adicionar o nome na Lista
        lista.adicionarInicio(p);

        NoPessoa p2 = new NoPessoa();
        p2.setNome("Vasco");
        //adicionar o nome na Lista
        lista.adicionarInicio(p2);

        NoPessoa p3 = new NoPessoa();
        p3.setNome("Gonza");
        //adicionar o nome na Lista
        lista.adicionarInicio(p3);

        NoPessoa p4 = new NoPessoa();
        p4.setNome("Ey-d");
        //adicionar o nome na Lista
        lista.adicionarInicio(p4);

        NoPessoa p5 = new NoPessoa();
        p5.setNome("Basilio");
        //adicionar o nome na Lista
        lista.adicionarFim(p5);

        lista.totalItensLista();
        //imprimir

        lista.imprimirLista();
    }
}
