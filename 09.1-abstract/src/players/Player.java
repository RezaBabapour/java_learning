package players;

public abstract class Player {
    int health;
    int armor;
    int attackDamage;
    boolean isNpc;

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public void attack(Player enemy) {
        enemy.health -= (this.attackDamage - enemy.armor);
    }

    public abstract void sound();

    public Player(int health, int armor, int attackDamage) {
        this.health = health;
        this.armor = armor;
        this.attackDamage = attackDamage;
    }
}
