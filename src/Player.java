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
    public void deleteUnit(int index) {
        units[index] = new EmptyUnit("None");
    }
    public String getUnit(int x) {
        return units[x].getChar();
    }
    public String getUnitName(int x) {
        return units[x].getName();
    }
    public Unit unit(int x) {
        return units[x];
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nPlayer name: " + name +
                "\nunits:" + "\n1) " + units[0] + "\n2) " + units[1] + "\n3) " + units[2] + "\n";
    }
}
