package proxy;
//822
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        //创建真实对象
        Lenovo lenovo = new Lenovo();

        //动态代理
        /*
        类加载器：真实对象.getClass().getClassLoader()
        接口数组：真实对象.getClass().getInterfaces()
        处理器： new InvocationHandler()
         */
        SaleComputer lenovo_proxy = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*
            代理逻辑编写的方法，代理对象调用的所有方法都会触发该方法执行
            proxy：代理对象
            method：代理对象调用的方法被封装成这个对象
            args：代理对象调用方法时，传递的实际参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invoke方法执行了");
//                System.out.println(method.getName());
//                System.out.println(args[0]);
                //1:增强参数
                if(method.getName().equals("sale")){
                    double money = (double) args[0];
                    money = money * 0.85;
                    args[0] = money;
                }
                //使用真实对象调用该方法
                Object o = method.invoke(lenovo, args);
                return o;
            }
        });

//        String msg = lenovo.sale(80.2);
//
//        System.out.println(msg);

        String msg = lenovo_proxy.sale(80.2);
        System.out.println(msg);

        lenovo_proxy.show();
    }
}
