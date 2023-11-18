public class Knight extends Util{

    public Knight() {
        super();
        power = 20;
        defence = 120;
        ParryChance = 0.3;
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
        return "Knight{" +
                "hp=" + hp +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
}
