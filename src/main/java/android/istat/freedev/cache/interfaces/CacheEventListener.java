package android.istat.freedev.cache.interfaces;

/**
 * Created by istat on 14/10/16.
 */

public interface CacheEventListener<T, Y extends DataStorage<T>> {
    public void onPut(Y storage, String key, T value, boolean contain);

    public void onRemove(Y storage, String key);

    public void onGarbage(Y storage);

    public void onInvalidated(Y storage);
}
