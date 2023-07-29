package reflect;

import java.lang.reflect.Field;

public class ReflectDemo1 {
    //获取Class对象的方式
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //1,多用于配置文件， 将类名定义在配置文件中，读取文件加载类
        Class cls1 = Class.forName("reflect.Person");
        System.out.println(cls1);

        //2多用于参数的传递
        Class  cls2 = Person.class;
        System.out.println(cls2);

        //3多用于对象的获取字节码方式
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);
        System.out.println(cls2 == cls3);


        System.out.println("-----------------");

        Field[] fields = cls1.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        Field a = cls1.getField("a");
        Object val = a.get(p);
        System.out.println(val);

        a.set(p, "张三");
        System.out.println(p.toString());

        System.out.println("-----------------");

        Field[] fields1 = cls1.getDeclaredFields();
        for (int i = 0; i < fields1.length; i++) {
            System.out.println(fields1[i]);
        }
        Field b = cls1.getDeclaredField("age");
        //访问非public成员变量时 ， 需要忽略权限修饰符的安全检查
        b.setAccessible(true);//暴力反射
        Object val1 = b.get(p);
        System.out.println(val1);


    }
}
