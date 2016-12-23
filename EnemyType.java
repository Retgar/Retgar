package clicker;

public enum EnemyType {
    WARRIOR("Warrior"),
    MAGE("Mage"),
    ROGUE("Rogue");

    private String name;

    EnemyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
