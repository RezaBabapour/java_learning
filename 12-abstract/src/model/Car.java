package model;

public abstract class Car {
    public void move()
    {
        oilCheck();
        waterCheck();
        gasCheck();
        gearCheck();
        acceleration();
    }

    public abstract void gasCheck();
    public abstract void oilCheck();
    public abstract void waterCheck();
    public abstract void gearCheck();
    public abstract void acceleration();
}
