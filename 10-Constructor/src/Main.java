public class Main {
    int a;
    int b;
    int c;

    public Main() {
        System.out.println("No args constructor");
    }

    public Main(int a) {
        System.out.println("One arg constructor");
        this.a = a;
    }

    public Main(int a, int b) {
        System.out.println("Two args constructor");
        this.a = a;
        this.b = b;
    }

    public Main(int a, int b, int c) {
        System.out.println("three args constructor");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Main m0=new Main();
        Main m1=new Main(1);
        Main m2=new Main(1,2);
        Main m3=new Main(1,2,3);
    }
}