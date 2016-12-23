package clicker;

import java.util.Scanner;

public class Consol {

    public Enemy mage;
    public Enemy warrior;
    public Enemy rogue;
    public Enemy myClass;
    public Enemy otherClass;

    Scanner scanner = new Scanner(System.in);
    Select select = new Select();

    int i;
    int j;
    int d;

    public void myClass() {

        System.out.println("Вам стоит выбрать ваш класс:");

        System.out.println("'1'- Выбрать класс 'war'");
        System.out.println("'2'- Выбрать класс 'mag'");
        System.out.println("'3'- Выбрать класс 'rog'");

    }

    public void otherClass() {

        System.out.println("Теперь вам стоит выбрать класс противника!");
        System.out.println("'1'- Выбрать класс 'war'");
        System.out.println("'2'- Выбрать класс 'mag'");
        System.out.println("'3'- Выбрать класс 'rog'");

    }

    public void action(Enemy myClass, Enemy otherClass) {
        this.myClass = myClass;
        this.otherClass = otherClass;
        System.out.println("Выберите дейстиве!");
        System.out.println("'1'- Ударить по голове противника вашей дубиной");
        System.out.println("'2'- Попытаться увернуться от дубиный противника");
        System.out.println("'3'- Наклееть никотиновый пластырь");

        d = scanner.nextInt();

        if (d == 1) {
            select.kick(myClass, otherClass);
            System.out.println("Вы ударили " + otherClass.getType().getName());
        }
        if (d == 2) {
            select.protection(myClass);
       System.out.println("Вы выбрали класс " + otherClass.getType().getName());
        }
        if (d == 3) {
            select.heal(myClass);
            System.out.println("Вы решили сегодня не курить! +15 к здоровью! ");
        }
    }

    public void enemyBuild() {
        mage = EnemyFactory.getEnemy(EnemyType.MAGE);
        warrior = EnemyFactory.getEnemy(EnemyType.WARRIOR);
        rogue = EnemyFactory.getEnemy(EnemyType.ROGUE);

    }

    public Enemy getAttacker() {
        enemyBuild();
        i = i = scanner.nextInt();
        if (i == 1) {
            myClass = warrior;

        }
        if (i == 2) {
            myClass = mage;

        }
        if (i == 3) {
            myClass = rogue;

        }

        return myClass;
    }

    public Enemy getDeffer() {
        enemyBuild();
        j = scanner.nextInt();
        if (j == 1) {
            otherClass = warrior;

        }
        if (j == 2) {
            otherClass = mage;

        }
        if (j == 3) {
            otherClass = rogue;

        }

        return otherClass;
    }

}
