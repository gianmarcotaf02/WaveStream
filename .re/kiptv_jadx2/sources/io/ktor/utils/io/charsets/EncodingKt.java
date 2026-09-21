package io.ktor.utils.io.charsets;

import androidx.media3.common.util.Log;
import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.core.internal.CharArraySequence;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.a;
import p094k8.l;
import p094k8.n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a1\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\b\u001a\u00020\r*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0012*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0003\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0015\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0018\u001a\u00020\r*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "Lk8/n;", "encode", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)Lk8/n;", "", "Lk8/l;", "dst", "Lh6/A;", "(Ljava/nio/charset/CharsetEncoder;[CIILk8/l;)V", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "max", "", "decode", "(Ljava/nio/charset/CharsetDecoder;Lk8/n;I)Ljava/lang/String;", "encodeArrayImpl", "(Ljava/nio/charset/CharsetEncoder;[CIILk8/l;)I", "destination", "encodeToImpl", "(Ljava/nio/charset/CharsetEncoder;Lk8/l;Ljava/lang/CharSequence;II)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EncodingKt {
    public static final String decode(CharsetDecoder charsetDecoder, n input, int i3) {
        m.e(charsetDecoder, "<this>");
        m.e(input, "input");
        StringBuilder sb = new StringBuilder((int) Math.min(i3, input.a().j));
        CharsetJVMKt.decode(charsetDecoder, input, sb, i3);
        return sb.toString();
    }

    public static String decode$default(CharsetDecoder charsetDecoder, n nVar, int i3, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i3 = Log.LOG_LEVEL_OFF;
        }
        return decode(charsetDecoder, nVar, i3);
    }

    public static final void encode(CharsetEncoder charsetEncoder, char[] input, int i3, int i9, l dst) {
        m.e(charsetEncoder, "<this>");
        m.e(input, "input");
        m.e(dst, "dst");
        encodeArrayImpl(charsetEncoder, input, i3, i9, dst);
    }

    public static n encode$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i3, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        return encode(charsetEncoder, charSequence, i3, i9);
    }

    public static final int encodeArrayImpl(CharsetEncoder charsetEncoder, char[] input, int i3, int i9, l dst) {
        m.e(charsetEncoder, "<this>");
        m.e(input, "input");
        m.e(dst, "dst");
        int i10 = i9 - i3;
        return CharsetJVMKt.encodeImpl(charsetEncoder, new CharArraySequence(input, i3, i10), 0, i10, dst);
    }

    public static final void encodeToImpl(CharsetEncoder charsetEncoder, l destination, CharSequence input, int i3, int i9) {
        m.e(charsetEncoder, "<this>");
        m.e(destination, "destination");
        m.e(input, "input");
        if (i3 >= i9) {
            return;
        }
        do {
            int iEncodeImpl = CharsetJVMKt.encodeImpl(charsetEncoder, input, i3, i9, destination);
            if (iEncodeImpl < 0) {
                throw new IllegalStateException("Check failed.");
            }
            i3 += iEncodeImpl;
        } while (i3 < i9);
    }

    public static final n encode(CharsetEncoder charsetEncoder, CharSequence input, int i3, int i9) {
        m.e(charsetEncoder, "<this>");
        m.e(input, "input");
        a aVar = new a();
        encodeToImpl(charsetEncoder, aVar, input, i3, i9);
        return aVar;
    }
}
