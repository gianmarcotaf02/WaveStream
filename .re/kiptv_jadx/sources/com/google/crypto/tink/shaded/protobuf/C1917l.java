package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1917l extends androidx.datastore.preferences.protobuf.AbstractC1503j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.io.ByteArrayInputStream f19551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f19552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19554f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19556i;
    public int j = androidx.media3.common.util.Log.LOG_LEVEL_OFF;

    public C1917l(java.io.ByteArrayInputStream byteArrayInputStream) {
        java.nio.charset.Charset charset = com.google.crypto.tink.shaded.protobuf.B.f19466a;
        this.f19551c = byteArrayInputStream;
        this.f19552d = new byte[4096];
        this.f19553e = 0;
        this.g = 0;
        this.f19556i = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final java.lang.String A() throws com.google.crypto.tink.shaded.protobuf.D {
        int iM = M();
        byte[] bArr = this.f19552d;
        if (iM > 0) {
            int i3 = this.f19553e;
            int i9 = this.g;
            if (iM <= i3 - i9) {
                java.lang.String str = new java.lang.String(bArr, i9, iM, com.google.crypto.tink.shaded.protobuf.B.f19466a);
                this.g += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM > this.f19553e) {
            return new java.lang.String(H(iM), com.google.crypto.tink.shaded.protobuf.B.f19466a);
        }
        Q(iM);
        java.lang.String str2 = new java.lang.String(bArr, this.g, iM, com.google.crypto.tink.shaded.protobuf.B.f19466a);
        this.g += iM;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final java.lang.String B() throws java.io.IOException {
        int iM = M();
        int i3 = this.g;
        int i9 = this.f19553e;
        int i10 = i9 - i3;
        byte[] bArrH = this.f19552d;
        if (iM <= i10 && iM > 0) {
            this.g = i3 + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            i3 = 0;
            if (iM <= i9) {
                Q(iM);
                this.g = iM;
            } else {
                bArrH = H(iM);
            }
        }
        return com.google.crypto.tink.shaded.protobuf.s0.f19590a.r(bArrH, i3, iM);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int C() throws com.google.crypto.tink.shaded.protobuf.D {
        if (g()) {
            this.f19555h = 0;
            return 0;
        }
        int iM = M();
        this.f19555h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw com.google.crypto.tink.shaded.protobuf.D.a();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int D() {
        return M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final long E() {
        return N();
    }

    public final byte[] H(int i3) throws java.io.IOException {
        byte[] bArrI = I(i3);
        if (bArrI != null) {
            return bArrI;
        }
        int i9 = this.g;
        int i10 = this.f19553e;
        int length = i10 - i9;
        this.f19556i += i10;
        this.g = 0;
        this.f19553e = 0;
        java.util.ArrayList<byte[]> arrayListJ = J(i3 - length);
        byte[] bArr = new byte[i3];
        java.lang.System.arraycopy(this.f19552d, i9, bArr, 0, length);
        for (byte[] bArr2 : arrayListJ) {
            java.lang.System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i3) throws java.io.IOException {
        if (i3 == 0) {
            return com.google.crypto.tink.shaded.protobuf.B.f19467b;
        }
        if (i3 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.D.e();
        }
        int i9 = this.f19556i;
        int i10 = this.g;
        int i11 = i9 + i10 + i3;
        if (i11 - androidx.media3.common.util.Log.LOG_LEVEL_OFF > 0) {
            throw new com.google.crypto.tink.shaded.protobuf.D("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i12 = this.j;
        if (i11 > i12) {
            R((i12 - i9) - i10);
            throw com.google.crypto.tink.shaded.protobuf.D.g();
        }
        int i13 = this.f19553e - i10;
        int i14 = i3 - i13;
        java.io.ByteArrayInputStream byteArrayInputStream = this.f19551c;
        if (i14 >= 4096) {
            try {
                if (i14 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (com.google.crypto.tink.shaded.protobuf.D e6) {
                e6.f19468h = true;
                throw e6;
            }
        }
        byte[] bArr = new byte[i3];
        java.lang.System.arraycopy(this.f19552d, this.g, bArr, 0, i13);
        this.f19556i += this.f19553e;
        this.g = 0;
        this.f19553e = 0;
        while (i13 < i3) {
            try {
                int i15 = byteArrayInputStream.read(bArr, i13, i3 - i13);
                if (i15 == -1) {
                    throw com.google.crypto.tink.shaded.protobuf.D.g();
                }
                this.f19556i += i15;
                i13 += i15;
            } catch (com.google.crypto.tink.shaded.protobuf.D e9) {
                e9.f19468h = true;
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
                int i10 = this.f19551c.read(bArr, i9, iMin - i9);
                if (i10 == -1) {
                    throw com.google.crypto.tink.shaded.protobuf.D.g();
                }
                this.f19556i += i10;
                i9 += i10;
            }
            i3 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() throws com.google.crypto.tink.shaded.protobuf.D {
        int i3 = this.g;
        if (this.f19553e - i3 < 4) {
            Q(4);
            i3 = this.g;
        }
        this.g = i3 + 4;
        byte[] bArr = this.f19552d;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long L() throws com.google.crypto.tink.shaded.protobuf.D {
        int i3 = this.g;
        if (this.f19553e - i3 < 8) {
            Q(8);
            i3 = this.g;
        }
        this.g = i3 + 8;
        byte[] bArr = this.f19552d;
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    public final int M() {
        int i3;
        int i9 = this.g;
        int i10 = this.f19553e;
        if (i10 != i9) {
            int i11 = i9 + 1;
            byte[] bArr = this.f19552d;
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
        int i9 = this.f19553e;
        if (i9 != i3) {
            int i10 = i3 + 1;
            byte[] bArr = this.f19552d;
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

    public final long O() throws com.google.crypto.tink.shaded.protobuf.D {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.g == this.f19553e) {
                Q(1);
            }
            int i9 = this.g;
            this.g = i9 + 1;
            byte b9 = this.f19552d[i9];
            j |= ((long) (b9 & 127)) << i3;
            if ((b9 & 128) == 0) {
                return j;
            }
        }
        throw com.google.crypto.tink.shaded.protobuf.D.d();
    }

    public final void P() {
        int i3 = this.f19553e + this.f19554f;
        this.f19553e = i3;
        int i9 = this.f19556i + i3;
        int i10 = this.j;
        if (i9 <= i10) {
            this.f19554f = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f19554f = i11;
        this.f19553e = i3 - i11;
    }

    public final void Q(int i3) throws com.google.crypto.tink.shaded.protobuf.D {
        if (S(i3)) {
            return;
        }
        if (i3 <= (androidx.media3.common.util.Log.LOG_LEVEL_OFF - this.f19556i) - this.g) {
            throw com.google.crypto.tink.shaded.protobuf.D.g();
        }
        throw new com.google.crypto.tink.shaded.protobuf.D("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void R(int i3) throws com.google.crypto.tink.shaded.protobuf.D {
        int i9 = this.f19553e;
        int i10 = this.g;
        int i11 = i9 - i10;
        if (i3 <= i11 && i3 >= 0) {
            this.g = i10 + i3;
            return;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = this.f19551c;
        if (i3 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.D.e();
        }
        int i12 = this.f19556i;
        int i13 = i12 + i10;
        int i14 = i13 + i3;
        int i15 = this.j;
        if (i14 > i15) {
            R((i15 - i12) - i10);
            throw com.google.crypto.tink.shaded.protobuf.D.g();
        }
        this.f19556i = i13;
        this.f19553e = 0;
        this.g = 0;
        while (i11 < i3) {
            long j = i3 - i11;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new java.lang.IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i11 += (int) jSkip;
                    }
                } catch (com.google.crypto.tink.shaded.protobuf.D e6) {
                    e6.f19468h = true;
                    throw e6;
                }
            } catch (java.lang.Throwable th) {
                this.f19556i += i11;
                P();
                throw th;
            }
        }
        this.f19556i += i11;
        P();
        if (i11 >= i3) {
            return;
        }
        int i16 = this.f19553e;
        int i17 = i16 - this.g;
        this.g = i16;
        Q(1);
        while (true) {
            int i18 = i3 - i17;
            int i19 = this.f19553e;
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
        int i11 = this.f19553e;
        if (i10 <= i11) {
            throw new java.lang.IllegalStateException(Y6.f.f(i3, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i12 = this.f19556i;
        if (i3 <= (androidx.media3.common.util.Log.LOG_LEVEL_OFF - i12) - i9 && i12 + i9 + i3 <= this.j) {
            byte[] bArr = this.f19552d;
            if (i9 > 0) {
                if (i11 > i9) {
                    java.lang.System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
                }
                this.f19556i += i9;
                this.f19553e -= i9;
                this.g = 0;
            }
            int i13 = this.f19553e;
            int iMin = java.lang.Math.min(bArr.length - i13, (androidx.media3.common.util.Log.LOG_LEVEL_OFF - this.f19556i) - i13);
            java.io.ByteArrayInputStream byteArrayInputStream = this.f19551c;
            try {
                int i14 = byteArrayInputStream.read(bArr, i13, iMin);
                if (i14 == 0 || i14 < -1 || i14 > bArr.length) {
                    throw new java.lang.IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i14 + "\nThe InputStream implementation is buggy.");
                }
                if (i14 > 0) {
                    this.f19553e += i14;
                    P();
                    if (this.f19553e >= i3) {
                        return true;
                    }
                    return S(i3);
                }
            } catch (com.google.crypto.tink.shaded.protobuf.D e6) {
                e6.f19468h = true;
                throw e6;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final void b(int i3) throws com.google.crypto.tink.shaded.protobuf.D {
        if (this.f19555h != i3) {
            throw new com.google.crypto.tink.shaded.protobuf.D("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int f() {
        return this.f19556i + this.g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final boolean g() {
        return this.g == this.f19553e && !S(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final void j(int i3) {
        this.j = i3;
        P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final int l(int i3) throws com.google.crypto.tink.shaded.protobuf.D {
        if (i3 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.D.e();
        }
        int i9 = this.f19556i + this.g + i3;
        int i10 = this.j;
        if (i9 > i10) {
            throw com.google.crypto.tink.shaded.protobuf.D.g();
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
    public final com.google.crypto.tink.shaded.protobuf.C1914i o() throws java.io.IOException {
        int iM = M();
        int i3 = this.f19553e;
        int i9 = this.g;
        int i10 = i3 - i9;
        byte[] bArr = this.f19552d;
        if (iM <= i10 && iM > 0) {
            com.google.crypto.tink.shaded.protobuf.C1914i c1914iF = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f(bArr, i9, iM);
            this.g += iM;
            return c1914iF;
        }
        if (iM == 0) {
            return com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;
        }
        byte[] bArrI = I(iM);
        if (bArrI != null) {
            return com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f(bArrI, 0, bArrI.length);
        }
        int i11 = this.g;
        int i12 = this.f19553e;
        int length = i12 - i11;
        this.f19556i += i12;
        this.g = 0;
        this.f19553e = 0;
        java.util.ArrayList<byte[]> arrayListJ = J(iM - length);
        byte[] bArr2 = new byte[iM];
        java.lang.System.arraycopy(bArr, i11, bArr2, 0, length);
        for (byte[] bArr3 : arrayListJ) {
            java.lang.System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        com.google.crypto.tink.shaded.protobuf.C1914i c1914i = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i;
        return new com.google.crypto.tink.shaded.protobuf.C1914i(bArr2);
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
        return androidx.datastore.preferences.protobuf.AbstractC1503j.d(M());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1503j
    public final long z() {
        return androidx.datastore.preferences.protobuf.AbstractC1503j.e(N());
    }
}
