import java.util.Scanner;

public class ExQuadraNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número para calcular o quadrado: ");
        int numeroEscolhido = scanner.nextInt();

        int quadrado = numeroEscolhido * numeroEscolhido;

        System.out.println("O quadrado de " + numeroEscolhido + " é: " + quadrado);
    }
}
