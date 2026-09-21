package M8;

import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.google.android.gms.internal.play_billing.M0;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class C0682j implements InterfaceC0684l, InterfaceC0683k, Cloneable, ByteChannel, AutoCloseable {

    public F f7259h;

    public long f7260i;

    public final void B(byte[] sink) throws EOFException {
        kotlin.jvm.internal.m.e(sink, "sink");
        int i3 = 0;
        while (i3 < sink.length) {
            int iT = t(sink, i3, sink.length - i3);
            if (iT == -1) {
                throw new EOFException();
            }
            i3 += iT;
        }
    }

    @Override
    public final void C(long j) throws EOFException {
        while (j > 0) {
            F f9 = this.f7259h;
            if (f9 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, f9.f7221c - f9.f7220b);
            long j9 = iMin;
            this.f7260i -= j9;
            j -= j9;
            int i3 = f9.f7220b + iMin;
            f9.f7220b = i3;
            if (i3 == f9.f7221c) {
                this.f7259h = f9.a();
                G.a(f9);
            }
        }
    }

    @Override
    public final void F(long j, C0682j c0682j) throws EOFException {
        long j9 = this.f7260i;
        if (j9 >= j) {
            c0682j.J(j, this);
        } else {
            c0682j.J(j9, this);
            throw new EOFException();
        }
    }

    public final long G() throws EOFException {
        int i3;
        if (this.f7260i == 0) {
            throw new EOFException();
        }
        int i9 = 0;
        boolean z6 = false;
        long j = 0;
        do {
            F f9 = this.f7259h;
            kotlin.jvm.internal.m.b(f9);
            int i10 = f9.f7220b;
            int i11 = f9.f7221c;
            while (i10 < i11) {
                byte b9 = f9.f7219a[i10];
                if (b9 >= 48 && b9 <= 57) {
                    i3 = b9 - 48;
                } else if (b9 >= 97 && b9 <= 102) {
                    i3 = b9 - 87;
                } else {
                    if (b9 < 65 || b9 > 70) {
                        if (i9 != 0) {
                            z6 = true;
                            break;
                        }
                        char[] cArr = N8.b.f7474a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b9 >> 4) & 15], cArr[b9 & 15]})));
                    }
                    i3 = b9 - 55;
                }
                if ((j & (-1152921504606846976L)) != 0) {
                    C0682j c0682j = new C0682j();
                    c0682j.a0(j);
                    c0682j.Z(b9);
                    throw new NumberFormatException("Number too large: ".concat(c0682j.T()));
                }
                j = (j << 4) | ((long) i3);
                i10++;
                i9++;
            }
            if (i10 == i11) {
                this.f7259h = f9.a();
                G.a(f9);
            } else {
                f9.f7220b = i10;
            }
            if (z6) {
                break;
            }
        } while (this.f7259h != null);
        this.f7260i -= (long) i9;
        return j;
    }

    @Override
    public final String I() throws EOFException {
        if (Long.MAX_VALUE < 0) {
            throw new IllegalArgumentException(B2.a.j(Long.MAX_VALUE, "limit < 0: ").toString());
        }
        long j = Long.MAX_VALUE != Long.MAX_VALUE ? Long.MAX_VALUE + 1 : Long.MAX_VALUE;
        long jS = s((byte) 10, 0L, j);
        if (jS != -1) {
            return N8.a.a(jS, this);
        }
        if (j < this.f7260i && i(j - 1) == 13 && i(j) == 10) {
            return N8.a.a(j, this);
        }
        C0682j c0682j = new C0682j();
        e(c0682j, 0L, Math.min(32, this.f7260i));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f7260i, Long.MAX_VALUE) + " content=" + c0682j.z(c0682j.f7260i).e() + (char) 8230);
    }

    @Override
    public final void J(long j, C0682j source) {
        F fB;
        kotlin.jvm.internal.m.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0674b.e(source.f7260i, 0L, j);
        while (j > 0) {
            F f9 = source.f7259h;
            kotlin.jvm.internal.m.b(f9);
            int i3 = f9.f7221c;
            F f10 = source.f7259h;
            kotlin.jvm.internal.m.b(f10);
            long j9 = i3 - f10.f7220b;
            int i9 = 0;
            if (j < j9) {
                F f11 = this.f7259h;
                F f12 = f11 != null ? f11.g : null;
                if (f12 != null && f12.f7223e) {
                    if ((((long) f12.f7221c) + j) - ((long) (f12.f7222d ? 0 : f12.f7220b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        F f13 = source.f7259h;
                        kotlin.jvm.internal.m.b(f13);
                        f13.d(f12, (int) j);
                        source.f7260i -= j;
                        this.f7260i += j;
                        return;
                    }
                }
                F f14 = source.f7259h;
                kotlin.jvm.internal.m.b(f14);
                int i10 = (int) j;
                if (i10 <= 0 || i10 > f14.f7221c - f14.f7220b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i10 >= 1024) {
                    fB = f14.c();
                } else {
                    fB = G.b();
                    int i11 = f14.f7220b;
                    p078i6.m.a0(f14.f7219a, 0, i11, fB.f7219a, i11 + i10);
                }
                fB.f7221c = fB.f7220b + i10;
                f14.f7220b += i10;
                F f15 = f14.g;
                kotlin.jvm.internal.m.b(f15);
                f15.b(fB);
                source.f7259h = fB;
            }
            F f16 = source.f7259h;
            kotlin.jvm.internal.m.b(f16);
            long j10 = f16.f7221c - f16.f7220b;
            source.f7259h = f16.a();
            F f17 = this.f7259h;
            if (f17 == null) {
                this.f7259h = f16;
                f16.g = f16;
                f16.f7224f = f16;
            } else {
                F f18 = f17.g;
                kotlin.jvm.internal.m.b(f18);
                f18.b(f16);
                F f19 = f16.g;
                if (f19 == f16) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.m.b(f19);
                if (f19.f7223e) {
                    int i12 = f16.f7221c - f16.f7220b;
                    F f20 = f16.g;
                    kotlin.jvm.internal.m.b(f20);
                    int i13 = 8192 - f20.f7221c;
                    F f21 = f16.g;
                    kotlin.jvm.internal.m.b(f21);
                    if (!f21.f7222d) {
                        F f22 = f16.g;
                        kotlin.jvm.internal.m.b(f22);
                        i9 = f22.f7220b;
                    }
                    if (i12 <= i13 + i9) {
                        F f23 = f16.g;
                        kotlin.jvm.internal.m.b(f23);
                        f16.d(f23, i12);
                        f16.a();
                        G.a(f16);
                    }
                }
            }
            source.f7260i -= j10;
            this.f7260i += j10;
            j -= j10;
        }
    }

    @Override
    public final long M(K source) {
        kotlin.jvm.internal.m.e(source, "source");
        long j = 0;
        while (true) {
            long jM = source.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, this);
            if (jM == -1) {
                return j;
            }
            j += jM;
        }
    }

    public final short N() throws EOFException {
        short s9 = readShort();
        return (short) (((s9 & 255) << 8) | ((65280 & s9) >>> 8));
    }

    public final String P(long j, Charset charset) throws EOFException {
        kotlin.jvm.internal.m.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount: ").toString());
        }
        if (this.f7260i < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        F f9 = this.f7259h;
        kotlin.jvm.internal.m.b(f9);
        int i3 = f9.f7220b;
        if (((long) i3) + j > f9.f7221c) {
            return new String(v(j), charset);
        }
        int i9 = (int) j;
        String str = new String(f9.f7219a, i3, i9, charset);
        int i10 = f9.f7220b + i9;
        f9.f7220b = i10;
        this.f7260i -= j;
        if (i10 == f9.f7221c) {
            this.f7259h = f9.a();
            G.a(f9);
        }
        return str;
    }

    @Override
    public final boolean Q(long j, C0685m bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        byte[] bArr = bytes.f7262h;
        int length = bArr.length;
        if (j >= 0 && length >= 0 && this.f7260i - j >= length && bArr.length >= length) {
            for (int i3 = 0; i3 < length; i3++) {
                if (i(((long) i3) + j) == bArr[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final String T() {
        return P(this.f7260i, O7.a.f8024b);
    }

    @Override
    public final InputStream U() {
        return new C0681i(this, 0);
    }

    public final C0685m V(int i3) {
        if (i3 == 0) {
            return C0685m.f7261k;
        }
        AbstractC0674b.e(this.f7260i, 0L, i3);
        F f9 = this.f7259h;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i3) {
            kotlin.jvm.internal.m.b(f9);
            int i12 = f9.f7221c;
            int i13 = f9.f7220b;
            if (i12 == i13) {
                throw new AssertionError("s.limit == s.pos");
            }
            i10 += i12 - i13;
            i11++;
            f9 = f9.f7224f;
        }
        byte[][] bArr = new byte[i11][];
        int[] iArr = new int[i11 * 2];
        F f10 = this.f7259h;
        int i14 = 0;
        while (i9 < i3) {
            kotlin.jvm.internal.m.b(f10);
            bArr[i14] = f10.f7219a;
            i9 += f10.f7221c - f10.f7220b;
            iArr[i14] = Math.min(i9, i3);
            iArr[i14 + i11] = f10.f7220b;
            f10.f7222d = true;
            i14++;
            f10 = f10.f7224f;
        }
        return new H(bArr, iArr);
    }

    public final F W(int i3) {
        if (i3 < 1 || i3 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        F f9 = this.f7259h;
        if (f9 == null) {
            F fB = G.b();
            this.f7259h = fB;
            fB.g = fB;
            fB.f7224f = fB;
            return fB;
        }
        F f10 = f9.g;
        kotlin.jvm.internal.m.b(f10);
        if (f10.f7221c + i3 <= 8192 && f10.f7223e) {
            return f10;
        }
        F fB2 = G.b();
        f10.b(fB2);
        return fB2;
    }

    public final void X(C0685m byteString) {
        kotlin.jvm.internal.m.e(byteString, "byteString");
        byteString.s(this, byteString.d());
    }

    public final void Y(byte[] source) {
        kotlin.jvm.internal.m.e(source, "source");
        write(source, 0, source.length);
    }

    public final void Z(int i3) {
        F fW = W(1);
        int i9 = fW.f7221c;
        fW.f7221c = i9 + 1;
        fW.f7219a[i9] = (byte) i3;
        this.f7260i++;
    }

    public final void a0(long j) {
        if (j == 0) {
            Z(48);
            return;
        }
        long j9 = (j >>> 1) | j;
        long j10 = j9 | (j9 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i3 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        F fW = W(i3);
        int i9 = fW.f7221c;
        for (int i10 = (i9 + i3) - 1; i10 >= i9; i10--) {
            fW.f7219a[i10] = N8.a.f7472a[(int) (15 & j)];
            j >>>= 4;
        }
        fW.f7221c += i3;
        this.f7260i += (long) i3;
    }

    public final long b() {
        long j = this.f7260i;
        if (j == 0) {
            return 0L;
        }
        F f9 = this.f7259h;
        kotlin.jvm.internal.m.b(f9);
        F f10 = f9.g;
        kotlin.jvm.internal.m.b(f10);
        int i3 = f10.f7221c;
        return (i3 >= 8192 || !f10.f7223e) ? j : j - ((long) (i3 - f10.f7220b));
    }

    public final void b0(int i3) {
        F fW = W(2);
        int i9 = fW.f7221c;
        byte[] bArr = fW.f7219a;
        bArr[i9] = (byte) ((i3 >>> 8) & 255);
        bArr[i9 + 1] = (byte) (i3 & 255);
        fW.f7221c = i9 + 2;
        this.f7260i += 2;
    }

    @Override
    public final M c() {
        return M.f7231d;
    }

    public final void c0(int i3, int i9, String string) {
        char cCharAt;
        kotlin.jvm.internal.m.e(string, "string");
        if (i3 < 0) {
            throw new IllegalArgumentException(M0.l(i3, "beginIndex < 0: ").toString());
        }
        if (i9 < i3) {
            throw new IllegalArgumentException(M0.k(i9, i3, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i9 > string.length()) {
            StringBuilder sbT = p121o0.p.t(i9, "endIndex > string.length: ", " > ");
            sbT.append(string.length());
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        while (i3 < i9) {
            char cCharAt2 = string.charAt(i3);
            if (cCharAt2 < 128) {
                F fW = W(1);
                int i10 = fW.f7221c - i3;
                int iMin = Math.min(i9, 8192 - i10);
                int i11 = i3 + 1;
                byte[] bArr = fW.f7219a;
                bArr[i3 + i10] = (byte) cCharAt2;
                while (true) {
                    i3 = i11;
                    if (i3 >= iMin || (cCharAt = string.charAt(i3)) >= 128) {
                        break;
                    }
                    i11 = i3 + 1;
                    bArr[i3 + i10] = (byte) cCharAt;
                }
                int i12 = fW.f7221c;
                int i13 = (i10 + i3) - i12;
                fW.f7221c = i12 + i13;
                this.f7260i += (long) i13;
            } else {
                if (cCharAt2 < 2048) {
                    F fW2 = W(2);
                    int i14 = fW2.f7221c;
                    byte b9 = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    byte[] bArr2 = fW2.f7219a;
                    bArr2[i14] = b9;
                    bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    fW2.f7221c = i14 + 2;
                    this.f7260i += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    F fW3 = W(3);
                    int i15 = fW3.f7221c;
                    byte[] bArr3 = fW3.f7219a;
                    bArr3[i15] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    fW3.f7221c = i15 + 3;
                    this.f7260i += 3;
                } else {
                    int i16 = i3 + 1;
                    char cCharAt3 = i16 < i9 ? string.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        Z(63);
                        i3 = i16;
                    } else {
                        int i17 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        F fW4 = W(4);
                        int i18 = fW4.f7221c;
                        byte b10 = (byte) ((i17 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        byte[] bArr4 = fW4.f7219a;
                        bArr4[i18] = b10;
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        fW4.f7221c = i18 + 4;
                        this.f7260i += 4;
                        i3 += 2;
                    }
                }
                i3++;
            }
        }
    }

    public final Object clone() {
        C0682j c0682j = new C0682j();
        if (this.f7260i == 0) {
            return c0682j;
        }
        F f9 = this.f7259h;
        kotlin.jvm.internal.m.b(f9);
        F fC = f9.c();
        c0682j.f7259h = fC;
        fC.g = fC;
        fC.f7224f = fC;
        for (F f10 = f9.f7224f; f10 != f9; f10 = f10.f7224f) {
            F f11 = fC.g;
            kotlin.jvm.internal.m.b(f11);
            kotlin.jvm.internal.m.b(f10);
            f11.b(f10.c());
        }
        c0682j.f7260i = this.f7260i;
        return c0682j;
    }

    @Override
    public final boolean d(long j) {
        return this.f7260i >= j;
    }

    public final void d0(String string) {
        kotlin.jvm.internal.m.e(string, "string");
        c0(0, string.length(), string);
    }

    public final void e(C0682j out, long j, long j9) {
        kotlin.jvm.internal.m.e(out, "out");
        long j10 = j;
        AbstractC0674b.e(this.f7260i, j10, j9);
        if (j9 == 0) {
            return;
        }
        out.f7260i += j9;
        F f9 = this.f7259h;
        while (true) {
            kotlin.jvm.internal.m.b(f9);
            long j11 = f9.f7221c - f9.f7220b;
            if (j10 < j11) {
                break;
            }
            j10 -= j11;
            f9 = f9.f7224f;
        }
        F f10 = f9;
        long j12 = j9;
        while (j12 > 0) {
            kotlin.jvm.internal.m.b(f10);
            F fC = f10.c();
            int i3 = fC.f7220b + ((int) j10);
            fC.f7220b = i3;
            fC.f7221c = Math.min(i3 + ((int) j12), fC.f7221c);
            F f11 = out.f7259h;
            if (f11 == null) {
                fC.g = fC;
                fC.f7224f = fC;
                out.f7259h = fC;
            } else {
                F f12 = f11.g;
                kotlin.jvm.internal.m.b(f12);
                f12.b(fC);
            }
            j12 -= (long) (fC.f7221c - fC.f7220b);
            f10 = f10.f7224f;
            j10 = 0;
        }
    }

    public final void e0(int i3) {
        if (i3 < 128) {
            Z(i3);
            return;
        }
        if (i3 < 2048) {
            F fW = W(2);
            int i9 = fW.f7221c;
            byte b9 = (byte) ((i3 >> 6) | PsExtractor.AUDIO_STREAM);
            byte[] bArr = fW.f7219a;
            bArr[i9] = b9;
            bArr[i9 + 1] = (byte) ((i3 & 63) | 128);
            fW.f7221c = i9 + 2;
            this.f7260i += 2;
            return;
        }
        if (55296 <= i3 && i3 < 57344) {
            Z(63);
            return;
        }
        if (i3 < 65536) {
            F fW2 = W(3);
            int i10 = fW2.f7221c;
            byte[] bArr2 = fW2.f7219a;
            bArr2[i10] = (byte) ((i3 >> 12) | 224);
            bArr2[i10 + 1] = (byte) (((i3 >> 6) & 63) | 128);
            bArr2[i10 + 2] = (byte) ((i3 & 63) | 128);
            fW2.f7221c = i10 + 3;
            this.f7260i += 3;
            return;
        }
        if (i3 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC0674b.k(i3)));
        }
        F fW3 = W(4);
        int i11 = fW3.f7221c;
        byte b10 = (byte) ((i3 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        byte[] bArr3 = fW3.f7219a;
        bArr3[i11] = b10;
        bArr3[i11 + 1] = (byte) (((i3 >> 12) & 63) | 128);
        bArr3[i11 + 2] = (byte) (((i3 >> 6) & 63) | 128);
        bArr3[i11 + 3] = (byte) ((i3 & 63) | 128);
        fW3.f7221c = i11 + 4;
        this.f7260i += 4;
    }

    public final boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        boolean z9 = false;
        if (!(obj instanceof C0682j)) {
            return false;
        }
        long j = this.f7260i;
        C0682j c0682j = (C0682j) obj;
        if (j != c0682j.f7260i) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        F f9 = this.f7259h;
        kotlin.jvm.internal.m.b(f9);
        F f10 = c0682j.f7259h;
        kotlin.jvm.internal.m.b(f10);
        int i3 = f9.f7220b;
        int i9 = f10.f7220b;
        long j9 = 0;
        while (j9 < this.f7260i) {
            long jMin = Math.min(f9.f7221c - i3, f10.f7221c - i9);
            long j10 = 0;
            while (j10 < jMin) {
                int i10 = i3 + 1;
                boolean z10 = z6;
                byte b9 = f9.f7219a[i3];
                int i11 = i9 + 1;
                boolean z11 = z9;
                if (b9 != f10.f7219a[i9]) {
                    return z11;
                }
                j10++;
                i9 = i11;
                i3 = i10;
                z6 = z10;
                z9 = z11;
            }
            boolean z12 = z6;
            boolean z13 = z9;
            if (i3 == f9.f7221c) {
                F f11 = f9.f7224f;
                kotlin.jvm.internal.m.b(f11);
                i3 = f11.f7220b;
                f9 = f11;
            }
            if (i9 == f10.f7221c) {
                f10 = f10.f7224f;
                kotlin.jvm.internal.m.b(f10);
                i9 = f10.f7220b;
            }
            j9 += jMin;
            z6 = z12;
            z9 = z13;
        }
        return z6;
    }

    @Override
    public final int g(z options) throws EOFException {
        kotlin.jvm.internal.m.e(options, "options");
        int iB = N8.a.b(this, options, false);
        if (iB == -1) {
            return -1;
        }
        C(options.f7291h[iB].d());
        return iB;
    }

    @Override
    public final long h(C0685m targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        return j(0L, targetBytes);
    }

    public final int hashCode() {
        F f9 = this.f7259h;
        if (f9 == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i9 = f9.f7221c;
            for (int i10 = f9.f7220b; i10 < i9; i10++) {
                i3 = (i3 * 31) + f9.f7219a[i10];
            }
            f9 = f9.f7224f;
            kotlin.jvm.internal.m.b(f9);
        } while (f9 != this.f7259h);
        return i3;
    }

    public final byte i(long j) {
        AbstractC0674b.e(this.f7260i, j, 1L);
        F f9 = this.f7259h;
        if (f9 == null) {
            kotlin.jvm.internal.m.b(null);
            throw null;
        }
        long j9 = this.f7260i;
        if (j9 - j < j) {
            while (j9 > j) {
                f9 = f9.g;
                kotlin.jvm.internal.m.b(f9);
                j9 -= (long) (f9.f7221c - f9.f7220b);
            }
            return f9.f7219a[(int) ((((long) f9.f7220b) + j) - j9)];
        }
        long j10 = 0;
        while (true) {
            int i3 = f9.f7221c;
            int i9 = f9.f7220b;
            long j11 = ((long) (i3 - i9)) + j10;
            if (j11 > j) {
                return f9.f7219a[(int) ((((long) i9) + j) - j10)];
            }
            f9 = f9.f7224f;
            kotlin.jvm.internal.m.b(f9);
            j10 = j11;
        }
    }

    @Override
    public final boolean isOpen() {
        return true;
    }

    public final long j(long j, C0685m targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        long j9 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "fromIndex < 0: ").toString());
        }
        F f9 = this.f7259h;
        if (f9 == null) {
            return -1L;
        }
        long j10 = this.f7260i;
        long j11 = j10 - j;
        byte[] bArr = targetBytes.f7262h;
        if (j11 < j) {
            while (j10 > j) {
                f9 = f9.g;
                kotlin.jvm.internal.m.b(f9);
                j10 -= (long) (f9.f7221c - f9.f7220b);
            }
            if (bArr.length == 2) {
                byte b9 = bArr[0];
                byte b10 = bArr[1];
                while (j10 < this.f7260i) {
                    int i3 = f9.f7221c;
                    for (int i9 = (int) ((((long) f9.f7220b) + j) - j10); i9 < i3; i9++) {
                        byte b11 = f9.f7219a[i9];
                        if (b11 == b9 || b11 == b10) {
                            return ((long) (i9 - f9.f7220b)) + j10;
                        }
                    }
                    j10 += (long) (f9.f7221c - f9.f7220b);
                    f9 = f9.f7224f;
                    kotlin.jvm.internal.m.b(f9);
                    j = j10;
                }
                return -1L;
            }
            while (j10 < this.f7260i) {
                int i10 = f9.f7221c;
                for (int i11 = (int) ((((long) f9.f7220b) + j) - j10); i11 < i10; i11++) {
                    byte b12 = f9.f7219a[i11];
                    for (byte b13 : bArr) {
                        if (b12 == b13) {
                            return ((long) (i11 - f9.f7220b)) + j10;
                        }
                    }
                }
                j10 += (long) (f9.f7221c - f9.f7220b);
                f9 = f9.f7224f;
                kotlin.jvm.internal.m.b(f9);
                j = j10;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (f9.f7221c - f9.f7220b)) + j9;
            if (j12 > j) {
                break;
            }
            f9 = f9.f7224f;
            kotlin.jvm.internal.m.b(f9);
            j9 = j12;
        }
        if (bArr.length == 2) {
            byte b14 = bArr[0];
            byte b15 = bArr[1];
            while (j9 < this.f7260i) {
                int i12 = f9.f7221c;
                for (int i13 = (int) ((((long) f9.f7220b) + j) - j9); i13 < i12; i13++) {
                    byte b16 = f9.f7219a[i13];
                    if (b16 == b14 || b16 == b15) {
                        return ((long) (i13 - f9.f7220b)) + j9;
                    }
                }
                j9 += (long) (f9.f7221c - f9.f7220b);
                f9 = f9.f7224f;
                kotlin.jvm.internal.m.b(f9);
                j = j9;
            }
            return -1L;
        }
        while (j9 < this.f7260i) {
            int i14 = f9.f7221c;
            for (int i15 = (int) ((((long) f9.f7220b) + j) - j9); i15 < i14; i15++) {
                byte b17 = f9.f7219a[i15];
                for (byte b18 : bArr) {
                    if (b17 == b18) {
                        return ((long) (i15 - f9.f7220b)) + j9;
                    }
                }
            }
            j9 += (long) (f9.f7221c - f9.f7220b);
            f9 = f9.f7224f;
            kotlin.jvm.internal.m.b(f9);
            j = j9;
        }
        return -1L;
    }

    @Override
    public final long k(InterfaceC0683k interfaceC0683k) {
        long j = this.f7260i;
        if (j > 0) {
            interfaceC0683k.J(j, this);
        }
        return j;
    }

    @Override
    public final long m(long j, C0682j sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        long j9 = this.f7260i;
        if (j9 == 0) {
            return -1L;
        }
        if (j > j9) {
            j = j9;
        }
        sink.J(j, this);
        return j;
    }

    public final void n(int i3) {
        F fW = W(4);
        int i9 = fW.f7221c;
        byte[] bArr = fW.f7219a;
        bArr[i9] = (byte) ((i3 >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i3 >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i3 >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i3 & 255);
        fW.f7221c = i9 + 4;
        this.f7260i += 4;
    }

    public final boolean o() {
        return this.f7260i == 0;
    }

    @Override
    public final InterfaceC0683k p(int i3) {
        Z(i3);
        return this;
    }

    @Override
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        F f9 = this.f7259h;
        if (f9 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), f9.f7221c - f9.f7220b);
        sink.put(f9.f7219a, f9.f7220b, iMin);
        int i3 = f9.f7220b + iMin;
        f9.f7220b = i3;
        this.f7260i -= (long) iMin;
        if (i3 == f9.f7221c) {
            this.f7259h = f9.a();
            G.a(f9);
        }
        return iMin;
    }

    public final byte readByte() throws EOFException {
        if (this.f7260i == 0) {
            throw new EOFException();
        }
        F f9 = this.f7259h;
        kotlin.jvm.internal.m.b(f9);
        int i3 = f9.f7220b;
        int i9 = f9.f7221c;
        int i10 = i3 + 1;
        byte b9 = f9.f7219a[i3];
        this.f7260i--;
        if (i10 != i9) {
            f9.f7220b = i10;
            return b9;
        }
        this.f7259h = f9.a();
        G.a(f9);
        return b9;
    }

    public final int readInt() throws EOFException {
        if (this.f7260i < 4) {
            throw new EOFException();
        }
        F f9 = this.f7259h;
        kotlin.jvm.internal.m.b(f9);
        int i3 = f9.f7220b;
        int i9 = f9.f7221c;
        if (i9 - i3 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = f9.f7219a;
        int i10 = i3 + 3;
        int i11 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8);
        int i12 = i3 + 4;
        int i13 = i11 | (bArr[i10] & 255);
        this.f7260i -= 4;
        if (i12 != i9) {
            f9.f7220b = i12;
            return i13;
        }
        this.f7259h = f9.a();
        G.a(f9);
        return i13;
    }

    public final long readLong() throws EOFException {
        if (this.f7260i < 8) {
            throw new EOFException();
        }
        F f9 = this.f7259h;
        kotlin.jvm.internal.m.b(f9);
        int i3 = f9.f7220b;
        int i9 = f9.f7221c;
        if (i9 - i3 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = f9.f7219a;
        int i10 = i3 + 7;
        long j = ((((long) bArr[i3 + 3]) & 255) << 32) | ((((long) bArr[i3]) & 255) << 56) | ((((long) bArr[i3 + 1]) & 255) << 48) | ((((long) bArr[i3 + 2]) & 255) << 40) | ((((long) bArr[i3 + 4]) & 255) << 24) | ((((long) bArr[i3 + 5]) & 255) << 16) | ((((long) bArr[i3 + 6]) & 255) << 8);
        int i11 = i3 + 8;
        long j9 = j | (((long) bArr[i10]) & 255);
        this.f7260i -= 8;
        if (i11 != i9) {
            f9.f7220b = i11;
            return j9;
        }
        this.f7259h = f9.a();
        G.a(f9);
        return j9;
    }

    public final short readShort() throws EOFException {
        if (this.f7260i < 2) {
            throw new EOFException();
        }
        F f9 = this.f7259h;
        kotlin.jvm.internal.m.b(f9);
        int i3 = f9.f7220b;
        int i9 = f9.f7221c;
        if (i9 - i3 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i10 = i3 + 1;
        byte[] bArr = f9.f7219a;
        int i11 = (bArr[i3] & 255) << 8;
        int i12 = i3 + 2;
        int i13 = (bArr[i10] & 255) | i11;
        this.f7260i -= 2;
        if (i12 == i9) {
            this.f7259h = f9.a();
            G.a(f9);
        } else {
            f9.f7220b = i12;
        }
        return (short) i13;
    }

    @Override
    public final long s(byte b9, long j, long j9) {
        F f9;
        long j10 = 0;
        if (0 > j || j > j9) {
            throw new IllegalArgumentException(("size=" + this.f7260i + " fromIndex=" + j + " toIndex=" + j9).toString());
        }
        long j11 = this.f7260i;
        if (j9 > j11) {
            j9 = j11;
        }
        if (j == j9 || (f9 = this.f7259h) == null) {
            return -1L;
        }
        if (j11 - j < j) {
            while (j11 > j) {
                f9 = f9.g;
                kotlin.jvm.internal.m.b(f9);
                j11 -= (long) (f9.f7221c - f9.f7220b);
            }
            while (j11 < j9) {
                int iMin = (int) Math.min(f9.f7221c, (((long) f9.f7220b) + j9) - j11);
                for (int i3 = (int) ((((long) f9.f7220b) + j) - j11); i3 < iMin; i3++) {
                    if (f9.f7219a[i3] == b9) {
                        return ((long) (i3 - f9.f7220b)) + j11;
                    }
                }
                j11 += (long) (f9.f7221c - f9.f7220b);
                f9 = f9.f7224f;
                kotlin.jvm.internal.m.b(f9);
                j = j11;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (f9.f7221c - f9.f7220b)) + j10;
            if (j12 > j) {
                break;
            }
            f9 = f9.f7224f;
            kotlin.jvm.internal.m.b(f9);
            j10 = j12;
        }
        while (j10 < j9) {
            int iMin2 = (int) Math.min(f9.f7221c, (((long) f9.f7220b) + j9) - j10);
            for (int i9 = (int) ((((long) f9.f7220b) + j) - j10); i9 < iMin2; i9++) {
                if (f9.f7219a[i9] == b9) {
                    return ((long) (i9 - f9.f7220b)) + j10;
                }
            }
            j10 += (long) (f9.f7221c - f9.f7220b);
            f9 = f9.f7224f;
            kotlin.jvm.internal.m.b(f9);
            j = j10;
        }
        return -1L;
    }

    public final int t(byte[] sink, int i3, int i9) {
        kotlin.jvm.internal.m.e(sink, "sink");
        AbstractC0674b.e(sink.length, i3, i9);
        F f9 = this.f7259h;
        if (f9 == null) {
            return -1;
        }
        int iMin = Math.min(i9, f9.f7221c - f9.f7220b);
        int i10 = f9.f7220b;
        p078i6.m.a0(f9.f7219a, i3, i10, sink, i10 + iMin);
        int i11 = f9.f7220b + iMin;
        f9.f7220b = i11;
        this.f7260i -= (long) iMin;
        if (i11 == f9.f7221c) {
            this.f7259h = f9.a();
            G.a(f9);
        }
        return iMin;
    }

    public final String toString() {
        long j = this.f7260i;
        if (j <= 2147483647L) {
            return V((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f7260i).toString());
    }

    public final C0680h u(C0680h unsafeCursor) {
        kotlin.jvm.internal.m.e(unsafeCursor, "unsafeCursor");
        byte[] bArr = N8.a.f7472a;
        if (unsafeCursor == AbstractC0674b.f7239a) {
            unsafeCursor = new C0680h();
        }
        if (unsafeCursor.f7251h != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f7251h = this;
        unsafeCursor.f7252i = true;
        return unsafeCursor;
    }

    public final byte[] v(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount: ").toString());
        }
        if (this.f7260i < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        B(bArr);
        return bArr;
    }

    @Override
    public final InterfaceC0683k w(String str) {
        d0(str);
        return this;
    }

    @Override
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.e(source, "source");
        int iRemaining = source.remaining();
        int i3 = iRemaining;
        while (i3 > 0) {
            F fW = W(1);
            int iMin = Math.min(i3, 8192 - fW.f7221c);
            source.get(fW.f7219a, fW.f7221c, iMin);
            i3 -= iMin;
            fW.f7221c += iMin;
        }
        this.f7260i += (long) iRemaining;
        return iRemaining;
    }

    @Override
    public final String x(Charset charset) {
        return P(this.f7260i, charset);
    }

    public final C0685m z(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount: ").toString());
        }
        if (this.f7260i < j) {
            throw new EOFException();
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new C0685m(v(j));
        }
        C0685m c0685mV = V((int) j);
        C(j);
        return c0685mV;
    }

    public final void write(byte[] source, int i3, int i9) {
        kotlin.jvm.internal.m.e(source, "source");
        long j = i9;
        AbstractC0674b.e(source.length, i3, j);
        int i10 = i9 + i3;
        while (i3 < i10) {
            F fW = W(1);
            int iMin = Math.min(i10 - i3, 8192 - fW.f7221c);
            int i11 = i3 + iMin;
            p078i6.m.a0(source, fW.f7221c, i3, fW.f7219a, i11);
            fW.f7221c += iMin;
            i3 = i11;
        }
        this.f7260i += j;
    }

    @Override
    public final C0682j a() {
        return this;
    }

    @Override
    public final void close() {
    }

    @Override
    public final void flush() {
    }
}
