package pojo.event.wolf.interfaces;

import java.util.EventObject;

/**
 * 狼王接口，狼群中只有一个狼王，被观察者
 * 博客地址：https://segmentfault.com/a/1190000012295887
 */
public interface Wolf{
    /**
     * 注册观察者
     * @param normalWolf
     */
    void attachObserver(NormalWolf normalWolf);

    /**
     * 注销观察者
     * @param normalWolf
     */
    void detchObserver(NormalWolf normalWolf);

    /**
     * 通知观察者
     */
    void notifyObserver(EventObject eventObject);
}
