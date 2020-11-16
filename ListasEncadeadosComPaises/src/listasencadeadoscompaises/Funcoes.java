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
public class Funcoes {

    private NoPaises primeiro;
    private NoPaises ultimo;

    public void inicilaizarLista(NoPaises noPaises) {
        System.out.println("Lista Iniaclizada");

        setPrimeiro(noPaises);
        setUltimo(getPrimeiro());

    }

    public void adicionarInicio(NoPaises noPaises) {
        if (getPrimeiro() == null) {
            inicilaizarLista(noPaises);
        } else {
            noPaises.setProximo(getPrimeiro());
            setPrimeiro(noPaises);
        }

    }

    public void imprimir() {
        System.out.println("Elementos na Lista");
        NoPaises auxiliar = getPrimeiro();
        boolean lop = true;

        while (lop) {
            System.out.println(auxiliar.getNome());
            {
                if (auxiliar.getProximo() != null) {
                    auxiliar = auxiliar.getProximo();
                } else {
                    return;
                }
            }
        }
    }

    public NoPaises getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoPaises primeiro) {
        this.primeiro = primeiro;
    }

    public NoPaises getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoPaises ultimo) {
        this.ultimo = ultimo;
    }

}
