package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lio/ktor/http/content/CompressedReadChannelResponse;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "original", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "delegateChannel", "Lio/ktor/util/ContentEncoder;", "encoder", "Ll6/h;", "coroutineContext", "<init>", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function0;Lio/ktor/util/ContentEncoder;Ll6/h;)V", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "", "T", "Lio/ktor/util/AttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "Lh6/A;", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/http/content/OutgoingContent;", "getOriginal", "()Lio/ktor/http/content/OutgoingContent;", "Lkotlin/jvm/functions/Function0;", "getDelegateChannel", "()Lkotlin/jvm/functions/Function0;", "Lio/ktor/util/ContentEncoder;", "getEncoder", "()Lio/ktor/util/ContentEncoder;", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "Lio/ktor/http/Headers;", "headers$delegate", "Lh6/h;", "getHeaders", "()Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class CompressedReadChannelResponse extends io.ktor.http.content.OutgoingContent.ReadChannelContent {
    private final p100l6.h coroutineContext;
    private final kotlin.jvm.functions.Function0 delegateChannel;
    private final io.ktor.util.ContentEncoder encoder;

    /* JADX INFO: renamed from: headers$delegate, reason: from kotlin metadata */
    private final p070h6.h headers;
    private final io.ktor.http.content.OutgoingContent original;

    public CompressedReadChannelResponse(io.ktor.http.content.OutgoingContent original, kotlin.jvm.functions.Function0 delegateChannel, io.ktor.util.ContentEncoder encoder, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(original, "original");
        kotlin.jvm.internal.m.e(delegateChannel, "delegateChannel");
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        this.original = original;
        this.delegateChannel = delegateChannel;
        this.encoder = encoder;
        this.coroutineContext = coroutineContext;
        this.headers = com.google.common.util.concurrent.D.A(p070h6.i.j, new io.ktor.http.content.c(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.http.Headers headers_delegate$lambda$2(io.ktor.http.content.CompressedReadChannelResponse compressedReadChannelResponse) {
        io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
        int i3 = 0;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(i3, 1, null);
        io.ktor.util.StringValuesKt.appendFiltered$default(headersBuilder, compressedReadChannelResponse.original.getHeaders(), false, new io.ktor.http.content.d(i3), 2, null);
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding(), compressedReadChannelResponse.encoder.getName());
        return headersBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean headers_delegate$lambda$2$lambda$1$lambda$0(java.lang.String name, java.lang.String str) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(str, "<unused var>");
        return !name.equalsIgnoreCase(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
    }

    @Override // io.ktor.http.content.OutgoingContent
    public java.lang.Long getContentLength() {
        java.lang.Long contentLength = this.original.getContentLength();
        if (contentLength != null) {
            java.lang.Long lPredictCompressedLength = this.encoder.predictCompressedLength(contentLength.longValue());
            if (lPredictCompressedLength != null && lPredictCompressedLength.longValue() >= 0) {
                return lPredictCompressedLength;
            }
        }
        return null;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.ContentType getContentType() {
        return this.original.getContentType();
    }

    public final p100l6.h getCoroutineContext() {
        return this.coroutineContext;
    }

    public final kotlin.jvm.functions.Function0 getDelegateChannel() {
        return this.delegateChannel;
    }

    public final io.ktor.util.ContentEncoder getEncoder() {
        return this.encoder;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.Headers getHeaders() {
        return (io.ktor.http.Headers) this.headers.getValue();
    }

    public final io.ktor.http.content.OutgoingContent getOriginal() {
        return this.original;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> T getProperty(io.ktor.util.AttributeKey<T> key) {
        kotlin.jvm.internal.m.e(key, "key");
        return (T) this.original.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.HttpStatusCode getStatus() {
        return this.original.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    /* JADX INFO: renamed from: readFrom */
    public io.ktor.utils.io.ByteReadChannel getChannel() {
        return this.encoder.encode((io.ktor.utils.io.ByteReadChannel) this.delegateChannel.invoke(), this.coroutineContext);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
        kotlin.jvm.internal.m.e(key, "key");
        this.original.setProperty(key, value);
    }
}
