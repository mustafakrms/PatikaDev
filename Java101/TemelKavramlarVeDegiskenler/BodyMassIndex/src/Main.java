import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double size, weight, indeks;

        System.out.print("Lütfen Boyunuzu ( Metre Cinsinden ) Giriniz : ");
        size = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        weight = input.nextDouble();

        indeks = weight / (size * size);
        System.out.println("Vücüt Kitle İndeksiniz : " + indeks);
    }
}
