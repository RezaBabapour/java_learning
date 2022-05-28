import sort.Sort;

import java.sql.Array;
import java.util.Arrays;
import java.util.Timer;

public class Main {
    public static void change(int a) {
        a++;
        System.out.println("a in function: " + a);
    }

    public static void main(String[] args) {


        int[] temp = new int[100000];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=(int)(Math.random()*1000);
        }
        Sort.selectionSort(temp);

        System.out.println(Arrays.toString(temp));
    }
}