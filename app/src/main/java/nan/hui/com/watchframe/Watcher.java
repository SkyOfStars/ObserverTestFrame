package nan.hui.com.watchframe;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by caoyanyan on 2017/3/27.
 */

public  abstract class Watcher  implements  Observer {
    @Override
    public void update(Observable o, Object arg) {
    }
}
