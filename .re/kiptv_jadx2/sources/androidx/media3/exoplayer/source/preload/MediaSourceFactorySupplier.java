package androidx.media3.exoplayer.source.preload;

import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.Cache;
import p068h4.v;

public interface MediaSourceFactorySupplier extends v {
    @Override
    Object get();

    MediaSourceFactorySupplier setCache(Cache cache);

    MediaSourceFactorySupplier setDataSourceFactory(DataSource.Factory factory);
}
