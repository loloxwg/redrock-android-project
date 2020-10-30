package MonsterHunter;

public class Monster {
    public String name;//名字
    public int hp;//血量
    public int atk;//攻击力
    public int def;//防御力

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int attack (int def){
        return atk-def;
    }
    public void show(){
        System.out.println(name+"攻击力"+atk+"防御力"+def+"生命值"+hp);

    }
}