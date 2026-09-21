package io.github.jan.supabase.storage;

import U7.A;
import io.ktor.client.request.HttpRequestBuilder;
import p194x6.j;

public final class d implements j {

    public final int f23319h;

    public final A f23320i;

    public d(A a2, int i3) {
        this.f23319h = i3;
        this.f23320i = a2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23319h) {
            case 0:
                return FlowExtensionKt.uploadOverride$lambda$1(this.f23320i, (HttpRequestBuilder) obj);
            default:
                return FlowExtensionKt.downloadOverride$lambda$0(this.f23320i, (HttpRequestBuilder) obj);
        }
    }
}
