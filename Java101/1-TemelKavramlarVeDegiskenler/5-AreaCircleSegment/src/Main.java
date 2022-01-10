import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int radius, centerAngle;
        double pi = 3.14, area;

        System.out.print("Dairenin YarıÇapını Giriniz : ");
        radius = input.nextInt();
        System.out.print("Dairenin Merkez Açı Ölçüsünü Giriniz : ");
        centerAngle = input.nextInt();

        area = (pi * (radius * radius) * centerAngle) / 360;
        System.out.print("Yarıçapı : " + radius + ",\nMerkez Açısının Ölçüsü : " + centerAngle + "\nOlan Daire Diliminin Alanı : " + area);


    }
}
