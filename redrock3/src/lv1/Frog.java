package lv1;

public class Frog extends Animal implements Swimmable{
    public Frog() {
        super();
    }
    public Frog(String name, String color, String type) {
        super(name, color, type);
    }
    @Override
    public void shout() {
        System.out.println("那只"+super.getColor()+
                "的，名字叫"+super.getName()+"的青蛙正在呱呱的叫");
    }
    @Override
    public void eat() {
        System.out.println("青蛙是"+super.getType()+",爱吃昆虫");
    }
    @Override
    public void swim() {
        System.out.println("虽然不是鱼，但是青蛙也是游泳高手");
    }
}