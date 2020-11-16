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
public class NoPaises {

    private String nome;
    private NoPaises Proximo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NoPaises getProximo() {
        return Proximo;
    }

    public void setProximo(NoPaises Proximo) {
        this.Proximo = Proximo;
    }

}
