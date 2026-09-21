package io.ktor.utils.io.core;

import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.DeprecationKt;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.protocol.OperatingSystem;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.c;
import p094k8.a;
import p094k8.l;
import p094k8.n;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0012\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u001b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018*>\b\u0007\u0010\u0001\"\u00020\u00002\u00020\u0000B0\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\"\b\u001f\u0012\u001e\b\u000bB\u001a\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\f\b#\u0012\b\b\fJ\u0004\b\b($¨\u0006%"}, d2 = {"Lk8/l;", "BytePacketBuilder", "()Lk8/l;", "", "value", "", "startIndex", "endIndex", "Lh6/A;", "append", "(Lk8/l;Ljava/lang/CharSequence;II)V", "Lk8/n;", OperatingSystem.JsonKeys.BUILD, "(Lk8/l;)Lk8/n;", "", "buffer", "offset", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "writeFully", "(Lk8/l;[BII)V", "packet", "writePacket", "(Lk8/l;Lk8/n;)V", "getSize", "(Lk8/l;)I", "getSize$annotations", "(Lk8/l;)V", "size", "Lh6/c;", "message", DeprecationKt.IO_DEPRECATION_MESSAGE, "replaceWith", "Lh6/l;", "expression", "Sink", "imports", "kotlinx.io.Sink", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BytePacketBuilderKt {
    public static final l BytePacketBuilder() {
        return new a();
    }

    @c
    public static void BytePacketBuilder$annotations() {
    }

    public static final void append(l lVar, CharSequence value, int i3, int i9) {
        m.e(lVar, "<this>");
        m.e(value, "value");
        StringsKt.writeText$default(lVar, value, i3, i9, (Charset) null, 8, (Object) null);
    }

    public static void append$default(l lVar, CharSequence charSequence, int i3, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        append(lVar, charSequence, i3, i9);
    }

    public static final n build(l lVar) {
        m.e(lVar, "<this>");
        return lVar.a();
    }

    public static final int getSize(l lVar) {
        m.e(lVar, "<this>");
        return (int) lVar.a().j;
    }

    public static final void writeFully(l lVar, byte[] buffer, int i3, int i9) {
        m.e(lVar, "<this>");
        m.e(buffer, "buffer");
        lVar.write(buffer, i3, i9 + i3);
    }

    public static void writeFully$default(l lVar, byte[] bArr, int i3, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length - i3;
        }
        writeFully(lVar, bArr, i3, i9);
    }

    public static final void writePacket(l lVar, n packet) {
        m.e(lVar, "<this>");
        m.e(packet, "packet");
        lVar.D(packet);
    }

    public static void getSize$annotations(l lVar) {
    }
}
