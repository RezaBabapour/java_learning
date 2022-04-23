public class Main {
    public static void main(String[] args) {

        System.out.println("example #1");
        int number = 13;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        System.out.println("example #2");
        String output = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(output);

        System.out.println("example #3");
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        System.out.println("example #4");
        number = -13;
        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }

    }
}