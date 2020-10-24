//Lv2:
//需要的知识点：循环语句，条件判断，简单的输出语句
//哲哲姐姐最近在忙着帮林潼姐姐写代码，没有很多时间学习高等数学，她的数学老师给她留了一道作
//业，你能用程序帮她解决掉吗？
//数学老师的题目：算出所有的三位水仙花数
//水仙花数是各个数字的立方和等于其本身的三位数
//请你帮她输出所有的水仙花数吧
public class leve2 {
    public static void main  (String args[]){
        for (int i=100;i<1000;i++){
            int num1=i/100;
            int num2=i/10%10;
            int num3=i%10;
            int num= num1*num1*num1+num2*num2*num2+num3*num3*num3;
            if (num==i){
                System.out.println("水仙花数："+i);
            }

        }
    }


}
