package weapons;

import heroes.Hero;

public class HolyHandGrenade extends Weapon {
    public HolyHandGrenade(double attackPower, WeaponType weaponType) {
        super(attackPower, weaponType);
    }

    @Override
    public double computeAttackPower(Hero oponent) {
        return super.computeAttackPower(oponent);
    }
}
