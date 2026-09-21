package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aW\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"K", "V", "Lkotlin/Function1;", "supplier", "Lh6/A;", "close", "", "maxSize", "", "createLRUCache", "(Lx6/j;Lx6/j;I)Ljava/util/Map;", "CACHE_INITIAL_CAPACITY", "I", "", "CACHE_LOAD_FACTOR", "F", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CacheKt {
    private static final int CACHE_INITIAL_CAPACITY = 10;
    private static final float CACHE_LOAD_FACTOR = 0.75f;

    @io.ktor.utils.io.InternalAPI
    public static final <K, V> java.util.Map<K, V> createLRUCache(p194x6.j supplier, p194x6.j close, int i3) {
        kotlin.jvm.internal.m.e(supplier, "supplier");
        kotlin.jvm.internal.m.e(close, "close");
        java.util.Map<K, V> mapSynchronizedMap = java.util.Collections.synchronizedMap(new io.ktor.util.LRUCache(supplier, close, i3));
        kotlin.jvm.internal.m.d(mapSynchronizedMap, "synchronizedMap(...)");
        return mapSynchronizedMap;
    }
}
