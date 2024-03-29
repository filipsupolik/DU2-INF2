package heroselectors;

import heroes.Hero;
import hlavnybalicek.HeroUnit;

public interface HeroForDuelSelector {
    Hero pickHero(HeroUnit heroUnit);
}
