package expermient2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y;
        if (x > 0) {
            y = Math.exp(-x);
            System.out.printf("y=" + String.format("%.4f", y));
        } else if (x == 1) {
            y = 1;
            System.out.printf("y=" + String.format("%.4f", y));

        } else if (x < 0) {
            y = -Math.exp(x);
            System.out.printf("y=" + String.format("%.4f", y));
        }

    }
}
