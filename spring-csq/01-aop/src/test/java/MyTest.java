import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //动态代理应代理接口
        UserService user = context.getBean("userService", UserService.class);

        user.add();
    }
}
