package android.istat.freedev.cache;

import android.istat.freedev.cache.interfaces.CacheEventListener;
import android.istat.freedev.cache.interfaces.DataStorage;
import android.os.Handler;
import android.os.Looper;

import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by istat on 14/10/16.
 */

public abstract class Cache implements DataStorage {
    protected Handler mHandler = new Handler(Looper.getMainLooper());
    final ConcurrentLinkedQueue<CacheEventListener<?, ?>> eventListeners = new ConcurrentLinkedQueue<>();
    HashMap<String, Integer> insertTime = new HashMap<String, Integer>();
    long liveTime = -1;

    public void setEntryLiveTime(long liveTime) {
        this.liveTime = liveTime;
    }

    @Override
    public long getEntryLiveTime() {
        return liveTime;
    }

    @Override
    public long getEntryInsertTime(String entry) {
        return 0;
    }

    @Override
    public void registerCacheEventListener(CacheEventListener listener) {
        this.eventListeners.add(listener);
    }

    @Override
    public void unregisterCacheEventListener(CacheEventListener listener) {
        this.eventListeners.remove(listener);
    }


    public ConcurrentLinkedQueue<CacheEventListener<?, ?>> getEventListeners() {
        return eventListeners;
    }

    public boolean isRegistered(CacheEventListener listener) {
        return eventListeners.contains(listener);
    }

//    protected final <T, Y extends DataStorage<T>> CacheEventListener<T, Y> optEventListener() {
//        try {
//            return (CacheEventListener<T, Y>) eventListener;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
