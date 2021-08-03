import java.util.Scanner;

public class CalcularIndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você irá calcular seu imc");

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        scanner.close();
    }
}
