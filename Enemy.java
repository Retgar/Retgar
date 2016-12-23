package clicker;

public class Enemy {
    private int ertw;
    private int hp;
    private int damage;
    private EnemyType type;

    public Enemy(int hp, int damage, EnemyType type) {
        this.hp = hp;
        this.damage = damage;
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void removeHp(int damage) {
        hp -= damage;
    }

    public void healHp() {
        hp += 15;
    }

    public EnemyType getType() {
        return type;
    }

};
