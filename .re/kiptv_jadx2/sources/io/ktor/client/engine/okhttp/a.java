package io.ktor.client.engine.okhttp;

import p194x6.j;
import w8.p;
import w8.r;

public final class a implements j {

    public final int f23333h;

    public final p f23334i;

    public a(p pVar, int i3) {
        this.f23333h = i3;
        this.f23334i = pVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23333h) {
            case 0:
                return OkHttpConfig.addNetworkInterceptor$lambda$3(this.f23334i, (r) obj);
            default:
                return OkHttpConfig.addInterceptor$lambda$2(this.f23334i, (r) obj);
        }
    }
}
