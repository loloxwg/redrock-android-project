package experiment1;

import java.util.Scanner;
public class Ex3{
    public static void main(String args[]){
        Scanner year = new Scanner(System.in);
        int n =year.nextInt();
        if (n%4==0||n%400==0){
            System.out.println(n+" is leap year");
        }else{
            System.out.println(n+" is not leap year");
        }
    }
}

