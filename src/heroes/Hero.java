package heroes;

public abstract class Hero {
    private double healthPoints;
    private double attackPower;
    private String name;
    private HeroClass heroClass;

    public Hero(double healthPoints, double attackPower, String name, HeroClass heroClass) {

        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.name = name;
        this.heroClass = heroClass;
    }

    protected abstract double computeAttackPower(Hero oponent);

    public void performAttack(Hero opponent) {

    }

    public void recieveAttack(double damage) {
        this.healthPoints -= damage;
    }

    public boolean isAlive() {
        boolean alive = true;
        if (this.healthPoints <= 0) {
            alive = false;
        }
        return alive;
    }

    protected void setHealthPoints() {

    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public String getName() {
        return name;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }
}
