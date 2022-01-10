import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut, elma, domates, muz, patlican, userInput, total;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;

        System.out.println("Armut KG Fiyatı : " + armut);
        System.out.println("Elma KG Fiyatı : " + elma);
        System.out.println("Domates KG Fiyatı : " + domates);
        System.out.println("Muz KG Fiyatı : " + muz);
        System.out.println("Patlıcan KG Fiyatı : " + patlican);

        System.out.println("----------------------------------");

        System.out.print("Armut Kaç Kilo ? : ");
        userInput = input.nextDouble();
        total = userInput * armut;

        System.out.print("Elma Kaç KG ? : ");
        userInput = input.nextDouble();
        total += userInput * elma;

        System.out.print("Domates Kaç KG ? : ");
        userInput = input.nextDouble();
        total += userInput * domates;

        System.out.print("Muz Kaç KG ? : ");
        userInput = input.nextDouble();
        total += userInput * muz;

        System.out.print("Patlıca Kaç KG ? : ");
        userInput = input.nextDouble();
        total += userInput * patlican;

        System.out.println("Toplam Tutar : " + total);


    }
}
