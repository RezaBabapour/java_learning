package Players;

public class Ninja implements Player{
    int health;
    int attackDamage;
    @Override
    public void jump() {
        System.out.println("ninja is jumping");
    }

    @Override
    public void attack(Player enemy) {
        System.out.println("I attacked "+enemy);
    }

}
