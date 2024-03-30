package hlavnybalicek;

import heroes.Hero;
import heroselectors.HeroForDuelSelector;

public class Arena {
    private HeroUnit heroUnit1;
    private HeroUnit heroUnit2;
    private HeroForDuelSelector duelSelector;
    private Hero firstHero;
    private Hero secondHero;

    public Arena(HeroUnit heroUnit1, HeroUnit heroUnit2, HeroForDuelSelector duelSelector) {
        this.heroUnit1 = heroUnit1;
        this.heroUnit2 = heroUnit2;
        this.duelSelector = duelSelector;
        this.firstHero =  this.duelSelector.pickHero(heroUnit1);
        this.secondHero =  this.duelSelector.pickHero(heroUnit2);
    }

    public void performDuelsInUnit() {
        System.out.printf("Starting duels between units: %n %s%n %s%n", this.heroUnit1.getName(), this.heroUnit2.getName());
        while (heroUnit1.numberOfHeroesAlive() > 0 || heroUnit2.numberOfHeroesAlive() > 0) {
            this.firstHero.performAttack(secondHero);
            this.secondHero.recieveAttack(this.firstHero.getAttackPower());
            this.secondHero.performAttack(this.firstHero);
            this.firstHero.recieveAttack(this.secondHero.getAttackPower());
        }
    }
}
