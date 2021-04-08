package experiment1;


import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is your first, second, third, forth or fifth JAVA code?");
        String name = in.nextLine();
        System.out.println("This is my " + name + " JAVA code!");
    }
}
