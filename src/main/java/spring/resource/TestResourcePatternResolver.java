package spring.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * ResourcePatternResolver 可以返回多个Resouce
 * 支持classpath*:模式
 * 支持**\/*.suffix模式
 */
public class TestResourcePatternResolver {
    /**
     * 主入口
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        //测试getResources
        Resource[] resources = resourcePatternResolver.getResources("classpath*:bind/*.xml");
        for (int i = 0; i < resources.length; i++) {
            System.out.println(resources[i].getFilename());
            System.out.println(resources[i].exists());
            System.out.println(resources[i].isReadable());
        }
        //测试getResource
        Resource resource = resourcePatternResolver.getResource("D:spring/xml");
        System.out.println(resource instanceof ClassPathResource);
        System.out.println(resource.exists()
        );
    }
}
