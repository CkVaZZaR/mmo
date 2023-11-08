public class Terminator extends Unit {
    public Terminator(String name) {
        super(name);
        power = 10;
        health = 100;
        defence = 15;
        critChance = 0.3f;
        parryChance = 0;
    }

    @Override
    public String toString() {
        return "Terminator{" +
                "health=" + health +
                ", power=" + power +
                ", defence=" + defence +
                ", critChance=" + critChance +
                ", parryChance=" + parryChance +
                ", name='" + name + '\'' +
                '}';
    }
}
