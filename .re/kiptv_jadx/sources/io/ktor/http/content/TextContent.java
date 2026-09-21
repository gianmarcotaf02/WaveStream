package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/ktor/http/content/TextContent;", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "", "text", "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "status", "<init>", "(Ljava/lang/String;Lio/ktor/http/ContentType;Lio/ktor/http/HttpStatusCode;)V", "", "bytes", "()[B", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getText", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "[B", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TextContent extends io.ktor.http.content.OutgoingContent.ByteArrayContent {
    private final byte[] bytes;
    private final io.ktor.http.ContentType contentType;
    private final io.ktor.http.HttpStatusCode status;
    private final java.lang.String text;

    public /* synthetic */ TextContent(java.lang.String str, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, contentType, (i3 & 4) != 0 ? null : httpStatusCode);
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    /* JADX INFO: renamed from: bytes, reason: from getter */
    public byte[] getContent() {
        return this.bytes;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public java.lang.Long getContentLength() {
        return java.lang.Long.valueOf(this.bytes.length);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.HttpStatusCode getStatus() {
        return this.status;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public java.lang.String toString() {
        return "TextContent[" + getContentType() + "] \"" + O7.q.p1(30, this.text) + '\"';
    }

    public TextContent(java.lang.String text, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode) {
        kotlin.jvm.internal.m.e(text, "text");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        this.text = text;
        this.contentType = contentType;
        this.status = httpStatusCode;
        java.nio.charset.Charset charset = io.ktor.http.ContentTypesKt.charset(getContentType());
        this.bytes = io.ktor.utils.io.core.StringsKt.toByteArray(text, charset == null ? O7.a.f8024b : charset);
    }
}
