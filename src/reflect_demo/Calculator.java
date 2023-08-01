package reflect_demo;

public class Calculator {

    @Check
    public void add(){
        System.out.println("加法");
    }

    @Check
    public void sub(){
        System.out.println("减法");
    }

    @Check
    public void mul(){
        System.out.println("乘法");
    }

    @Check
    public void div(){
        System.out.println("除法");
    }

    public void show(){
        System.out.println("测试");
    }
}
