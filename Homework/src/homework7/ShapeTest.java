package homework7;

abstract class Shape {
    abstract double perimeter();
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    double perimeter() {
        return 2*r*Math.PI;
    }
}

class Rectangle extends Shape{
    private double a,b;
    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    double perimeter(){
        return a*b;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        Rectangle rect =new Rectangle(2,3);
        System.out.println(c.perimeter());
        System.out.println(rect.perimeter());
    }
}