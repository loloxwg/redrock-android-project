package homework2;

import java.util.Scanner;

public class Hm2mod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            n = in.nextInt();
            if (n == 0) {
                System.out.println("programe is over");
                break;
            }
            boolean m=isPrime(n);
            if (m){
                System.out.printf("%d is not sushu\n",n);

            }else {
                System.out.printf("%d is sushu\n",n);
            }
        } while (n != 0);
    }

    public static boolean isPrime(int a) {
        if (a == 1 || a == 2) {
            return false;
        }else {
            int i;
            for (i=2;i<=a/2;i++){
                if (a%i==0){
                    return true;
                }
            }
        }
        return false;
    }
}
