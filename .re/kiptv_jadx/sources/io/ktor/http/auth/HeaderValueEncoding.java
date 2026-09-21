package io.ktor.http.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/auth/HeaderValueEncoding;", "", "<init>", "(Ljava/lang/String;I)V", "QUOTED_WHEN_REQUIRED", "QUOTED_ALWAYS", "URI_ENCODE", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum HeaderValueEncoding {
    QUOTED_WHEN_REQUIRED,
    QUOTED_ALWAYS,
    URI_ENCODE;

    private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }
}
