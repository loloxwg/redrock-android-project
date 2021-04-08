package experiment1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("hello," + name + "!");
    }

}
