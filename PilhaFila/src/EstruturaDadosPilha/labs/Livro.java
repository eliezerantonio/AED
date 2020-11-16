package EstruturaDadosPilha.labs;

public class Livro {

    private String Nome;
    private String Autor;
    private int AnoLancamento;
    private int ISBN;

    //Aqui criei o construtor da super class de forma vazia
    public Livro() {
        super();
    }

    //Aqui criei os construtores com todos os campos
    public Livro(String Nome, String Autor, int AnoLancamento, int ISBN) {
        this.Nome = Nome;
        this.Autor = Autor;
        this.AnoLancamento = AnoLancamento;
        this.ISBN = ISBN;
    }

    //Aqui criei os get e set para todos atributos
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAnoLancamento() {
        return AnoLancamento;
    }

    public void setAnoLancamento(int AnoLancamento) {
        this.AnoLancamento = AnoLancamento;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Livro{" + "Nome=" + Nome
                + ", Autor=" + Autor
                + ", AnoLancamento="
                + AnoLancamento
                + ", ISBN=" + ISBN + '}';
    }

}
