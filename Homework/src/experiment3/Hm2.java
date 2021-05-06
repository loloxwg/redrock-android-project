package experiment3;

import java.util.Scanner;

public class Hm2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        Triangle s = new Triangle(a,b,c);
        s.getArea();
        System.out.println("perimeter="+s.getPerimeter());
        System.out.printf("area=%.1f\n" , s.getArea());
        s.back();
        in.close();
    }

}
class Triangle{//三角形类
    private double a,b,c;//私有的边长
    double getPerimeter(){//根据题目要求，返回周长
        double Perimeter;
        Perimeter = a+b+c;
        return Perimeter;
    }
    double getArea(){//根据题目返回面积，用到Math
        double t = (a+b+c)/2.0;
        double Area = Math.sqrt(t*(t-a)*(t-b)*(t-c));
        return Area;
    }
    public void setSide(double x, double y, double z){
        a=x;
        b=y;
        c=z;
    }
    public Triangle(double a, double b, double c){//这里由于定义时候就给定了边长，所以这里就做出判断
        if (a+b<=c||a+c<=b||b+c<=a){
            this.setSide(0,0,0);//调用边长设定函数
        }else {
            this.setSide(a,b,c);
        }
    }
    public void back(){//由于是private，就在这里用函数返回
        System.out.println("a="+this.a+","+"b="+this.b+","+"c="+this.c);
    }
}

