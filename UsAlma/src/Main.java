import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k,m,total = 1;

        System.out.print("Sayiyi giriniz: ");
        k = input.nextInt();

        System.out.print("Üssünü girin: ");
        m = input.nextInt();

        for(int i =1; i <=m;i++){
            total = total * k;
        }
        System.out.print("Sayinin değeri: " + total);

    }
}