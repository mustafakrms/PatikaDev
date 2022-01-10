import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total, km, perKm = 2.20, startPrice = 10.0;

        System.out.print("Mesafeyi KM Cinsinden Giriniz : ");
        km = input.nextDouble();

        total = startPrice + (perKm * km);
        total = (total < 20) ? 20 : total;

        System.out.println("Taksimetre Açılışı : " + startPrice);
        System.out.println("KM Başına ücret : " + perKm);
        System.out.println("Gidilen KM : " + km);
        System.out.println("Ödenecek Toplam Tutar : " + total);

    }
}
