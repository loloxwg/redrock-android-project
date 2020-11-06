package lv2;

public class Add {
    private double addition1;
    private double addition2;
    private char operator;

    public Add (double i , char k, double j){
        addition1=i;
        addition2=j;
        operator=k;
    }

    public void setAddition1(double addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(double addition2) {
        this.addition2 = addition2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void addition (){
        double sum= addition1+addition2;
        System.out.println(sum);
    }

    public void subtractive(){
        double subtractive=addition1-addition2;
        System.out.println(subtractive);
    }
    public void multiplication(){
        double mult =addition1*addition2;
        System.out.println(mult);
    }
    public void division(){
        double div=addition1/addition2;
        System.out.println(div);
    }

}
