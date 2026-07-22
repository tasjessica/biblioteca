package biblioteca;
import java.util.ArrayList;
//classe que vai gerenciar a coleçáo de estoque
//guarda a lista de produtos e vai concentrar todas as ações
//(adicionar, listar, buscar, remover) que mexem nessa lista
public class Estoque {
    //lista que armazena todos os produtos cadastrados no sistema. começa vazia e é inicializada no construtor
    private ArrayList<Produto> produtos;
    //construtor: roda quando criamos um novo Estoque (new Estoque()).
    public Estoque(){
        produtos = new ArrayList<>();
    }
    //cria um novo Produto com os dados recebidos e adiciona na lista de estoque
    public void adicionarProduto(String livro, int quantidade, double valor) {
        Produto produto = new Produto(livro, quantidade, valor);
        produtos.add(produto);
    }

    // aqui usamos os getters do produto pra imprimir os dados
    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Livro: " + produto.getLivro() + " | Quantidade: " + produto.getQuantidade() + " | Valor: " + produto.getValor());
        }
    }

    public Produto buscarProduto(String nomeBuscado){
        for (Produto produto : produtos){
            if (produto.getLivro().equals(nomeBuscado)){
                return produto;
            }
        }
        return null;
    }

    public void atualizarQuantidade(String nomeBuscado, int novaQuantidade){
        Produto produto = buscarProduto(nomeBuscado);
        if (produto != null){
            produto.setQuantidade(novaQuantidade);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void removerProduto(String nomeBuscado){
        Produto produto = buscarProduto(nomeBuscado);
        if (produto != null){
            produtos.remove(produto);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
