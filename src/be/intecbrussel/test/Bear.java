package be.intecbrussel.test;

public class Bear extends MightMonster {
    private int holeNr;

    public Bear() {
        this(0);
    }

    public Bear(int hitPoints) {
        this(hitPoints, 0);
    }

    public Bear(int hitPoints, int ragePoints) {
        this(0, hitPoints, ragePoints);
    }

    public Bear(int holeNr, int hitPoints, int ragePoints) {
        this.holeNr = holeNr;
        super.setHitPoints(hitPoints);
        super.setRagePoints(ragePoints);
    }

    public int bearClawAttack() {
        int bearRp = super.getRagePoints();
        if (bearRp >= 8) {
            System.out.println("rooaar!!");
            return 10;
        } else {

            System.out.println("out of ragePoints points");
            return 0;
        }
    }
}
