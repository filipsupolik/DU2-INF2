package weapons;

import heroes.Hero;

public class Weapon {
    private double baseAttackPower;
    private WeaponType weaponType;

    public Weapon(double attackPower, WeaponType weaponType) {
        baseAttackPower = attackPower;
        this.weaponType = weaponType;
    }

    public double computeAttackPower(Hero oponent) {
        return 1;
    }

    public double getBaseAttackPower() {
        return baseAttackPower;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
