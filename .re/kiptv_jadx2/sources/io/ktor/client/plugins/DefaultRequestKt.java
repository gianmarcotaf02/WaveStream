package io.ktor.client.plugins;

import androidx.media3.container.NalUnitUtil;
import io.ktor.client.HttpClientConfig;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lh6/A;", "block", "defaultRequest", "(Lio/ktor/client/HttpClientConfig;Lx6/j;)V", "LP8/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "LP8/b;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultRequestKt {
    private static final P8.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultRequest");

    public static final void defaultRequest(HttpClientConfig<?> httpClientConfig, j block) {
        m.e(httpClientConfig, "<this>");
        m.e(block, "block");
        httpClientConfig.install(DefaultRequest.INSTANCE, new a(0, block));
    }

    public static final A defaultRequest$lambda$0(j jVar, DefaultRequest.DefaultRequestBuilder install) {
        m.e(install, "$this$install");
        jVar.invoke(install);
        return A.f22523a;
    }
}
