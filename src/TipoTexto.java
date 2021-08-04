import java.util.Scanner;

public class TipoTexto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String surname = scanner.nextLine();

        System.out.println("Olá, " + name + " " + surname);

        scanner.close();

    }
}
