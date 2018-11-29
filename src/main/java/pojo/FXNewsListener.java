package pojo;

import org.springframework.stereotype.Component;

@Component
public class FXNewsListener implements IFXNewsListener {

    public void getNews() {
        System.out.println("get news!");
    }
}
