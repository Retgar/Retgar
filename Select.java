package clicker;

public class Select {

    private boolean miss;
    Intellect intel = new Intellect();

    public void kick(Enemy yourHero, Enemy enemyHero) {

        if (miss == true) {
            System.out.println("Промах");
            miss=false;
        } else {
            enemyHero.removeHp(yourHero.getDamage());
            System.out.println(yourHero.getType().getName() + " наносит удар!: "
                    + "-" + yourHero.getDamage() + " "
                    + enemyHero.getType().getName() + "(" + enemyHero.getHp() + ").");
        }
    }

    public void protection(Enemy enemyHero) {
        intel.setMiss(true);
        System.out.println("Уворот");

    }

    public void heal(Enemy yourHero) {
        yourHero.healHp();
        System.out.println(yourHero.getType().getName() + " Подлечил себя! + 15hp" + yourHero.getHp());
    }

    public void setMiss(boolean mis) {
        miss = mis;
    }

   
}
