import java.util.Random;

public class Util {

    private Object fir;
    protected double hp = 100;
    protected int defence = 100;
    protected double power = 10.0;
    protected double CriticalChance = 0.1;
    protected double ParryChance = 0.1;


    public Util() {

    }

    public double getHp(){//getter <--называется
        if (hp <= 0) {
            return 0;
        }
        return hp;
    }
    public void setHp(int hp){//сеттер
        this.hp = hp;//первому хп присваевается знач-е с метода
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public double getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getCriticalChance() {
        return CriticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        CriticalChance = criticalChance;
    }

    public double getParryChance() {
        return ParryChance;
    }

    public void setParryChance(double parryChance) {
        ParryChance = parryChance;
    }

    public void attack(Util unit){

        Random random = new Random();
        double crit = 1.0;
        double rand = (random.nextInt(10) + 1) / 10;
        if (unit.CriticalChance <= rand) {
            crit += unit.CriticalChance;
        }
        unit.getDammage(power*crit);
    }

    public void getDammage(double dammage){
        this.hp -= dammage;
    }

    @Override
    public String toString() {
        if (hp < 0){
            hp = 0;
        }
        return "Unit{" +
                "hp=" + hp +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }

    public void Hello(String name){
        System.out.println(name +", а вы не из робкого десятка!");
        System.out.println("Теперь, Вам надо выбрать тройку игроков, которые будут биться за Вас в схватке");
        System.out.println("Есть три типа персонажей: маг, рыцарь и терминатор. Выбери три своих скрепыша (в порядке их участия в битве)!!");
        System.out.println("Введите три ЦИФРЫ: маг(1), рыцарь(2), терминатор(3)");
    }

    public void wiz(int num){
        switch (num){
            case 1:
                fir = new Wizard();
                break;
            case 2:
                fir = new Knight();
                break;
            case 3:
                fir = new Terminator();
                break;
            default:
                break;
        }
    }
    public Object getCharacter() {
        return fir; // Метод для возврата объекта Knight, Wizard или Terminator
    }
}
