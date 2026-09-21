package io.ktor.utils.io;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.core.StringsKt;
import io.sentry.SentryEnvelopeItemHeader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.n;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\b\u0002\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\u0006\u0010\r\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"", "content", "", "offset", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "([BII)Lio/ktor/utils/io/ByteReadChannel;", "", "text", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lio/ktor/utils/io/ByteReadChannel;", "Lk8/n;", "source", "(Lk8/n;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteChannelCtorKt {
    public static final ByteReadChannel ByteReadChannel(byte[] content, int i3, int i9) {
        m.e(content, "content");
        p094k8.a aVar = new p094k8.a();
        aVar.write(content, i3, i9 + i3);
        return ByteReadChannel(aVar);
    }

    public static ByteReadChannel ByteReadChannel$default(byte[] bArr, int i3, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return ByteReadChannel(bArr, i3, i9);
    }

    public static ByteReadChannel ByteReadChannel$default(String str, Charset charset, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            charset = O7.a.f8024b;
        }
        return ByteReadChannel(str, charset);
    }

    public static final ByteReadChannel ByteReadChannel(String text, Charset charset) {
        m.e(text, "text");
        m.e(charset, "charset");
        return ByteReadChannel$default(StringsKt.toByteArray(text, charset), 0, 0, 6, null);
    }

    public static final ByteReadChannel ByteReadChannel(n source) {
        m.e(source, "source");
        return new SourceByteReadChannel(source);
    }
}
