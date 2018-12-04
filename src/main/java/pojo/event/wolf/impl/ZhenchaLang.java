package pojo.event.wolf.impl;

import pojo.event.wolf.interfaces.NormalWolf;
import pojo.event.wolf.interfaces.Wolf;

import java.util.EventObject;

/**
 * 侦查狼
 */
public class ZhenchaLang extends NormalWolf {

    public ZhenchaLang(Wolf wolf){
        this.wolf = wolf;
        this.wolf.attachObserver(this);
    }

    public void reciveEvent(EventObject eventObject) {
        if(eventObject instanceof TalkEvent){
            TalkEvent talkEvent = (TalkEvent) eventObject;
            System.out.println("侦查狼收到通知："+talkEvent.getInfo());
        }
    }
}
