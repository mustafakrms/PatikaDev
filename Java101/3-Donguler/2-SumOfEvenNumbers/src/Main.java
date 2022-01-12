import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, sum = 0;


        do {
            System.out.print("Pozitif Sayı Giriniz : ");
            number = input.nextInt();
            if (number % 4 == 0 && number > 0) {
                sum += number;
            }

        } while (number % 2 == 0);
        System.out.println("Girilen sayılardan 2 ve 4 katı olanların toplamı = " + sum);

    }
}
