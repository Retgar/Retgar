package clicker;

import java.util.Scanner;

public class Consol {

    private Enemy mage;
    private Enemy warrior;
    private Enemy rogue;
    private Enemy yourHero;
    private Enemy enemyHero;
    private int miss;

    Scanner scanner = new Scanner(System.in);
    Select select = new Select();

    public void action(Enemy yourHero, Enemy enemyHero) {
        int d;
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

        int i;
        enemyBuild();

        while (true) {

            i = scanner.nextInt();

            if (i == 1) {
                yourHero = warrior;
                return yourHero;
            } else if (i == 2) {
                yourHero = mage;
                return yourHero;
            } else if (i == 3) {
                yourHero = rogue;
                return yourHero;
            } else {
                System.out.println("Введи число от 1 до 3");
            }
        }
    }

    public Enemy getDeffer() {

        int j;
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
