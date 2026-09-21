package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006!\"#$%&B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000f\u0082\u0001\u0006'()*+,¨\u0006-"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "", "<init>", "()V", "T", "Lio/ktor/util/AttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "Lh6/A;", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/http/Headers;", "trailers", "()Lio/ktor/http/Headers;", "Lio/ktor/util/Attributes;", "extensionProperties", "Lio/ktor/util/Attributes;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "contentType", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "getHeaders", "headers", "NoContent", "ReadChannelContent", "WriteChannelContent", "ByteArrayContent", "ProtocolUpgrade", "ContentWrapper", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Lio/ktor/http/content/OutgoingContent$NoContent;", "Lio/ktor/http/content/OutgoingContent$ProtocolUpgrade;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class OutgoingContent {
    private io.ktor.util.Attributes extensionProperties;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "", "bytes", "()[B", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class ByteArrayContent extends io.ktor.http.content.OutgoingContent {
        public ByteArrayContent() {
            super(null);
        }

        public abstract byte[] bytes();
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Lio/ktor/http/content/OutgoingContent;", "delegate", "<init>", "(Lio/ktor/http/content/OutgoingContent;)V", "", "T", "Lio/ktor/util/AttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "Lh6/A;", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "()Lio/ktor/http/content/OutgoingContent;", "copy", "(Lio/ktor/http/content/OutgoingContent;)Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "contentType", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "headers", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class ContentWrapper extends io.ktor.http.content.OutgoingContent {
        private final io.ktor.http.content.OutgoingContent delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentWrapper(io.ktor.http.content.OutgoingContent delegate) {
            super(null);
            kotlin.jvm.internal.m.e(delegate, "delegate");
            this.delegate = delegate;
        }

        public abstract io.ktor.http.content.OutgoingContent.ContentWrapper copy(io.ktor.http.content.OutgoingContent delegate);

        /* JADX INFO: renamed from: delegate, reason: from getter */
        public final io.ktor.http.content.OutgoingContent getDelegate() {
            return this.delegate;
        }

        @Override // io.ktor.http.content.OutgoingContent
        public java.lang.Long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public io.ktor.http.ContentType getContentType() {
            return this.delegate.getContentType();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public io.ktor.http.Headers getHeaders() {
            return this.delegate.getHeaders();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public <T> T getProperty(io.ktor.util.AttributeKey<T> key) {
            kotlin.jvm.internal.m.e(key, "key");
            return (T) this.delegate.getProperty(key);
        }

        @Override // io.ktor.http.content.OutgoingContent
        public io.ktor.http.HttpStatusCode getStatus() {
            return this.delegate.getStatus();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
            kotlin.jvm.internal.m.e(key, "key");
            this.delegate.setProperty(key, value);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/OutgoingContent$NoContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class NoContent extends io.ktor.http.content.OutgoingContent {
        public NoContent() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH¦@¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ProtocolUpgrade;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "Ll6/h;", "engineContext", "userContext", "LS7/h0;", "upgrade", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Ll6/h;Ll6/h;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class ProtocolUpgrade extends io.ktor.http.content.OutgoingContent {
        public ProtocolUpgrade() {
            super(null);
        }

        @Override // io.ktor.http.content.OutgoingContent
        public final io.ktor.http.HttpStatusCode getStatus() {
            return io.ktor.http.HttpStatusCode.INSTANCE.getSwitchingProtocols();
        }

        public abstract java.lang.Object upgrade(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.h hVar, p100l6.h hVar2, p100l6.c cVar);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "LD6/j;", "range", "(LD6/j;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class ReadChannelContent extends io.ktor.http.content.OutgoingContent {
        public ReadChannelContent() {
            super(null);
        }

        public abstract io.ktor.utils.io.ByteReadChannel readFrom();

        public io.ktor.utils.io.ByteReadChannel readFrom(D6.j range) {
            kotlin.jvm.internal.m.e(range, "range");
            return range.isEmpty() ? io.ktor.utils.io.ByteReadChannel.INSTANCE.getEmpty() : io.ktor.utils.io.ByteWriteChannelOperationsKt.writer((S7.A) S7.C0877a0.f9566h, (p100l6.h) S7.M.f9550b, true, (p194x6.m) new io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1(this, range, null)).getChannel();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Lh6/A;", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/c;)Ljava/lang/Object;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class WriteChannelContent extends io.ktor.http.content.OutgoingContent {
        public WriteChannelContent() {
            super(null);
        }

        public abstract java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.c cVar);
    }

    public /* synthetic */ OutgoingContent(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    public java.lang.Long getContentLength() {
        return null;
    }

    public io.ktor.http.ContentType getContentType() {
        return null;
    }

    public io.ktor.http.Headers getHeaders() {
        return io.ktor.http.Headers.INSTANCE.getEmpty();
    }

    public <T> T getProperty(io.ktor.util.AttributeKey<T> key) {
        kotlin.jvm.internal.m.e(key, "key");
        io.ktor.util.Attributes attributes = this.extensionProperties;
        if (attributes != null) {
            return (T) attributes.getOrNull(key);
        }
        return null;
    }

    public io.ktor.http.HttpStatusCode getStatus() {
        return null;
    }

    public <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
        kotlin.jvm.internal.m.e(key, "key");
        if (value == null && this.extensionProperties == null) {
            return;
        }
        if (value == null) {
            io.ktor.util.Attributes attributes = this.extensionProperties;
            if (attributes != null) {
                attributes.remove(key);
                return;
            }
            return;
        }
        io.ktor.util.Attributes attributesAttributes$default = this.extensionProperties;
        if (attributesAttributes$default == null) {
            attributesAttributes$default = io.ktor.util.AttributesJvmKt.Attributes$default(false, 1, null);
        }
        this.extensionProperties = attributesAttributes$default;
        attributesAttributes$default.put(key, value);
    }

    public io.ktor.http.Headers trailers() {
        return null;
    }

    private OutgoingContent() {
    }
}
