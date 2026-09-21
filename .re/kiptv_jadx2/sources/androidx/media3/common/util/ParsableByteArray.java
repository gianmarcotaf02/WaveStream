package androidx.media3.common.util;

import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.errorprone.annotations.CheckReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p076i4.AbstractC2214p0;
import p121o0.p;

@CheckReturnValue
public final class ParsableByteArray {
    public static final int INVALID_CODE_POINT = 1114112;
    private byte[] data;
    private int limit;
    private int position;
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final AbstractC2214p0 SUPPORTED_CHARSETS_FOR_READLINE = AbstractC2214p0.s(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);
    private static final AtomicBoolean shouldEnforceLimitOnLegacyMethods = new AtomicBoolean();

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private static int decodeUtf8CodeUnit(int i3, int i9, int i10, int i11) {
        byte b9 = (byte) i10;
        return q0.u((byte) 0, AbstractC1833d1.k(((i3 & 7) << 2) | ((i9 & 48) >> 4)), AbstractC1833d1.k(((((byte) i9) & 15) << 4) | ((b9 & 60) >> 2)), AbstractC1833d1.k(((b9 & 3) << 6) | (((byte) i11) & 63)));
    }

    private int findNextLineTerminator(Charset charset) {
        int i3;
        byte[] bArr;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i3 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i3 = 2;
        }
        int i9 = this.position;
        while (true) {
            int i10 = this.limit;
            if (i9 >= i10 - (i3 - 1)) {
                return i10;
            }
            if ((!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) || !Util.isLinebreak(this.data[i9])) {
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr2 = this.data;
                    if (bArr2[i9] != 0 || !Util.isLinebreak(bArr2[i9 + 1])) {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr = this.data;
                            if (bArr[i9 + 1] != 0 || !Util.isLinebreak(bArr[i9])) {
                            }
                        }
                        i9 += i3;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr = this.data;
                        if (bArr[i9 + 1] != 0) {
                            continue;
                        }
                    }
                    i9 += i3;
                }
            }
            return i9;
        }
    }

    private static int getSmallestCodeUnitSize(Charset charset) {
        AbstractC1864o0.P(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean isUtf8ContinuationByte(byte b9) {
        return (b9 & 192) == 128;
    }

    private void maybeAssertAtLeastBytesLeftForLegacyMethod(int i3) {
        if (!shouldEnforceLimitOnLegacyMethods.get() || bytesLeft() >= i3) {
            return;
        }
        StringBuilder sbT = p.t(i3, "bytesNeeded= ", ", bytesLeft=");
        sbT.append(bytesLeft());
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    private int peekCodePointAndSize(Charset charset) {
        int codePoint;
        int iDecodeUtf8CodeUnit;
        AbstractC1864o0.P(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() < getSmallestCodeUnitSize(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.position + ", limit=" + this.limit);
        }
        byte b9 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.data[this.position];
            if ((b10 & 128) == 0) {
                codePoint = b10 & 255;
                return (codePoint << 8) | b9;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte bPeekUtf8CodeUnitSize = peekUtf8CodeUnitSize();
            if (bPeekUtf8CodeUnitSize == 1) {
                iDecodeUtf8CodeUnit = this.data[this.position] & 255;
            } else if (bPeekUtf8CodeUnitSize == 2) {
                byte[] bArr = this.data;
                int i3 = this.position;
                iDecodeUtf8CodeUnit = decodeUtf8CodeUnit(0, 0, bArr[i3], bArr[i3 + 1]);
            } else {
                if (bPeekUtf8CodeUnitSize != 3) {
                    if (bPeekUtf8CodeUnitSize == 4) {
                        byte[] bArr2 = this.data;
                        int i9 = this.position;
                        iDecodeUtf8CodeUnit = decodeUtf8CodeUnit(bArr2[i9], bArr2[i9 + 1], bArr2[i9 + 2], bArr2[i9 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.data;
                int i10 = this.position;
                iDecodeUtf8CodeUnit = decodeUtf8CodeUnit(0, bArr3[i10] & 15, bArr3[i10 + 1], bArr3[i10 + 2]);
            }
            b9 = bPeekUtf8CodeUnitSize;
            codePoint = iDecodeUtf8CodeUnit;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cPeekChar = peekChar(byteOrder, 0);
            if (!Character.isHighSurrogate(cPeekChar) || bytesLeft() < 4) {
                codePoint = cPeekChar;
                b9 = 2;
            } else {
                codePoint = Character.toCodePoint(cPeekChar, peekChar(byteOrder, 2));
                b9 = 4;
            }
        }
        return (codePoint << 8) | b9;
    }

    private byte peekUtf8CodeUnitSize() {
        byte b9 = this.data[this.position];
        if ((b9 & 128) == 0) {
            return (byte) 1;
        }
        if ((b9 & 224) == 192 && bytesLeft() >= 2 && isUtf8ContinuationByte(this.data[this.position + 1])) {
            return (byte) 2;
        }
        if ((this.data[this.position] & 240) == 224 && bytesLeft() >= 3 && isUtf8ContinuationByte(this.data[this.position + 1]) && isUtf8ContinuationByte(this.data[this.position + 2])) {
            return (byte) 3;
        }
        return ((this.data[this.position] & 248) == 240 && bytesLeft() >= 4 && isUtf8ContinuationByte(this.data[this.position + 1]) && isUtf8ContinuationByte(this.data[this.position + 2]) && isUtf8ContinuationByte(this.data[this.position + 3])) ? (byte) 4 : (byte) 0;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCodePointAndSize;
        if (bytesLeft() < getSmallestCodeUnitSize(charset) || (iPeekCodePointAndSize = peekCodePointAndSize(charset)) == 0) {
            return (char) 0;
        }
        long j = iPeekCodePointAndSize >>> 8;
        AbstractC1864o0.N((j >> 32) == 0, "out of range: %s", j);
        int i3 = (int) j;
        if (Character.isSupplementaryCodePoint(i3)) {
            return (char) 0;
        }
        long j9 = i3;
        char c9 = (char) j9;
        AbstractC1864o0.N(((long) c9) == j9, "Out of range: %s", j9);
        for (char c10 : cArr) {
            if (c10 == c9) {
                this.position = q0.m(iPeekCodePointAndSize & 255) + this.position;
                return c9;
            }
        }
        return (char) 0;
    }

    public static void setShouldEnforceLimitOnLegacyMethods(boolean z6) {
        shouldEnforceLimitOnLegacyMethods.set(z6);
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return Math.max(this.limit - this.position, 0);
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i3) {
        if (i3 > capacity()) {
            this.data = Arrays.copyOf(this.data, i3);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        return peekChar(ByteOrder.BIG_ENDIAN, 0);
    }

    public int peekCodePoint(Charset charset) {
        int iPeekCodePointAndSize = peekCodePointAndSize(charset);
        return iPeekCodePointAndSize != 0 ? q0.m(iPeekCodePointAndSize >>> 8) : INVALID_CODE_POINT;
    }

    public int peekInt() {
        if (bytesLeft() >= 4) {
            int i3 = readInt();
            this.position -= 4;
            return i3;
        }
        throw new IndexOutOfBoundsException("position=" + this.position + ", limit=" + this.limit);
    }

    public int peekUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        return this.data[this.position] & 255;
    }

    public int peekUnsignedInt24() {
        if (bytesLeft() >= 3) {
            int unsignedInt24 = readUnsignedInt24();
            this.position -= 3;
            return unsignedInt24;
        }
        throw new IndexOutOfBoundsException("position=" + this.position + ", limit=" + this.limit);
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i3) {
        readBytes(parsableBitArray.data, 0, i3);
        parsableBitArray.setPosition(0);
    }

    public String readDelimiterTerminatedString(char c9) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i3 = this.position;
        while (i3 < this.limit && this.data[i3] != c9) {
            i3++;
        }
        byte[] bArr = this.data;
        int i9 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i9, i3 - i9);
        this.position = i3;
        if (i3 < this.limit) {
            this.position = i3 + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = (bArr[i3] & 255) << 24;
        int i11 = i3 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 16) | i10;
        int i13 = i3 + 3;
        this.position = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 8);
        this.position = i3 + 4;
        return (bArr[i13] & 255) | i14;
    }

    public int readInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = ((bArr[i3] & 255) << 24) >> 8;
        int i11 = i3 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        this.position = i3 + 3;
        return (bArr[i11] & 255) | i12;
    }

    public String readLine() {
        return readLine(StandardCharsets.UTF_8);
    }

    public int readLittleEndianInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = bArr[i3] & 255;
        int i11 = i3 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        int i13 = i3 + 3;
        this.position = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 16);
        this.position = i3 + 4;
        return ((bArr[i13] & 255) << 24) | i14;
    }

    public int readLittleEndianInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = bArr[i3] & 255;
        int i11 = i3 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        this.position = i3 + 3;
        return ((bArr[i11] & 255) << 16) | i12;
    }

    public long readLittleEndianLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        long j = ((long) bArr[i3]) & 255;
        int i10 = i3 + 2;
        this.position = i10;
        long j9 = j | ((((long) bArr[i9]) & 255) << 8);
        int i11 = i3 + 3;
        this.position = i11;
        long j10 = j9 | ((((long) bArr[i10]) & 255) << 16);
        int i12 = i3 + 4;
        this.position = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 24);
        int i13 = i3 + 5;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 32);
        int i14 = i3 + 6;
        this.position = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 40);
        int i15 = i3 + 7;
        this.position = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 48);
        this.position = i3 + 8;
        return ((((long) bArr[i15]) & 255) << 56) | j14;
    }

    public short readLittleEndianShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = bArr[i3] & 255;
        this.position = i3 + 2;
        return (short) (((bArr[i9] & 255) << 8) | i10);
    }

    public long readLittleEndianUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        long j = ((long) bArr[i3]) & 255;
        int i10 = i3 + 2;
        this.position = i10;
        long j9 = j | ((((long) bArr[i9]) & 255) << 8);
        int i11 = i3 + 3;
        this.position = i11;
        long j10 = j9 | ((((long) bArr[i10]) & 255) << 16);
        this.position = i3 + 4;
        return ((((long) bArr[i11]) & 255) << 24) | j10;
    }

    public int readLittleEndianUnsignedInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = bArr[i3] & 255;
        int i11 = i3 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        this.position = i3 + 3;
        return ((bArr[i11] & 255) << 16) | i12;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException(M0.l(littleEndianInt, "Top bit not zero: "));
    }

    public int readLittleEndianUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = bArr[i3] & 255;
        this.position = i3 + 2;
        return ((bArr[i9] & 255) << 8) | i10;
    }

    public long readLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        long j = (((long) bArr[i3]) & 255) << 56;
        int i10 = i3 + 2;
        this.position = i10;
        long j9 = j | ((((long) bArr[i9]) & 255) << 48);
        int i11 = i3 + 3;
        this.position = i11;
        long j10 = j9 | ((((long) bArr[i10]) & 255) << 40);
        int i12 = i3 + 4;
        this.position = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 32);
        int i13 = i3 + 5;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 24);
        int i14 = i3 + 6;
        this.position = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 16);
        int i15 = i3 + 7;
        this.position = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 8);
        this.position = i3 + 8;
        return (((long) bArr[i15]) & 255) | j14;
    }

    public String readNullTerminatedString(int i3) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i3);
        if (i3 == 0) {
            return "";
        }
        int i9 = this.position;
        int i10 = (i9 + i3) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i9, (i10 >= this.limit || this.data[i10] != 0) ? i3 : i3 - 1);
        this.position += i3;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = (bArr[i3] & 255) << 8;
        this.position = i3 + 2;
        return (short) ((bArr[i9] & 255) | i10);
    }

    public String readString(int i3) {
        return readString(i3, StandardCharsets.UTF_8);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        byte[] bArr = this.data;
        int i3 = this.position;
        this.position = i3 + 1;
        return bArr[i3] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = (bArr[i3] & 255) << 8;
        this.position = i3 + 2;
        int i11 = (bArr[i9] & 255) | i10;
        this.position = i3 + 4;
        return i11;
    }

    public long readUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        long j = (((long) bArr[i3]) & 255) << 24;
        int i10 = i3 + 2;
        this.position = i10;
        long j9 = j | ((((long) bArr[i9]) & 255) << 16);
        int i11 = i3 + 3;
        this.position = i11;
        long j10 = j9 | ((((long) bArr[i10]) & 255) << 8);
        this.position = i3 + 4;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public int readUnsignedInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = (bArr[i3] & 255) << 16;
        int i11 = i3 + 2;
        this.position = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        this.position = i3 + 3;
        return (bArr[i11] & 255) | i12;
    }

    public int readUnsignedIntToInt() {
        int i3 = readInt();
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalStateException(M0.l(i3, "Top bit not zero: "));
    }

    public int readUnsignedLeb128ToInt() {
        return q0.m(readUnsignedLeb128ToLong());
    }

    public long readUnsignedLeb128ToLong() {
        long j = 0;
        for (int i3 = 0; i3 < 9; i3++) {
            if (this.position == this.limit) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long unsignedByte = readUnsignedByte();
            j |= (127 & unsignedByte) << (i3 * 7);
            if ((unsignedByte & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public long readUnsignedLongToLong() {
        long j = readLong();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(B2.a.j(j, "Top bit not zero: "));
    }

    public int readUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i3 = this.position;
        int i9 = i3 + 1;
        this.position = i9;
        int i10 = (bArr[i3] & 255) << 8;
        this.position = i3 + 2;
        return (bArr[i9] & 255) | i10;
    }

    public long readUtf8EncodedLong() {
        int i3;
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        long j = this.data[this.position];
        int i9 = 7;
        while (true) {
            if (i9 >= 0) {
                int i10 = 1 << i9;
                if ((((long) i10) & j) == 0) {
                    if (i9 < 6) {
                        j &= (long) (i10 - 1);
                        i3 = 7 - i9;
                        break;
                    }
                    if (i9 == 7) {
                        i3 = 1;
                        break;
                    }
                } else {
                    i9--;
                }
            }
            i3 = 0;
            break;
        }
        if (i3 == 0) {
            throw new NumberFormatException(B2.a.j(j, "Invalid UTF-8 sequence first byte: "));
        }
        maybeAssertAtLeastBytesLeftForLegacyMethod(i3);
        for (int i11 = 1; i11 < i3; i11++) {
            byte b9 = this.data[this.position + i11];
            if ((b9 & 192) != 128) {
                throw new NumberFormatException(B2.a.j(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b9 & 63));
        }
        this.position += i3;
        return j;
    }

    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i3 = this.position;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.position = i3 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i9 = this.position;
        byte b9 = bArr2[i9];
        if (b9 == -2 && bArr2[i9 + 1] == -1) {
            this.position = i9 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b9 != -1 || bArr2[i9 + 1] != -2) {
            return null;
        }
        this.position = i9 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void reset(int i3) {
        reset(capacity() < i3 ? new byte[i3] : this.data, i3);
    }

    public void setLimit(int i3) {
        AbstractC1864o0.L(i3 >= 0 && i3 <= this.data.length);
        this.limit = i3;
    }

    public void setPosition(int i3) {
        AbstractC1864o0.L(i3 >= 0 && i3 <= this.limit);
        this.position = i3;
    }

    public void skipBytes(int i3) {
        setPosition(this.position + i3);
    }

    public void skipLeb128() {
        while ((readUnsignedByte() & 128) != 0) {
        }
    }

    @Deprecated
    public char peekChar(Charset charset) {
        int iPeekUnsignedByte;
        AbstractC1864o0.P(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() != 0) {
            if (charset.equals(StandardCharsets.US_ASCII)) {
                iPeekUnsignedByte = peekUnsignedByte();
            } else if (charset.equals(StandardCharsets.UTF_8)) {
                if ((this.data[this.position] & 128) == 0) {
                    iPeekUnsignedByte = peekUnsignedByte();
                }
            } else if (bytesLeft() >= 2) {
                return peekChar(charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN, 0);
            }
            return (char) iPeekUnsignedByte;
        }
        return (char) 0;
    }

    public String readLine(Charset charset) {
        AbstractC1864o0.P(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public String readString(int i3, Charset charset) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i3);
        String str = new String(this.data, this.position, i3, charset);
        this.position += i3;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ParsableByteArray(int i3) {
        this.data = new byte[i3];
        this.limit = i3;
    }

    public void readBytes(byte[] bArr, int i3, int i9) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i9);
        System.arraycopy(this.data, this.position, bArr, i3, i9);
        this.position += i9;
    }

    public void reset(byte[] bArr, int i3) {
        this.data = bArr;
        this.limit = i3;
        this.position = 0;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public void readBytes(ByteBuffer byteBuffer, int i3) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i3);
        byteBuffer.put(this.data, this.position, i3);
        this.position += i3;
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr, int i3) {
        this.data = bArr;
        this.limit = i3;
    }

    private char peekChar(ByteOrder byteOrder, int i3) {
        byte b9;
        byte b10;
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.data;
            int i9 = this.position + i3;
            b9 = bArr[i9];
            b10 = bArr[i9 + 1];
        } else {
            byte[] bArr2 = this.data;
            int i10 = this.position + i3;
            b9 = bArr2[i10 + 1];
            b10 = bArr2[i10];
        }
        return (char) ((b10 & 255) | (b9 << 8));
    }
}
