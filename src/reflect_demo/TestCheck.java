package reflect_demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        Class cls = c.getClass();

        Method[] methods = cls.getMethods();

        for(Method method : methods){
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //方法名称
                    String mn = method.getName();
                    //异常的名称
                    String ec = e.getCause().getClass().getSimpleName();
                    //异常的原因
                    String er = e.getCause().getMessage();
                    e.printStackTrace();
                }
            }
        }
    }
}
