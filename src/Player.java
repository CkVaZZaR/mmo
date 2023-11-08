import java.util.Arrays;

public class Player {

    private String name;
    private Unit[] units = new Unit[3];
    private int massiveIndex = 0;

    public Player(String name) {
        this.name = name;
    }

    public void addUnit(int x, String name) {
        if (x == 0) {
            units[massiveIndex] = new Wizard(name);
            ++massiveIndex;
        } else if (x == 1) {
            units[massiveIndex] = new Knight(name);
            ++massiveIndex;
        } else if (x == 2) {
            units[massiveIndex] = new Terminator(name);
            ++massiveIndex;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", units=" + Arrays.toString(units) +
                '}';
    }
}
