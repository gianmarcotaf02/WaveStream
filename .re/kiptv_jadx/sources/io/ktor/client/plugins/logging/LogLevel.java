package io.ktor.client.plugins.logging;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/client/plugins/logging/LogLevel;", "", "", "info", "headers", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "<init>", "(Ljava/lang/String;IZZZ)V", "Z", "getInfo", "()Z", "getHeaders", "getBody", "ALL", "HEADERS", "BODY", "INFO", "NONE", "ktor-client-logging"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum LogLevel {
    ALL(true, true, true),
    HEADERS(true, true, false),
    BODY(true, false, true),
    INFO(true, false, false),
    NONE(false, false, false);

    private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());
    private final boolean body;
    private final boolean headers;
    private final boolean info;

    LogLevel(boolean z6, boolean z9, boolean z10) {
        this.info = z6;
        this.headers = z9;
        this.body = z10;
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }

    public final boolean getBody() {
        return this.body;
    }

    public final boolean getHeaders() {
        return this.headers;
    }

    public final boolean getInfo() {
        return this.info;
    }
}
