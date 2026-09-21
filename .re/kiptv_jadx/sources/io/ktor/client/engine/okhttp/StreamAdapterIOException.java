package io.ktor.client.engine.okhttp;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/engine/okhttp/StreamAdapterIOException;", "Ljava/io/IOException;", "Lokio/IOException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StreamAdapterIOException extends java.io.IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamAdapterIOException(java.lang.Throwable cause) {
        super(cause);
        kotlin.jvm.internal.m.e(cause, "cause");
    }
}
