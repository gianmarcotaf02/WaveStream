package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1502i extends androidx.datastore.preferences.protobuf.AbstractC1503j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.io.InputStream f16212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16215f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16217i;
    public int j = androidx.media3.common.util.Log.LOG_LEVEL_OFF;

    public C1502i(java.io.InputStream inputStream) {
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a;
        this.f16212c = inputStream;
        this.f16213d = new byte[4096];
        this.f16214e = 0;
        this.g = 0;
        this.f16217i = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final java.lang.String A() throws androidx.datastore.preferences.protobuf.C1518z {
        int iM = M();
        byte[] bArr = this.f16213d;
        if (iM > 0) {
            int i3 = this.f16214e;
            int i9 = this.g;
            if (iM <= i3 - i9) {
                java.lang.String str = new java.lang.String(bArr, i9, iM, androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a);
                this.g += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw androidx.datastore.preferences.protobuf.C1518z.d();
        }
        if (iM > this.f16214e) {
            return new java.lang.String(H(iM), androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a);
        }
        Q(iM);
        java.lang.String str2 = new java.lang.String(bArr, this.g, iM, androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a);
        this.g += iM;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final java.lang.String B() throws java.io.IOException {
        int iM = M();
        int i3 = this.g;
        int i9 = this.f16214e;
        int i10 = i9 - i3;
        byte[] bArrH = this.f16213d;
        if (iM <= i10 && iM > 0) {
            this.g = i3 + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            if (iM < 0) {
                throw androidx.datastore.preferences.protobuf.C1518z.d();
            }
            i3 = 0;
            if (iM <= i9) {
                Q(iM);
                this.g = iM;
            } else {
                bArrH = H(iM);
            }
        }
        return androidx.datastore.preferences.protobuf.n0.f16238a.F(bArrH, i3, iM);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int C() throws androidx.datastore.preferences.protobuf.C1518z {
        if (g()) {
            this.f16216h = 0;
            return 0;
        }
        int iM = M();
        this.f16216h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new androidx.datastore.preferences.protobuf.C1518z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int D() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final long E() {
        return N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final boolean F(int i3) throws androidx.datastore.preferences.protobuf.C1518z {
        int i9 = i3 & 7;
        int i10 = 0;
        if (i9 != 0) {
            if (i9 == 1) {
                R(8);
                return true;
            }
            if (i9 == 2) {
                R(M());
                return true;
            }
            if (i9 == 3) {
                G();
                b(((i3 >>> 3) << 3) | 4);
                return true;
            }
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw androidx.datastore.preferences.protobuf.C1518z.b();
            }
            R(4);
            return true;
        }
        int i11 = this.f16214e - this.g;
        byte[] bArr = this.f16213d;
        if (i11 >= 10) {
            while (i10 < 10) {
                int i12 = this.g;
                this.g = i12 + 1;
                if (bArr[i12] < 0) {
                    i10++;
                }
            }
            throw androidx.datastore.preferences.protobuf.C1518z.c();
        }
        while (i10 < 10) {
            if (this.g == this.f16214e) {
                Q(1);
            }
            int i13 = this.g;
            this.g = i13 + 1;
            if (bArr[i13] < 0) {
                i10++;
            }
        }
        throw androidx.datastore.preferences.protobuf.C1518z.c();
        return true;
    }

    public final byte[] H(int i3) throws java.io.IOException {
        byte[] bArrI = I(i3);
        if (bArrI != null) {
            return bArrI;
        }
        int i9 = this.g;
        int i10 = this.f16214e;
        int length = i10 - i9;
        this.f16217i += i10;
        this.g = 0;
        this.f16214e = 0;
        java.util.ArrayList<byte[]> arrayListJ = J(i3 - length);
        byte[] bArr = new byte[i3];
        java.lang.System.arraycopy(this.f16213d, i9, bArr, 0, length);
        for (byte[] bArr2 : arrayListJ) {
            java.lang.System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i3) throws java.io.IOException {
        if (i3 == 0) {
            return androidx.datastore.preferences.protobuf.AbstractC1516x.f16268b;
        }
        if (i3 < 0) {
            throw androidx.datastore.preferences.protobuf.C1518z.d();
        }
        int i9 = this.f16217i;
        int i10 = this.g;
        int i11 = i9 + i10 + i3;
        if (i11 - androidx.media3.common.util.Log.LOG_LEVEL_OFF > 0) {
            throw new androidx.datastore.preferences.protobuf.C1518z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i12 = this.j;
        if (i11 > i12) {
            R((i12 - i9) - i10);
            throw androidx.datastore.preferences.protobuf.C1518z.e();
        }
        int i13 = this.f16214e - i10;
        int i14 = i3 - i13;
        java.io.InputStream inputStream = this.f16212c;
        if (i14 >= 4096) {
            try {
                if (i14 > inputStream.available()) {
                    return null;
                }
            } catch (androidx.datastore.preferences.protobuf.C1518z e6) {
                e6.f16269h = true;
                throw e6;
            }
        }
        byte[] bArr = new byte[i3];
        java.lang.System.arraycopy(this.f16213d, this.g, bArr, 0, i13);
        this.f16217i += this.f16214e;
        this.g = 0;
        this.f16214e = 0;
        while (i13 < i3) {
            try {
                int i15 = inputStream.read(bArr, i13, i3 - i13);
                if (i15 == -1) {
                    throw androidx.datastore.preferences.protobuf.C1518z.e();
                }
                this.f16217i += i15;
                i13 += i15;
            } catch (androidx.datastore.preferences.protobuf.C1518z e9) {
                e9.f16269h = true;
                throw e9;
            }
        }
        return bArr;
    }

    public final java.util.ArrayList J(int i3) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i3 > 0) {
            int iMin = java.lang.Math.min(i3, 4096);
            byte[] bArr = new byte[iMin];
            int i9 = 0;
            while (i9 < iMin) {
                int i10 = this.f16212c.read(bArr, i9, iMin - i9);
                if (i10 == -1) {
                    throw androidx.datastore.preferences.protobuf.C1518z.e();
                }
                this.f16217i += i10;
                i9 += i10;
            }
            i3 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() throws androidx.datastore.preferences.protobuf.C1518z {
        int i3 = this.g;
        if (this.f16214e - i3 < 4) {
            Q(4);
            i3 = this.g;
        }
        this.g = i3 + 4;
        byte[] bArr = this.f16213d;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long L() throws androidx.datastore.preferences.protobuf.C1518z {
        int i3 = this.g;
        if (this.f16214e - i3 < 8) {
            Q(8);
            i3 = this.g;
        }
        this.g = i3 + 8;
        byte[] bArr = this.f16213d;
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    public final int M() {
        int i3;
        int i9 = this.g;
        int i10 = this.f16214e;
        if (i10 != i9) {
            int i11 = i9 + 1;
            byte[] bArr = this.f16213d;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.g = i11;
                return b9;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                if (i13 < 0) {
                    i3 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        i3 = i15 ^ 16256;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            i3 = (-2080896) ^ i17;
                        } else {
                            i14 = i9 + 5;
                            byte b10 = bArr[i16];
                            int i18 = (i17 ^ (b10 << 28)) ^ 266354560;
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
                this.g = i12;
                return i3;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j;
        long j9;
        long j10;
        long j11;
        int i3 = this.g;
        int i9 = this.f16214e;
        if (i9 != i3) {
            int i10 = i3 + 1;
            byte[] bArr = this.f16213d;
            byte b9 = bArr[i3];
            if (b9 >= 0) {
                this.g = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i3 + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    j = i12 ^ (-128);
                } else {
                    int i13 = i3 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        j = i14 ^ 16256;
                        i11 = i13;
                    } else {
                        int i15 = i3 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            j11 = (-2080896) ^ i16;
                        } else {
                            long j12 = i16;
                            i11 = i3 + 5;
                            long j13 = j12 ^ (((long) bArr[i15]) << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i15 = i3 + 6;
                                long j14 = j13 ^ (((long) bArr[i11]) << 35);
                                if (j14 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i11 = i3 + 7;
                                    j13 = j14 ^ (((long) bArr[i15]) << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i15 = i3 + 8;
                                        j14 = j13 ^ (((long) bArr[i11]) << 49);
                                        if (j14 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i11 = i3 + 9;
                                            long j15 = (j14 ^ (((long) bArr[i15]) << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i17 = i3 + 10;
                                                if (bArr[i11] >= 0) {
                                                    i11 = i17;
                                                }
                                            }
                                            j = j15;
                                        }
                                    }
                                }
                                j11 = j9 ^ j14;
                            }
                            j = j10 ^ j13;
                        }
                        i11 = i15;
                        j = j11;
                    }
                }
                this.g = i11;
                return j;
            }
        }
        return O();
    }

    public final long O() throws androidx.datastore.preferences.protobuf.C1518z {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.g == this.f16214e) {
                Q(1);
            }
            int i9 = this.g;
            this.g = i9 + 1;
            byte b9 = this.f16213d[i9];
            j |= ((long) (b9 & 127)) << i3;
            if ((b9 & 128) == 0) {
                return j;
            }
        }
        throw androidx.datastore.preferences.protobuf.C1518z.c();
    }

    public final void P() {
        int i3 = this.f16214e + this.f16215f;
        this.f16214e = i3;
        int i9 = this.f16217i + i3;
        int i10 = this.j;
        if (i9 <= i10) {
            this.f16215f = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f16215f = i11;
        this.f16214e = i3 - i11;
    }

    public final void Q(int i3) throws androidx.datastore.preferences.protobuf.C1518z {
        if (S(i3)) {
            return;
        }
        if (i3 <= (androidx.media3.common.util.Log.LOG_LEVEL_OFF - this.f16217i) - this.g) {
            throw androidx.datastore.preferences.protobuf.C1518z.e();
        }
        throw new androidx.datastore.preferences.protobuf.C1518z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void R(int i3) throws androidx.datastore.preferences.protobuf.C1518z {
        int i9 = this.f16214e;
        int i10 = this.g;
        if (i3 <= i9 - i10 && i3 >= 0) {
            this.g = i10 + i3;
            return;
        }
        java.io.InputStream inputStream = this.f16212c;
        if (i3 < 0) {
            throw androidx.datastore.preferences.protobuf.C1518z.d();
        }
        int i11 = this.f16217i;
        int i12 = i11 + i10;
        int i13 = i12 + i3;
        int i14 = this.j;
        if (i13 > i14) {
            R((i14 - i11) - i10);
            throw androidx.datastore.preferences.protobuf.C1518z.e();
        }
        this.f16217i = i12;
        int i15 = i9 - i10;
        this.f16214e = 0;
        this.g = 0;
        while (i15 < i3) {
            long j = i3 - i15;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new java.lang.IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i15 += (int) jSkip;
                    }
                } catch (androidx.datastore.preferences.protobuf.C1518z e6) {
                    e6.f16269h = true;
                    throw e6;
                }
            } catch (java.lang.Throwable th) {
                this.f16217i += i15;
                P();
                throw th;
            }
        }
        this.f16217i += i15;
        P();
        if (i15 >= i3) {
            return;
        }
        int i16 = this.f16214e;
        int i17 = i16 - this.g;
        this.g = i16;
        Q(1);
        while (true) {
            int i18 = i3 - i17;
            int i19 = this.f16214e;
            if (i18 <= i19) {
                this.g = i18;
                return;
            } else {
                i17 += i19;
                this.g = i19;
                Q(1);
            }
        }
    }

    public final boolean S(int i3) throws java.io.IOException {
        int i9 = this.g;
        int i10 = i9 + i3;
        int i11 = this.f16214e;
        if (i10 <= i11) {
            throw new java.lang.IllegalStateException(Y6.f.f(i3, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i12 = this.f16217i;
        if (i3 <= (androidx.media3.common.util.Log.LOG_LEVEL_OFF - i12) - i9 && i12 + i9 + i3 <= this.j) {
            byte[] bArr = this.f16213d;
            if (i9 > 0) {
                if (i11 > i9) {
                    java.lang.System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
                }
                this.f16217i += i9;
                this.f16214e -= i9;
                this.g = 0;
            }
            int i13 = this.f16214e;
            int iMin = java.lang.Math.min(bArr.length - i13, (androidx.media3.common.util.Log.LOG_LEVEL_OFF - this.f16217i) - i13);
            java.io.InputStream inputStream = this.f16212c;
            try {
                int i14 = inputStream.read(bArr, i13, iMin);
                if (i14 == 0 || i14 < -1 || i14 > bArr.length) {
                    throw new java.lang.IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i14 + "\nThe InputStream implementation is buggy.");
                }
                if (i14 > 0) {
                    this.f16214e += i14;
                    P();
                    if (this.f16214e >= i3) {
                        return true;
                    }
                    return S(i3);
                }
            } catch (androidx.datastore.preferences.protobuf.C1518z e6) {
                e6.f16269h = true;
                throw e6;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final void b(int i3) throws androidx.datastore.preferences.protobuf.C1518z {
        if (this.f16216h != i3) {
            throw new androidx.datastore.preferences.protobuf.C1518z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int f() {
        return this.f16217i + this.g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final boolean g() {
        return this.g == this.f16214e && !S(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final void j(int i3) {
        this.j = i3;
        P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int l(int i3) throws androidx.datastore.preferences.protobuf.C1518z {
        if (i3 < 0) {
            throw androidx.datastore.preferences.protobuf.C1518z.d();
        }
        int i9 = this.f16217i + this.g + i3;
        if (i9 < 0) {
            throw new androidx.datastore.preferences.protobuf.C1518z("Failed to parse the message.");
        }
        int i10 = this.j;
        if (i9 > i10) {
            throw androidx.datastore.preferences.protobuf.C1518z.e();
        }
        this.j = i9;
        P();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final boolean m() {
        return N() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final androidx.datastore.preferences.protobuf.C1500g n() throws java.io.IOException {
        int iM = M();
        int i3 = this.f16214e;
        int i9 = this.g;
        int i10 = i3 - i9;
        byte[] bArr = this.f16213d;
        if (iM <= i10 && iM > 0) {
            androidx.datastore.preferences.protobuf.C1500g c1500gF = androidx.datastore.preferences.protobuf.C1500g.f(bArr, i9, iM);
            this.g += iM;
            return c1500gF;
        }
        if (iM == 0) {
            return androidx.datastore.preferences.protobuf.C1500g.j;
        }
        if (iM < 0) {
            throw androidx.datastore.preferences.protobuf.C1518z.d();
        }
        byte[] bArrI = I(iM);
        if (bArrI != null) {
            return androidx.datastore.preferences.protobuf.C1500g.f(bArrI, 0, bArrI.length);
        }
        int i11 = this.g;
        int i12 = this.f16214e;
        int length = i12 - i11;
        this.f16217i += i12;
        this.g = 0;
        this.f16214e = 0;
        java.util.ArrayList<byte[]> arrayListJ = J(iM - length);
        byte[] bArr2 = new byte[iM];
        java.lang.System.arraycopy(bArr, i11, bArr2, 0, length);
        for (byte[] bArr3 : arrayListJ) {
            java.lang.System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        androidx.datastore.preferences.protobuf.C1500g c1500g = androidx.datastore.preferences.protobuf.C1500g.j;
        return new androidx.datastore.preferences.protobuf.C1500g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final double p() {
        return java.lang.Double.longBitsToDouble(L());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int q() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int r() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final long s() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final float t() {
        return java.lang.Float.intBitsToFloat(K());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int u() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final long v() {
        return N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int w() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final long x() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int y() {
        int iM = M();
        return (-(iM & 1)) ^ (iM >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final long z() {
        long jN = N();
        return (-(jN & 1)) ^ (jN >>> 1);
    }
}
