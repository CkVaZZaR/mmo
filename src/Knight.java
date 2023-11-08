public class Knight extends Unit {

    public Knight(String name) {
        super(name);
        power = 10;
        health = 150;
        defence = 5;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "health=" + health +
                ", power=" + power +
                ", defence=" + defence +
                ", critChance=" + critChance +
                ", parryChance=" + parryChance +
                ", name='" + name + '\'' +
                '}';
    }
}

