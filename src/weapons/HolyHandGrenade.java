package weapons;

import heroes.Hero;

public class HolyHandGrenade extends Weapon {
    public HolyHandGrenade(double attackPower) {
        super(attackPower, WeaponType.HOLYHANDGRENADE);
    }

    @Override
    public double computeAttackPower(Hero opponent) {
        return 0;
    }
}
