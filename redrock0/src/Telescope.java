

import java.util.Scanner;

public class Telescope {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int y = 0; y <= 2 * r; y += 2) {
            int x = (int) Math.round(r - Math.sqrt(r * r - (r - y) * (r - y)));
            int len = 2 * (r - x);

            if (y == r || y == r + 1) {
                System.out.print(' ');
                for (int h = 0; h <= r * 5 / 4; h++) {
                    System.out.print("镜");
                }
                System.out.println(" 镜");
            } else {
                for (int i = 0; i <= x; i++) {
                    System.out.print(' ');
                }
                System.out.print("镜");

                for (int j = 0; j <= len; j++) {
                    if (j == r - x) {
                        System.out.print("镜");
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println("镜");
            }
        }
    }
}
