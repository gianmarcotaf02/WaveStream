package t8;

/* JADX INFO: renamed from: t8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2862l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.io.InputStream f28627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.nio.charset.CharsetDecoder f28628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f28629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public char f28631e;

    public C2862l(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(charset, "charset");
        this.f28627a = inputStream;
        java.nio.charset.CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPLACE;
        this.f28628b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(t8.C2856f.f28619c.c(8196));
        this.f28629c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public final int a(char[] cArr, int i3, int i9) throws java.nio.charset.CharacterCodingException {
        int i10;
        java.nio.charset.CharsetDecoder charsetDecoder;
        char c9;
        char c10;
        char c11;
        char c12;
        if (i9 == 0) {
            return 0;
        }
        if (i3 < 0 || i3 >= cArr.length || i9 < 0 || i3 + i9 > cArr.length) {
            java.lang.StringBuilder sbS = p121o0.p.s(i3, i9, "Unexpected arguments: ", ", ", ", ");
            sbS.append(cArr.length);
            throw new java.lang.IllegalArgumentException(sbS.toString().toString());
        }
        boolean z6 = true;
        if (this.f28630d) {
            cArr[i3] = this.f28631e;
            i3++;
            i9--;
            this.f28630d = false;
            if (i9 == 0) {
                return 1;
            }
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i9 == 1) {
            if (this.f28630d) {
                this.f28630d = false;
                c12 = this.f28631e;
            } else {
                char[] cArr2 = new char[2];
                int iA = a(cArr2, 0, 2);
                if (iA == -1) {
                    c9 = 65535;
                } else if (iA == 1) {
                    c10 = cArr2[0];
                } else {
                    if (iA != 2) {
                        throw new java.lang.IllegalStateException(("Unreachable state: " + iA).toString());
                    }
                    this.f28631e = cArr2[1];
                    this.f28630d = true;
                    c11 = cArr2[0];
                }
            }
            if (c9 != 65535) {
                c9 = c10;
                c9 = c11;
                c9 = c12;
                cArr[i3] = c9;
                return i10 + 1;
            }
            if (i10 == 0) {
                return -1;
            }
            return i10;
        }
        java.nio.CharBuffer charBufferWrap = java.nio.CharBuffer.wrap(cArr, i3, i9);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        java.nio.CharBuffer charBuffer = charBufferWrap;
        boolean z9 = false;
        while (true) {
            charsetDecoder = this.f28628b;
            java.nio.ByteBuffer byteBuffer = this.f28629c;
            java.nio.charset.CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z9);
            if (coderResultDecode.isUnderflow()) {
                if (z9 || !charBuffer.hasRemaining()) {
                    z6 = z9;
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = this.f28627a.read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining < 0) {
                        byteBuffer.flip();
                    } else {
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z9 = true;
                    } else {
                        continue;
                    }
                } catch (java.lang.Throwable th) {
                    byteBuffer.flip();
                    throw th;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    z6 = z9;
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z6) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i10;
    }
}
