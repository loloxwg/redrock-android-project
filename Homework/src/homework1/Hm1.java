package homework1;
import java.util.Scanner;
//public class Hm1 {
//    public static void main(String[] args) {
//        Scanner request =new Scanner(System.in);
//        int m = request.nextInt();
//        int n = request.nextInt();
//        System.out.printf("%d to %d WanSHu:\n",m,n);
//        for (int i = m; i <= n; i++) {
//            int factor = 0;
//            for (int j = 1; j < i; j++) {
//                if (i % j == 0) {
//                    factor += j;
//                }
//            }
//            if (i == factor) {
//                //200 to 500 WanShu:
//
//                System.out.printf("%d,",factor);
//            }
//        }
//    }
//}


/*
    编程找出m~n之间的所有完数，m和n为从键盘输入的两个整数。
*/

import java.util.Scanner;

public class Hm1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int j, k, i;
        System.out.printf("%d to %d WanShu:\n", m, n);
        for (j = m; j <= n; j++) {
            k = j;
            for (i = 1; i < j; i++) {
                if (j % i == 0) {
                    k = k - i;
                }
            }
            if (k == 0) {
                System.out.printf("%d,", j);
            }
        }
    }
}