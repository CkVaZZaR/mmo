public class Knight extends Unit {

    public Knight(String name) {
        super(name);
        power = 10;
        health = 150;
        defence = 5;
        critChance = 0.2f;
        parryChance = 0.4f;
    }
    public String getChar() {
        return "K";
    }

    @Override
    public String toString() {
        return "Knight (K)" +
                "\nhealth: " + health +
                "\npower: " + power +
                "\ndefence: " + defence + "\n";
    }
}

