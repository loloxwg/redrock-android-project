package lv1;


public class lv1 {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit("哈哈", "黑色", "哺乳类");
        rabbit.shout();
        rabbit.eat();
        System.out.println("====================");
        Animal frog = new Frog("嘻嘻", "绿色", "非哺乳类");
        frog.shout();
        frog.eat();
        Swimmable swimer = (Swimmable)frog;
        swimer.swim();
    }
}



