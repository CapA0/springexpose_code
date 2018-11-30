package spring.testfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.IFXNewsProvider;

/**
 * 测试实例工厂类得到provider实例
 */
public class TestFactory {

    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bind_factory.xml");
        IFXNewsProvider newsProvider = (IFXNewsProvider) applicationContext.getBean("newsProvider");
        newsProvider.getAndPersistNews();
    }
}
