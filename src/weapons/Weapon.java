package weapons;

import heroes.Hero;

public class Weapon {
    private double baseAttackPower;
    private WeaponType weaponType;

    public Weapon(double attackPower, WeaponType weaponType) {
        this.baseAttackPower = attackPower;
        this.weaponType = weaponType;
    }

    public double computeAttackPower(Hero opponent) {
        return this.baseAttackPower;
    }

    public double getBaseAttackPower() {
        return baseAttackPower;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
