package javaaplication;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int bil1;

        Scanner scan = new Scanner (System.in);
        System.out.println("Menampilkan hello world");
        System.out.println("Masukkan bilangan=");
        bil1= scan.nextInt();

        if (bil1 % 3 == 0) {
            System.out.println("Hello");
        }else if (bil1 % 5 == 0) {
            System.out.println("World");
        }
        if (bil1 % 5 == 0 && bil1 % 3 == 0)
            System.out.println("Hello World");

    }
}
