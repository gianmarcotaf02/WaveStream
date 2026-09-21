package io.ktor.http.cio.internals;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "isPoolingDisabled", "()Z", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CharArrayPoolJvmKt {
    public static final boolean isPoolingDisabled() {
        java.lang.String property = java.lang.System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            return java.lang.Boolean.parseBoolean(property);
        }
        return false;
    }
}
