package pojo.event.springwolf;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ZhenChaLang implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof TalkEvent){
            TalkEvent talkEvent = (TalkEvent) event;
            String info = talkEvent.getInfo();
            System.out.println("侦查狼收到信息："+info);
        }
    }
}
