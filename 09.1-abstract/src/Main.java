import players.*;

public class Main {
    public static void main(String[] args) {
        Ninja n1=new Ninja(100,10,20);
        Ninja n2=new Ninja(100,10,20);
        Bee b1=new Bee(100,10,10);
        n2.attack(n1);
        b1.sound();
        n1.sound();
        Player[] players=new Player[2];
        players[0]=new Ninja(100,10,20);
        players[1]=new Bee(100,10,20);
        players[0].sound();
        players[1].sound();


    }
}