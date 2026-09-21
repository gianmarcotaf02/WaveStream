package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public interface MediaSourceFactorySupplier extends p068h4.v {
    @Override // p068h4.v
    /* synthetic */ java.lang.Object get();

    androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier setCache(androidx.media3.datasource.cache.Cache cache);

    androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory);
}
