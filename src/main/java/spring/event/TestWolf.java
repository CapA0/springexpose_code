package spring.event;

import pojo.event.wolf.impl.BulieLang;
import pojo.event.wolf.impl.LangWang;
import pojo.event.wolf.impl.ZhenchaLang;

public class TestWolf {
    /**
     * 主入口
     * @param args
     */
    public static void main(String[] args) {
        LangWang langWang = LangWang.getInstance();
        ZhenchaLang zhenchaLang = new ZhenchaLang(langWang);
        BulieLang bulieLang = new BulieLang(langWang);
        langWang.talk("捕猎狼负责捕猎，侦查狼负责侦查");
    }
}
