package clicker;

public class Select {

    Intellect intel = new Intellect();

    public void kick(Enemy yourHero, Enemy enemyHero) {

        enemyHero.removeHp(yourHero.getDamage());
        System.out.println(yourHero.getType().getName() + " наносит удар!: "
                + "-" + yourHero.getDamage() + " "
                + enemyHero.getType().getName() + "(" + enemyHero.getHp() + ").");

    }

    public void protection(Enemy enemyHero) {
        System.out.println("Уворот");

    }

    public void heal(Enemy yourHero) {
        yourHero.healHp();
        System.out.println(yourHero.getType().getName() + " Подлечил себя! + 15hp" + yourHero.getHp());
    }

}
