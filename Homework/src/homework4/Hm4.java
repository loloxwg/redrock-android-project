package homework4;

import java.util.Scanner;

class MyPoint {
    double x;
    double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void showXY(){

        System.out.println("Your location of horizontal (X) is :"+x);
        System.out.println("Your location of ordinate (Y) is :"+y);
    }
}

class MyPointDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the horizontal (X) :");
        double x = in.nextDouble();
        System.out.println("Please input the ordinate (Y) : ");
        double y = in.nextDouble();
        MyPoint myPoint = new MyPoint(x, y);
        myPoint.showXY();

    }
}
