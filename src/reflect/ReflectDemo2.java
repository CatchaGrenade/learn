package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {
    //获取Class对象的方式
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1,多用于配置文件， 将类名定义在配置文件中，读取文件加载类
        Class cls1 = Class.forName("reflect.Person");
        System.out.println(cls1);

        Constructor cons = cls1.getConstructor();
        System.out.println(cons);

        Constructor cons1 = cls1.getConstructor(String.class, int.class);
        System.out.println(cons1);
        Object person = cons1.newInstance("张三", 19);
        System.out.println(person);

    }
}
