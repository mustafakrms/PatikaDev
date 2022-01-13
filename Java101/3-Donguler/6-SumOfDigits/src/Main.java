import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //   # Bir sayının basamak sayılarının toplamını hesaplayan program


        Scanner input = new Scanner(System.in);
        int number, tempNumber, sum = 0;

        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        tempNumber = number;
        while (tempNumber != 0) {
            sum += (tempNumber % 10);
            tempNumber /= 10;
        }
        System.out.printf("%d Sayısının Basamak Sayılarının Toplamı : %d", number, sum);

    }
}
