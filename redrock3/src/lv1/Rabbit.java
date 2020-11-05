package lv1;

public class Rabbit extends Animal{
    public Rabbit() {
        super();
    }
    public Rabbit(String name, String color, String type) {
        super(name, color, type);
    }
    @Override
    public void shout() {
        System.out.println("那只"+super.getColor()+
                "的，名字叫"+super.getName()+"的兔子正在叽叽的叫");
    }
    @Override
    public void eat() {
        System.out.println("兔子是"+super.getType()+",爱吃胡萝卜");
    }
}