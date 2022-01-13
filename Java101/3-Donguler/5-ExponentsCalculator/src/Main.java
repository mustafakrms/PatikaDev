import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, exponent, total = 1;

        System.out.print("Üssü Alınacak Sayıyı Giriniz : ");
        number = input.nextInt();

        System.out.print("Üs Olacak Sayıyı Giriniz : ");
        exponent = input.nextInt();

        for (int i = 1; i <= exponent; i++) {

            total *= number;

        }
        System.out.printf("%d^%d = %d", number, exponent, total);

    }
}
