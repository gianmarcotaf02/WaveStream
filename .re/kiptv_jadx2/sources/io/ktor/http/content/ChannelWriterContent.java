package io.ktor.http.content;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.http.ContentType;
import io.ktor.http.HttpStatusCode;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import p070h6.A;
import p194x6.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001BM\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/ktor/http/content/ChannelWriterContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lkotlin/Function2;", "Lio/ktor/utils/io/ByteWriteChannel;", "Ll6/c;", "Lh6/A;", "", TtmlNode.TAG_BODY, "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "status", "", "contentLength", "<init>", "(Lx6/m;Lio/ktor/http/ContentType;Lio/ktor/http/HttpStatusCode;Ljava/lang/Long;)V", "channel", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/c;)Ljava/lang/Object;", "Lx6/m;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ChannelWriterContent extends OutgoingContent.WriteChannelContent {
    private final m body;
    private final Long contentLength;
    private final ContentType contentType;
    private final HttpStatusCode status;

    public ChannelWriterContent(m mVar, ContentType contentType, HttpStatusCode httpStatusCode, Long l2, int i3, AbstractC2541f abstractC2541f) {
        this(mVar, contentType, (i3 & 4) != 0 ? null : httpStatusCode, (i3 & 8) != 0 ? null : l2);
    }

    @Override
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override
    public HttpStatusCode getStatus() {
        return this.status;
    }

    @Override
    public Object writeTo(ByteWriteChannel byteWriteChannel, p100l6.c cVar) {
        Object objInvoke = this.body.invoke(byteWriteChannel, cVar);
        return objInvoke == p109m6.a.f25430h ? objInvoke : A.f22523a;
    }

    public ChannelWriterContent(m body, ContentType contentType, HttpStatusCode httpStatusCode, Long l2) {
        kotlin.jvm.internal.m.e(body, "body");
        this.body = body;
        this.contentType = contentType;
        this.status = httpStatusCode;
        this.contentLength = l2;
    }
}
