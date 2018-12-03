package spring.resource;

import org.springframework.core.io.*;

/**
 * 测试文件系统资源加载
 */
public class TestFileSystemResourceLoader {
    public static void main(String[] args) {
        ResourceLoader resourceLoader = new FileSystemResourceLoader();
        Resource resource1 = resourceLoader.getResource("D:/spring21site/README");
        System.out.println(resource1 instanceof ClassPathResource);
        System.out.println(resource1 instanceof UrlResource);
        System.out.println(resource1 instanceof FileSystemResource);
        System.out.println(resource1.exists());
    }
}
