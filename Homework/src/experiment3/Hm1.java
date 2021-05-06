package experiment3;

<<<<<<< HEAD


=======
>>>>>>> 04d1f1be71d44854f76987549600cf055770d522
import java.util.Scanner;

public class Hm1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input c1:");
        double real1 = in.nextDouble();
        double image1 = in.nextDouble();
        System.out.println("input c2:");
        double real2 = in.nextDouble();
        double image2 = in.nextDouble();
        Complex s1 = new Complex();
        Complex s2 = new Complex();
        s1.realPart = real1;
        s1.imaginaryPart = image1;
        s2.realPart = real2;
        s2.imaginaryPart = image2;
        System.out.println("ComplexNumber a: "+s1.realPart+" + "+s1.imaginaryPart+"i");
        System.out.println("ComplexNumber b: "+s2.realPart+" + "+s2.imaginaryPart+"i");
        add(s1,s2);
        delete(s1,s2);
        mult(s1,s2);
        in.close();
    }
    static class Complex{
        double realPart;
        double imaginaryPart;
    }
    public static void add(Complex s1,Complex s2){
        System.out.println("(a + b) = "+(s1.realPart+s2.realPart)+" + "+(s1.imaginaryPart+s2.imaginaryPart)+"i");
    }
    public static void delete(Complex s1,Complex s2){
        System.out.println("(a - b) = "+(s1.realPart-s2.realPart)+" + "+(s1.imaginaryPart-s2.imaginaryPart)+"i");
    }
    public static void mult(Complex s1,Complex s2){
        double real;
        double image;
        double temp;
        real = s1.realPart*s2.realPart;
        image = s1.realPart*s2.imaginaryPart+s1.imaginaryPart*s2.realPart;
<<<<<<< HEAD
        if (s1.imaginaryPart>0&&s2.imaginaryPart>0||s1.imaginaryPart<0&&s2.imaginaryPart<0){
=======
        if (s1.imaginaryPart>0&&s2.imaginaryPart>0||s1.imaginaryPart<0&&s2.imaginaryPart<0){//对i*i进行正负判断
>>>>>>> 04d1f1be71d44854f76987549600cf055770d522
            temp = -(s1.imaginaryPart*s2.imaginaryPart);
        }else {
            temp = (s1.imaginaryPart*s2.imaginaryPart);
        }
        real = real+temp;
        System.out.println("(a * b) = "+real+" + "+image+"i");
    }
}
<<<<<<< HEAD




=======



>>>>>>> 04d1f1be71d44854f76987549600cf055770d522
