package heroes;

public class Ghoul extends Hero {
    private boolean ozivenie;

    public Ghoul(double healthPoints, double attackPower, String name) {
        super(healthPoints, attackPower, name, HeroClass.GHOUL);
        this.ozivenie = false;
    }

    @Override
    protected double computeAttackPower(Hero opponent) {
        return this.getAttackPower();
    }

    public void recieveAttack(double attackPower) {
        double zivotyPredOzivenim = this.getHealthPoints();
        super.recieveAttack(attackPower);
        if (!this.isAlive() && !this.ozivenie) {
            this.setHealthPoints(zivotyPredOzivenim * 0.9);
            this.ozivenie = true;
            System.out.printf("%s was ressurected with %.2f HP!%n", this.getName(), this.getHealthPoints());
        }
    }
}
