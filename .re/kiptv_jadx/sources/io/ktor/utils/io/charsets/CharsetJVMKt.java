package io.ktor.utils.io.charsets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a!\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u0013\u001a\u00020\u0012*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0015\u001a\u00020\u0012*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a7\u0010\u0018\u001a\u00020\u000f*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u00020\u0012*\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u0014\u001a1\u0010!\u001a\u00020\u000f*\u00060\u001bj\u0002`\u001c2\u0006\u0010\u000e\u001a\u00020\u001d2\n\u0010\u0017\u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"\"\u0019\u0010\u0003\u001a\u00020\u0002*\u00060\u0004j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u001d\u0010'\u001a\u00060\u0004j\u0002`\u0005*\u00060\u000bj\u0002`\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u001d\u0010'\u001a\u00060\u0004j\u0002`\u0005*\u00060\u001bj\u0002`\u001c8F¢\u0006\u0006\u001a\u0004\b%\u0010(*\n\u0010)\"\u00020\u00042\u00020\u0004*\n\u0010*\"\u00020\u000b2\u00020\u000b*\n\u0010+\"\u00020\u001b2\u00020\u001b*\n\u0010,\"\u00020\u00002\u00020\u0000¨\u0006-"}, d2 = {"LO7/a;", "Lio/ktor/utils/io/charsets/Charsets;", "", "name", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "forName", "(LO7/a;Ljava/lang/String;)Ljava/nio/charset/Charset;", "", "isSupported", "(LO7/a;Ljava/lang/String;)Z", "Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "", "encodeToByteArray", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)[B", "encodeToByteArraySlow", "Lk8/l;", "dst", "encodeImpl", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;IILk8/l;)I", "encodeToByteArrayImpl", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "Lk8/n;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "max", "decode", "(Ljava/nio/charset/CharsetDecoder;Lk8/n;Ljava/lang/Appendable;I)I", "getName", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "getCharset", "(Ljava/nio/charset/CharsetEncoder;)Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "(Ljava/nio/charset/CharsetDecoder;)Ljava/nio/charset/Charset;", "Charset", "CharsetEncoder", "CharsetDecoder", "Charsets", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CharsetJVMKt {
    public static /* synthetic */ void Charset$annotations() {
    }

    public static final int decode(java.nio.charset.CharsetDecoder charsetDecoder, p094k8.n input, java.lang.Appendable dst, int i3) throws java.io.IOException {
        kotlin.jvm.internal.m.e(charsetDecoder, "<this>");
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(dst, "dst");
        if (kotlin.jvm.internal.m.a(getCharset(charsetDecoder), O7.a.f8024b)) {
            java.lang.String strJ = p094k8.p.j(input);
            dst.append(strJ);
            return strJ.length();
        }
        long remaining = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(input);
        byte[] bArrI = p094k8.p.i(input, -1);
        java.nio.charset.Charset charset = getCharset(charsetDecoder);
        kotlin.jvm.internal.m.e(charset, "charset");
        dst.append(new java.lang.String(bArrI, charset));
        return (int) remaining;
    }

    public static final int encodeImpl(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence input, int i3, int i9, p094k8.l dst) {
        kotlin.jvm.internal.m.e(charsetEncoder, "<this>");
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(dst, "dst");
        byte[] bArrEncodeToByteArray = encodeToByteArray(charsetEncoder, input, i3, i9);
        dst.write(bArrEncodeToByteArray, 0, bArrEncodeToByteArray.length);
        return bArrEncodeToByteArray.length;
    }

    public static final byte[] encodeToByteArray(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence input, int i3, int i9) {
        kotlin.jvm.internal.m.e(charsetEncoder, "<this>");
        kotlin.jvm.internal.m.e(input, "input");
        if (!(input instanceof java.lang.String)) {
            return encodeToByteArraySlow(charsetEncoder, input, i3, i9);
        }
        if (i3 == 0) {
            java.lang.String str = (java.lang.String) input;
            if (i9 == str.length()) {
                byte[] bytes = str.getBytes(charsetEncoder.charset());
                kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
                return bytes;
            }
        }
        java.lang.String strSubstring = ((java.lang.String) input).substring(i3, i9);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        kotlin.jvm.internal.m.d(bytes2, "getBytes(...)");
        return bytes2;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i3, int i9, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        return encodeToByteArray(charsetEncoder, charSequence, i3, i9);
    }

    public static final byte[] encodeToByteArrayImpl(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence input, int i3, int i9) {
        kotlin.jvm.internal.m.e(charsetEncoder, "<this>");
        kotlin.jvm.internal.m.e(input, "input");
        throw new java.lang.IllegalStateException("Not needed on jvm");
    }

    public static /* synthetic */ byte[] encodeToByteArrayImpl$default(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i3, int i9, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        return encodeToByteArrayImpl(charsetEncoder, charSequence, i3, i9);
    }

    private static final byte[] encodeToByteArraySlow(java.nio.charset.CharsetEncoder charsetEncoder, java.lang.CharSequence charSequence, int i3, int i9) throws java.nio.charset.CharacterCodingException {
        java.nio.ByteBuffer byteBufferEncode = charsetEncoder.encode(java.nio.CharBuffer.wrap(charSequence, i3, i9));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final java.nio.charset.Charset forName(O7.a aVar, java.lang.String name) {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName(name);
        kotlin.jvm.internal.m.d(charsetForName, "forName(...)");
        return charsetForName;
    }

    public static final java.nio.charset.Charset getCharset(java.nio.charset.CharsetEncoder charsetEncoder) {
        kotlin.jvm.internal.m.e(charsetEncoder, "<this>");
        java.nio.charset.Charset charset = charsetEncoder.charset();
        kotlin.jvm.internal.m.d(charset, "charset(...)");
        return charset;
    }

    public static final java.lang.String getName(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(charset, "<this>");
        java.lang.String strName = charset.name();
        kotlin.jvm.internal.m.d(strName, "name(...)");
        return strName;
    }

    public static final boolean isSupported(O7.a aVar, java.lang.String name) {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        return java.nio.charset.Charset.isSupported(name);
    }

    public static final java.nio.charset.Charset getCharset(java.nio.charset.CharsetDecoder charsetDecoder) {
        kotlin.jvm.internal.m.e(charsetDecoder, "<this>");
        java.nio.charset.Charset charset = charsetDecoder.charset();
        kotlin.jvm.internal.m.b(charset);
        return charset;
    }
}
