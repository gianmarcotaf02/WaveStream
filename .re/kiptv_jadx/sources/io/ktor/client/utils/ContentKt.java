package io.ktor.client.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lkotlin/Function1;", "Lio/ktor/http/Headers;", "block", "wrapHeaders", "(Lio/ktor/http/content/OutgoingContent;Lx6/j;)Lio/ktor/http/content/OutgoingContent;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContentKt {
    public static final io.ktor.http.content.OutgoingContent wrapHeaders(io.ktor.http.content.OutgoingContent outgoingContent, p194x6.j block) {
        kotlin.jvm.internal.m.e(outgoingContent, "<this>");
        kotlin.jvm.internal.m.e(block, "block");
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) {
            return new io.ktor.http.content.OutgoingContent.NoContent(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.1
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (io.ktor.http.Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
            return new io.ktor.http.content.OutgoingContent.ReadChannelContent(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.2
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (io.ktor.http.Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                /* JADX INFO: renamed from: readFrom */
                public io.ktor.utils.io.ByteReadChannel getChannel() {
                    return ((io.ktor.http.content.OutgoingContent.ReadChannelContent) this.$this_wrapHeaders).getChannel();
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                public io.ktor.utils.io.ByteReadChannel readFrom(D6.j range) {
                    kotlin.jvm.internal.m.e(range, "range");
                    return ((io.ktor.http.content.OutgoingContent.ReadChannelContent) this.$this_wrapHeaders).readFrom(range);
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) {
            return new io.ktor.http.content.OutgoingContent.WriteChannelContent(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.3
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (io.ktor.http.Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
                public java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.c cVar) {
                    java.lang.Object objWriteTo = ((io.ktor.http.content.OutgoingContent.WriteChannelContent) this.$this_wrapHeaders).writeTo(byteWriteChannel, cVar);
                    return objWriteTo == p109m6.a.f25430h ? objWriteTo : p070h6.A.f22523a;
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
            return new io.ktor.http.content.OutgoingContent.ByteArrayContent(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.4
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (io.ktor.http.Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                /* JADX INFO: renamed from: bytes */
                public byte[] getBytes() {
                    return ((io.ktor.http.content.OutgoingContent.ByteArrayContent) this.$this_wrapHeaders).getBytes();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade) {
            return new io.ktor.http.content.OutgoingContent.ProtocolUpgrade(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt.wrapHeaders.5
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = (io.ktor.http.Headers) block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent.ProtocolUpgrade
                public java.lang.Object upgrade(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.h hVar, p100l6.h hVar2, p100l6.c cVar) {
                    return ((io.ktor.http.content.OutgoingContent.ProtocolUpgrade) this.$this_wrapHeaders).upgrade(byteReadChannel, byteWriteChannel, hVar, hVar2, cVar);
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper) {
            return wrapHeaders(((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getDelegate(), block);
        }
        throw new I3.b();
    }
}
