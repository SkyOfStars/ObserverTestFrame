package nan.hui.com.watchframe;

import java.util.Observable;

/**
 * Created by caoyanyan on 2017/3/27.
 */

public class WatcherAble  extends Observable {
    public static WatcherAble instance=null;
    private WatcherAble(){}
    public static WatcherAble getInstance(){
        if (instance == null) {
            instance = new WatcherAble();
        }
        return instance;
    }
    public void notifyDataChange(Data data) {
        //被观察者怎么通知观察者数据有改变了呢？？这里的两个方法是关键。
        setChanged();
        notifyObservers(data);
    }
}
