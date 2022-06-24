import java.util.Scanner;
//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, max = 1, min = 1;

        System.out.print("Kac tane sayi gireceksiniz: ");
        int n = input.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ".Sayiyi giriniz: ");
                num = input.nextInt();

                if (num > 0) {
                    if (i == 1) {
                        max = num;
                        min = num;
                    } else if (num > max) {
                        max = num;
                    } else if (num < min) {
                        min = num;
                    }
                }
            }
            System.out.println("En buyuk sayi: " + max);
            System.out.println("En kucuk sayi: " + min);
        }else {
            System.out.println("Yanlis deger girdiniz!");
        }
    }
}