package io.ktor.client.utils;

import I3.b;
import androidx.media3.container.NalUnitUtil;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p100l6.c;
import p100l6.h;
import p109m6.a;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lkotlin/Function1;", "Lio/ktor/http/Headers;", "block", "wrapHeaders", "(Lio/ktor/http/content/OutgoingContent;Lx6/j;)Lio/ktor/http/content/OutgoingContent;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContentKt {
    public static final OutgoingContent wrapHeaders(OutgoingContent outgoingContent, j block) {
        m.e(outgoingContent, "<this>");
        m.e(block, "block");
        if (outgoingContent instanceof OutgoingContent.NoContent) {
            return new OutgoingContent.NoContent(block, outgoingContent) {
                final OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override
                public HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
            return new OutgoingContent.ReadChannelContent(block, outgoingContent) {
                final OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override
                public HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override
                public ByteReadChannel getChannel() {
                    return ((OutgoingContent.ReadChannelContent) this.$this_wrapHeaders).getChannel();
                }

                @Override
                public ByteReadChannel readFrom(D6.j range) {
                    m.e(range, "range");
                    return ((OutgoingContent.ReadChannelContent) this.$this_wrapHeaders).readFrom(range);
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
            return new OutgoingContent.WriteChannelContent(block, outgoingContent) {
                final OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override
                public HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override
                public Object writeTo(ByteWriteChannel byteWriteChannel, c cVar) {
                    Object objWriteTo = ((OutgoingContent.WriteChannelContent) this.$this_wrapHeaders).writeTo(byteWriteChannel, cVar);
                    return objWriteTo == a.f25430h ? objWriteTo : A.f22523a;
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
            return new OutgoingContent.ByteArrayContent(block, outgoingContent) {
                final OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override
                public byte[] getBytes() {
                    return ((OutgoingContent.ByteArrayContent) this.$this_wrapHeaders).getBytes();
                }

                @Override
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override
                public HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ProtocolUpgrade) {
            return new OutgoingContent.ProtocolUpgrade(block, outgoingContent) {
                final OutgoingContent $this_wrapHeaders;
                private final Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override
                public Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override
                public ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override
                public Headers getHeaders() {
                    return this.headers;
                }

                @Override
                public Object upgrade(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, h hVar, h hVar2, c cVar) {
                    return ((OutgoingContent.ProtocolUpgrade) this.$this_wrapHeaders).upgrade(byteReadChannel, byteWriteChannel, hVar, hVar2, cVar);
                }
            };
        }
        if (outgoingContent instanceof OutgoingContent.ContentWrapper) {
            return wrapHeaders(((OutgoingContent.ContentWrapper) outgoingContent).getDelegate(), block);
        }
        throw new b();
    }
}
