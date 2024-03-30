package heroes;

public enum HeroClass {
    GHOUL,
    ZOMBIE,
    WARRIOR,
    PRIEST;

    HeroClass() {
    }

    public boolean isUndead() {
        if (this == GHOUL || this == ZOMBIE) {
            return true;
        }
        return false;
    }
}
