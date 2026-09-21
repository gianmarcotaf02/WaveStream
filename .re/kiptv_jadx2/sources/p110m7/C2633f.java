package p110m7;

import Z2.M;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public final class C2633f {

    public int f25479c;

    public final InputStream f25481e;

    public int f25482f;

    public int f25484i;

    public int f25483h = Log.LOG_LEVEL_OFF;

    public final byte[] f25477a = new byte[4096];

    public int f25478b = 0;

    public int f25480d = 0;
    public int g = 0;

    public C2633f(InputStream inputStream) {
        this.f25481e = inputStream;
    }

    public final void a(int i3) {
        if (this.f25482f != i3) {
            throw new r("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i3 = this.f25483h;
        if (i3 == Integer.MAX_VALUE) {
            return -1;
        }
        return i3 - (this.g + this.f25480d);
    }

    public final void c(int i3) {
        this.f25483h = i3;
        o();
    }

    public final int d(int i3) {
        if (i3 < 0) {
            throw new r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i9 = this.g + this.f25480d + i3;
        int i10 = this.f25483h;
        if (i9 > i10) {
            throw r.a();
        }
        this.f25483h = i9;
        o();
        return i10;
    }

    public final u e() {
        int iK = k();
        int i3 = this.f25478b;
        int i9 = this.f25480d;
        if (iK > i3 - i9 || iK <= 0) {
            return iK == 0 ? AbstractC2632e.f25476h : new u(h(iK));
        }
        byte[] bArr = new byte[iK];
        System.arraycopy(this.f25477a, i9, bArr, 0, iK);
        u uVar = new u(bArr);
        this.f25480d += iK;
        return uVar;
    }

    public final int f() {
        return k();
    }

    public final AbstractC2629b g(w wVar, C2635h c2635h) throws r {
        int iK = k();
        if (this.f25484i >= 64) {
            throw new r("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = d(iK);
        this.f25484i++;
        AbstractC2629b abstractC2629b = (AbstractC2629b) wVar.a(this, c2635h);
        a(0);
        this.f25484i--;
        c(iD);
        return abstractC2629b;
    }

    public final byte[] h(int i3) throws IOException {
        if (i3 <= 0) {
            if (i3 == 0) {
                return q.f25502a;
            }
            throw new r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i9 = this.g;
        int i10 = this.f25480d;
        int i11 = i9 + i10 + i3;
        int i12 = this.f25483h;
        if (i11 > i12) {
            r((i12 - i9) - i10);
            throw r.a();
        }
        byte[] bArr = this.f25477a;
        if (i3 < 4096) {
            byte[] bArr2 = new byte[i3];
            int i13 = this.f25478b - i10;
            System.arraycopy(bArr, i10, bArr2, 0, i13);
            this.f25480d = this.f25478b;
            int i14 = i3 - i13;
            if (i14 > 0) {
                p(i14);
            }
            System.arraycopy(bArr, 0, bArr2, i13, i14);
            this.f25480d = i14;
            return bArr2;
        }
        int i15 = this.f25478b;
        this.g = i9 + i15;
        this.f25480d = 0;
        this.f25478b = 0;
        int length = i15 - i10;
        int i16 = i3 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i16 > 0) {
            int iMin = Math.min(i16, 4096);
            byte[] bArr3 = new byte[iMin];
            int i17 = 0;
            while (i17 < iMin) {
                int i18 = this.f25481e.read(bArr3, i17, iMin - i17);
                if (i18 == -1) {
                    throw r.a();
                }
                this.g += i18;
                i17 += i18;
            }
            i16 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i3];
        System.arraycopy(bArr, i10, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int i() throws r {
        int i3 = this.f25480d;
        if (this.f25478b - i3 < 4) {
            p(4);
            i3 = this.f25480d;
        }
        this.f25480d = i3 + 4;
        byte[] bArr = this.f25477a;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long j() throws r {
        int i3 = this.f25480d;
        if (this.f25478b - i3 < 8) {
            p(8);
            i3 = this.f25480d;
        }
        this.f25480d = i3 + 8;
        byte[] bArr = this.f25477a;
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    public final int k() {
        int i3;
        int i9 = this.f25480d;
        int i10 = this.f25478b;
        if (i10 != i9) {
            int i11 = i9 + 1;
            byte[] bArr = this.f25477a;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.f25480d = i11;
                return b9;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                long j = i13;
                if (j < 0) {
                    i3 = (int) ((-128) ^ j);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    long j9 = i15;
                    if (j9 >= 0) {
                        i3 = (int) (16256 ^ j9);
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        long j10 = i17;
                        if (j10 < 0) {
                            i3 = (int) ((-2080896) ^ j10);
                        } else {
                            i14 = i9 + 5;
                            byte b10 = bArr[i16];
                            int i18 = (int) (((long) (i17 ^ (b10 << 28))) ^ 266354560);
                            if (b10 < 0) {
                                i16 = i9 + 6;
                                if (bArr[i14] < 0) {
                                    i14 = i9 + 7;
                                    if (bArr[i16] < 0) {
                                        i16 = i9 + 8;
                                        if (bArr[i14] < 0) {
                                            i14 = i9 + 9;
                                            if (bArr[i16] < 0) {
                                                int i19 = i9 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i12 = i19;
                                                    i3 = i18;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i18;
                            }
                            i3 = i18;
                        }
                        i12 = i16;
                    }
                    i12 = i14;
                }
                this.f25480d = i12;
                return i3;
            }
        }
        return (int) m();
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l() {
        long j;
        long j9;
        long j10;
        int i3 = this.f25480d;
        int i9 = this.f25478b;
        if (i9 != i3) {
            int i10 = i3 + 1;
            byte[] bArr = this.f25477a;
            byte b9 = bArr[i3];
            if (b9 >= 0) {
                this.f25480d = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i3 + 2;
                long j11 = (bArr[i10] << 7) ^ b9;
                if (j11 >= 0) {
                    int i12 = i3 + 3;
                    long j12 = j11 ^ ((long) (bArr[i11] << 14));
                    if (j12 >= 0) {
                        j10 = 16256;
                    } else {
                        i11 = i3 + 4;
                        j11 = j12 ^ ((long) (bArr[i12] << 21));
                        if (j11 < 0) {
                            j9 = -2080896;
                        } else {
                            i12 = i3 + 5;
                            j12 = j11 ^ (((long) bArr[i11]) << 28);
                            if (j12 >= 0) {
                                j10 = 266354560;
                            } else {
                                i11 = i3 + 6;
                                j11 = j12 ^ (((long) bArr[i12]) << 35);
                                if (j11 >= 0) {
                                    i12 = i3 + 7;
                                    j12 = j11 ^ (((long) bArr[i11]) << 42);
                                    if (j12 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i11 = i3 + 8;
                                        j11 = j12 ^ (((long) bArr[i12]) << 49);
                                        if (j11 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            int i13 = i3 + 9;
                                            long j13 = (j11 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                            i11 = j13 < 0 ? i3 + 10 : i13;
                                            j = j13;
                                        }
                                    }
                                    this.f25480d = i11;
                                    return j;
                                }
                                j9 = -34093383808L;
                            }
                        }
                    }
                    i11 = i12;
                    j = j10 ^ j12;
                    this.f25480d = i11;
                    return j;
                }
                j9 = -128;
                j = j9 ^ j11;
                this.f25480d = i11;
                return j;
            }
        }
        return m();
    }

    public final long m() throws r {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f25480d == this.f25478b) {
                p(1);
            }
            int i9 = this.f25480d;
            this.f25480d = i9 + 1;
            byte b9 = this.f25477a[i9];
            j |= ((long) (b9 & 127)) << i3;
            if ((b9 & 128) == 0) {
                return j;
            }
        }
        throw new r("CodedInputStream encountered a malformed varint.");
    }

    public final int n() throws r {
        if (this.f25480d == this.f25478b && !s(1)) {
            this.f25482f = 0;
            return 0;
        }
        int iK = k();
        this.f25482f = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new r("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i3 = this.f25478b + this.f25479c;
        this.f25478b = i3;
        int i9 = this.g + i3;
        int i10 = this.f25483h;
        if (i9 <= i10) {
            this.f25479c = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f25479c = i11;
        this.f25478b = i3 - i11;
    }

    public final void p(int i3) throws r {
        if (!s(i3)) {
            throw r.a();
        }
    }

    public final boolean q(int i3, M m8) throws IOException {
        int iN;
        int i9 = i3 & 7;
        if (i9 == 0) {
            long jL = l();
            m8.i0(i3);
            m8.j0(jL);
            return true;
        }
        if (i9 == 1) {
            long j = j();
            m8.i0(i3);
            m8.h0(j);
            return true;
        }
        if (i9 == 2) {
            u uVarE = e();
            m8.i0(i3);
            m8.i0(uVarE.size());
            m8.e0(uVarE);
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw new r("Protocol message tag had invalid wire type.");
            }
            int i10 = i();
            m8.i0(i3);
            m8.g0(i10);
            return true;
        }
        m8.i0(i3);
        do {
            iN = n();
            if (iN == 0) {
                break;
            }
        } while (q(iN, m8));
        int i11 = ((i3 >>> 3) << 3) | 4;
        a(i11);
        m8.i0(i11);
        return true;
    }

    public final void r(int i3) throws r {
        int i9 = this.f25478b;
        int i10 = this.f25480d;
        int i11 = i9 - i10;
        if (i3 <= i11 && i3 >= 0) {
            this.f25480d = i10 + i3;
            return;
        }
        if (i3 < 0) {
            throw new r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i12 = this.g;
        int i13 = i12 + i10 + i3;
        int i14 = this.f25483h;
        if (i13 > i14) {
            r((i14 - i12) - i10);
            throw r.a();
        }
        this.f25480d = i9;
        p(1);
        while (true) {
            int i15 = i3 - i11;
            int i16 = this.f25478b;
            if (i15 <= i16) {
                this.f25480d = i15;
                return;
            } else {
                i11 += i16;
                this.f25480d = i16;
                p(1);
            }
        }
    }

    public final boolean s(int i3) throws IOException {
        InputStream inputStream;
        int i9 = this.f25480d;
        int i10 = i9 + i3;
        int i11 = this.f25478b;
        if (i10 <= i11) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i3);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.g + i9 + i3 <= this.f25483h && (inputStream = this.f25481e) != null) {
            byte[] bArr = this.f25477a;
            if (i9 > 0) {
                if (i11 > i9) {
                    System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
                }
                this.g += i9;
                this.f25478b -= i9;
                this.f25480d = 0;
            }
            int i12 = this.f25478b;
            int i13 = inputStream.read(bArr, i12, bArr.length - i12);
            if (i13 == 0 || i13 < -1 || i13 > bArr.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i13);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i13 > 0) {
                this.f25478b += i13;
                if ((this.g + i3) - C.BUFFER_FLAG_NOT_DEPENDED_ON > 0) {
                    throw new r("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                o();
                if (this.f25478b >= i3) {
                    return true;
                }
                return s(i3);
            }
        }
        return false;
    }
}
