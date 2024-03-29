package heroes;

public class Ghoul extends Hero {
    public Ghoul(double healthPoints, double attackPower, String name) {
        super(healthPoints, attackPower, name, HeroClass.GHOUL);
    }

    @Override
    protected double computeAttackPower(Hero oponent) {
        return 0;
    }

    public void recieveAttack(double attackPower) {

    }
}
