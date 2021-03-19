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
        for (int i = 2; i < data; i++) {
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
        while (num != 0) {
            int a = num % 10;
            num = num / 10;

        }
        return num;
    }


}


