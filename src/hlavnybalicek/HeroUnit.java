package hlavnybalicek;

import heroes.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeroUnit {
    private String name;
    private ArrayList<Hero> listOfHeroes;

    public HeroUnit(String name) {
        this.listOfHeroes = new ArrayList<>();
        this.name = name;
    }

    public List<Hero> getListOfHeroes() {
        return Collections.unmodifiableList(this.listOfHeroes);
    }

    public void removeHero(Hero hero) {
        this.listOfHeroes.remove(hero);
    }

    public int numberOfHeroesAlive() {
        int aliveHeroes = this.listOfHeroes.size();
        return aliveHeroes;
    }

    public void recruitHero(Hero hero) {
        this.listOfHeroes.add(hero);
    }

    public String getName() {
        return name;
    }
}
