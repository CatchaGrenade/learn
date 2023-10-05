import com.kuang.mapper.UserMapper;
import com.kuang.mapper.UserMapperImpl;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyTest {

    @Test
    public void test1() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession session = sqlSessionFactory.openSession(true);
//
//        UserMapper userMapper = session.getMapper(UserMapper.class);
//
//        List<User> ls = userMapper.sel();
//
//        System.out.println(ls.toString());

         ApplicationContext cpx = new ClassPathXmlApplicationContext("spring-dao.xml");

         UserMapper userMapper = cpx.getBean("userMapper", UserMapper.class);

        System.out.println(userMapper.sel());
    }
}
