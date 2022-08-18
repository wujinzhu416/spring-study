import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //动态代理代理的是接口，此处用Impl类会出现代理错误
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }
}
