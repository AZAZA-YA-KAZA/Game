import java.util.Random;
import java.util.Scanner;

public class Scenary extends Main{

    public Scenary() {
        super();
    }

    public String toString() {
        Scanner p = new Scanner(System.in);
        String[] tim1 = {"t", "t", "t"};
        System.out.println("Добро пожаловать на арену смерти! Пожалуйства, представьтесь");
        String na = p.nextLine();
        Util unit1 = new Util();
        unit1.Hello(na);
        int pers11 = p.nextInt(), pers12 = p.nextInt(), pers13 = p.nextInt();
        unit1.wiz(pers11);
        Object character1 = unit1.getCharacter();
        Util pr11 = new Terminator();
        if (character1 instanceof Wizard) {
            tim1[0] = "w";
            pr11 = new Wizard();// Теперь у вас есть объект pr1, который является экземпляром Wizard
        } else if (character1 instanceof Knight) {
            tim1[0] = "k";
            pr11 = new Knight();
        }
        unit1.wiz(pers12);
        Object character2 = unit1.getCharacter();
        Util pr12 = new Terminator();
        if (character2 instanceof Wizard) {
            tim1[1] = "w";
            pr12 = new Wizard();// Теперь у вас есть объект pr1, который является экземпляром Wizard
        } else if (character2 instanceof Knight) {
            tim1[1] = "k";
            pr12 = new Knight();
        }
        unit1.wiz(pers13);
        Object character3 = unit1.getCharacter();
        Util pr13 = new Terminator();
        if (character3 instanceof Wizard) {
            tim1[2] = "w";
            pr13 = new Wizard();// Теперь у вас есть объект pr1, который является экземпляром Wizard
        } else if (character3 instanceof Knight) {
            tim1[2] = "k";
            pr13 = new Knight();
        }

        String[] tim2 = {"t", "t", "t"};
        System.out.println("Добро пожаловать на арену смерти! Пожалуйства, представьтесь");
        Util unit2 = new Util();
        String t = p.nextLine(), n = p.nextLine();
        unit2.Hello(n);
        int pers21 = p.nextInt(), pers22 = p.nextInt(), pers23 = p.nextInt();
        unit2.wiz(pers21);
        Object character21 = unit2.getCharacter();
        Util pr21 = new Terminator();
        if (character21 instanceof Wizard) {
            tim2[0] = "w";
            pr21 = new Wizard();// Теперь у вас есть объект pr1, который является экземпляром Wizard
        } else if (character21 instanceof Knight) {
            tim2[0] = "k";
            pr21 = new Knight();
        }
        unit2.wiz(pers22);
        Object character22 = unit2.getCharacter();
        Util pr22 = new Terminator();
        if (character22 instanceof Wizard) {
            tim2[1] = "w";
            pr22 = new Wizard();// Теперь у вас есть объект pr1, который является экземпляром Wizard
        } else if (character22 instanceof Knight) {
            tim2[1] = "k";
            pr22 = new Knight();
        }
        unit2.wiz(pers23);
        Object character33 = unit2.getCharacter();
        Util pr23 = new Terminator();
        if (character33 instanceof Wizard) {
            tim2[2] = "w";
            pr23 = new Wizard();// Теперь у вас есть объект pr1, который является экземпляром Wizard
        } else if (character33 instanceof Knight) {
            tim2[2] = "k";
            pr23 = new Knight();
        }
        int i = 1, sr = 0, q = 1;
        while ((pr11.getHp() > 0 || pr12.getHp() > 0 || pr13.getHp() > 0) && (pr21.getHp() > 0 || pr22.getHp() > 0 || pr23.getHp() > 0)) {
            Util prot, pr;
            if (q % 2 == 1) {
                sr %= 3;
                pr = pr11;//персоанж наш
                if (sr == 0) {
                    System.out.println("Раунд" + i + ". Ходит игрок " + na + " Сражается " + tim1[0].toUpperCase() + " " + tim1[1] + " " + tim1[2]);
                } else if (sr == 1) {
                    pr = pr12;
                    System.out.println("Раунд" + i + ". Ходит игрок " + na + " Сражается " + tim1[0] + " " + tim1[1].toUpperCase() + " " + tim1[2]);
                } else if (sr == 2) {
                    pr = pr13;
                    System.out.println("Раунд" + i + ". Ходит игрок " + na + " Сражается " + tim1[0] + " " + tim1[1] + " " + tim1[2].toUpperCase());
                }
                System.out.println("Силы противника:\n" + pr21 + "\n" + pr22 + "\n" + pr23);
                System.out.println("Какого бьём?");
                int figh = p.nextInt();
                prot = pr21;
                switch (figh) {
                    case 2:
                        prot = pr22;
                        break;
                    case 3:
                        prot = pr23;
                        break;
                    default:
                        break;
                }
            } else {
                q = 0;
                sr %= 3;
                pr = pr21;//наш персонаж
                if (sr == 0) {
                    System.out.println("Раунд" + i + ". Ходит игрок " + n + " Сражается " + tim2[0].toUpperCase() + " " + tim2[1] + " " + tim2[2]);
                } else if (sr == 1) {
                    pr = pr22;
                    System.out.println("Раунд" + i + ". Ходит игрок " + n + " Сражается " + tim2[0] + " " + tim2[1].toUpperCase() + " " + tim2[2]);
                } else if (sr == 2) {
                    pr = pr23;
                    System.out.println("Раунд" + i + ". Ходит игрок " + n + " Сражается " + tim2[0] + " " + tim2[1] + " " + tim2[2].toUpperCase());
                }
                sr++;
                i++;
                System.out.println("Силы противника:\n" + pr11 + "\n" + pr12 + "\n" + pr13);
                System.out.println("Какого бьём?");
                int figh = p.nextInt();
                prot = pr11;
                switch (figh) {
                    case 2:
                        prot = pr12;
                        break;
                    case 3:
                        prot = pr13;
                        break;
                    default:
                        break;
                }
            }
            q++;
            //отбит ли удар
            // Создаем объект Random
            Random random = new Random();
            // Генерируем случайное число в диапазоне от 1 до 10
            double rand = (random.nextInt(10) + 1) / 10;
            if (prot.ParryChance <= rand) {
                System.out.println("Удар отбит");
            } else {
                pr.attack(prot);
                if (prot.getHp() <= 0) {
                    System.out.println("Критический удар");
                } else {
                    System.out.println("Удар нанесён");
                }
            }
        }
        if (q == 2) {
            System.out.println("Победил игрок 1. Его осн. характеристики:");
            System.out.println(pr11);
            System.out.println(pr12);
            System.out.println(pr13);
        } else {
            System.out.println("Победил игрок 2. Его осн. характеристики:");
            System.out.println(pr21);
            System.out.println(pr22);
            System.out.println(pr23);
        }
        return na;
    }
}
