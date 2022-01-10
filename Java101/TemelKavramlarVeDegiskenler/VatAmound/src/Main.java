import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total, vatAmount, vatRate, money;
        boolean isStatus;

        System.out.print("Paranızı Giriniz : ");
        money = input.nextDouble();

        isStatus = money < 1000;
        vatRate = isStatus ? 0.18 : 0.08;
        vatAmount = money * vatRate;
        total = vatAmount + money;


        System.out.println("KDV'siz Fiyat : " + money);
        System.out.println("KDV Oranı : " + vatRate);
        System.out.println("KDV Tutarı : " + vatAmount);
        System.out.println("KDV'li Fiyat : " + total);


    }

}