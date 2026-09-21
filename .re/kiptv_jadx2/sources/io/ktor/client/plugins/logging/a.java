package io.ktor.client.plugins.logging;

import io.ktor.client.plugins.observer.ResponseObserverConfig;
import io.ktor.client.plugins.observer.ResponseObserverKt;
import p070h6.A;
import p163t.AbstractC2750d;
import p163t.C2764k;
import p194x6.j;
import p194x6.m;

public final class a implements j {

    public final int f23358h;

    public final m f23359i;

    public a(int i3, m mVar) {
        this.f23358h = i3;
        this.f23359i = mVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23358h) {
            case 0:
                return LoggingKt.Logging$lambda$16$lambda$15(this.f23359i, (ResponseObserverConfig) obj);
            case 1:
                return ResponseObserverKt.ResponseObserver$lambda$1(this.f23359i, (ResponseObserverConfig) obj);
            case 2:
                C2764k c2764k = (C2764k) obj;
                this.f23359i.invoke(c2764k.f27627e.getValue(), AbstractC2750d.j.f27454b.invoke(c2764k.f27628f));
                return A.f22523a;
            case 3:
                String categoryId = (String) obj;
                kotlin.jvm.internal.m.e(categoryId, "categoryId");
                this.f23359i.invoke("movies", categoryId);
                return A.f22523a;
            default:
                String categoryId2 = (String) obj;
                kotlin.jvm.internal.m.e(categoryId2, "categoryId");
                this.f23359i.invoke("series", categoryId2);
                return A.f22523a;
        }
    }
}
