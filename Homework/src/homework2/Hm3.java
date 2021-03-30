package homework2;

import java.util.Scanner;

public class Hm3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int[] array = new int[i];
        for (int j = 0; j < i; j++) {
            array[j] = in.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int k = 1; k < i; k++) {
            if (max < array[k])
                max = array[k];
            if (array[k] < min)
                min = array[k];
        }
        System.out.println(max + " " + min);
    }
}

