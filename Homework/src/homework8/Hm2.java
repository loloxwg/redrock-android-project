package homework8;
import java.util.Scanner;

public class Hm2 {


    public static int gcd(int a, int b) {
        int t = 0;
        if(a < b){
            t = a;
            a = b;
            b = t;
        }
        int c = a % b;
        if(c == 0){
            return b;
        }
        else{
            return gcd(b, c);
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        String number;
        int decimal;
        int a, b,c;
        int g;

        number = in.next();

        String[] array = new String[2];
        array = number.split("\\.");
        a = Integer.parseInt(array[0]);
        decimal = Integer.parseInt(array[1]);


        int length = array[1].length();
        b = decimal;
        c = (int)Math.pow(10, length);
        g = gcd(b,c);
        System.out.println(a + " " + b/g +" " + c/g);

    }

}
