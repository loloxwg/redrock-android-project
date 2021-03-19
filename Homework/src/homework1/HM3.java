package homework1;

import java.util.Scanner;

public class HM3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();
        double sum=m+n+d;
        double average=sum/3.0;
        System.out.println("sum="+sum);
        System.out.println("average="+average);


    }
}
