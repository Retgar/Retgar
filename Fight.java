package clicker;

public class Fight {

    public int hp = 1;
    private Enemy attacker;
    private Enemy defender;

    public void Fight() {
        Consol cons = new Consol();
        Intellect intell = new Intellect();

        System.out.println("Вам стоит выбрать ваш класс:");
        System.out.println("'1'- Выбрать класс 'war'");
        System.out.println("'2'- Выбрать класс 'mag'");
        System.out.println("'3'- Выбрать класс 'rog'");

        attacker = cons.getAttacker();

        System.out.println("Теперь вам стоит выбрать класс противника!");
        System.out.println("'1'- Выбрать класс 'war'");
        System.out.println("'2'- Выбрать класс 'mag'");
        System.out.println("'3'- Выбрать класс 'rog'");

        defender = cons.getDeffer();

        while (true) {

            System.out.println("Выберите дейстиве!");
            System.out.println("'1'- Ударить по голове противника вашей дубиной");
            System.out.println("'2'- Попытаться увернуться от дубиный противника");
            System.out.println("'3'- Наклееть никотиновый пластырь");

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
