import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Qual o valor do seu produto? ");
        Double valorUsuario = scanner.nextDouble();


        System.out.print("Qual a quantidade? ");
        Integer quantidadeProduto = scanner.nextInt();

        Double valotTotalProduto = valorUsuario * quantidadeProduto;

        Double desconto = 0.0;

        if (quantidadeProduto > 10) {
            desconto = 0.10;
        }

        Double valorDesconto = valotTotalProduto * desconto;

        Double valorFinal = valotTotalProduto - valorDesconto;

        System.out.println("Você pagará: " + valorFinal);

        scanner.close();
    }
}
