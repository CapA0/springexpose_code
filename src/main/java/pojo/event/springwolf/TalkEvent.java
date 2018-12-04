package pojo.event.springwolf;

import org.springframework.context.ApplicationEvent;

/**
 * Spring实现的Event
 */
public class TalkEvent extends ApplicationEvent {

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
