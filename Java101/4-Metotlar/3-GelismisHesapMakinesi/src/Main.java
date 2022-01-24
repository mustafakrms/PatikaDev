import java.util.Scanner;

public class Main {

    static int numberOne() {

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        return input.nextInt();
    }

    static int numberTwo() {

        Scanner input = new Scanner(System.in);
        System.out.print("İkinci Sayıyı Giriniz : ");
        return input.nextInt();
    }

    static void sum(int numberOne, int numberTwo) {

        int result = numberOne + numberTwo;
        System.out.println("Toplama İşlemin Sonucu : " + result);
    }

    static void minus(int numberOne, int numberTwo) {

        int result = numberOne - numberTwo;
        System.out.println("Çıkarma İşlemin Sonucu : " + result);
    }

    static void multiplication(int numberOne, int numberTwo) {
        int result = numberOne * numberTwo;
        System.out.println("Çarpma İşlemin Sonucu : " + result);
    }

    static void divided(double numberOne, double numberTwo) {

        if (numberTwo == 0)
            System.out.println("İkinci sayı 0 Olamaz!");
        else {
            double result = numberOne / numberTwo;
            System.out.println("Bölme İşlemin Sonucu : " + result);
        }
    }

    static void exponential(int numberOne, int numberTwo) {

        int result = 1;
        for (int i = 1; i <= numberTwo; i++) {
            result *= numberOne;
        }
        System.out.printf("%d^%d = %d\n", numberOne, numberTwo, result);
    }

    static void fact(int numberOne) {

        int result = 1;
        for (int i = 1; i <= numberOne; i++) {
            result *= i;
        }
        System.out.println("Birinci Sayının Faktöriyeli : " + result);
    }

    static void mod(int numberOne, int numberTwo) {

        int result = numberOne % numberTwo;
        System.out.println(numberOne + "%" + numberTwo + " = " + result);
    }

    static void rectangle(int numberOne, int numberTwo) {

        int area = numberOne * numberTwo;
        int circumference = 2 * (numberOne + numberTwo);
        System.out.println("Dikdörtgenin Alanı : " + area);
        System.out.println("Dikdörtgenin Çevresi : " + circumference);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Bulma İşlemi\n" +
                "6-Faktöriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan ve Çeve Hesaplama\n" +
                "0- Çıkış\n";
        System.out.println(menu);

        while (true) {

            System.out.print("Yapacağınız İşlemi seçiniz => ");
            int select = input.nextInt();

            if (select == 0)
                break;

            System.out.println("===============================================================");

            switch (select) {
                case 1:
                    System.out.println("==== Toplama İşlemi ====");
                    sum(numberOne(), numberTwo());
                    break;
                case 2:
                    System.out.println("==== Çıkarma İşlemi ====");
                    minus(numberOne(), numberTwo());
                    break;
                case 3:
                    System.out.println("==== Çarpma İşlemi ====");
                    multiplication(numberOne(), numberTwo());
                    break;
                case 4:
                    System.out.println("==== Bölme İşlemi ====");
                    divided(numberOne(), numberTwo());
                    break;
                case 5:
                    System.out.println("==== Üs Alma İşlemi ====");
                    exponential(numberOne(), numberTwo());
                    break;
                case 6:
                    System.out.println("==== Faktöriyel İşlemi ====");
                    fact(numberOne());
                    break;
                case 7:
                    System.out.println("==== Mod Alma İşlemi ====");
                    mod(numberOne(), numberTwo());
                    break;
                case 8:
                    System.out.println("==== Dikdörtgen Alan ve Çevre İşlemi ====");
                    rectangle(numberOne(), numberTwo());
                    break;
                default:
                    System.out.println("Hatalı İşlem Girdiniz!!");
                    break;
            }
            System.out.println("===============================================================");

        }

        System.out.println("Güle Güle!");


    }
}
