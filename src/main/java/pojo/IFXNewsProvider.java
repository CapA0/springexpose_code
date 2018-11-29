package pojo;

/**
 * 新闻提供接口
 */
public interface IFXNewsProvider {
    /**
     * 获取并持久化新闻
     */
    void getAndPersistNews();
}
