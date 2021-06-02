package experiment6;

import java.util.Scanner;

class MyError{
    public double negativeerror(double num) throws NegativeException,ZeroException {
        double g = num;
        if (num < 0) {
            throw new NegativeException("The divisor, " + num + ", could not be negative!");
        }
        if (num == 0) {
            throw new ZeroException("The divisor, " + num + ",could not be zero!");
        }
        return g;
    }
}

class NegativeException extends Exception{
    NegativeException(String msg){
//        super(msg);
    }
}
class ZeroException extends  Exception{
    ZeroException(String msg){
//        super(msg);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Please input first number: ");
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        System.out.println("Please input second number: ");
        int num2=in.nextInt();
        double d;
        try{

            MyError myError=new MyError();
            myError.negativeerror(num2);
            d=(double) num1/num2;
            System.out.println("Divisor is : "+d);

        } catch (NegativeException e) {
            System.out.println("The divisor, " + num2 + ", could not be negative!");
        } catch (ZeroException e) {
            System.out.println("The divisor, " + num2 + ",could not be zero!");
        }finally {
            System.out.println("finally!");
        }



    }

}
