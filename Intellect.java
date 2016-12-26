package clicker;

import java.util.Random;

public class Intellect {

    Select sell = new Select();
    Random r = new Random();
    private boolean miss;

    public void intAction(Enemy yourHero, Enemy enemyHero) {
        while (true) {

            int i = r.nextInt(0);
            if (i == 0) {
                if (miss == true) {
                    System.out.println("Герой промахнулся!");
                    miss = false;
                    break;
                } else {
                    enemyHero.removeHp(yourHero.getDamage());
                    System.out.println(yourHero.getType().getName() + " наносит удар!: "
                            + "-" + yourHero.getDamage() + " "
                            + enemyHero.getType().getName() + "(" + enemyHero.getHp() + ").");
                    break;
                }
            } else if (i == 1) {
                sell.setMiss(15);
                System.out.println("Пытаеться уклониться");
                break;
            } else if (i == 2) {
                sell.heal(yourHero);
                break;
            } else {
                System.out.println("ИИ решил что выбирать из трёх вариантов скучно и выбрал четвёртый");
                break;
            }
        }
    }

    public void setMiss(boolean mis) {
        miss = mis;
    }

}
