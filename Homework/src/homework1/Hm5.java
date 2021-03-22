package homework1;


import java.util.Scanner;

public class Hm5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the first number:");
        System.out.println("Please input the second number:");
        System.out.println("Please input the third number:");

        int a = in.nextInt();

        int b = in.nextInt();
        int c = in.nextInt();
        if (a > b && a > c) {


            System.out.println("The maximum number is:" + a);

        } else if (b > a && b > c) {
            System.out.println("The maximum number is:" + b);
        } else if (c > a && c > b) {
            System.out.println("The maximum number is:" + c);
        }

    }
}
