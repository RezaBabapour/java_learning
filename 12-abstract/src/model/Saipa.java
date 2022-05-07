package model;

public class Saipa extends Car{
    @Override
    public void gasCheck() {
        System.out.println("Saipa gas checked");
    }

    @Override
    public void oilCheck() {
        System.out.println("Saipa oil checked");
    }

    @Override
    public void waterCheck() {
        System.out.println("Saipa water checked");
    }

    @Override
    public void gearCheck() {
        System.out.println("Saipa gear checked");
    }

    @Override
    public void acceleration() {
        System.out.println("Saipa engine accelerated");
    }
}
