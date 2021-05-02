package experiment3;
import java.util.Scanner;
class Triangle {
    private double a, b, c;
    double getPerimeter(){
        double Perimeter;
        Perimeter=a+b+c;
        return Perimeter;
    }
    double getArea(){
        double t = (a+b+c)/2.0;
        double Area = Math.sqrt(t*(t-a)*(t-b)*(t-c));
        return Area;
    }
    public void setSide(double x, double y, double z){
        a=x;
        b=y;
        c=z;
    }
    public Triangle(double a, double b, double c){
        if (a+b<=c||a+c<=b||b+c<=a){
            this.setSide(0,0,0);
        }else {
            this.setSide(a,b,c);
        }
    }
    public void back(){
        System.out.println("a="+this.a+","+"b="+this.b+","+"c="+this.c);
    }
}

public class Hm2{
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
