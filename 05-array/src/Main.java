public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("myArray is " + myArray[i]);
        }

        for (int j : myArray) {
            System.out.println("myArray is " + myArray[j]);
        }

        int[] tmpArray = {1, 57, 23, 656, 2, 5};
        int sum = 0;
        for (int i = 0; i < tmpArray.length; i++) {
            sum += tmpArray[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / tmpArray.length);

    }
}