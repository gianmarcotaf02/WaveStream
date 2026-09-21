package io.github.jan.supabase.network;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.github.jan.supabase.network.KtorSupabaseHttpClient f23299i;

    public /* synthetic */ a(io.github.jan.supabase.network.KtorSupabaseHttpClient ktorSupabaseHttpClient, int i3) {
        this.f23298h = i3;
        this.f23299i = ktorSupabaseHttpClient;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23298h) {
            case 0:
                return io.github.jan.supabase.network.KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$13(this.f23299i, (io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder) obj);
            case 1:
                return io.github.jan.supabase.network.KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$15(this.f23299i, (io.ktor.client.plugins.HttpTimeoutConfig) obj);
            default:
                return io.github.jan.supabase.network.KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$13$lambda$12(this.f23299i, (io.ktor.http.HeadersBuilder) obj);
        }
    }
}
