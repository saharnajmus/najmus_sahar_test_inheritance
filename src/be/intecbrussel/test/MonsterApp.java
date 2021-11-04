package be.intecbrussel.test;

public class MonsterApp {
    public static void main(String[] args) {
        Bear bear = new Bear(50, 5);
        Witch witch = new Witch(30, 100);
        witch.setMaxHp(30);
        bear.setMaxHp(50);
        int witchHitPoints = 0;//witch.getHitPoints();
        int bearHitPoints = 0; //bear.getHitPoints();
        int witchMagicPoints = witch.getMagicPoints();
        int bearRagePoints = bear.getRagePoints();

        while (witchHitPoints < witch.getMaxHp() || bearHitPoints < bear.getMaxHp()) {
            if (witchHitPoints > witch.getMaxHp()) {
                System.out.println("witch is dead");
                break;
            }
            witch.fireballAttack();
            System.out.println("witch magic points " + witchMagicPoints);
            witchMagicPoints += 4;
            witch.setMagicPoints(witchMagicPoints);
            System.out.println("witch Magic Points after  turn " + witchMagicPoints);
            witchHitPoints++;
            bear.bearClawAttack();
            System.out.println("bear's rage points " + bearRagePoints);
            bearRagePoints += 5;
            bear.setRagePoints(bearRagePoints);
            System.out.println("bear's rage points after turn " + bearRagePoints);
            bearHitPoints++;

        }

        witch.restoreMp(witchMagicPoints);
        bear.restoreRp(bearRagePoints);
        System.out.println("witch magic points are " + witchMagicPoints);

        System.out.println("Bear rage points are " + bearRagePoints);
        if (witch.getMagicPoints() < bearRagePoints) {
            System.out.println("Bear is the winner");
        } else {
            System.out.println("witch is the winner");
        }

    }
}
