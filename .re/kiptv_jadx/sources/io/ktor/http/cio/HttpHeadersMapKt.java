package io.ktor.http.cio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b\"\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/http/cio/HttpHeadersMap;", "", "indent", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "Lh6/A;", "dumpTo", "(Lio/ktor/http/cio/HttpHeadersMap;Ljava/lang/String;Ljava/lang/Appendable;)V", "", "EXPECTED_HEADERS_QTY", "I", "HEADER_SIZE", "HEADER_ARRAY_POOL_SIZE", "", "EMPTY_INT_LIST", "[I", "Lio/ktor/utils/io/pool/DefaultPool;", "IntArrayPool", "Lio/ktor/utils/io/pool/DefaultPool;", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpHeadersMapKt {
    private static final int EXPECTED_HEADERS_QTY = 512;
    private static final int HEADER_ARRAY_POOL_SIZE = 1000;
    private static final int HEADER_SIZE = 8;
    private static final int[] EMPTY_INT_LIST = new int[0];
    private static final io.ktor.utils.io.pool.DefaultPool<int[]> IntArrayPool = new io.ktor.utils.io.pool.DefaultPool<int[]>() { // from class: io.ktor.http.cio.HttpHeadersMapKt$IntArrayPool$1
        @Override // io.ktor.utils.io.pool.DefaultPool
        public int[] produceInstance() {
            return new int[4096];
        }
    };

    public static final void dumpTo(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, java.lang.String indent, java.lang.Appendable out) throws java.io.IOException {
        kotlin.jvm.internal.m.e(httpHeadersMap, "<this>");
        kotlin.jvm.internal.m.e(indent, "indent");
        kotlin.jvm.internal.m.e(out, "out");
        int size = httpHeadersMap.getSize();
        for (int i3 = 0; i3 < size; i3++) {
            out.append(indent);
            out.append(httpHeadersMap.nameAt(i3));
            out.append(" => ");
            out.append(httpHeadersMap.valueAt(i3));
            out.append("\n");
        }
    }
}
