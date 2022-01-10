import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOne, numberTwo, numberThree;

        System.out.print("1. Sayıyı Giriniz : ");
        numberOne = input.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        numberTwo = input.nextInt();

        System.out.print("3. Sayıyı Griniz : ");
        numberThree = input.nextInt();

        if ((numberOne < numberTwo) && (numberOne < numberThree)) {
            if (numberTwo < numberThree) {
                System.out.println("Sayıların Küçükten Büyüğe Sırlanışı : " + numberOne + " < " + numberTwo + " < " + numberThree);
            } else {
                System.out.println("Sayıların Küçükten Büyüğe Sırlanışı : " + numberOne + " < " + numberThree + " < " + numberTwo);
            }
        } else if ((numberTwo < numberOne) && (numberTwo < numberThree)) {
            if (numberOne < numberThree) {
                System.out.println("Sayıların Küçükten Büyüğe Sırlanışı : " + numberTwo + " < " + numberOne + " < " + numberThree);
            } else {
                System.out.println("Sayıların Küçükten Büyüğe Sırlanışı : " + numberTwo + " < " + numberThree + " < " + numberOne);
            }
        } else if (numberOne < numberTwo) {
            System.out.println("Sayıların Küçükten Büyüğe Sırlanışı : " + numberThree + " < " + numberOne + " < " + numberTwo);
        } else {
            System.out.println("Sayıların Küçükten Büyüğe Sırlanışı : " + numberThree + " < " + numberTwo + " < " + numberOne);
        }


    }

}
