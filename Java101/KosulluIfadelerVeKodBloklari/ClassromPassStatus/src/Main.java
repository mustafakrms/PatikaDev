import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, muzik, count = 0;
        double avarage = 0.0;
        Scanner input = new Scanner(System.in);


        //kullanıcının notlarınıgirdiği yer
        //where the user enters notes
        System.out.print("Matematik Notunuzu Girin : ");
        mat = input.nextInt();
        if ((mat >= 0) && (mat <= 100)) {
            count++;
            avarage += mat;
        }

        System.out.print("Türkçe Notunuzu Girin : ");
        turkce = input.nextInt();
        if ((turkce >= 0) && (turkce <= 100)) {
            count++;
            avarage += turkce;
        }

        System.out.print("Fizik Notunuzu Girin : ");
        fizik = input.nextInt();
        if ((fizik >= 0) && (fizik <= 100)) {
            count++;
            avarage += fizik;
        }

        System.out.print("Kimya Notunuzu Girin : ");
        kimya = input.nextInt();
        if ((kimya >= 0) && (kimya <= 100)) {
            count++;
            avarage += kimya;
        }

        System.out.print("Müzik Notunuzu Girin : ");
        muzik = input.nextInt();
        if ((muzik >= 0) && (muzik <= 100)) {

            count++;
            avarage += muzik;

        }

        //Dönen sayıların ortalamasını alma
        //Average of returned numbers
        avarage = avarage / count;

        //show the output to the user
        if (avarage > 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz. ");
        } else {
            System.out.println("Maalesef Sınıfta Kaldınız !");
        }
        System.out.println("Ortalamanız : " + avarage);

    }
}
