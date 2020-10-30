package MonsterHunter;

import java.util.Scanner;

public class MonsterHunterDrive{
    public static void main(String[] args) {
        Monster monster =new Monster();
        Hunter hunter = new Hunter();
        monster.setAtk(100111111);
        monster.setHp(999);
        monster.setName("破天大轰");
        monster.setDef(999999);
        monster.show();



        hunter.setAtk(99999);
        hunter.setDef(8888);
        hunter.setHp(99999);
        hunter.setName("永远的苍蓝星");
        hunter.show();



        System.out.println("攻击力"+monster.attack(hunter.getDef()));
    }
}