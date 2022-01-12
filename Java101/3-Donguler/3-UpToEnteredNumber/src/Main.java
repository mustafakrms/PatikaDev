import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sınır Sayısını Giriniz : ");
        number = input.nextInt();

        System.out.println("4'ün katı Olanlar");
        System.out.println("-----------------");

        for (int i = 1; i <= number; i *= 4) {

            System.out.print(i + " - ");
        }
        System.out.println("\n-----------------");
        System.out.println("5'ün katı Olanlar");
        System.out.println("-----------------");

        for (int i = 1; i <= number; i *= 5) {
            System.out.print(i + " - ");
        }
    }
}
