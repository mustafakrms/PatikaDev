import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int temp;

        System.out.print("Sıcaklık Giriniz : ");
        temp = input.nextInt();

        if (temp >= 25) {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        } else if (temp >= 10) {
            System.out.println("Pikniğe Gidebilirsiniz.");
            if (temp <= 15) {
                System.out.println("Sinema'ya Gidebilirsin.");
            }
        } else if (temp >= 5) {
            System.out.println("Sinema'ya Gidebilirsiniz.");
        } else {
            System.out.println("Kayak Yapmaya Gidebilirsiniz.");
        }
    }
}
