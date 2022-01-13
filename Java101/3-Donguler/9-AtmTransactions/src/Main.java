import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password;
        int balance = 1500;
        int select, price;
        int right = 3;

        while (right > 0) {
            System.out.print("----------------------------\n");
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = input.nextLine();
            System.out.print("----------------------------\n");

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoş Geldiniz.");
                do {
                    System.out.print("----------------------------\n");
                    System.out.println
                            ("1- Para Çekme\n" +
                                    "2- Para Yatırma\n" +
                                    "3- Bakiye Sorgulama\n" +
                                    "4- Çıkış ");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçin : ");
                    select = input.nextInt();
                    System.out.print("----------------------------\n");
                    switch (select) {
                        case 1:
                            System.out.print("Çekmek İstediğiniz Tutarı Giriniz : ");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.print("Hesabınızda Yeterli Bakiye Yok.");
                            } else {
                                balance -= price;
                                System.out.printf("Hesabınızdan %d Tutarında Para Çekildi.\n", price);
                            }
                            continue;
                        case 2:
                            System.out.print("Yatırmak İstediğiniz Tutarı Giriniz : ");
                            price = input.nextInt();
                            balance += price;
                            System.out.printf("Hesabınıza %d Tutarı Eklendi.\n", price);

                            continue;
                        case 3:
                            System.out.printf("Hesabınızdaki Bakiye : %d $\n", balance);
                            break;
                        case 4:
                            continue;
                        default:
                            System.out.println("Hatalı İşlem Seçtiniz. Lütfen Tekrar Deneyin.");
                    }
                    System.out.print("----------------------------\n");
                } while (select != 4);
                System.out.println("İyi Günler Dileriz.");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Edilmiştir. Lütfen Banka ile İletişime Geçiniz.");
                } else {
                    System.out.println("Kullanıcı Adı veya Şifre Hatalı. Lütfen Tekrar Deneyiniz.");
                    System.out.printf("Kalan Hakkınız : %d\n", right);
                }
            }

        }

    }
}
