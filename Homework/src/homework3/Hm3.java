package homework3;

import java.util.Scanner;

public class Hm3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        for (int i=m;i<=n;i++){
            if(isPalindrome(i)){
                System.out.println(i);
            };
        }
    }
    public static boolean isPalindrome(int x){
        boolean flag = true;
        char[] charArray = String.valueOf(x).toCharArray();
        int length = charArray.length;
        for(int i = 0;i<length;i++){
            char ahead = charArray[i];
            char hinder = charArray[length - i -1];
            if(ahead != hinder){
                flag = false;
            }
        }
        return flag;
    }
}
