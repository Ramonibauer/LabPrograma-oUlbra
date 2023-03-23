import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = false;
        System.out.print("Digite um número positivo: ");
        int number = input.nextInt();

        for(int i = 0; i <= number; ++i) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
