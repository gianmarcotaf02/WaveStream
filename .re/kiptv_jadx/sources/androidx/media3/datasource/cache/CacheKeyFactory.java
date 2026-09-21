package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public interface CacheKeyFactory {
    public static final androidx.media3.datasource.cache.CacheKeyFactory DEFAULT = new D1.C0223h(13);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ java.lang.String lambda$static$0(androidx.media3.datasource.DataSpec dataSpec) {
        java.lang.String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }

    java.lang.String buildCacheKey(androidx.media3.datasource.DataSpec dataSpec);
}
