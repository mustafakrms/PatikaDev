import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        //Düz Üçgen
        for (int i = 1; i <= number; i++) {

            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        //Ters üçgen
        for (int i = 1; i <= number - 1; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (number - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}