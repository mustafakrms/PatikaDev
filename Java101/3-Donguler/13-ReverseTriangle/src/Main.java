import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif Tam Sayı Giriniz : ");
        int number = input.nextInt();

        if (number > 0) {
            //Satır Sayısı
            for (int i = 1; i <= number; i++) {

                //Boşluk Bırakan Döngü
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                //Yıldız Bırakan Döngü
                for (int k = 0; k < (2 * (number - i)) + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } else {
            System.out.println("Hatalı Değer Girdiniz!");
        }
    }
}
