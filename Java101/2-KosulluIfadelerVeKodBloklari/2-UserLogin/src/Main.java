import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, userPassword, password = "java123";
        int select;
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        userPassword = input.nextLine();

        if (userName.equals("patika")) {
            if (userPassword.equals(password)) {
                System.out.println("Başarıyla Giriş Yaptınız.");
            } else {
                System.out.println("Şifrenizi Yanlış Girdiniz. Sıfırlamak İster misiniz ?");
                System.out.print("1- Evet\n2- Hayır\nSeçiminiz : ");
                select = input.nextInt();

                switch (select) {
                    case 1:

                        System.out.print("Lütfen Yeni Şifrenizi Giriniz : ");
                        String newUserPassword = input.next();

                        if ((newUserPassword.equals(password)) || (newUserPassword.equals(userPassword))) {
                            System.out.println("Şifre Oluşturulmadı, Lütfen Başka Şifre Giriniz.");
                        } else {
                            System.out.println("Şifre Başarıyla Oluşturuldu.");
                            password = newUserPassword;
                        }

                        break;
                    case 2:
                        System.out.println("Giriş Yapılamadı !");
                        break;
                    default:
                        System.out.println("Lütfen Tekrar Deneyin. Hatalı İşlem Girdiniz. !");
                        break;
                }

            }

        } else {
            System.out.println("Kullanıcı Adınızı Yanlış Girdiniz Lütfen Tekrar Deneyiniz ! ");
        }

    }
}
