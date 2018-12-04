package pojo.event.wolf.interfaces;

import java.util.EventObject;

/**
 * 普通狼，观察者，观察狼王所有的事件
 */
public abstract class NormalWolf {

    /**
     * 持有狼王的引用，用于自己注册到狼王那儿
     */
    protected Wolf wolf;

    /**
     * 接收到事件的处理
     */
    public abstract void reciveEvent(EventObject eventObject);
}
