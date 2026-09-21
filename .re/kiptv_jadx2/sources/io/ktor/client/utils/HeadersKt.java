package io.ktor.client.utils;

import androidx.media3.container.NalUnitUtil;
import io.ktor.client.plugins.sse.c;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "Lh6/A;", "block", "Lio/ktor/http/Headers;", "buildHeaders", "(Lx6/j;)Lio/ktor/http/Headers;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HeadersKt {
    public static final Headers buildHeaders(j block) {
        m.e(block, "block");
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        block.invoke(headersBuilder);
        return headersBuilder.build();
    }

    public static Headers buildHeaders$default(j jVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            jVar = new c(21);
        }
        return buildHeaders(jVar);
    }

    public static final A buildHeaders$lambda$0(HeadersBuilder headersBuilder) {
        m.e(headersBuilder, "<this>");
        return A.f22523a;
    }
}
