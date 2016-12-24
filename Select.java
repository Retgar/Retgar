package clicker;

public class Select {

    public void kick(Enemy yourHero, Enemy enemyHero) {

        //  System.out.println(yourHero.getType().getName() + "Промахнулся!");
        enemyHero.removeHp(yourHero.getDamage());
        System.out.println(yourHero.getType().getName() + " наносит удар!: "
                + "-" + yourHero.getDamage() + " "
                + enemyHero.getType().getName() + "(" + enemyHero.getHp() + ").");
    }

    public void protection(Enemy hero) {

        System.out.println("Уворот");

    }

    public void heal(Enemy yourHero) {
        yourHero.healHp();
        System.out.println(yourHero.getType().getName() + " Подлечил себя! + 15hp" + yourHero.getHp());
    }

}
