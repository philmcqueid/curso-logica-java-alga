import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite o valor do cliente: ");
        Double valorPassadoPeloCliente = scanner.nextDouble();

        Double resultado = valorPassadoPeloCliente - valorProduto;

        System.out.println("Seu troco é: " + resultado);

        scanner.close();
    }
}
