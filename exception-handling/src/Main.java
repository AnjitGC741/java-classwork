public class Main {
    public static void main(String[] args) {
        try{

            int divider = 0;
            int value = 500;
            int result = value/divider;
            System.out.println("Result is "+ result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally {
//            it work even when error occured or not.
            System.out.println("this is finally part");
        }
        anotherWork();
        anotherWork();
        anotherWork();
    }
    static  void anotherWork()
    {
        System.out.println("Work");
    }
}