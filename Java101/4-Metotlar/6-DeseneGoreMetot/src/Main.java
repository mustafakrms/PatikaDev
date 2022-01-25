import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        patternMethod(number, number, false);
    }

    static int patternMethod(int number, int temp, boolean isState) {

        if (number > 0 && !(isState)) {
            System.out.print(number + " ");
            number -= 5;
            patternMethod(number, temp, false);

        } else if (temp >= number) {
            System.out.print(number + " ");
            number += 5;
            patternMethod(number, temp, true);
        }
        return 1;

    }
}
