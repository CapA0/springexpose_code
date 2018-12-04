package spring.ioc.bind;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import pojo.IFXNewsProvider;

/**
 * 通过XML注册bean到容器中
 */
public class BindViaXml {
    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanFactory beanFactory = bindViaXml(defaultListableBeanFactory);
        IFXNewsProvider newsProvider = (IFXNewsProvider) beanFactory.getBean("newsProvider");
        newsProvider.getAndPersistNews();
    }

    private static BeanFactory bindViaXml(DefaultListableBeanFactory registry) {
        //两种写法
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("classpath:bind.xml");
        return registry;
        //return new XmlBeanFactory(new ClassPathResource("bind.xml"));

    }


}
