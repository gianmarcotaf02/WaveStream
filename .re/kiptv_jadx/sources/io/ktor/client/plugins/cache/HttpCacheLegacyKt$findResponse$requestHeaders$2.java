package io.ktor.client.plugins.cache;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public /* synthetic */ class HttpCacheLegacyKt$findResponse$requestHeaders$2 extends kotlin.jvm.internal.j implements p194x6.j {
    public HttpCacheLegacyKt$findResponse$requestHeaders$2(java.lang.Object obj) {
        super(1, 0, io.ktor.http.Headers.class, obj, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;");
    }

    @Override // p194x6.j
    public final java.util.List<java.lang.String> invoke(java.lang.String p2) {
        kotlin.jvm.internal.m.e(p2, "p0");
        return ((io.ktor.http.Headers) this.receiver).getAll(p2);
    }
}
