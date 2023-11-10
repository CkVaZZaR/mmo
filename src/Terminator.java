public class Terminator extends Unit {
    public Terminator(String name) {
        super(name);
        power = 10;
        health = 100;
        defence = 15;
        critChance = 0.5f;
        parryChance = 0;
    }

    @Override
    public String toString() {
        return "Terminator (T)" +
                "\nhealth: " + health +
                "\npower: " + power +
                "\ndefence: " + defence + "\n";
    }
}
