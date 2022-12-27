import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Sınır sayı değerini giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {

            System.out.println("4ün " + i + "." + "kuvveti: " + Math.pow(4, i));
            System.out.println("5in " + i + "." + "kuvveti: " + Math.pow(5, i));
            System.out.println(" ");
        }
    }
}