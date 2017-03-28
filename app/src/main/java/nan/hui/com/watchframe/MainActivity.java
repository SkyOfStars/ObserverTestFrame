package nan.hui.com.watchframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Observable;

public class MainActivity extends AppCompatActivity {

    private Watcher mWatcher = new Watcher() {
        @Override
        public void update(Observable o, Object arg) {
            super.update(o, arg);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //模拟被观察者数据改变，更新数据。
//        Data mData = new Data();
//        mData.setDataChange(0);
//        WatcherAble.getInstance().notifyDataChange(mData);
    }

    @Override
    protected void onResume() {
        super.onResume();
        WatcherAble.getInstance().addObserver(mWatcher);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        WatcherAble.getInstance().deleteObserver(mWatcher);
    }
}
