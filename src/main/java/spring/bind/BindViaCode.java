package spring.bind;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import pojo.FXNewsListener;
import pojo.FXNewsPersister;
import pojo.FXNewsProvider;
import pojo.IFXNewsProvider;

/**
 * 通过直接编码注册bean并绑定到BeanFactory
 */
public class BindViaCode {

    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanFactory container = bindViaCode(defaultListableBeanFactory);
        IFXNewsProvider ifxNewsProvider = (IFXNewsProvider) container.getBean("newsProvider");
        ifxNewsProvider.getAndPersistNews();
    }

    private static BeanFactory bindViaCode(DefaultListableBeanFactory registry) {
        //创建BeanDefinition
        RootBeanDefinition newsProvider = new RootBeanDefinition(FXNewsProvider.class, true);
        RootBeanDefinition newsListener = new RootBeanDefinition(FXNewsListener.class, true);
        RootBeanDefinition newsPersister = new RootBeanDefinition(FXNewsPersister.class, true);
        //注册到容器中
        registry.registerBeanDefinition("newsProvider",newsProvider);
        registry.registerBeanDefinition("newsListener",newsListener);
        registry.registerBeanDefinition("newsPersister",newsPersister);
        //创建依赖关系
        ConstructorArgumentValues argValues = new ConstructorArgumentValues();
        argValues.addIndexedArgumentValue(0,newsListener);
        argValues.addIndexedArgumentValue(1,newsPersister);
        newsProvider.setConstructorArgumentValues(argValues);
        return registry;
    }

}
