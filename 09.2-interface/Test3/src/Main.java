public class Main {
    public static void main(String[] args) {
        Main obj = new Main();

            obj.methodWithException();



    }
    public void methodWithException() throws Exception
    {
        System.out.println(1/0);
    }

}