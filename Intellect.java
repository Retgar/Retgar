package clicker;

public class Intellect {

    
    Select sell = new Select();

    public void intAction(Enemy yourHero, Enemy enemyHero) {

        int i = 0;//r.nextInt(3);

        if (i == 0) {

            enemyHero.removeHp(yourHero.getDamage());
            System.out.println(yourHero.getType().getName() + " наносит удар!: "
                    + "-" + yourHero.getDamage() + " "
                    + enemyHero.getType().getName() + "(" + enemyHero.getHp() + ").");
            
        } else if (i == 1) {

        } else if (i == 2) {
            sell.heal(yourHero);

        } else {
            System.out.println("ИИ решил что выбирать из трёх вариантов скучно и выбрал четвёртый");
        }

    }

}
