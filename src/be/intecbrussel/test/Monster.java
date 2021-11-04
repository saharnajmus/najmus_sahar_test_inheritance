package be.intecbrussel.test;

public abstract class Monster {
    private int hitPoints;
    private int maxHp;

    public Monster() {
        this(100);//not sure
    }

    public Monster(int maxHp) {
        setMaxHp(maxHp);
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int h) {
        this.hitPoints = h;

    }

    public void heal(int h) {
        this.hitPoints = h;

    }

    public boolean takeDamage(int d) {
        if (this.hitPoints <=0) {
            return false;
        } else {
            this.hitPoints-=d;
            return true;
        }
    }
}
