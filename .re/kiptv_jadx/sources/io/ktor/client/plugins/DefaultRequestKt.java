package io.ktor.client.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lh6/A;", "block", "defaultRequest", "(Lio/ktor/client/HttpClientConfig;Lx6/j;)V", "LP8/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "LP8/b;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultRequestKt {
    private static final P8.b LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultRequest");

    public static final void defaultRequest(io.ktor.client.HttpClientConfig<?> httpClientConfig, p194x6.j block) {
        kotlin.jvm.internal.m.e(httpClientConfig, "<this>");
        kotlin.jvm.internal.m.e(block, "block");
        httpClientConfig.install(io.ktor.client.plugins.DefaultRequest.INSTANCE, new io.ktor.client.plugins.a(0, block));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A defaultRequest$lambda$0(p194x6.j jVar, io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder install) {
        kotlin.jvm.internal.m.e(install, "$this$install");
        jVar.invoke(install);
        return p070h6.A.f22523a;
    }
}
