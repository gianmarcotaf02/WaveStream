package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lio/ktor/http/content/CompressedWriteChannelResponse;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "original", "Lio/ktor/util/ContentEncoder;", "encoder", "Ll6/h;", "coroutineContext", "<init>", "(Lio/ktor/http/content/OutgoingContent$WriteChannelContent;Lio/ktor/util/ContentEncoder;Ll6/h;)V", "", "T", "Lio/ktor/util/AttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "Lh6/A;", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "getOriginal", "()Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lio/ktor/util/ContentEncoder;", "getEncoder", "()Lio/ktor/util/ContentEncoder;", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "Lio/ktor/http/Headers;", "headers$delegate", "Lh6/h;", "getHeaders", "()Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class CompressedWriteChannelResponse extends io.ktor.http.content.OutgoingContent.WriteChannelContent {
    private final p100l6.h coroutineContext;
    private final io.ktor.util.ContentEncoder encoder;

    /* JADX INFO: renamed from: headers$delegate, reason: from kotlin metadata */
    private final p070h6.h headers;
    private final io.ktor.http.content.OutgoingContent.WriteChannelContent original;

    /* JADX INFO: renamed from: io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2", f = "CompressedContent.kt", l = {84}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p117n6.i implements p194x6.m {
        final /* synthetic */ io.ktor.utils.io.ByteWriteChannel $channel;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.c cVar) {
            super(2, cVar);
            this.$channel = byteWriteChannel;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            io.ktor.http.content.CompressedWriteChannelResponse.AnonymousClass2 anonymousClass2 = io.ktor.http.content.CompressedWriteChannelResponse.this.new AnonymousClass2(this.$channel, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.http.content.CompressedWriteChannelResponse.AnonymousClass2) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
            java.lang.Throwable th;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) this.L$0;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    io.ktor.utils.io.ByteWriteChannelKt.close(byteWriteChannel);
                    return p070h6.A.f22523a;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        io.ktor.utils.io.ByteWriteChannelKt.close(byteWriteChannel);
                        throw th3;
                    }
                }
            }
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.utils.io.ByteWriteChannel byteWriteChannelEncode = io.ktor.http.content.CompressedWriteChannelResponse.this.getEncoder().encode(this.$channel, ((S7.A) this.L$0).getCoroutineContext());
            try {
                io.ktor.http.content.OutgoingContent.WriteChannelContent original = io.ktor.http.content.CompressedWriteChannelResponse.this.getOriginal();
                this.L$0 = byteWriteChannelEncode;
                this.label = 1;
                if (original.writeTo(byteWriteChannelEncode, this) == aVar) {
                    return aVar;
                }
                byteWriteChannel = byteWriteChannelEncode;
                io.ktor.utils.io.ByteWriteChannelKt.close(byteWriteChannel);
                return p070h6.A.f22523a;
            } catch (java.lang.Throwable th4) {
                byteWriteChannel = byteWriteChannelEncode;
                th = th4;
                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
                throw th;
            }
        }
    }

    public CompressedWriteChannelResponse(io.ktor.http.content.OutgoingContent.WriteChannelContent original, io.ktor.util.ContentEncoder encoder, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(original, "original");
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        this.original = original;
        this.encoder = encoder;
        this.coroutineContext = coroutineContext;
        this.headers = com.google.common.util.concurrent.D.A(p070h6.i.j, new io.ktor.http.content.c(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.http.Headers headers_delegate$lambda$2(io.ktor.http.content.CompressedWriteChannelResponse compressedWriteChannelResponse) {
        io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
        int i3 = 1;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, i3, null);
        io.ktor.util.StringValuesKt.appendFiltered$default(headersBuilder, compressedWriteChannelResponse.original.getHeaders(), false, new io.ktor.http.content.d(i3), 2, null);
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding(), compressedWriteChannelResponse.encoder.getName());
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

    public final io.ktor.util.ContentEncoder getEncoder() {
        return this.encoder;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.Headers getHeaders() {
        return (io.ktor.http.Headers) this.headers.getValue();
    }

    public final io.ktor.http.content.OutgoingContent.WriteChannelContent getOriginal() {
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

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
        kotlin.jvm.internal.m.e(key, "key");
        this.original.setProperty(key, value);
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.c cVar) throws java.lang.Throwable {
        java.lang.Object objK = S7.C.K(this.coroutineContext, new io.ktor.http.content.CompressedWriteChannelResponse.AnonymousClass2(byteWriteChannel, null), cVar);
        return objK == p109m6.a.f25430h ? objK : p070h6.A.f22523a;
    }
}
