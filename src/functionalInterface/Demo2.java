package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo2 {

    //Supplier<T>: 生产型接口, 指定泛型是啥类型, 接口中的get方法就返回啥类型数据
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    //Consumer<T>: 消费型接口, 泛型执行什么类型, 接口中的accept方法就消费什么类型的数据
    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void method2(String name, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(name);
    }

    //对某种类型的数据进行判断,返回一个布尔值
    public static boolean method3(String s, Predicate<String> pre){
        return pre.test(s);
    }

    //对某种类型的数据进行判断,返回一个布尔值
    public static boolean method4(String s, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }

    //对某种类型的数据进行判断,返回一个布尔值
    public static boolean method5(String s, Predicate<String> pre1){
//        return !pre1.test(s);
        return pre1.negate().test(s);
    }

    public static boolean method6(String s, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);
    }

    public static void method7(String s, Function<String, Integer> fun){
        int i = fun.apply(s);
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println(getString(() -> {
            return "sss1";
        }));

        System.out.println(getString(() -> "sss2"));

        method("陈世青", (a) -> {
            //对传递的字符串进行消费
            //消费方式: 直接输出字符串
            System.out.println("消费方式->直接输出字符串: " + a);

            //消费方式: 反转字符串
            System.out.println("消费方式->反转字符串: " + new StringBuffer(a).reverse().toString());
        });

        method2("毛青兰", (t)->{
            System.out.println("连续消费1: "+ t);
        }, (t)->{
            System.out.println("连续消费2: "+ t);
        });

        if(
                method3("aswd", (str)->str.length() > 3)
        ){
            System.out.println("测试3");
        }

        method7("1234", (s)->{
            return Integer.parseInt(s);
        });
    }
}
