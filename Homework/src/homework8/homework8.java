package homework8;

import java.util.Scanner;

class CoreError{
    public int coreerror(int num) throws MyException{
        int g =num;
        if (num>100||num<0){
            throw new MyException("Error,score should be in 0-100.");

        }
        return g;
    }
}

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
public class homework8 {

    public static void main(String[] args) {
        System.out.println("Please input your score");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int g;
        CoreError d =new CoreError();
        try{
            int s =d.coreerror(num);
            System.out.println("Your score is:"+s);
        }
        catch (MyException e){
            System.out.println("Error,score should be in 0-100.");
        }
    }
}

