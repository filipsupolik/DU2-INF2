package weapons;

import heroes.Hero;

public class HolyHandGrenade extends Weapon {
    public HolyHandGrenade(double attackPower) {
        super(attackPower, WeaponType.HOLYHANDGRENADE);
    }

    @Override
    public double computeAttackPower(Hero opponent) {
        double utocnaSila;
        if (opponent.getHeroClass().isUndead()) {
            double zakladnaSila = this.getBaseAttackPower();
            utocnaSila = zakladnaSila * 2;
        } else {
            utocnaSila = this.getBaseAttackPower();
        }
        return utocnaSila;
    }
}
