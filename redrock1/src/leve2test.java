import java.util.Random;

public class leve2test {
    static int[][] multiplyMatrix;
    static Random ran = new Random();

    public static void main(String[] args) {
        int length1;

        length1 = ran.nextInt(10);
        int[][] a = new int[length1][length1];
        int[][] b = new int[length1][length1];
        getAB(a, b);
        mMatrix(a, b);
        show();
        SumOfDiagonalDlements();
    }

    public static void getAB(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                if (j > i)
                    a[i][j] = ran.nextInt(10);
                else if (i > j)
                    a[i][j] = a[j][i];
                else
                    a[i][j] = ran.nextInt(10);
            }
        }
        for (int i = 0; i < b.length; ++i) {
            for (int j = 0; j < b.length; ++j) {
                if (j > i)
                    b[i][j] = ran.nextInt(10);
                else if (i > j)
                    b[i][j] = b[j][i];
                else
                    b[i][j] = ran.nextInt(10);
            }
        }

        System.out.println("输出矩阵A");//输出矩阵A
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("输出矩阵B");//输出矩阵B
        for (int i = 0; i < b.length; ++i) {
            for (int j = 0; j < b.length; ++j) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }


    }

    public static void mMatrix(int[][] a, int[][] b) {//矩阵A*B
        System.out.println("输出矩阵A*B");
        multiplyMatrix = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {//A的行数
            for (int j = 0; j < b[0].length; j++) {//B的列数
                for (int k = 0; k < a[0].length; k++) {//A的列数
                    multiplyMatrix[i][j] = multiplyMatrix[i][j] + a[i][k] * b[k][j];//将矩阵A的第I行和矩阵B的第J列对应的数相乘得到multiplyMatrix[i][j]
                }
            }
        }
    }

    public static void show() {//输出矩阵乘积multiplyMatrix
        for (int i = 0; i < multiplyMatrix.length; i++) {
            for (int j = 0; j < multiplyMatrix[0].length; j++) {
                System.out.print(multiplyMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void SumOfDiagonalDlements() {
        int sum = 0;
        System.out.println("输出对角线之和");
        for (int i = 0; i < multiplyMatrix.length; i++) {
            for (int j = 0; j < multiplyMatrix.length; j++)
                if (i == j) {
                    sum = sum + multiplyMatrix[i][j];
                }
        }
        System.out.println(sum);
    }
}