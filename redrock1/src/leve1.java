import java.util.Scanner;

public class leve1 {
    public static void main(String[] args) {
        int[] arr1 = {15, 25, 10, 30, 40, 20, 50};
        for (int a = 0; a < arr1.length - 1; a++) {
            for (int b = 0; b < arr1.length - 1; b++) {
                if (arr1[b] > arr1[b + 1]) {
                    int temp = arr1[b];
                    arr1[b] = arr1[b + 1];
                    arr1[b + 1] = temp;
                }
            }
        }
        System.out.printf("冒泡排序后的结果：\n");
        for (int x : arr1) {
            System.out.printf(" " + x);
        }

        System.out.println("请输入一个待插入的数：\n");

        Scanner sc = new Scanner(System.in);

        int inPut = sc.nextInt();
        int[] arr2 = new int[arr1.length + 1];
        for (int i=0;i<arr1.length-1;i++){
            if (inPut>=arr1[i]);
            int j=i;
        }


        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        arr2[arr1.length] = inPut;

        for (int c = 0; c < arr2.length-1; c++) {
            for (int d = 0; d < arr2.length-1; d++) {
                if (arr2[d] > arr2[d + 1]) {
                    int temp1 = arr2[d];
                    arr2[d] = arr2[d + 1];
                    arr2[d + 1] = temp1;
                }
            }
        }

        System.out.printf("插入数字" + "(" + inPut + ")" + "之后的数组为:");
        for (int x:arr2) {
            System.out.printf(" " + x);

        }


    }
}

