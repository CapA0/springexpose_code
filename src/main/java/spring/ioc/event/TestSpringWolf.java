package spring.ioc.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.event.springwolf.TalkEvent;

/**
 * Spring实现的狼王发布消息，所有狼监听消息机制
 */
public class TestSpringWolf {

    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("event/event.xml");
        TalkEvent talkEvent = new TalkEvent(ac,"捕猎狼负责捕猎，侦查狼负责侦查");
        ac.publishEvent(talkEvent);
    }
}
