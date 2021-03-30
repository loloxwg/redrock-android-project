package homework2;

import java.util.Scanner;

public class Hm2 {
    public static void main(String[] args) {

        while(true){
            Scanner in =new Scanner(System.in);
            int x =in.nextInt();
            boolean isPrime=true;
            if (x==0){
                System.out.println("programe is over");
                break;
            }
            if (x==1){
                isPrime=false;
            }
            for (int i=2;i<x;i++){
                if (x%i==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(x+" is sushu");
            }
            else {
                System.out.println(x+" is not sushu");
            }
        }


    }
}

