package spring.extend;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyOverrideConfigurer;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import pojo.extend.MockPlaceHolderPojo;
import pojo.extend.MyPropertyPlaceHolderConfigurer;

/**
 * PropertyPlaceHolderConfigurer的测试类，使用BeanFactory和ApplicationContext
 */
public class TestPlaceHolderConfigurer {
    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("extend/extend_placeholder.xml"));
        //测试原始的类
        //PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
        //propertyPlaceholderConfigurer.setLocation(new ClassPathResource("extend/placeholder.properties"));
        //propertyPlaceholderConfigurer.postProcessBeanFactory((ConfigurableListableBeanFactory) beanFactory);

        //测试加入解密算法的类(ABC 会被解密成 a+c 其他字符为)
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new MyPropertyPlaceHolderConfigurer();
        propertyPlaceholderConfigurer.setLocation(new ClassPathResource("extend/placeholder.properties"));
        propertyPlaceholderConfigurer.postProcessBeanFactory((ConfigurableListableBeanFactory) beanFactory);

        // 替换字符串
        PropertyOverrideConfigurer propertyOverrideConfigurer = new PropertyOverrideConfigurer();
        propertyOverrideConfigurer.setLocation(new ClassPathResource("extend/override.properties"));
        propertyOverrideConfigurer.postProcessBeanFactory((ConfigurableListableBeanFactory) beanFactory);

        MockPlaceHolderPojo pojo = (MockPlaceHolderPojo) beanFactory.getBean("placeHolder");
        System.out.println(pojo.toString());
    }
}
