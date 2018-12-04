package spring.ioc.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.IFXNewsProvider;

/**
 * 测试静态工厂方法注入的实例
 */
public class TestStaticFactory {

    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bind_staticfactory.xml");
        IFXNewsProvider newsProvider = (IFXNewsProvider) applicationContext.getBean("newsProvider");
        newsProvider.getAndPersistNews();
    }
}
