import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* FAKTÖRİYEL HESABI

        int sayi, i,toplam=1;

        System.out.print("Sayiyi giriniz: ");
        sayi = input.nextInt();

        for (i = 1; i <= sayi; i++) {
            toplam = toplam * i;
        }
        System.out.println(sayi + " faktöriyel: " + toplam);

         */

        /* N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        C(n,r) = n! / (r! * (n-r)!)
         */

        Scanner input = new Scanner(System.in);

        int N, R, kombinasyon;
        int carp1 = 1, carp2 = 1, carp3 = 1;

        System.out.print("N elemanlı kümenin sayısını girin: ");
        N = input.nextInt();

        System.out.print("r elemanlı farklı gruplarının sayısını girin: ");
        R = input.nextInt();

        if (N > R) {
            for (int i = 1; i <= N; i++) {
                carp1 = carp1 * i;
            }

            for (int j = 1; j <= R; j++) {
                carp2 = carp2 * j;
            }

            for (int k = 1; k <= (N - R); k++) {
                carp3 = carp3 * k;
            }
            kombinasyon = carp1 / (carp2 * carp3);

            System.out.print(N + " nin" + R + " li kombinasyonu: " + kombinasyon);
        } else {
            System.out.print("Hatali işlem.");
        }

    }
}