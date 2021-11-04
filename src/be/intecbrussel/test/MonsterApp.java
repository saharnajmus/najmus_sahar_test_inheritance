package be.intecbrussel.test;

public class MonsterApp {
    public static void main(String[] args) {
        Bear bear = new Bear(50, 5);
        Witch witch = new Witch(30, 100);
        witch.setMaxHp(30);
        bear.setMaxHp(50);
        int witchMagicPoints = witch.getMagicPoints();
        int bearRagePoints = bear.getRagePoints();

        while (witch.getHitPoints() > 0 && bear.getHitPoints() > 0) {

            int fireballAttack = witch.fireballAttack();
            bear.takeDamage(fireballAttack);
            witchMagicPoints += 4;
            witch.setMagicPoints(witchMagicPoints);
            int clawAttack = bear.bearClawAttack();
            witch.takeDamage(clawAttack);
            bearRagePoints += 5;
            bear.setRagePoints(bearRagePoints);

            if (witch.getHitPoints() <= 0) {
                System.out.println("witch is dead");
            }

            if (bear.getHitPoints() <= 0) {
                System.out.println("bear is dead");
            }
        }

        witch.restoreMp(witchMagicPoints);
        bear.restoreRp(bearRagePoints);
        System.out.println("witch magic points are " + witch.getMagicPoints());

        System.out.println("Bear rage points are " + bear.getRagePoints());
        if (witch.getMagicPoints() < bear.getRagePoints()) {
            System.out.println("Bear is the winner");
        } else if (witch.getMagicPoints() > bear.getRagePoints()) {
            System.out.println("witch is the winner");
        }

    }
}
