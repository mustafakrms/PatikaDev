import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int date, result;
        String stdout = "Çin Zodyağı Burcunuz : ";

        System.out.print("Doğum Tarihinizi Giriniz : ");
        date = input.nextInt();

        result = date % 12;

        switch (result) {
            case 1:
                System.out.println(stdout + "Maymun");
                break;
            case 2:
                System.out.println(stdout + "Horoz");
                break;
            case 3:
                System.out.println(stdout + "Köpek");
                break;
            case 4:
                System.out.println(stdout + "Domuz");
                break;
            case 5:
                System.out.println(stdout + "Fare");
                break;
            case 6:
                System.out.println(stdout + "Öküz");
                break;
            case 7:
                System.out.println(stdout + "Kaplan");
                break;
            case 8:
                System.out.println(stdout + "Tavşan");
                break;
            case 9:
                System.out.println(stdout + "Ejderha");
                break;
            case 10:
                System.out.println(stdout + "Yılan");
                break;
            case 11:
                System.out.println(stdout + "At");
                break;
            case 12:
                System.out.println(stdout + "Koyun");
                break;

        }


    }
}
