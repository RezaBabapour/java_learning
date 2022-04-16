public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        ++a;
        System.out.println("a = " + ++a);
        System.out.println("a = " + a++);
        System.out.println("a = " + a);
        b = 5;
        System.out.println((a * b) + "   " + (a + b) + "  " + (a - b));

        b = a + b;
        b += a;
        b -= a;
        b *= a;
        b /= a;
        int c = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        c = a%  b;
        System.out.println("a % b = " + c);


        a = 10;
        b = 20;

        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(!(a > b));

        System.out.println(!(a - b > 0));



        if (a > b)
            System.out.println("a > b is true");
        else
            System.out.println("a <= b is true");


        if (a > b && b > 10)
            System.out.println("if with && was true");

        if (a > b || b > 10) {
            System.out.println("if with || was true");
        }

        if (a % 2 != 0)
            System.out.println("a is odd");

    }
}