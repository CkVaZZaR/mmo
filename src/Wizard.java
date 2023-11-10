public class Wizard extends Unit {

    public Wizard(String name) {
        super(name);
        power = 30;
        health = 80;
        defence = 0;
        critChance = 0.5f;
        parryChance = 0.3f;
    }

    protected int mana = 100;

    @Override
    protected void attack(Unit unit) {
        if (mana > 10)
            super.attack(unit);
        mana -= 10;
    }
    public String getChar() {
        return "W";
    }

    @Override
    public String toString() {
        return "Wizard (W)" +
                "\nmana: " + mana +
                "\nhealth: " + health +
                "\npower: " + power +
                "\ndefence: " + defence + "\n";
    }
}
