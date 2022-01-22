import java.util.Scanner;

public class Main {

    static boolean isPolindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();

        if (isPolindrom(number))
            System.out.println("Girdiğiniz Sayı Polindrom Sayıdır.");
        else
            System.out.println("Gidiğiniz Sayı Polindrom Sayı Değildir!");


    }
}
