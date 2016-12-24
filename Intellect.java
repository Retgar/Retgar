package clicker;

import java.util.Random;

public class Intellect {

    Random r = new Random();
    Select sell = new Select();

    public void intAction(Enemy yourHero, Enemy enemyHero) {

        int i = 0;//r.nextInt(3);

        if (i == 0) {
            sell.kick(yourHero, enemyHero);
        } else if (i == 1) {

            System.out.println("Попытка уклонения");
            //      sell.protection(intell);

        } else if (i == 2) {
            sell.heal(yourHero);

        } else {
            System.out.println("ИИ решил что выбирать из трёх вариантов скучно и выбрал четвёртый");
        }

    }

}
