package weapons;

import heroes.Hero;
import heroes.HeroClass;

public class HPReaper extends Weapon {
    public HPReaper(double attackPower) {
        super(attackPower, WeaponType.HPREAPER);
    }

    @Override
    public double computeAttackPower(Hero oponent) {
        double utocnaSila;
        if (oponent.getHeroClass() == HeroClass.WARRIOR) {
            double zivotyProtivnika = oponent.getHealthPoints();
            utocnaSila = zivotyProtivnika * 0.25;
        } else {
            utocnaSila = this.getBaseAttackPower();
        }
        return utocnaSila;
    }
}
