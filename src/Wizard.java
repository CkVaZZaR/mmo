public class Wizard extends Unit {

    public Wizard(String name) {
        super(name);
        power = 30;
        health = 80;
        defence = 0;
    }

    protected int mana = 100;

    @Override
    protected void attack(Unit unit) {
        if (mana > 0)
            super.attack(unit);
        mana -= 10;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", health=" + health +
                ", power=" + power +
                ", defence=" + defence +
                ", critChance=" + critChance +
                ", parryChance=" + parryChance +
                '}';
    }
}
