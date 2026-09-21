package io.ktor.utils.io.core;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u000e\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u0011\u001a)\u0010\u0013\u001a\u00020\u0000*\u00020\r2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0016\u001a\u00020\u0000*\u00020\r2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a'\u0010\u0018\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0017\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b \u0010!\u001a;\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\"2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b \u0010#\u001a\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "toByteArray", "(Ljava/lang/String;Ljava/nio/charset/Charset;)[B", "bytes", "", "offset", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "String", "([BIILjava/nio/charset/Charset;)Ljava/lang/String;", "Lk8/n;", "readBytes", "(Lk8/n;)[B", "count", "(Lk8/n;I)[B", "max", "readText", "(Lk8/n;Ljava/nio/charset/Charset;I)Ljava/lang/String;", "n", "readTextExact", "charactersCount", "readTextExactCharacters", "(Lk8/n;ILjava/nio/charset/Charset;)Ljava/lang/String;", "Lk8/l;", "", "text", "fromIndex", "toIndex", "Lh6/A;", "writeText", "(Lk8/l;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;)V", "", "(Lk8/l;[CIILjava/nio/charset/Charset;)V", "", "prematureEndOfStreamToReadChars", "(I)Ljava/lang/Void;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StringsKt {
    @p070h6.c
    public static final java.lang.String String(byte[] bytes, int i3, int i9, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        kotlin.jvm.internal.m.e(charset, "charset");
        if (charset.equals(O7.a.f8024b)) {
            return O7.x.o0(i3, i9 + i3, 4, bytes);
        }
        p094k8.a aVar = new p094k8.a();
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully(aVar, bytes, i3, i9);
        return readText$default(aVar, charset, 0, 2, null);
    }

    public static /* synthetic */ java.lang.String String$default(byte[] bArr, int i3, int i9, java.nio.charset.Charset charset, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        if ((i10 & 8) != 0) {
            charset = O7.a.f8024b;
        }
        return String(bArr, i3, i9, charset);
    }

    private static final java.lang.Void prematureEndOfStreamToReadChars(int i3) throws java.io.EOFException {
        throw new java.io.EOFException(Y6.f.f(i3, "Not enough input bytes to read ", " characters."));
    }

    @p070h6.c
    public static final byte[] readBytes(p094k8.n nVar, int i3) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        return p094k8.p.h(nVar, i3);
    }

    public static final java.lang.String readText(p094k8.n nVar, java.nio.charset.Charset charset, int i3) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        if (!charset.equals(O7.a.f8024b)) {
            return io.ktor.utils.io.charsets.EncodingKt.decode(charset.newDecoder(), nVar, i3);
        }
        if (i3 == Integer.MAX_VALUE) {
            return p094k8.p.j(nVar);
        }
        long jMin = java.lang.Math.min(nVar.a().j, i3);
        nVar.S(jMin);
        return p094k8.p.c(nVar.a(), jMin);
    }

    public static /* synthetic */ java.lang.String readText$default(p094k8.n nVar, java.nio.charset.Charset charset, int i3, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            charset = O7.a.f8024b;
        }
        if ((i9 & 2) != 0) {
            i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        return readText(nVar, charset, i3);
    }

    @p070h6.c
    public static final java.lang.String readTextExact(p094k8.n nVar, java.nio.charset.Charset charset, int i3) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        return readTextExactCharacters(nVar, i3, charset);
    }

    public static /* synthetic */ java.lang.String readTextExact$default(p094k8.n nVar, java.nio.charset.Charset charset, int i3, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            charset = O7.a.f8024b;
        }
        return readTextExact(nVar, charset, i3);
    }

    public static final java.lang.String readTextExactCharacters(p094k8.n nVar, int i3, java.nio.charset.Charset charset) throws java.io.EOFException {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        java.lang.String text = readText(nVar, charset, i3);
        if (text.length() >= i3) {
            return text;
        }
        prematureEndOfStreamToReadChars(i3);
        throw new I3.b();
    }

    public static /* synthetic */ java.lang.String readTextExactCharacters$default(p094k8.n nVar, int i3, java.nio.charset.Charset charset, int i9, java.lang.Object obj) {
        if ((i9 & 2) != 0) {
            charset = O7.a.f8024b;
        }
        return readTextExactCharacters(nVar, i3, charset);
    }

    public static final byte[] toByteArray(java.lang.String str, java.nio.charset.Charset charset) throws java.nio.charset.CharacterCodingException {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        java.nio.charset.Charset charset2 = O7.a.f8024b;
        if (!charset.equals(charset2)) {
            return io.ktor.utils.io.charsets.CharsetJVMKt.encodeToByteArray(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        com.google.common.util.concurrent.AbstractC1903s.m(0, length, str.length());
        java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = charset2.newEncoder();
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPORT;
        java.nio.ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(java.nio.CharBuffer.wrap(str, 0, length));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            kotlin.jvm.internal.m.b(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                kotlin.jvm.internal.m.b(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ byte[] toByteArray$default(java.lang.String str, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            charset = O7.a.f8024b;
        }
        return toByteArray(str, charset);
    }

    public static final void writeText(p094k8.l lVar, java.lang.CharSequence text, int i3, int i9, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        kotlin.jvm.internal.m.e(text, "text");
        kotlin.jvm.internal.m.e(charset, "charset");
        if (charset == O7.a.f8024b) {
            p094k8.p.o(lVar, text.toString(), i3, i9);
        } else {
            io.ktor.utils.io.charsets.EncodingKt.encodeToImpl(charset.newEncoder(), lVar, text, i3, i9);
        }
    }

    public static /* synthetic */ void writeText$default(p094k8.l lVar, java.lang.CharSequence charSequence, int i3, int i9, java.nio.charset.Charset charset, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        if ((i10 & 8) != 0) {
            charset = O7.a.f8024b;
        }
        writeText(lVar, charSequence, i3, i9, charset);
    }

    @p070h6.c
    public static final byte[] readBytes(p094k8.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        return p094k8.p.i(nVar, -1);
    }

    public static final void writeText(p094k8.l lVar, char[] text, int i3, int i9, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        kotlin.jvm.internal.m.e(text, "text");
        kotlin.jvm.internal.m.e(charset, "charset");
        if (charset == O7.a.f8024b) {
            p094k8.p.o(lVar, O7.x.m0(text, i3, i3 + i9), 0, i9 - i3);
        } else {
            io.ktor.utils.io.charsets.EncodingKt.encode(charset.newEncoder(), text, i3, i9, lVar);
        }
    }

    public static /* synthetic */ void writeText$default(p094k8.l lVar, char[] cArr, int i3, int i9, java.nio.charset.Charset charset, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = cArr.length;
        }
        if ((i10 & 8) != 0) {
            charset = O7.a.f8024b;
        }
        writeText(lVar, cArr, i3, i9, charset);
    }
}
