package clicker;

public class Fight {

    public int hp = 1;
    private Enemy player;
    private Enemy intellectI;


    Intellect intel = new Intellect();

    public void Fight() {
        Consol cons = new Consol();
        Intellect intell = new Intellect();

        System.out.println(
                "Вам стоит выбрать ваш класс:");
        System.out.println(
                "'1'- Выбрать класс 'war'");
        System.out.println(
                "'2'- Выбрать класс 'mag'");
        System.out.println(
                "'3'- Выбрать класс 'rog'");
        player = cons.getAttacker();

        System.out.println(
                "Теперь вам стоит выбрать класс противника!");
        System.out.println(
                "'1'- Выбрать класс 'war'");
        System.out.println(
                "'2'- Выбрать класс 'mag'");
        System.out.println(
                "'3'- Выбрать класс 'rog'");

        intellectI = cons.getDeffer();

        while (true) {
           
            if (player.getHp() > 0) {
                if (intellectI.getHp() > 0) {

                    System.out.println("Выберите дейстиве!");
                    System.out.println("'1'- Ударить по голове противника вашей дубиной");
                    System.out.println("'2'- Попытаться увернуться от дубиный противника");
                    System.out.println("'3'- Наклееть никотиновый пластырь");

                    cons.action(player, intellectI);
                    intell.intAction(intellectI, player);
                } else {
                    System.out.println("Битва закончена.Вы победили!");
                    break;
                }
            } else {
                System.out.println("Битва закончена.Вы проиграли.");

                break;
            }

        }

    }
}
