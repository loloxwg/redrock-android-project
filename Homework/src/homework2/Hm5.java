package homework2;

import java.util.Scanner;

public class Hm5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int []counts=countFun(str.toLowerCase());
        for (int i=0;i<counts.length;i++){
            if (counts[i]!=0){
                System.out.println("("+(char)('A'+i)+")"+"Num="+counts[i]);
            }
        }

    }
    public static int[] countFun(String s){
        int []counts=new int[26];
        for (int i=0;i<s.length();i++){
            if (Character.isLetter(s.charAt(i)))
                counts[s.charAt(i)-'a']++;
        }
        return counts;
    }
}
