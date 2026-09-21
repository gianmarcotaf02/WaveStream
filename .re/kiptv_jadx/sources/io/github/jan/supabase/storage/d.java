package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U7.A f23320i;

    public /* synthetic */ d(U7.A a2, int i3) {
        this.f23319h = i3;
        this.f23320i = a2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23319h) {
            case 0:
                return io.github.jan.supabase.storage.FlowExtensionKt.uploadOverride$lambda$1(this.f23320i, (io.ktor.client.request.HttpRequestBuilder) obj);
            default:
                return io.github.jan.supabase.storage.FlowExtensionKt.downloadOverride$lambda$0(this.f23320i, (io.ktor.client.request.HttpRequestBuilder) obj);
        }
    }
}
