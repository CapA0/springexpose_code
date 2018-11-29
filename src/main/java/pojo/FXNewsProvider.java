package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FXNewsProvider implements IFXNewsProvider {
    @Autowired
    private IFXNewsListener ifxNewsListener;
    @Autowired
    private IFXNewsPersister ifxNewsPersister;

    public FXNewsProvider(IFXNewsListener ifxNewsListener, IFXNewsPersister ifxNewsPersister) {
        this.ifxNewsListener = ifxNewsListener;
        this.ifxNewsPersister = ifxNewsPersister;
    }

    public FXNewsProvider() {
    }

    public IFXNewsListener getIfxNewsListener() {
        return ifxNewsListener;
    }

    public void setIfxNewsListener(IFXNewsListener ifxNewsListener) {
        this.ifxNewsListener = ifxNewsListener;
    }

    public IFXNewsPersister getIfxNewsPersister() {
        return ifxNewsPersister;
    }

    public void setIfxNewsPersister(IFXNewsPersister ifxNewsPersister) {
        this.ifxNewsPersister = ifxNewsPersister;
    }

    public void getAndPersistNews() {
        ifxNewsListener.getNews();
        ifxNewsPersister.persistNews();
    }
}
