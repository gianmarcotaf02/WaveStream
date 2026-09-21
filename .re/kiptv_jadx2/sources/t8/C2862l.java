package t8;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public final class C2862l {

    public final InputStream f28627a;

    public final CharsetDecoder f28628b;

    public final ByteBuffer f28629c;

    public boolean f28630d;

    public char f28631e;

    public C2862l(InputStream inputStream, Charset charset) {
        kotlin.jvm.internal.m.e(charset, "charset");
        this.f28627a = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f28628b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(C2856f.f28619c.c(8196));
        this.f28629c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public final int a(char[] cArr, int i3, int i9) throws CharacterCodingException {
        int i10;
        CharsetDecoder charsetDecoder;
        char c9;
        char c10;
        char c11;
        char c12;
        if (i9 == 0) {
            return 0;
        }
        if (i3 < 0 || i3 >= cArr.length || i9 < 0 || i3 + i9 > cArr.length) {
            StringBuilder sbS = p121o0.p.s(i3, i9, "Unexpected arguments: ", ", ", ", ");
            sbS.append(cArr.length);
            throw new IllegalArgumentException(sbS.toString().toString());
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
                        throw new IllegalStateException(("Unreachable state: " + iA).toString());
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
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i3, i9);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z9 = false;
        while (true) {
            charsetDecoder = this.f28628b;
            ByteBuffer byteBuffer = this.f28629c;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z9);
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
                } catch (Throwable th) {
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
