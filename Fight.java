package clicker;

public class Fight {

    public int hp = 1;
    private Enemy attacker;
    private Enemy defender;

    public void Fight() {
        Consol cons = new Consol();
        Intellect intell = new Intellect();

        cons.myClass();

        attacker = cons.getAttacker();
        cons.otherClass();
        defender = cons.getDeffer();

        while (true) {
            if (attacker.getHp() > 0) {
                if (defender.getHp() > 0) {
                    cons.action(attacker, defender);
                    intell.intAction(defender, attacker);
                } else {
                    System.out.println("Битва закончена.Вы победили!");
                    return;
                }
            } else {
                System.out.println("Битва закончена.Вы проиграли.");

                return;
            }

        }

    }
}
