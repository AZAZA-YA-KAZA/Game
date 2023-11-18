public class Terminator extends Util{

    public Terminator() {
        super();
        CriticalChance = 0.4;
        hp = 120;
    }

    @Override
    public void attack(Util unit) {
        super.attack(unit);
    }

    @Override
    public String toString() {
        if (hp < 0){
            hp = 0;
        }
        return "Terminator{" +
                "hp=" + hp +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
}
