package biblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        int opcao = 0;

        while (opcao != 6) {
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Atualizar quantidade");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");
            opcao = scanner.nextInt();
        }


    }
}