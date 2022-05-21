public class Main {

    //factoreal
    //power
    //divide
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[]lost={5,8,1,3,2,7,6};
        int sum=0;

        for (int i = 1; i <= 8; i++) {
            sum+=i;
        }
        int lostSum=0;
        for (int i = 0; i<lost.length;i++){
            lostSum+=lost[i];
        }
        System.out.println(sum-lostSum);


        int a = 10;
        int b =0;
        System.out.println(a/b);//divide by zero
    }
}