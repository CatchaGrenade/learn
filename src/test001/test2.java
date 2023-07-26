package test001;

public class test2 {
    private static int i = 0;
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        i++;
        System.out.println(i);
        a();
    }
}

