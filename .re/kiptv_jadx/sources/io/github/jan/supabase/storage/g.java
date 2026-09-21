package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.github.jan.supabase.storage.StorageImpl f23325i;

    public /* synthetic */ g(io.github.jan.supabase.storage.StorageImpl storageImpl, int i3) {
        this.f23324h = i3;
        this.f23325i = storageImpl;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23324h) {
            case 0:
                return io.github.jan.supabase.storage.StorageImpl.api$lambda$1$lambda$0(this.f23325i, (io.ktor.client.plugins.HttpTimeoutConfig) obj);
            default:
                return io.github.jan.supabase.storage.StorageImpl.api$lambda$1(this.f23325i, (io.ktor.client.request.HttpRequestBuilder) obj);
        }
    }
}
