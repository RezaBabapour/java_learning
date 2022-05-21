package players;

public class Ninja extends Player{

    public Ninja(int health, int armor, int attackDamage) {
        super(health, armor, attackDamage);
    }
    public void sound(){
        System.out.println("vay vay");
    }
}
