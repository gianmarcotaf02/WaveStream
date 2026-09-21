package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001BM\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/ktor/http/content/ChannelWriterContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lkotlin/Function2;", "Lio/ktor/utils/io/ByteWriteChannel;", "Ll6/c;", "Lh6/A;", "", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "status", "", "contentLength", "<init>", "(Lx6/m;Lio/ktor/http/ContentType;Lio/ktor/http/HttpStatusCode;Ljava/lang/Long;)V", "channel", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/c;)Ljava/lang/Object;", "Lx6/m;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ChannelWriterContent extends io.ktor.http.content.OutgoingContent.WriteChannelContent {
    private final p194x6.m body;
    private final java.lang.Long contentLength;
    private final io.ktor.http.ContentType contentType;
    private final io.ktor.http.HttpStatusCode status;

    public /* synthetic */ ChannelWriterContent(p194x6.m mVar, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode, java.lang.Long l2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(mVar, contentType, (i3 & 4) != 0 ? null : httpStatusCode, (i3 & 8) != 0 ? null : l2);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public java.lang.Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.c cVar) {
        java.lang.Object objInvoke = this.body.invoke(byteWriteChannel, cVar);
        return objInvoke == p109m6.a.f25430h ? objInvoke : p070h6.A.f22523a;
    }

    public ChannelWriterContent(p194x6.m body, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode, java.lang.Long l2) {
        kotlin.jvm.internal.m.e(body, "body");
        this.body = body;
        this.contentType = contentType;
        this.status = httpStatusCode;
        this.contentLength = l2;
    }
}
