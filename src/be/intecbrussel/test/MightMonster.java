package be.intecbrussel.test;

public abstract class MightMonster extends Monster {
    private int ragePoints;
    private int maxRp;

    public MightMonster() {
        this(100, 100);//Not sure
    }

    MightMonster(int maxRp, int maxHp) {
        super(maxHp);
        this.maxRp=maxRp;
    }

    public int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int h) {
        this.ragePoints = h;
    }

    public void restoreRp(int h) {
        if (h < maxRp) {
            this.ragePoints = h;
        }else {
            this.ragePoints = maxRp;
        }
    }

    public boolean useRp(int d) {
        if (d > ragePoints) {
            return false;
        }
        return true;
    }
}
