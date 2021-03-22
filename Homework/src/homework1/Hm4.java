package homework1;

import java.util.Scanner;

//判断可逆素数
public class Hm4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        for (int i = 2; i < data; i++) {
            if (data % i == 0) {
                a++;
            }
        }
        int data2 = NumberReverse.reverse(data);
        for (int i = 2; i < data2; i++) {
            if (data2 % i == 0) {
                b++;
            }
        }

        if (a == 0 && b == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

class NumberReverse {

    static int reverse(int num) {
        if (num>9){
            int a = num % 10;
            int b = num / 10;
            int c = a * 10 + b;
            num = c;
        }




        System.out.println(num);
        return num;
    }


}


