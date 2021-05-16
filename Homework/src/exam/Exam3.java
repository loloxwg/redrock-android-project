package exam;
import java.util.Scanner;
class Circle{
    double radius;
    double area;
    Circle(double radius){
        if (radius<0){
            this.radius=0;
            System.out.println("The radius is not less than 0.");
        }
        else {
            this.radius = radius;
        }
    }
    public double getArea(){
        double area=3.14*radius*radius;
        return area;
    }
}
class Cylinder{
    Circle bottom;
    double height;
    Cylinder(Circle bottom, double height){
        this.bottom=bottom;
        if (height<0){
            this.height=0;
            System.out.println("The height is not less than 0.");
        }
        else {
            this.height=height;
        }
    }
    public double getVolme(){
        double v=this.bottom.getArea()*this.height;
        return v;
    }
}
public class Exam3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please input the radius of the circle");
        double r=in.nextDouble();
        Circle a=new Circle(r);
        System.out.println("please input the height of the cylinder");
        double h= in.nextDouble();
        Cylinder b=new Cylinder(a,h);
        double v=b.getVolme();
        System.out.println("The volume is: "+v);
    }

}
