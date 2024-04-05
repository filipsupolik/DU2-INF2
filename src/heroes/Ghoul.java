package heroes;

public class Ghoul extends Hero {
    public Ghoul(double healthPoints, double attackPower, String name) {
        super(healthPoints, attackPower, name, HeroClass.GHOUL);
    }

    @Override
    protected double computeAttackPower(Hero opponent) {
        return this.getAttackPower();
    }

    public void recieveAttack(double attackPower) {
        double zivoty = this.getHealthPoints();
        zivoty -= attackPower;
        this.setHealthPoints(zivoty);
    }
}
