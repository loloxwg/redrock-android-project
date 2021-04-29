package exam;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        System.out.println("n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pos1 = 0;
        int pos2 = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
                pos1 = i;
            }
            if (max < a[i]) {
                max = a[i];
                pos2 = i;
            }
        }
        System.out.println("max=" + max + ",pos=" + pos2);
        System.out.println("min=" + min + ",pos=" + pos1);


    }
}
