package functionalInterface;

public class Demo {
    //函数式接口的使用
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImpl());

        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口的方法");
            }
        });

        //调用show方法的参数是一个函数式接口， 可以使用lambda表达式
        show(() ->  System.out.println("使用lambda表达式重新接口的方法 "));
    }
}
