package io.ktor.client.call;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/call/UnsupportedContentTypeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/http/content/OutgoingContent;", "content", "<init>", "(Lio/ktor/http/content/OutgoingContent;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UnsupportedContentTypeException extends java.lang.IllegalStateException {
    public UnsupportedContentTypeException(io.ktor.http.content.OutgoingContent content) {
        kotlin.jvm.internal.m.e(content, "content");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to write body: ");
        super(com.google.android.gms.internal.play_billing.M0.p(kotlin.jvm.internal.B.f24540a, content.getClass(), sb));
    }
}
