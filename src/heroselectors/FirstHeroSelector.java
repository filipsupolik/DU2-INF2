package heroselectors;

import heroes.Hero;
import hlavnybalicek.HeroUnit;

public class FirstHeroSelector implements HeroForDuelSelector {
    @Override
    public Hero pickHero(HeroUnit heroUnit) {
        Hero vybratyHrdina = null;
        vybratyHrdina =  heroUnit.getListOfHeroes().get(0);
        return vybratyHrdina;
    }
}
