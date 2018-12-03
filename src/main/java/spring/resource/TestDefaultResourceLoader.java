package spring.resource;

import org.springframework.core.io.*;

import java.io.IOException;

/**
 * 测试默认资源加载的行为
 */
public class TestDefaultResourceLoader {
    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) throws IOException {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource fake = resourceLoader.getResource("D:/spring21site/README");
        System.out.println(fake instanceof ClassPathResource);
        System.out.println("是否存在："+fake.exists());

        Resource resource1 = resourceLoader.getResource("file:D:/spring21site/README");
        System.out.println(resource1 instanceof UrlResource);

        Resource resource2 = resourceLoader.getResource("https://www.baidu.com");
        System.out.println(resource2 instanceof UrlResource);

        System.out.println(resource1.getFile());
        System.out.println(resource2.getFile());
    }
}
