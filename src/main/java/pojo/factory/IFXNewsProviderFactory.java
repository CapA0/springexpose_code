package pojo.factory;

import pojo.FXNewsProvider;
import pojo.IFXNewsProvider;

/**
 * 实例工厂类，通过工厂实例获取Provider实例
 */
public class IFXNewsProviderFactory {
    public IFXNewsProvider getInstance(){
        return new FXNewsProvider();
    }
}
