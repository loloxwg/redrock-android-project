package expermient2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1, j = 1;
        int sum = 0;
        do {
            i *= j;
            sum += i;
            j++;
        } while (j <= n);
        System.out.printf("1!~%d!=%d",n,sum);
    }

}
