package clicker;

import java.util.Random;

public class Intellect {

    Consol cons = new Consol();
    Random r = new Random();
    Select sell = new Select();
    Enemy intell;
    Enemy player;

    public void intAction(Enemy intell, Enemy player) {
        this.player = player;
        this.intell = intell;

        int i = 0;//r.nextInt(3);

        if (i == 0) {

            player.removeHp(intell.getDamage());
            System.out.println(intell.getType().getName() + " наносит удар!: "
                    + "-" + intell.getDamage() + " "
                    + player.getType().getName() + "(" + player.getHp() + ").");

        }

        if (i == 1) {

            System.out.println("Попытка уклонения");
            //      sell.protection(intell);

        }
        if (i == 2) {
            sell.heal(intell);

        }

    }

}
