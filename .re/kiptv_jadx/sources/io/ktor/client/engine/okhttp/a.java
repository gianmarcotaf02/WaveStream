package io.ktor.client.engine.okhttp;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w8.p f23334i;

    public /* synthetic */ a(w8.p pVar, int i3) {
        this.f23333h = i3;
        this.f23334i = pVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23333h) {
            case 0:
                return io.ktor.client.engine.okhttp.OkHttpConfig.addNetworkInterceptor$lambda$3(this.f23334i, (w8.r) obj);
            default:
                return io.ktor.client.engine.okhttp.OkHttpConfig.addInterceptor$lambda$2(this.f23334i, (w8.r) obj);
        }
    }
}
