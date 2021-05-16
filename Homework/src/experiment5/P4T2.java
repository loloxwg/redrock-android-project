package experiment5;

import java.util.Scanner;


interface CircleInterface {
    final float PI = 3.14159f;

    float getArea(float r);

    float getCircumference(float r);
}

class Circle implements CircleInterface {
    float r;
    public void Circle(float r){
        this.r=r;
    }
    public float getArea(float r){
        return (float)(PI*Math.pow(r,2));
    }
    public float getCircumference(float r){
        return PI*2*r;
    }
}

public class P4T2 {
    public static void main(String[] args) {

        Circle c = new Circle();

        Scanner s = new Scanner(System.in);
        System.out.println("Please  input  r:  ");
        float r = s.nextFloat();

        System.out.println("The  area  is  :  " + c.getArea(r));
        System.out.println("The  circumference  is  :  " + c.getCircumference(r));
    }
}

