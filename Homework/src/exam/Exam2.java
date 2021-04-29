package exam;

import java.util.Scanner;


public class Exam2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the first number:\n");
        int a = scan.nextInt();
        System.out.print("Please input the second number:\n");
        int b = scan.nextInt();
        Max_Min(a,b);
    }
    public static void Max_Min(int a,int b){
        int i = a;
        int j = b;
        int x =0,y =0;
        if(a < b){
            x = b;
            b = a;
            a = x;
        }
        while(b != 0){
            y = a % b;
            a = b;
            b = y;
        }

        int t = i * j / a;
        System.out.println("The maxmum common divisor:"+ a);
        System.out.println("The minimun common multiple:"+ t);
    }
}



