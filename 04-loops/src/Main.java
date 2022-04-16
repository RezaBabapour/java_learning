public class Main {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("while loop test");
        while (i <= 10) {
            System.out.println("i =" + i);
            i++;
        }

        i = 9;
        System.out.println("do while loop test");
        do {
            System.out.println("i = " + i);
            i++;
        } while (i > 10);

        System.out.println("For loop test: ");
        for (i = 0; i < 10; i++)
            System.out.println("i = " + i);

        System.out.println("Test for break");
        for (i = 0; ; i++) {
            if (i == 10) {
                System.out.println("break happend");
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("Test for continue");
        for (i = 0; ; i++) {
            if (i == 10)
                break;
            if (i % 2 == 0)
                continue;
            System.out.println("i = " + i);
        }
    }
}