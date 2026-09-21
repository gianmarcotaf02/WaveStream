package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lio/ktor/util/Sha1;", "Lio/ktor/util/HashFunction;", "<init>", "()V", "", "input", "", "pos", "Lh6/A;", "processChunk", "([BI)V", "reset", "offset", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "update", "([BII)V", "digest", "()[B", "", "messageLength", "J", "unprocessed", "[B", "unprocessedLimit", "I", "", "words", "[I", "h0", "h1", "h2", "h3", "h4", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Sha1 implements io.ktor.util.HashFunction {
    private long messageLength;
    private int unprocessedLimit;
    private final byte[] unprocessed = new byte[64];
    private final int[] words = new int[80];
    private int h0 = 1732584193;
    private int h1 = -271733879;
    private int h2 = -1732584194;
    private int h3 = 271733878;
    private int h4 = -1009589776;

    private final void processChunk(byte[] input, int pos) {
        int i3;
        int iLeftRotate;
        int i9;
        int[] iArr = this.words;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= 16) {
                break;
            }
            int i12 = pos + 3;
            int i13 = ((input[pos + 1] & 255) << 16) | ((input[pos] & 255) << 24) | ((input[pos + 2] & 255) << 8);
            pos += 4;
            iArr[i11] = i13 | (input[i12] & 255);
            i11++;
        }
        for (i3 = 16; i3 < 80; i3++) {
            iArr[i3] = io.ktor.util.HashFunctionKt.leftRotate(((iArr[i3 - 3] ^ iArr[i3 - 8]) ^ iArr[i3 - 14]) ^ iArr[i3 - 16], 1);
        }
        int i14 = this.h0;
        int i15 = this.h1;
        int iLeftRotate2 = this.h2;
        int i16 = this.h3;
        int i17 = this.h4;
        while (i10 < 80) {
            if (i10 < 20) {
                iLeftRotate = io.ktor.util.HashFunctionKt.leftRotate(i14, 5) + (((iLeftRotate2 ^ i16) & i15) ^ i16) + i17 + 1518500249;
                i9 = iArr[i10];
            } else if (i10 < 40) {
                iLeftRotate = io.ktor.util.HashFunctionKt.leftRotate(i14, 5) + ((i15 ^ iLeftRotate2) ^ i16) + i17 + 1859775393;
                i9 = iArr[i10];
            } else if (i10 < 60) {
                iLeftRotate = ((io.ktor.util.HashFunctionKt.leftRotate(i14, 5) + (((iLeftRotate2 | i16) & i15) | (iLeftRotate2 & i16))) + i17) - 1894007588;
                i9 = iArr[i10];
            } else {
                iLeftRotate = ((io.ktor.util.HashFunctionKt.leftRotate(i14, 5) + ((i15 ^ iLeftRotate2) ^ i16)) + i17) - 899497514;
                i9 = iArr[i10];
            }
            int i18 = iLeftRotate + i9;
            i10++;
            i17 = i16;
            i16 = iLeftRotate2;
            iLeftRotate2 = io.ktor.util.HashFunctionKt.leftRotate(i15, 30);
            i15 = i14;
            i14 = i18;
        }
        this.h0 += i14;
        this.h1 += i15;
        this.h2 += iLeftRotate2;
        this.h3 += i16;
        this.h4 += i17;
    }

    private final void reset() {
        this.messageLength = 0L;
        byte[] bArr = this.unprocessed;
        java.util.Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        this.unprocessedLimit = 0;
        p078i6.m.i0(this.words, 0);
        this.h0 = 1732584193;
        this.h1 = -271733879;
        this.h2 = -1732584194;
        this.h3 = 271733878;
        this.h4 = -1009589776;
    }

    @Override // io.ktor.util.HashFunction
    public byte[] digest() {
        byte[] bArr = this.unprocessed;
        int i3 = this.unprocessedLimit;
        long j = this.messageLength * ((long) 8);
        int i9 = i3 + 1;
        bArr[i3] = -128;
        if (i9 > 56) {
            java.util.Arrays.fill(bArr, i9, 64, (byte) 0);
            processChunk(bArr, 0);
            java.util.Arrays.fill(bArr, 0, i9, (byte) 0);
        } else {
            java.util.Arrays.fill(bArr, i9, 56, (byte) 0);
        }
        bArr[56] = (byte) (j >>> 56);
        bArr[57] = (byte) (j >>> 48);
        bArr[58] = (byte) (j >>> 40);
        bArr[59] = (byte) (j >>> 32);
        bArr[60] = (byte) (j >>> 24);
        bArr[61] = (byte) (j >>> 16);
        bArr[62] = (byte) (j >>> 8);
        bArr[63] = (byte) j;
        processChunk(bArr, 0);
        int i10 = this.h0;
        int i11 = this.h1;
        int i12 = this.h2;
        int i13 = this.h3;
        int i14 = this.h4;
        reset();
        return new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10, (byte) (i11 >> 24), (byte) (i11 >> 16), (byte) (i11 >> 8), (byte) i11, (byte) (i12 >> 24), (byte) (i12 >> 16), (byte) (i12 >> 8), (byte) i12, (byte) (i13 >> 24), (byte) (i13 >> 16), (byte) (i13 >> 8), (byte) i13, (byte) (i14 >> 24), (byte) (i14 >> 16), (byte) (i14 >> 8), (byte) i14};
    }

    @Override // io.ktor.util.HashFunction
    public void update(byte[] input, int offset, int length) {
        kotlin.jvm.internal.m.e(input, "input");
        this.messageLength += (long) length;
        int i3 = offset + length;
        byte[] bArr = this.unprocessed;
        int i9 = this.unprocessedLimit;
        if (i9 > 0) {
            int i10 = length + i9;
            if (i10 < 64) {
                p078i6.m.a0(input, i9, offset, bArr, i3);
                this.unprocessedLimit = i10;
                return;
            } else {
                int i11 = (64 - i9) + offset;
                p078i6.m.a0(input, i9, offset, bArr, i11);
                processChunk(bArr, 0);
                this.unprocessedLimit = 0;
                offset = i11;
            }
        }
        while (offset < i3) {
            int i12 = offset + 64;
            if (i12 > i3) {
                p078i6.m.a0(input, 0, offset, bArr, i3);
                this.unprocessedLimit = i3 - offset;
                return;
            } else {
                processChunk(input, offset);
                offset = i12;
            }
        }
    }
}
