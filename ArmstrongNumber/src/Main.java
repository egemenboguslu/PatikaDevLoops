import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
        sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

        Örneğin 407 sayısını ele alalım.
        (4^3)+(0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
        Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi giriniz: ");
        int sayi = input.nextInt();

        int basamakSayisi = 0, basamakDegeri, basUssu, sonuc = 0;
        int geciciDeger = sayi;

        while (geciciDeger != 0) {
            geciciDeger /= 10;
            basamakSayisi++;
        }
        System.out.println("Basamak sayimiz: " + basamakSayisi);

        geciciDeger = sayi;

        while (geciciDeger != 0) {
            basamakDegeri = geciciDeger % 10;

            // Üs alma işlemi.

            basUssu = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                basUssu = basUssu * basamakDegeri;
            }

            sonuc = sonuc + basUssu;
            geciciDeger /= 10;
        }
        if (sayi == sonuc) {
            System.out.print(sayi + " bir armstrong sayidir.");
        } else {
            System.out.print(sayi + " bir armstrong sayi değildir.");
        }

    }
}