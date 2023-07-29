package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo3 {
    //获取Class对象的方式
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1,多用于配置文件， 将类名定义在配置文件中，读取文件加载类
        Class cls1 = Class.forName("reflect.Person");
        System.out.println(cls1);

        Method[] methods = cls1.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }

        Method getName = cls1.getMethod("getName");
        Person p = new Person();
        System.out.println(getName.invoke(p));

        Method eat = cls1.getMethod("eat", String.class);
        eat.invoke(p, "饭");

    }
}
