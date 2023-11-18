public class Wizard extends Util {

    protected int mana = 100;

    @Override
    public String toString() {
        if (hp < 0){
            hp = 0;
        }
        return "Wizard{" +
                "mana=" + mana +
                ", hp=" + hp +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }

    public Wizard() {
        super();
        power = 25;
        defence = 80;
    }

    @Override
    public void attack(Util unit) {
        mana -= 10;
        if (mana != 0) {
            super.attack(unit);
        }
        else{
            System.out.println("Маны нет, вы пропускаете ход");
        }
    }

}
