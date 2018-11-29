package pojo;

import org.springframework.stereotype.Component;

@Component
public class FXNewsPersister implements IFXNewsPersister {
    public void persistNews() {
        System.out.println("persist news!");
    }
}
