package heroes;

import weapons.Weapon;

public class Priest extends ArmedHero {
    public Priest(double healthPoints, double attackPower, String name, Weapon weapon, HeroClass heroClass) {
        super(healthPoints, attackPower, name, weapon, HeroClass.PRIEST);
    }

    @Override
    protected double computeAttackPower(Hero oponent) {
        return super.computeAttackPower(oponent);
    }
}
