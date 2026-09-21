package io.ktor.client.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public /* synthetic */ class HttpRequestRetryKt$HttpRequestRetry$1 extends kotlin.jvm.internal.j implements kotlin.jvm.functions.Function0 {
    public static final io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$1 INSTANCE = new io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$1();

    public HttpRequestRetryKt$HttpRequestRetry$1() {
        super(0, io.ktor.client.plugins.HttpRequestRetryConfig.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final io.ktor.client.plugins.HttpRequestRetryConfig invoke() {
        return new io.ktor.client.plugins.HttpRequestRetryConfig();
    }
}
