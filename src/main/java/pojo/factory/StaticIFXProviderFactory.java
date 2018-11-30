package pojo.factory;


import pojo.FXNewsProvider;
import pojo.IFXNewsListener;
import pojo.IFXNewsPersister;
import pojo.IFXNewsProvider;

/**
 * 静态工厂类，通过静态方法返回IFXProvider的实现类实例
 */
public class StaticIFXProviderFactory {
    public static IFXNewsProvider getInstance(IFXNewsListener fxNewsListener,IFXNewsPersister fxNewsPersister){
        return new FXNewsProvider(fxNewsListener,fxNewsPersister);
    }
}
