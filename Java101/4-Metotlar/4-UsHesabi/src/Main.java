import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değer Giriniz : ");
        int number = input.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int expo = input.nextInt();

        int total = 1;
        int result = exponentialNumber(number, expo, total);
        System.out.println(number + "^" + expo + " = " + result);

    }

    static int exponentialNumber(int number, int expo, int total) {
        expo--;
        if (expo >= 0) {
            total *= number;
            return exponentialNumber(number, expo, total);
        }
        return total;
    }
}
