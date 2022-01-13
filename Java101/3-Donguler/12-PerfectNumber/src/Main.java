import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif Tam Sayı Giriniz : ");
        int number = input.nextInt();
        int sum = 0;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == (number * 2)) {
                System.out.printf("%d Sayısı Mükemmel Sayıdır.\n", number);
            } else {
                System.out.printf("%d Sayısı Mükemmel Sayı Değildir.\n", number);
            }

        } else {
            System.out.println("Hatalı Değer Girdiniz!");
        }
    }
}
