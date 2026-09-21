package io.ktor.client.plugins.cache.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/io/File;", "directory", "LS7/w;", "dispatcher", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "FileStorage", "(Ljava/io/File;LS7/w;)Lio/ktor/client/plugins/cache/storage/CacheStorage;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileCacheStorageKt {
    public static final io.ktor.client.plugins.cache.storage.CacheStorage FileStorage(java.io.File directory, S7.AbstractC0906w dispatcher) {
        kotlin.jvm.internal.m.e(directory, "directory");
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        return new io.ktor.client.plugins.cache.storage.CachingCacheStorage(new io.ktor.client.plugins.cache.storage.FileCacheStorage(directory, dispatcher));
    }

    public static io.ktor.client.plugins.cache.storage.CacheStorage FileStorage$default(java.io.File file, S7.AbstractC0906w abstractC0906w, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            Z7.e eVar = S7.M.f9549a;
            abstractC0906w = Z7.d.f13044i;
        }
        return FileStorage(file, abstractC0906w);
    }
}
