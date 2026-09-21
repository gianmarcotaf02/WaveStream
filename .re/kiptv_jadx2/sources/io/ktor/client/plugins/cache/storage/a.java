package io.ktor.client.plugins.cache.storage;

import io.ktor.util.collections.ConcurrentSetKt;
import kotlin.jvm.functions.Function0;

public final class a implements Function0 {

    public final int f23343h;

    public a(int i3) {
        this.f23343h = i3;
    }

    @Override
    public final Object invoke() {
        switch (this.f23343h) {
            case 0:
                return FileCacheStorage.readCache$lambda$2();
            case 1:
                return FileCacheStorage.C23632.invokeSuspend$lambda$0();
            case 2:
                return CacheStorage.Companion.Unlimited$lambda$0();
            case 3:
                return HttpCacheStorage.Unlimited$lambda$0();
            case 4:
                return ConcurrentSetKt.ConcurrentSet();
            case 5:
                return ConcurrentSetKt.ConcurrentSet();
            case 6:
                return ConcurrentSetKt.ConcurrentSet();
            default:
                return ConcurrentSetKt.ConcurrentSet();
        }
    }
}
