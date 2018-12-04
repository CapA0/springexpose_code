package pojo.event.wolf.impl;

import pojo.event.wolf.interfaces.NormalWolf;
import pojo.event.wolf.interfaces.Wolf;

import java.util.ArrayList;
import java.util.EventObject;

/**
 * 狼王，单例模式
 */
public class LangWang implements Wolf {

    private static LangWang instance;
    private ArrayList<NormalWolf> normalWolves = new ArrayList<NormalWolf>();

    private LangWang(){
    }

    public static LangWang getInstance(){
        if(instance == null){
            synchronized (LangWang.class){
                if(instance == null){
                    instance = new LangWang();
                }
            }
        }
        return instance;
    }

    public void attachObserver(NormalWolf normalWolf) {
        normalWolves.add(normalWolf);
    }

    public void detchObserver(NormalWolf normalWolf) {
        if(normalWolves.contains(normalWolf)){
            normalWolves.remove(normalWolf);
        }
    }

    public void notifyObserver(EventObject eventObject) {
        ArrayList<NormalWolf> copylist = new ArrayList<NormalWolf>(this.normalWolves);
        for (NormalWolf normalWolf: copylist) {
            normalWolf.reciveEvent(eventObject);
        }
    }

    /**
     * 狼王talk
     * @param info
     */
    public void talk(String info){
        TalkEvent talkEvent = new TalkEvent(this,info);
        //System.out.println("talk event info:"+talkEvent.getInfo());
        notifyObserver(talkEvent);
    }
}
