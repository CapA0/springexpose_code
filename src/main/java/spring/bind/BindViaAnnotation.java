package spring.bind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.IFXNewsProvider;

/**
 * 基于注解注册bean到容器中
 * 需要更换JDK，更换为1.7即可
 */
public class BindViaAnnotation {
    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("bind_annotation.xml");
        IFXNewsProvider ifxNewsProvider = (IFXNewsProvider) container.getBean("FXNewsProvider");
        ifxNewsProvider.getAndPersistNews();
    }
}
