import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();

        if (isPrimeNumber(number, number)) {
            System.out.println(number + " Sayısı ASALDIR.");
        } else {
            System.out.println(number + " Sayısı ASAL DEĞİLDİR.");
        }

    }

    static boolean isPrimeNumber(int number, int counter) {
        counter--;
        if (counter > 1) {
            if (number % counter == 0) {
                return false;
            } else {
                return isPrimeNumber(number, counter);
            }
        } else {
            return true;
        }


    }
}
