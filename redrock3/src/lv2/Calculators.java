package lv2;

public class Calculators {
    public static void main(String[] args) {
       Add add=new Add(3,'+',6);
       Add sub=new Add(3,'-',6);
       Add mult=new Add(3,'*',6);
       Add div=new Add(3,'/',6);
       add.addition();
       sub.subtractive();
       mult.multiplication();
       div.division();
    }
}
