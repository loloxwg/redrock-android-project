package homework3;

import java.util.Scanner;

public class Hm2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 10;
        int a[] = new int[N];
        System.out.println("Please input 10 numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Your numbers are:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]+" ");

        }

        System.out.println("\nPlease input m:");

        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = a[N - m + i];
        }
        for (int i = N - 1; i >= m; i--) {
            a[i] = a[i - m];
        }
        for (int i = 0; i < m; i++) {
            a[i] = b[i];
        }
        System.out.println("The new numbers are:");
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
    }
}