

public class Lv3 {
    public static void main(String[] args) {
        int[][] num1 = {{24, 8}, {35, 9}, {15, 10}, {17, 8}, {20, 7}, {49, 14}, {50, 16}, {98, 16}};
        int[][] num2 = {{3, 8}, {5, 9}, {2, 17}, {45, 8}, {13, 7}, {99, 14}, {175, 16}, {151, 9999}};
        int[][] plus = {{0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}};
        for (int a = 0; a < num1.length; a++)
            for (int b = 0; b < 2; b++)
                plus[a][b] = num1[a][b];
        for (int c = 0; c < num2.length; c++)
            for (int d = 0; d < 2; d++)
                plus[c + 8][d] = num2[c][d];//将两个数组合并
        for (int i = 0; i < plus.length; i++)
            for (int j = 0; j < 15 - i; j++)
                if (plus[j][0] > plus[j + 1][0]) {
                    int temp = plus[j][0];
                    plus[j][0] = plus[j + 1][0];
                    plus[j + 1][0] = temp;//转移第一个数据
                    int temp1 = plus[j][1];
                    plus[j][1] = plus[j + 1][1];
                    plus[j + 1][1] = temp1;//转移第二个数据
                }
        for (int m = 0; m < plus.length; m++)
            System.out.println(plus[m][0] + "," + plus[m][1]);//输出数组
    }
}
