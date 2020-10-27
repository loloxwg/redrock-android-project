package lv3;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int i = 0, sum = 0;
    String[] dishes = {"辣子鸡丁", "水煮肉片", "糖醋里脊", "干锅牛肉", "干锅排骨"};
    int[] price = {38, 22, 18, 38, 29};
    int[] number = {1, 2, 3, 4, 5};

    public void show_dishes() {
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i] + "." + dishes[i] + " " + price[i] + "元");
        }
    }//显示菜单的方法，用数组实现

    public void choice_dishes_main_body() {

        System.out.println("输入你想点菜的序号（空格分割）");
        String input = sc.nextLine();
        String[] choice = input.split(" ");//split() 方法根据匹配给定的正则表达式来拆分字符串。
        int n = 0;
        for (String data : choice) {
            n++;
        }
        int [] tempChoice  = new int[n];
        for (int j = 0; j < n; j++) {
            tempChoice[j] = Integer.parseInt(choice[j]);
        }
        showPrice(tempChoice);
        System.out.println("一共"+sum+"元");
    }
    public int showPrice(int temp[]){
        System.out.println("你共选择了:");
        for (int i=0;i<temp.length;i++){
            switch (temp[i]){
                case 1:
                    System.out.println(dishes[0] + " " + price[0] + "元");
                    sum += price[0];
                    break;
                case 2:
                    System.out.println(dishes[1] + " " + price[1] + "元");
                    sum += price[1];
                    break;
                case 3:
                    System.out.println(dishes[2] + " " + price[2] + "元");
                    sum += price[2];
                    break;
                case 4:
                    System.out.println(dishes[3] + " " + price[3] + "元");
                    sum += price[3];
                    break;
                case 5:
                    System.out.println(dishes[4] + " " + price[4] + "元");
                    sum += price[4];
                    break;
            }
        }
        return sum;
    }
}


