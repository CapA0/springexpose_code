package spring.bind;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import pojo.IFXNewsProvider;

/**
 * 通过properties配置文件注册bean到容器中
 */
public class BindViaProperties {
    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanFactory beanFactory = bindViaProperties(defaultListableBeanFactory);
        IFXNewsProvider ifxNewsProvider = (IFXNewsProvider) beanFactory.getBean("newsProvider");
        ifxNewsProvider.getAndPersistNews();
    }

    private static BeanFactory bindViaProperties(DefaultListableBeanFactory registry) {
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("classpath:bind.properties");
        return registry;
    }


}
