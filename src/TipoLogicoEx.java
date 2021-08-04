import java.util.Scanner;

public class TipoLogicoEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual foi a nota do aluno? ");
        Integer nota = scanner.nextInt();

        Boolean aprovado = nota >= 70;

        if (aprovado) {
            System.out.println("O aluno tirou " + nota + ". Foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado");
        }
    }
}
