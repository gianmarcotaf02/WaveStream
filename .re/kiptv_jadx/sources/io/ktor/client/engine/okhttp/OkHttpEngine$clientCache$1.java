package io.ktor.client.engine.okhttp;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public /* synthetic */ class OkHttpEngine$clientCache$1 extends kotlin.jvm.internal.j implements p194x6.j {
    public OkHttpEngine$clientCache$1(java.lang.Object obj) {
        super(1, 0, io.ktor.client.engine.okhttp.OkHttpEngine.class, obj, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;");
    }

    @Override // p194x6.j
    public final w8.s invoke(io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig) {
        return ((io.ktor.client.engine.okhttp.OkHttpEngine) this.receiver).createOkHttpClient(httpTimeoutConfig);
    }
}
