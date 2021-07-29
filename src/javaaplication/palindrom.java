package javaaplication;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        String kataAsli ,kataBalik ="";

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukan kata yang akan di cek palindrome : ");
        kataAsli = inputUser.nextLine();
        int panjang = kataAsli.length();

        for (int index = panjang -1;index>=0; index--){
            kataBalik = kataBalik + kataAsli.charAt(index);
        }

        if (kataAsli.equals(kataBalik)){
            System.out.println("TRUE (kata termasuk palindrome)");
        }
        else {
            System.out.println("FALSE (Kata tidak termasuk palindrome)");
        }
    }
}
