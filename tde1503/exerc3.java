import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = false;
        System.out.print("Digite número inteiro positivo: ");
        int number = input.nextInt();

        for(int i = 0; i <= 10; ++i) {
            System.out.println(+ number + " x " + i + "=" + number * i);
        }
    }
}
