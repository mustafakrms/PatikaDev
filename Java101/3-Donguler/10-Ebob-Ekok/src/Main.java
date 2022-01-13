import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz : ");
        int numberOne = input.nextInt();
        System.out.print("n2 Sayısını Giriniz : ");
        int numberTwo = input.nextInt();

        int ebob = 1, ekok, swap;

        // Küçüğünü bulma
        if (numberOne > numberTwo) {
            swap = numberOne;
            numberOne = numberTwo;
            numberTwo = numberOne;
        }
        //Ebob Bulma
        for (int i = numberOne; i > 0; i--) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                ebob = i;
                break;
            }
        }
        //ekok Formülü = (n1*n2)/ebob
        ekok = (numberOne * numberTwo) / ebob;

        System.out.printf("%d ve %d Sayılarının EBOB'u : %d\n", numberOne, numberTwo, ebob);
        System.out.printf("%d ve %d Sayılarının EKOK'u : %d\n", numberOne, numberTwo, ekok);

    }
}
