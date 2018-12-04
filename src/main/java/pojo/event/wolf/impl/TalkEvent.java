package pojo.event.wolf.impl;

import java.util.EventObject;

/**
 * 说话事件
 */
public class TalkEvent extends EventObject {

    private String info;

    public TalkEvent(Object source) {
        super(source);
    }

    public TalkEvent(Object source,String info) {
        super(source);
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
