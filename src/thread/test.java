package thread;

public class test {
    public static void main(String[] args) {

        Thread1 t = new Thread1();
        t.start();
        System.out.println(t.getName());

        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
