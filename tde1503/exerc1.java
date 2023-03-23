import java.util.Scanner;

    public class exerc1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int soma = 0;
            int i = 0;
            System.out.print("Digite um número inteiro positivo: ");

            int numero;
            for(numero = input.nextInt(); i <= numero; ++i) {
                soma += i;
            }

            System.out.println("A soma dos números naturais até" + numero + " são: " + soma);
        }
    }

}
