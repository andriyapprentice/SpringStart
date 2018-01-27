package ua.com.owu.run;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (ConfigurableApplicationContext context
                     = new ClassPathXmlApplicationContext("classpath:/META-INF/context.xml");
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("!!!!!input name and age!!!!!");
            String name = scanner.next();
            int age = scanner.nextInt();
//             UserService userService= (UserService) context.getBean("UserService");

            UserService bean = context.getBean(UserService.class);
            bean.insert(new User(name, age));
        }
//    context.close();
    }
}
