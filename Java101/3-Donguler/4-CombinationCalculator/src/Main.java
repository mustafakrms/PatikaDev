import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfElement, numberOfChoises, elementFactorial = 1, count = 1, choicesFactorial = 1, subtraction = 1, combination;

        System.out.print("Eleman Sayısını Girin (n) : ");
        numberOfElement = input.nextInt();

        System.out.print("Seçim Sayısını Girin (r) : ");
        numberOfChoises = input.nextInt();


        if (numberOfElement >= numberOfChoises) {

            for (int i = 1; i <= numberOfElement; i++) {
                elementFactorial *= i;
                if (i <= numberOfChoises) {
                    choicesFactorial *= i;
                } else {
                    subtraction *= count;
                    count++;
                }
            }
            combination = elementFactorial / (choicesFactorial * subtraction);
            System.out.printf("C( %d , %d ) = %d ", numberOfElement, numberOfChoises, combination);

        } else {
            System.out.println("Seçim Sayısı Eleman Sayısından Küçük Olamaz!");
        }


    }
}
