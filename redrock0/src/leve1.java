//Lv 1:
//需要的知识点：Java基本的输入语句，简单的分支结构
//看来你已经完成了idea的安装并且已经可以输出Hello World了，现在就来用java解决一些有意思的问题
//吧
//张涛姐姐每天都要回复很多学弟和学妹的消息，但是张涛姐姐更希望能够在白天(7:00 - 18:00)回复学弟
//的消息，在深夜(18:01 - 次日6:59)回复学妹的消息，那么在某个时间她到底应该回复学弟的消息呢还是
//学妹的消息呢？不如你写个程序帮她判断一下吧！
//要求：输入一个数字（属于[0,24]）来代表一天中的小时数（比如7:00~7:59都可以用7表示），输出张
//涛姐姐要回复的到底是学弟还是学妹
import java.util.Scanner;

public class leve1 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (7<=n&&n<18){
            System.out.println("张涛姐姐回复学弟了");
        }
        else System.out.println("张涛姐姐回复学妹了");
    }
}
