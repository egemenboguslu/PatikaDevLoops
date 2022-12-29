import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secim, bakiye = 1000, tutar,bloke = 3;
        String password;

        while (bloke > 0) {

            System.out.print("Şifreyi giriniz: ");
            password = input.nextLine();

            if (password.equals("java101")) {
                System.out.println("Bankamıza hoşgeldiniz.");
                do {
                    System.out.println("1-Para yatırma: ");
                    System.out.println("2-Para çekme: ");
                    System.out.println("3-Bakiye sorgula: ");
                    System.out.println("4-Çıkış yap: ");
                    System.out.print("Seçim yapınız: ");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Yatıracağınız tutarı giriniz: ");
                            tutar = input.nextInt();
                            bakiye = tutar + bakiye;
                            System.out.println("Yeni bakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.print("Çekilecek tutarı giriniz:");
                            tutar = input.nextInt();

                            if (tutar > bakiye) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                bakiye = bakiye - tutar;
                                System.out.println("Yeni bakiyeniz: " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz " + bakiye + " tl'dir.");
                            break;
                        case 4:
                            System.out.println("Kartınızı alınız.Güle güle!");
                            break;
                        default:
                            System.out.println("Hatali seçim yaptınız.");

                    }
                } while (secim != 4);
                System.out.println("İyi günler.");
                break;
            } else {
                bloke--;
                System.out.println("Hatalı şifre girdiniz.");
            }
            if (bloke == 0) {
                System.out.println("Kartınız bloke olmuştur.");
            } else {
                System.out.println("Kalan hakkınız: " + bloke);
            }
        }
    }
}