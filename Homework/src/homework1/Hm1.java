package homework1;
import java.util.Scanner;
public class Hm1 {
    public static void main(String[] args) {
        Scanner request =new Scanner(System.in);
        int m = request.nextInt();
        int n = request.nextInt();
        System.out.printf("%d to %d WanSHu:\n",m,n);
        for (int i = m; i <= n; i++) {
            int factor = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    factor += j;
                }
            }
            if (i == factor) {
                //200 to 500 WanShu:

                System.out.printf(i+",");
            }
        }
    }
}