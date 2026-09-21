package io.github.jan.supabase.network;

import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.http.HeadersBuilder;
import p194x6.j;

public final class a implements j {

    public final int f23298h;

    public final KtorSupabaseHttpClient f23299i;

    public a(KtorSupabaseHttpClient ktorSupabaseHttpClient, int i3) {
        this.f23298h = i3;
        this.f23299i = ktorSupabaseHttpClient;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23298h) {
            case 0:
                return KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$13(this.f23299i, (DefaultRequest.DefaultRequestBuilder) obj);
            case 1:
                return KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$15(this.f23299i, (HttpTimeoutConfig) obj);
            default:
                return KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$13$lambda$12(this.f23299i, (HeadersBuilder) obj);
        }
    }
}
