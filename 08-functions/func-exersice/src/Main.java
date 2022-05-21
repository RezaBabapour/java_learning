//f(n)=f(n-1)+f(n-2)
public class Main {


    public static int sum(int[] numbers){
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        return sum;
    }
    public static int recFibo(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return recFibo(n-1)+ recFibo(n-2);
    }

    public static int fibo(int n){
        int f0 = 0, f1 = 1, f2 = 0;
        for (int i = 0; i < n; i++) {
            f2 = f1 + f0;
            f1 = f0;
            f0 = f2;
        }
        return f2;
    }
    public static void main(String[] args) {
//        int n=10;
//        int f0=1,f1=0,f2=0;
//        for (int i = 0; i <n ; i++) {
//            f2=f1+f0;
//            System.out.println(f2);
//            f0=f1;
//            f1=f2;
//        }
//        System.out.println("fibonacci is ="+f2);
        System.out.println(fibo(10));
        System.out.println(recFibo(10));


        int[] array = {5,6,1,8,0,12};
        System.out.println(sum(array));


    }
}