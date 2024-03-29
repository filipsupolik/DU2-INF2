package weapons;

import heroes.Hero;

public class HPReaper extends Weapon {
    public HPReaper(double attackPower, WeaponType weaponType) {
        super(attackPower, weaponType);
    }

    @Override
    public double computeAttackPower(Hero oponent) {
        return super.computeAttackPower(oponent);
    }
}
