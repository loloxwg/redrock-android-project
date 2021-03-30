package homework3;

import java.util.Scanner;

public class Hm1 {
    public static void main(String[] args) {
        System.out.println("Please input a sentence:");
        Scanner in = new Scanner(System.in);
        String result = in.nextLine();
        int number = 0, str = 0, space = 0, other = 0;
        char x[] = result.toCharArray();
        for (int i = 0; i < x.length; i++) {
            if (Character.isDigit(x[i])) {
                number++;
            } else if (Character.isLetter(x[i])) {
                str++;
            } else if (Character.isWhitespace(x[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.printf("The number of numbers is:%d\n",number);
        System.out.printf("The number of English letters is:%d\n",str);
        System.out.printf("The number of blank space is:%d\n",space);
        System.out.printf("The number of other characters is:%d\n",other);

    }
}
