package homework4;

import java.util.Scanner;


class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void showAll() {
        System.out.println("The lengh is:" + length + "\n" + "The width is:" + width + "\n" + "The area is:" + getArea() + "\n");
    }

    public double getArea() {
        return length * width;
    }

}

class RectangleDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input length:");
        double a=in.nextDouble();
        System.out.println("Please input width:");
        double b=in.nextDouble();
        Rectangle r = new Rectangle(a, b);
        r.showAll();
    }
}