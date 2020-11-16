/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoescrito.eliezerantonio.pkg170351;

/**
 *
 * @author eliezer
 */
public class Cliente {

    private String nome;
    private String marcaViatura;
    private int numeroDeOrdem;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String marcaViatura, int numeroDeOrdem) {
        this.nome = nome;
        this.marcaViatura = marcaViatura;
        this.numeroDeOrdem = numeroDeOrdem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarcaViatura() {
        return marcaViatura;
    }

    public void setMarcaViatura(String marcaViatura) {
        this.marcaViatura = marcaViatura;
    }

    public int getNumeroDeOrdem() {
        return numeroDeOrdem;
    }

    public void setNumeroDeOrdem(int numeroDeOrdem) {
        this.numeroDeOrdem = numeroDeOrdem;
    }

    @Override
    public String toString() {
        return "\n"
                
                + "Nome: " + getNome()
                + "\nMarca da viatura : " + getMarcaViatura()
                + "\nnumero de ordem: " + getNumeroDeOrdem()
              
                ;

    }

}
