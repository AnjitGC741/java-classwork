
public class Main {
    public static void main(String[] args) {
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        p1.start();
        p2.start();
    }
}
class Process1 extends  Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<=100)
        {
            System.out.println("process 1 is calling");
            i++;
        }
        }
}
class Process2 extends  Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<=100)
        {
            System.out.println("process 2 calling");
            i++;
        }

    }
}
