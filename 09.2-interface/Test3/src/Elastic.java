public class Elastic<num0, num1> {
    private num0 a;
    private num1 b;

    public Elastic(num0 a, num1 b) {
        this.a = a;
        this.b = b;
    }

    public num0 getA() {
        return a;
    }

    public void setA(num0 a) {
        this.a = a;
    }

    public num1 getB() {
        return b;
    }

    public void setB(num1 b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Elastic{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}