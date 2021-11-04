package be.intecbrussel.test;

public abstract class MagicMonster extends Monster {
    private int magicPoints;
    private int maxMP;

    public MagicMonster() {
        this(100, 100);//not sure
    }

    public MagicMonster(int maxMp, int maxHp) {
        super(maxHp);
        this.maxMP = maxMp;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int h) {
        this.magicPoints = h;
    }

    public void restoreMp(int h) {
        if (h < maxMP) {
            this.magicPoints = h;
        }
        else{
            this.magicPoints = maxMP;
        }

    }

    public boolean useMp(int d) {
        if (d > magicPoints) {
            return false;
        }
        return true;
    }
}
