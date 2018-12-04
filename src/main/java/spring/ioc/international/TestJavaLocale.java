package spring.ioc.international;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 测试JAVA SE的国际化支持
 */
public class TestJavaLocale {
    public static void main(String[] args) {
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("content",Locale.CHINA);
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("content",Locale.US);

        System.out.println("us-US:" + resourceBundle2.getString("helloWorld"));
        System.out.println("us-US:" + String.format(resourceBundle2.getString("time"), "08:00"));
        System.out.println("zh-CN：" + resourceBundle1.getString("helloWorld"));
        System.out.println("zh-CN：" + String.format(resourceBundle1.getString("time"), "08:00"));
    }
}
