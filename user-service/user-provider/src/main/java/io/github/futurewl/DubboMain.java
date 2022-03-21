package io.github.futurewl;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:/META-INF/user-provider.xml");
        context.start();
//        System.in.read();
        Main.main(args);
    }
}
