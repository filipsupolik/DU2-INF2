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
        while (this.heroUnit1.numberOfHeroesAlive() > 0 || heroUnit2.numberOfHeroesAlive() > 0) {
            try{
                this.firstHero.performAttack(secondHero);
                if (this.secondHero.isAlive()) {
                    this.secondHero.performAttack(this.firstHero);
                    if (!this.firstHero.isAlive()) {
                        System.out.printf("Hero %s was killed by %s%n", this.firstHero.getName(), this.secondHero.getName());
                        this.heroUnit1.removeHero(this.firstHero);
                        this.firstHero = this.duelSelector.pickHero(heroUnit1);
                    }
                } else if (!this.secondHero.isAlive()) {
                    this.heroUnit2.removeHero(this.secondHero);
                    this.secondHero = this.duelSelector.pickHero(heroUnit2);
                }
            }catch (RuntimeException e){
                break;
            }
        }
        if(this.heroUnit1.numberOfHeroesAlive()>this.heroUnit2.numberOfHeroesAlive()){
            System.out.printf("Winning unit is: %s%n", this.heroUnit1.getName());
        }else{
            System.out.printf("Winning unit is: %s%n", this.heroUnit2.getName());
        }
    }
}
