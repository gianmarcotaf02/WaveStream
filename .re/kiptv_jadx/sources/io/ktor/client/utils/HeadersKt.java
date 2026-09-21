package io.ktor.client.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "Lh6/A;", "block", "Lio/ktor/http/Headers;", "buildHeaders", "(Lx6/j;)Lio/ktor/http/Headers;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HeadersKt {
    public static final io.ktor.http.Headers buildHeaders(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        block.invoke(headersBuilder);
        return headersBuilder.build();
    }

    public static /* synthetic */ io.ktor.http.Headers buildHeaders$default(p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            jVar = new io.ktor.client.plugins.sse.c(21);
        }
        return buildHeaders(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A buildHeaders$lambda$0(io.ktor.http.HeadersBuilder headersBuilder) {
        kotlin.jvm.internal.m.e(headersBuilder, "<this>");
        return p070h6.A.f22523a;
    }
}
