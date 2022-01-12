import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0, count = -1, number;

        System.out.print("Pozitif Tam Sayı Giriniz : ");
        number = input.nextInt();

        if (number > 0) {

            for (int i = 0; i <= number; i += 12) {

                sum += i;
                count++;

            }

            if (count == 0) {
                System.out.println("Girilen Değerin 3'e ve 4'e Bölümü yoktur");
            } else {
                int average = sum / count;
                System.out.println("Girilen Sayının 3'e ve 4'e Ortak Bölümünün ortalaması : " + average);
            }


        } else {
            System.out.println("Pozitif Tam Sayı Girilmedi!");
        }

    }
}
