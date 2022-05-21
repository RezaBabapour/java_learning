public class Main {
    public static void main(String[] args) {
        int[] myarray = {2, 50, 20, 5, 10, 30};
        int tmp;
        sort(myarray);
        search(myarray,6);
        for (int i = 0; i < myarray.length; i++)
            for (int j = 0; j < myarray.length - 1; j++) {
                if (myarray[j] > myarray[j + 1]) {
                tmp = myarray[j+1];
                myarray[j+1]= myarray[j];
                myarray[j] = tmp;
                }
            }
        for (int i = 0 ; i < myarray.length ; i++)
            System.out.print(myarray[i] + ",");
    }

}