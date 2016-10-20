package android.istat.freedev.cache;

import android.istat.freedev.cache.interfaces.CacheEventListener;

/**
 * Created by istat on 14/10/16.
 */

public class MemoryCache extends Cache {
    @Override
    public void setCacheEventListener(CacheEventListener listener) {

    }

    @Override
    public Object get(String key) {
        return null;
    }

    @Override
    public void put(String key, Object value) {

    }

    @Override
    public boolean remove(String key) {
        return false;
    }

    @Override
    public long getEntryLiveTime() {
        return 0;
    }

    @Override
    public long getEntryInsertTime() {
        return 0;
    }

    @Override
    public boolean contain(String key) {
        return false;
    }

    @Override
    public void invalidate() {

    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public long getMaxSize() {
        return 0;
    }

    @Override
    public long getFreeSpace() {
        return 0;
    }
}
