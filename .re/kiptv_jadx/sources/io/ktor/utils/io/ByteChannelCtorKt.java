package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\b\u0002\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\u0006\u0010\r\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"", "content", "", "offset", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "([BII)Lio/ktor/utils/io/ByteReadChannel;", "", "text", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lio/ktor/utils/io/ByteReadChannel;", "Lk8/n;", "source", "(Lk8/n;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteChannelCtorKt {
    public static final io.ktor.utils.io.ByteReadChannel ByteReadChannel(byte[] content, int i3, int i9) {
        kotlin.jvm.internal.m.e(content, "content");
        p094k8.a aVar = new p094k8.a();
        aVar.write(content, i3, i9 + i3);
        return ByteReadChannel(aVar);
    }

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel ByteReadChannel$default(byte[] bArr, int i3, int i9, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return ByteReadChannel(bArr, i3, i9);
    }

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel ByteReadChannel$default(java.lang.String str, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            charset = O7.a.f8024b;
        }
        return ByteReadChannel(str, charset);
    }

    public static final io.ktor.utils.io.ByteReadChannel ByteReadChannel(java.lang.String text, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(text, "text");
        kotlin.jvm.internal.m.e(charset, "charset");
        return ByteReadChannel$default(io.ktor.utils.io.core.StringsKt.toByteArray(text, charset), 0, 0, 6, null);
    }

    public static final io.ktor.utils.io.ByteReadChannel ByteReadChannel(p094k8.n source) {
        kotlin.jvm.internal.m.e(source, "source");
        return new io.ktor.utils.io.SourceByteReadChannel(source);
    }
}
