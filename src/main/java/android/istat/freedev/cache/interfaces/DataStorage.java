package android.istat.freedev.cache.interfaces;

/**
 * Created by istat on 14/10/16.
 */

public interface DataStorage<T> {
    public void registerCacheEventListener(CacheEventListener<T, ?> listener);

    public void unregisterCacheEventListener(CacheEventListener<T, ?> listener);

    public T get(String key);

    public void put(String key, T value);

    public boolean remove(String key);

    public long getEntryLiveTime();

    public long getEntryInsertTime(String key);

    public boolean contain(String key);

    public void invalidate();

    public long getSize();

    public long getMaxSize();

    public long getFreeSpace();


}
