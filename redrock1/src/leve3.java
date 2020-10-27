import java.util.Scanner;
public class leve3 {
    public static void main(String[] args) {
        Meals meals1=new Meals(1,"辣子鸡丁",38);
        Meals meals2=new Meals(2,"水煮肉片",22);
        Meals meals3=new Meals(3,"糖醋里脊",18);
        Meals meals4=new Meals(4,"干锅牛肉",38);
        Meals meals5=new Meals(5,"干锅排骨",29);

        Restaurant restaurant1=new Restaurant(1,"支付宝");
        Restaurant restaurant0=new Restaurant(2,"");

        restaurant0.welcome();
//        for (int i =0;i<5;i++){
//
//        }//for循环一会搞
        System.out.println(meals1.number+"."+meals1.name+" "+meals1.price+"元");
        System.out.println(meals2.number+"."+meals2.name+" "+meals2.price+"元");
        System.out.println(meals3.number+"."+meals3.name+" "+meals3.price+"元");
        System.out.println(meals4.number+"."+meals4.name+" "+meals4.price+"元");
        System.out.println(meals5.number+"."+meals5.name+" "+meals5.price+"元");
       // restaurant.buyWhat();
    }

}



class Meals {
    int number;
    String name;
    int price;


    public Meals(int number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }


}

class Restaurant{
    String name;
    int methodNumber;
    String method;


    public Restaurant(int methodNumber, String method) {
        this.methodNumber = methodNumber;
        this.method = method;
    }

    public void welcome(){
        System.out.println("欢迎来到中心食堂，这是今天的菜单:");
    }
    public int buyWhat(){
        System.out.println("请输入需要点的菜的序号：（空格键分割）");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void buyMethod(int method){
        System.out.println("请选择支付方式：");
    }
}
