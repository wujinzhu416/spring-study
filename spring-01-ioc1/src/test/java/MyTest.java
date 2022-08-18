import org.example.dao.UserDaoMysql;
import org.example.dao.UserDaoOracle;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService =(UserServiceImpl) context.getBean("userService");

        userService.getUser();

    }
}
