package thread;

public class Thread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }

}
