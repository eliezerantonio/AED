/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasencadeadoscompaises;

/**
 *
 * @author eliezer
 */
public class ListasEncadeadosComPaises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcoes lista = new Funcoes();
        
        NoPaises pais = new NoPaises();
        NoPaises pais2 = new NoPaises();
        NoPaises pais3 = new NoPaises();
        
        pais.setNome("Angola");
        pais2.setNome("França");
        pais3.setNome("Brasil");
        
        lista.adicionarInicio(pais2);
        lista.adicionarInicio(pais3);
        lista.adicionarInicio(pais);
        lista.imprimir();
    }
    
}
