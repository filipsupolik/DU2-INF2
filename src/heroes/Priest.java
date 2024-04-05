package heroes;

import weapons.Weapon;
import weapons.WeaponType;

public class Priest extends ArmedHero {
    public Priest(double healthPoints, int attackPower, String name, Weapon weapon, HeroClass heroClass) {
        super(healthPoints, attackPower, name, weapon, heroClass);
    }

    @Override
    protected double computeAttackPower(Hero opponent) {
        double utocnaSila;
        if (this.getWeapon().getWeaponType() == WeaponType.STAFF) {
            double sila = this.getAttackPower();
            utocnaSila = sila * 10;
        } else {
            utocnaSila = this.getAttackPower();
        }
        return utocnaSila;
    }
}
