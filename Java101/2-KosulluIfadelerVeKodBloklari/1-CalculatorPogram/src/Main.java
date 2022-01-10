import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int select;
        double numberOne, numberTwo;

        System.out.print("1. Sayıyı Giriniz : ");
        numberOne = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        numberTwo = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama İşleminin Sonucu : " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.println("Çıkarma İşleminin Sonucu : " + (numberOne - numberTwo));
                break;
            case 3:
                System.out.println("Çarpma İşleminin Sonucu : " + (numberOne * numberTwo));
                break;
            case 4:
                if (numberTwo == 0) {
                    System.out.println("0'a Sayı Bölünmez ! ");
                } else {
                    System.out.println("Bölme İşleminin Sonucu : " + (numberOne / numberTwo));
                }
                break;
            default:
                System.out.println("Hatalı İşlem Girdiniz");
                break;
        }


    }
}
