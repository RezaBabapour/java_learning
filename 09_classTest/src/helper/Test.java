package helper;

public class Test {
    public static float pi = 3.14f;

    public static float getPi(){
        return pi;
    }
    int number;
    String name;

    public void setNumber(int number) {
        this.number = number;
    }

    public int sum(int a) {
        return this.number + a;
    }

    public int getNumber() {
        return number;
    }
}