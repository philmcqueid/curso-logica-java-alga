import java.util.Scanner;

public class AterandoValorVariavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite o tipo de pagamento [1 = à vista /2 = à prazo]");
        Integer tipoDePagamento = scanner.nextInt();

        Boolean pagamentoAVista = tipoDePagamento.equals(1);

        Double juros = 0.0;

        if (!pagamentoAVista) {
            juros = 10.0;
        }

        Double acrescimo = valorProduto * juros / 100;

        Double valorTotal = valorProduto + acrescimo;

        System.out.println("Valor final: " + valorTotal);

        scanner.close();
    }
}
