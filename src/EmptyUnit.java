public class EmptyUnit extends Unit {
    public EmptyUnit(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "None\n";
    }
}
