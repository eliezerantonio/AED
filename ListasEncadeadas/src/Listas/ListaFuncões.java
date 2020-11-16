package Listas;

/**
 *
 * @author eliezer
 */
public class ListaFuncões {

    private NoPessoa primeiro;
    private NoPessoa ultimo;

    //criando os metodos 
    //1. Metodo para comecar/inicializar a lista
    public void inicializarLista(NoPessoa noPessoa) {
        System.out.println("Lista iniciada.");

        setPrimeiro(noPessoa);
        setUltimo(getPrimeiro());
    }

    //2. Metodo para adicionar elemento na lista - Adicionar no Inicio
    public void adicionarInicio(NoPessoa noPessoa) {
        //verificar se a lista esta preenchida ou ja foi iniciada
        if (getPrimeiro() == null) {
            inicializarLista(noPessoa);
        } else {// se a lista ja esiver inicializada
            noPessoa.setProximo(getPrimeiro());
            setPrimeiro(noPessoa);//aqui adiciona o novo elemento na lista
        }
    }

    //3. Metodo para adicionar elemento na lista - Adicionar no Fim
    public void adicionarFim(NoPessoa noPessoa) {
        if (getPrimeiro() == null) {
            inicializarLista(noPessoa);
        } else {
            getUltimo().setProximo(noPessoa);
            noPessoa = getUltimo();
        }
    }

    //4. metodo para Imprimir os elementos da lista
    public void imprimirLista() {
        System.out.println("Elementos existentes na lista");
        NoPessoa aux = getPrimeiro();
        boolean lop = true;

        while (lop) {
            System.out.println(aux.getNome());
            //verificar se o a variavel aux (reserva) aponta para ele mesmo ou se aponta para o proxima
            if (aux.getProximo() != null) {
                aux = aux.getProximo();
            } else {
                return;
            }
        }
    }

    //5.Metodo para contar os elementos existentes na lista
    public int totalItensLista() {
        System.out.println("Total de elementos da lita");
        int total = 0;
        //verificar se a lista esta vazia
        if (getPrimeiro() != null) {
            NoPessoa aux = getPrimeiro();
            boolean lop = true;
            while (lop) {
                total++;
                if (aux.getProximo() != null) {
                    aux = aux.getProximo();
                } else {
                    return total;
                }
            }
        }
        return total;
    }

    //6.  System.out.println("Total de elementos da lita");
    public void removerItemInico() {
        System.out.println("Remover elemento no inicio");
        NoPessoa aux = new NoPessoa();

        aux.setProximo(primeiro.getProximo()); //COlocar aux na posicao proximo
        primeiro.setProximo(null);// removendo Item anterior
        //definindo o Proximo elemtno partindo d axiliar
        primeiro = aux.getProximo();
        aux = null;

    }

    // 7. removr itemFim
    public void removerItemFim() {
        NoPessoa aux = new NoPessoa();
        aux = primeiro;

        //verficando de o auxiliar na posicao proximo for null, se for nulo vai ser ultimo
        //percorrendo a lista ate achar o penultimo intem da lista
        for (int i = 0; i < totalItensLista(); i++) {
            //verficar
            if (aux.getProximo().getProximo() != null) {// verificar se o aux e ultimo
                aux = aux.getProximo(); // O AUX VAI RECEBER A POSICAO
            } else {
                ultimo = aux; // ultimo APonta para auxiliar
                ultimo.setProximo(null);// se o  ultimo for null TERMINA

                return;
            }

        }

    }

    // 8. Adicionar Posiciao
    public void adicionarPorPosicao(int posicao, NoPessoa novoNo) {
        NoPessoa aux = primeiro;
        //Verficar a posiao do Igual a zero adicionar no inico
        if (posicao == 0) {
            adicionarInicio(novoNo);

        } else if (posicao == totalItensLista()) {// se for total de itens adiconar no fim
            adicionarFim(novoNo);

        } else if (posicao < 0 || posicao > totalItensLista()) {// se for 0 ou maior que o que xiste  na lista nao vai adiconar 
            System.out.println("Posicao Invalida");
            return;

        } else {
            //suponde que desejamos adiconar a posicao 2 
            posicao--; //decremento para cehgar na psociao anteriro
            // quando passar  o decremento vai fiar posicao 1
            //adiconar por posicao
            // Percorrer lista 

        }
    }
    //9- Remover por posicao

    public void removerPorPosicao(int posicao) {
        NoPessoa aux = primeiro;
        if (posicao == 0) {
            removerItemInico();

        } else if (posicao == totalItensLista()) {

            removerItemFim();

        } else if (posicao < 0 || posicao > totalItensLista()) {
            System.out.println("posicoao invalida");
            return;
        } else {

        }
    }

    /**
     * @return the primeiro
     */
    public NoPessoa getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(NoPessoa primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return the ultimo
     */
    public NoPessoa getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NoPessoa ultimo) {
        this.ultimo = ultimo;
    }

}
