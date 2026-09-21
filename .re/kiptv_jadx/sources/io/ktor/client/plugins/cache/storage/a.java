package io.ktor.client.plugins.cache.storage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23343h;

    public /* synthetic */ a(int i3) {
        this.f23343h = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f23343h) {
            case 0:
                return io.ktor.client.plugins.cache.storage.FileCacheStorage.readCache$lambda$2();
            case 1:
                return io.ktor.client.plugins.cache.storage.FileCacheStorage.C23632.invokeSuspend$lambda$0();
            case 2:
                return io.ktor.client.plugins.cache.storage.CacheStorage.Companion.Unlimited$lambda$0();
            case 3:
                return io.ktor.client.plugins.cache.storage.HttpCacheStorage.Unlimited$lambda$0();
            case 4:
                return io.ktor.util.collections.ConcurrentSetKt.ConcurrentSet();
            case 5:
                return io.ktor.util.collections.ConcurrentSetKt.ConcurrentSet();
            case 6:
                return io.ktor.util.collections.ConcurrentSetKt.ConcurrentSet();
            default:
                return io.ktor.util.collections.ConcurrentSetKt.ConcurrentSet();
        }
    }
}
