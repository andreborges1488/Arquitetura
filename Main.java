import java.util.Scanner;
import arquitetura.Produto;

public class Main {
    public static void main(String[] args) {
        int num, codigo;
        String nome;
        Scanner leia = new Scanner(System.in);
        Produto novoProduto = new Produto();

        do {
            System.out.println("1 - Cadastro de Produtos");
            System.out.println("2 - Entrada de Produtos");
            System.out.println("3 - Saída de Produtos");
            System.out.println("4 - Consultar");

            num = leia.nextInt();
            leia.nextLine();

            switch (num) {
                case 1:
                    System.out.println("Código: ");
                    codigo = leia.nextInt();
                    System.out.println("Nome: ");
                    nome = leia.nextLine();

                    novoProduto = new Produto(codigo, nome);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                   
                    break;

                case 3:
                  
                    break;

                case 4:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (num != 4);
    }
}