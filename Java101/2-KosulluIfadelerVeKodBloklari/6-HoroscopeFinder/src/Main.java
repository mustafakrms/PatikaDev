import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month, day;
        String horoscope = "";
        boolean isError = false, isPullsThirty, isPullsThirtyOne;

        System.out.print("Doğduğunuz Ay'ı Giriniz : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün'ü Giriniz : ");
        day = input.nextInt();

        isPullsThirty = (day > 0 && day <= 30);
        isPullsThirtyOne = (day > 0 && day <= 31);

        if (month == 1) {
            if (isPullsThirtyOne) {
                if (day < 21)
                    horoscope = "Oğlak";
                else
                    horoscope = "Kova";

            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day > 0 && day <= 28) {
                if (day < 20)
                    horoscope = "Kova";
                else
                    horoscope = "Balık";

            } else {
                isError = true;
            }

        } else if (month == 3) {
            if (isPullsThirtyOne) {
                if (day < 21)
                    horoscope = "Balık";
                else
                    horoscope = "Koç";

            } else {
                isError = true;
            }

        } else if (month == 4) {
            if (isPullsThirty) {
                if (day < 21)
                    horoscope = "Koç";
                else
                    horoscope = "Boğa";

            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (isPullsThirtyOne) {
                if (day < 22)
                    horoscope = "Boğa";

                else
                    horoscope = "İkizler";


            } else {
                isError = true;
            }

        } else if (month == 6) {
            if (isPullsThirty) {
                if (day < 23)
                    horoscope = "İkizler";
                else
                    horoscope = "Yengeç";


            } else {
                isError = true;
            }

        } else if (month == 7) {
            if (isPullsThirtyOne) {
                if (day < 23)
                    horoscope = "Yengeç";
                else
                    horoscope = "Aslan";

            } else {
                isError = true;
            }

        } else if (month == 8) {
            if (isPullsThirtyOne) {
                if (day < 23)
                    horoscope = "Aslan";
                else
                    horoscope = "Başak";

            } else {
                isError = true;
            }

        } else if (month == 9) {
            if (isPullsThirty) {
                if (day < 23)
                    horoscope = "Başak";
                else
                    horoscope = "Terazi";
            } else {
                isError = true;
            }

        } else if (month == 10) {
            if (isPullsThirtyOne) {
                if (day < 23)
                    horoscope = "Terazi";
                else
                    horoscope = "Akrep";

            } else {
                isError = true;
            }

        } else if (month == 11) {
            if (isPullsThirty) {
                if (day < 22)
                    horoscope = "Akrep";
                else
                    horoscope = "Yay";

            } else {
                isError = true;
            }

        } else if (month == 12) {
            if (isPullsThirtyOne) {

                if (day < 21)
                    horoscope = "Yay";
                else
                    horoscope = "Oğlak";
            } else {
                isError = true;
            }

        } else {
            isError = true;
        }

        // Show Data User
        if (isError) {
            System.out.println("Hatalı İşlem Girdiniz !");
        } else {
            System.out.println("Burcunuz : " + horoscope);
        }


    }
}
