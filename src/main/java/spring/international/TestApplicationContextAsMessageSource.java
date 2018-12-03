package spring.international;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * 测试ApplicationContext作为MessageSource来获取国际化信息
 * 需要在xml配置文件中注入一个MessageSource实现
 */
public class TestApplicationContextAsMessageSource {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("international/international.xml");
        System.out.println(applicationContext.getMessage("helloWorld", null, Locale.CHINA));
        System.out.println(applicationContext.getMessage("helloWorld",null,Locale.US));
        System.out.println(applicationContext.getMessage("time",new Object[]{"08:00"},Locale.CHINA));
        System.out.println(applicationContext.getMessage("time",new Object[]{"08:00"},Locale.US));
    }

}
