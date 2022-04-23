public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int power(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        return result;
    }

    public static int max(int first, int second) {
        if (first >= second)
            return first;
        else return second;
    }

    public static void main(String[] args) {
        System.out.println("example1:");
        int num1 = 5, num2 = 8;
        System.out.println("Sum is : " + sum(num1, num2));

        System.out.println("example2:");
        System.out.println("Power is : " + power(num1, num2));

        System.out.println("example3:");
        System.out.println("Max is :" + max(num1, num2));

        System.out.println("example 4:");
        System.out.println("Print 2 powers");
        for (int i = 0; i <= 10; i++) {
            System.out.println(power(2, i));
        }


    }
}