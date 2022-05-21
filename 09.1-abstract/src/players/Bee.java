package players;

public class Bee extends Player{


    public Bee(int health, int armor, int attackDamage) {
        super(health, armor, attackDamage);
    }

    @Override
    public void sound() {
        System.out.println("viz viz");
    }
}
