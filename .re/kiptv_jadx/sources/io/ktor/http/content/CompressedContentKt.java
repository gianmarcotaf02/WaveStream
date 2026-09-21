package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/util/ContentEncoder;", "contentEncoder", "Ll6/h;", "coroutineContext", "compressed", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/util/ContentEncoder;Ll6/h;)Lio/ktor/http/content/OutgoingContent;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CompressedContentKt {
    public static final io.ktor.http.content.OutgoingContent compressed(final io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.util.ContentEncoder contentEncoder, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(outgoingContent, "<this>");
        kotlin.jvm.internal.m.e(contentEncoder, "contentEncoder");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
            final int i3 = 0;
            return new io.ktor.http.content.CompressedReadChannelResponse(outgoingContent, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.b
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    switch (i3) {
                        case 0:
                            return io.ktor.http.content.CompressedContentKt.compressed$lambda$0(outgoingContent);
                        default:
                            return io.ktor.http.content.CompressedContentKt.compressed$lambda$1(outgoingContent);
                    }
                }
            }, contentEncoder, coroutineContext);
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) {
            return new io.ktor.http.content.CompressedWriteChannelResponse((io.ktor.http.content.OutgoingContent.WriteChannelContent) outgoingContent, contentEncoder, coroutineContext);
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
            final int i9 = 1;
            return new io.ktor.http.content.CompressedReadChannelResponse(outgoingContent, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.b
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    switch (i9) {
                        case 0:
                            return io.ktor.http.content.CompressedContentKt.compressed$lambda$0(outgoingContent);
                        default:
                            return io.ktor.http.content.CompressedContentKt.compressed$lambda$1(outgoingContent);
                    }
                }
            }, contentEncoder, coroutineContext);
        }
        if ((outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) || (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade)) {
            return null;
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper) {
            return compressed(((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getDelegate(), contentEncoder, coroutineContext);
        }
        throw new I3.b();
    }

    public static /* synthetic */ io.ktor.http.content.OutgoingContent compressed$default(io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.util.ContentEncoder contentEncoder, p100l6.h hVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            hVar = p100l6.i.f24820h;
        }
        return compressed(outgoingContent, contentEncoder, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel compressed$lambda$0(io.ktor.http.content.OutgoingContent outgoingContent) {
        return ((io.ktor.http.content.OutgoingContent.ReadChannelContent) outgoingContent).getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel compressed$lambda$1(io.ktor.http.content.OutgoingContent outgoingContent) {
        return io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(((io.ktor.http.content.OutgoingContent.ByteArrayContent) outgoingContent).getBytes(), 0, 0, 6, null);
    }
}
