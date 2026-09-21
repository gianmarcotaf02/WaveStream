package io.ktor.client.plugins.logging;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.m f23359i;

    public /* synthetic */ a(int i3, p194x6.m mVar) {
        this.f23358h = i3;
        this.f23359i = mVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23358h) {
            case 0:
                return io.ktor.client.plugins.logging.LoggingKt.Logging$lambda$16$lambda$15(this.f23359i, (io.ktor.client.plugins.observer.ResponseObserverConfig) obj);
            case 1:
                return io.ktor.client.plugins.observer.ResponseObserverKt.ResponseObserver$lambda$1(this.f23359i, (io.ktor.client.plugins.observer.ResponseObserverConfig) obj);
            case 2:
                p163t.C2764k c2764k = (p163t.C2764k) obj;
                this.f23359i.invoke(c2764k.f27627e.getValue(), p163t.AbstractC2750d.j.f27454b.invoke(c2764k.f27628f));
                return p070h6.A.f22523a;
            case 3:
                java.lang.String categoryId = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(categoryId, "categoryId");
                this.f23359i.invoke("movies", categoryId);
                return p070h6.A.f22523a;
            default:
                java.lang.String categoryId2 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(categoryId2, "categoryId");
                this.f23359i.invoke("series", categoryId2);
                return p070h6.A.f22523a;
        }
    }
}
