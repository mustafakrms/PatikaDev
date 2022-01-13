import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        int count = input.nextInt();
        int maxNumber = 0, minNumber = 0, value;

        //adet sayısının negatitif olmaması durumunu sorgulama
        if (count > 0) {
            for (int i = 1; i <= count; i++) {
                System.out.printf("%d. Sayıyı Giriniz : ", i);
                value = input.nextInt();
                if (i == 1) {
                    maxNumber = value;
                    minNumber = value;
                } else if (maxNumber < value) {
                    maxNumber = value;
                } else if (minNumber > value) {
                    minNumber = value;
                }

            }

            System.out.printf("Girilen Sayılardan En Büyüğü : %d", maxNumber);
            System.out.printf("\nGirilen Sayılardan En Küçüğü : %d", minNumber);


        } else {
            System.out.println("Hatalı Değer Girdiniz!");
        }


    }
}
