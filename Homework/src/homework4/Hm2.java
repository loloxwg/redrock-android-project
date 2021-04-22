package homework4;

import java.util.Scanner;


class Circle {
    public Circle() {
    }
    double r;
    Circle(double r) {
        this.r=r;
    }
    public void disp() {
        System.out.printf("radius=%.4f\n" , r);
        System.out.printf("perimeter=%.4f\n" , getPerimeter());
        System.out.printf("area=%.4f\n" , getArea());
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
    public double getArea(){
        return Math.pow(r,2.0)*Math.PI;
    }

}

class CircleDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();

        Circle circle=new Circle(a);
        circle.disp();
    }
}