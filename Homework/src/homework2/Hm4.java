package homework2;

import java.util.Scanner;

public class Hm4 {
    public static void main(String[] args) {
        System.out.println("Please input a number:");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int i = 1, j = 1;
        int sum = 0;
        do {
            i *= j;
            sum += i;
            j++;
        } while (j <= n);
        System.out.println("1+2!+3!+...+n!= "+sum);
    }
}
