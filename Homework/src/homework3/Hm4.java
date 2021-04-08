package homework3;

import java.util.Scanner;
public class Hm4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] S = new int[240];
        char[] S1 = in.nextLine().toCharArray();//读入一串数字
        for (int i = 0; i < S1.length; i++) {
            S[i] = S1[i]-'0';//由于是字符串，故需要减去'0'来实现数字的实现
        }
        int N = in.nextInt();
        Delete(N,S,S1);
        in.close();
    }
    public static void Delete(int N,int[] S,char[] S1){
        //要求是删除N个数后，所得到的数是最小的，还不能排序，就判断出其是最小的
        //删数时，从前往后寻找第一个比后一个数字大的数字，然后删除之，按照这种方法删除N个数字即得最小数字。
        int count = 0;//定义count来记录删减次数
        int length = S1.length;//由于length需要进行加减，这里就用来代替
        for (int i = 0; i < S1.length; i++) {
            if (S[i]>S[i+1]){
                for (int j = i; j < length; j++) {
                    S[j] = S[j+1];//后面的数向前补齐
                }
                length--;//完成一次删减就减一
                count++;//完成一次删减就加一
                if (count==N){
                    break;//相等时退出循环
                }
                i=-1;//回到第一个位置，但是上面会加一，这里就要是-1。
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(S[i]);
        }
    }
}

