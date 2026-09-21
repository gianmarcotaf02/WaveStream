package io.github.jan.supabase.storage;

import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.request.HttpRequestBuilder;
import p194x6.j;

public final class g implements j {

    public final int f23324h;

    public final StorageImpl f23325i;

    public g(StorageImpl storageImpl, int i3) {
        this.f23324h = i3;
        this.f23325i = storageImpl;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23324h) {
            case 0:
                return StorageImpl.api$lambda$1$lambda$0(this.f23325i, (HttpTimeoutConfig) obj);
            default:
                return StorageImpl.api$lambda$1(this.f23325i, (HttpRequestBuilder) obj);
        }
    }
}
