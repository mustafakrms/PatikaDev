import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz : ");
        int digit = input.nextInt();
        int numberOne = 0, numberTwo = 1, numberThree;

        System.out.printf("%d Basamaklı Fibanocci Serisi : ", digit);
        for (int i = 0; i < digit; i++) {

            numberThree = numberOne + numberTwo;
            System.out.printf("%d ", numberOne);
            numberOne = numberTwo;
            numberTwo = numberThree;

        }

    }
}
