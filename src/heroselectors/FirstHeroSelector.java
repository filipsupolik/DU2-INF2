package heroselectors;

import heroes.Hero;
import hlavnybalicek.HeroUnit;

public class FirstHeroSelector implements HeroForDuelSelector {
    @Override
    public Hero pickHero(HeroUnit heroUnit) {
        return heroUnit.getListOfHeroes().get(0);
    }
}
