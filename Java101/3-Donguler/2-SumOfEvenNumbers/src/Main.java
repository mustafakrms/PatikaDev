import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Pozitif Tam Sayı Giriniz : ");
        number = input.nextInt();

        if (number > 0) {

            for (int i = 0; i <= number; i += 2) {
                sum += i;
            }
            System.out.println("Girilen Değerin 2 ve 4 Katlarının Toplamı : " + sum);


        } else {
            System.out.println("Pozitif Tam Sayı Girilmedi!");
        }

    }
}
