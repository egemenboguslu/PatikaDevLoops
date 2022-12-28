import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi giriniz: ");
        int number = input.nextInt();

        int basValue, result = 0;

        while (number != 0) {

            basValue = number % 10;
            result += basValue;
            number /= 10;
        }

        System.out.print("Basamak değerleri toplamı: " + result);
    }
}