package heroes;

import weapons.Weapon;

public class ArmedHero extends Hero {
    private Weapon weapon;

    public ArmedHero(double healthPoints, double attackPower, String name, Weapon weapon, HeroClass heroClass) {
        super(healthPoints, attackPower, name, heroClass);
        this.weapon = weapon;
    }

    @Override
    protected double computeAttackPower(Hero opponent) {
        if (this.weapon != null) {
            return this.getAttackPower() * this.weapon.computeAttackPower(opponent);
        } else {
            return this.getAttackPower();
        }
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
}
