import java.util.Scanner;

public class Main {

    static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Fibanocci Serisinde Bumak İstediğiniz Basamağı Giriniz : ");
        int number = input.nextInt();

        System.out.printf("%d. Basamakta %d Sayısı Bulunuyor.", number, fib(number));

    }
}
