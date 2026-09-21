package androidx.media3.datasource.cache;

import D1.C0223h;
import androidx.media3.datasource.DataSpec;

public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new C0223h(13);

    static String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }

    String buildCacheKey(DataSpec dataSpec);
}
