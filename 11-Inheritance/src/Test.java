// base class or superclass
class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

//subclass
class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gear, int speed,
                        int seatHeight) {
        super(gear,speed);  // invoking base-class(Bicycle) constructor
        this.seatHeight = seatHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

// driver class
public class Test {
    public static void main(String args[]) {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
