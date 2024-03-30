package weapons;

import heroes.Hero;

public class HPReaper extends Weapon {
    public HPReaper(double attackPower) {
        super(attackPower, WeaponType.HPREAPER);
    }

    @Override
    public double computeAttackPower(Hero oponent) {
        return 2;
    }
}
