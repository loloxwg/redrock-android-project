package homework2;

import java.util.Scanner;

public class Hm1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a score:");
        int point =in.nextInt();
        if (point>=90){
            System.out.println("A");
        }else if (80<=point&&point<=89){
            System.out.println("B");
        }else if (70<=point&&point<=79){
            System.out.println("C");
        }else if (60<=point&&point<=69){
            System.out.println("D");
        }else if (point<60){
            System.out.println("E");
        }
    }
}
