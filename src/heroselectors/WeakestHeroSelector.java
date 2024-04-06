package heroselectors;

import heroes.Hero;
import hlavnybalicek.HeroUnit;

public class WeakestHeroSelector implements HeroForDuelSelector {
    @Override
    public Hero pickHero(HeroUnit heroUnit) {
        Hero weakestHero = heroUnit.getListOfHeroes().get(0);

        for (int i = 1; i < heroUnit.getListOfHeroes().size(); i++) {
            Hero currentHero = heroUnit.getListOfHeroes().get(i);
            if (currentHero.getAttackPower() < weakestHero.getAttackPower()) {
                weakestHero = currentHero;
            }
        }
        return weakestHero;
    }
}
