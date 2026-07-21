package biblioteca;
//só um molde, representando UM livro e sem nenhuma lógica de estoque
public class Produto {
    private String livro;
    private int quantidade;
    private double valor;

    public Produto (String livro, int quantidade, double valor){
        this.livro = livro;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
