package lv1;
/**
 * 动物类
 * @author Administrator
 */
public abstract class Animal {
    private String name;//名字
    private String color;//颜色
    private String type;//类别（哺乳类、非哺乳类）
    public Animal() {
        super();
    }
    public Animal(String name, String color, String type) {
        super();
        this.name = name;
        this.color = color;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    /**
     * 发出叫声
     */
    public abstract void shout();
    /**
     * 吃饭
     */
    public abstract void eat();
}