package clicker;

public class Select {

    Intellect intel = new Intellect();

    public void kick(Enemy attacker, Enemy defender) {

        System.out.println(attacker.getType().getName() + "Промахнулся!");

        defender.removeHp(attacker.getDamage());
        System.out.println(attacker.getType().getName() + " наносит удар!: "
                + "-" + attacker.getDamage()
                + defender.getType().getName() + "(" + defender.getHp() + ").");
    }

    public void protection(Enemy defender) {

        System.out.println("Уворот");

    }

    public void heal(Enemy defender) {
        defender.healHp();
        System.out.println(defender.getType().getName() + " Подлечил себя! + 15hp" + defender.getHp());
    }

}
