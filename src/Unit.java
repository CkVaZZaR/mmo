public class Unit {

    protected int health = 100;
    protected int power = 10;
    protected int defence = 10;
    protected float critChance = 0.1f;
    protected float parryChance = 0.1f;
    public String name;
    public Unit(String name) {
        Game.countOfUnits++;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public float getCritChance() {
        return critChance;
    }

    public void setCritChance(float critChance) {
        this.critChance = critChance;
    }

    public float getParryChance() {
        return parryChance;
    }

    public void setParryChance(float parryChance) {
        this.parryChance = parryChance;
    }
    protected void getDamage(int damage) {
        if (this.defence < damage && CustomChanceRandom.getParry(this)) {
            this.health -= damage;
        }
    }
    protected void attack(Unit unit) {
        unit.getDamage(power + CustomChanceRandom.getCrit(this));
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", power=" + power +
                ", defence=" + defence +
                ", critChance=" + critChance +
                ", parryChance=" + parryChance +
                '}';
    }
}
