package be.intecbrussel.test;

public class Witch extends MagicMonster {
    private String name;

    public Witch() {
        this(0);
    }

    public Witch(int hitPoints) {
        this(hitPoints, 0);
    }

    public Witch(int hitPoints, int magicPoints) {
        this(null, hitPoints, magicPoints);
    }

    public Witch(String name, int hitPoints, int magicPoints) {
        this.name = name;
        super.setHitPoints(hitPoints);
        super.setMagicPoints(magicPoints);


    }

    public int fireballAttack() {
        int witchMp = super.getMagicPoints();
        if (witchMp >= 5) {
            System.out.println(" fwooosh!!");


            return 8;
        } else {
            System.out.println("out of magic points");
            return 0;
        }
    }
}
