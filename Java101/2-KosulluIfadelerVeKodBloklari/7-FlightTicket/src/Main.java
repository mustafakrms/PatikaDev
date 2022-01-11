import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distance, age, tripSelection;
        double ageDiscount, ticketDiscount = 0.20, discountedAmount, totalPrice, discountRate = 0, perKM = 0.10;

        System.out.print("Mesafeyi KM Türünden Giriniz : ");
        distance = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz ( 1 => Tek Yön, 2 => Gidiş Dönüş )  : ");
        tripSelection = input.nextInt();

        if ((distance > 0) && (age > 0) && (tripSelection == 1 || tripSelection == 2)) {

            if (age < 12) {
                discountRate = 0.50;
            } else if (age <= 24) {
                discountRate = 0.10;
            } else if (age > 65) {
                discountRate = 0.30;
            }
            totalPrice = distance * perKM;
            ageDiscount = totalPrice * discountRate;
            discountedAmount = totalPrice - ageDiscount;

            switch (tripSelection) {
                case 1:
                    System.out.println("Toplam tutar : " + discountedAmount);
                    break;
                case 2:
                    ticketDiscount *= discountedAmount;
                    totalPrice = (discountedAmount - ticketDiscount) * 2;
                    System.out.println("Toplam tutar : " + totalPrice);
                    break;

            }

        } else {
            System.out.println("Haalı Veri Girdiniz !");
        }


    }
}
