package clicker;

import java.util.Scanner;

public class Consol {

    public Enemy mage;
    public Enemy warrior;
    public Enemy rogue;
    public Enemy yourHero;
    public Enemy enemyHero;

    Scanner scanner = new Scanner(System.in);
    Select select = new Select();

    int i;
    int j;
    int d;

    public void action(Enemy yourHero, Enemy enemyHero) {

        while (true) {

            d = scanner.nextInt();

            if (d == 1) {
                select.kick(yourHero, enemyHero);
                System.out.println("Вы ударили " + enemyHero.getType().getName());
                break;

            } else if (d == 2) {

                select.protection(yourHero);

                break;

            } else if (d == 3) {
                select.heal(yourHero);
                System.out.println("Вы решили сегодня не курить! +15 к здоровью! ");
                break;

            } else {
                System.out.println("Введи число от 1 до 3");
            }
        }
    }

    public void enemyBuild() {
        mage = EnemyFactory.getEnemy(EnemyType.MAGE);
        warrior = EnemyFactory.getEnemy(EnemyType.WARRIOR);
        rogue = EnemyFactory.getEnemy(EnemyType.ROGUE);

    }

    public Enemy getAttacker() {

        enemyBuild();

        while (true) {

            i = scanner.nextInt();

            if (i == 1) {
                enemyHero = warrior;
                return enemyHero;
            } else if (i == 2) {
                enemyHero = mage;
                return enemyHero;
            } else if (i == 3) {
                enemyHero = rogue;
                return enemyHero;
            } else {
                System.out.println("Введи число от 1 до 3");
            }
        }
    }

    public Enemy getDeffer() {

        enemyBuild();

        while (true) {

            j = scanner.nextInt();

            if (j == 1) {
                enemyHero = warrior;
                return enemyHero;
            } else if (j == 2) {
                enemyHero = mage;
                return enemyHero;
            } else if (j == 3) {
                enemyHero = rogue;
                return enemyHero;
            } else {
                System.out.println("Введи число от 1 до 3");
            }
        }

    }

}
