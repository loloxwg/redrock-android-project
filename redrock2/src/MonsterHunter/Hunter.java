package MonsterHunter;

public class Hunter {
    String name;
    int hp;
    int atk;
    int def;
    public int attack(int def){
        return atk-def;
    }
    public void show(){
        System.out.println(name+"攻击力"+atk+"防御力"+def+"生命值"+hp);

    }

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
}


