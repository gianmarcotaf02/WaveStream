package io.ktor.client.plugins.cache;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public /* synthetic */ class HttpCache$findResponse$lookup$1 extends kotlin.jvm.internal.j implements p194x6.j {
    public HttpCache$findResponse$lookup$1(java.lang.Object obj) {
        super(1, 0, io.ktor.http.HeadersBuilder.class, obj, "get", "get(Ljava/lang/String;)Ljava/lang/String;");
    }

    @Override // p194x6.j
    public final java.lang.String invoke(java.lang.String p2) {
        kotlin.jvm.internal.m.e(p2, "p0");
        return ((io.ktor.http.HeadersBuilder) this.receiver).get(p2);
    }
}
