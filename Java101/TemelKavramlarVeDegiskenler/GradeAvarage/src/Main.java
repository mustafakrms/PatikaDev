
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, turkce, fizik, kimya, muzik, tarih, total;
        double avarage;
        String result;
        boolean isStatus;

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz :");
        tarih = input.nextInt();

        total = (mat + turkce + fizik + kimya + muzik + tarih);
        avarage = total / 6.0;

        System.out.println("Derslerinizin Ortalaması : " + avarage);

        isStatus = (avarage > 60);
        result = isStatus ? "Tebrikler Sınıfı Geçtiniz" : "Maalesef Sınıfta Kaldınız";
        System.out.print(result);
    }
}
