public class TipoLogico {
    public static void main(String[] args) {
        boolean variavelVerdadeira = true;
        System.out.println("Variável verdadeira " + variavelVerdadeira);

        boolean variavelFalsa = false;
        System.out.println("Variável verdadeira " + variavelFalsa);

        System.out.println("--------------");

        int idade = 19;
        boolean podeTirarCarteira = idade >= 18;

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele pode tirar a carteira");
        } else {
            System.out.println("Ele é menor de idade!");
        }

    }
}
