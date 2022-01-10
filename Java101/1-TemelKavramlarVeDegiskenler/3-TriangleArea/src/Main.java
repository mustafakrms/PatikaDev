import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sideLenghtOne, sideLenghtTwo, sideLenghtThree;
        double u, perimeter, area;

        System.out.print("Birinci Kenarın Uzunluğunu Giriniz : ");
        sideLenghtOne = input.nextInt();
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz : ");
        sideLenghtTwo = input.nextInt();
        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz : ");
        sideLenghtThree = input.nextInt();

        u = (sideLenghtOne + sideLenghtTwo + sideLenghtThree) / 2F;
        perimeter = 2 * u;
        area = Math.sqrt(u * (u - sideLenghtOne) * (u - sideLenghtTwo) * (u - sideLenghtThree));

        System.out.println("Üçgenin çevresi : " + perimeter);
        System.out.println("Üçgenin alanı : " + area);


    }
}
