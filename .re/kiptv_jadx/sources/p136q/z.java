package p136q;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26440a = p136q.P.f26351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f26441b = p136q.AbstractC2673q.f26414a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f26442c = p144r.a.f26671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26445f;

    public z(int i3) {
        if (i3 >= 0) {
            e(p136q.P.d(i3));
        } else {
            p144r.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f26444e = 0;
        long[] jArr = this.f26440a;
        if (jArr != p136q.P.f26351a) {
            p078i6.m.j0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f26440a;
            int i3 = this.f26443d;
            int i9 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j)) | j;
        }
        p078i6.m.h0(this.f26442c, null, 0, this.f26443d);
        this.f26445f = p136q.P.a(this.f26443d) - this.f26444e;
    }

    public final boolean b(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = java.lang.Long.hashCode(j) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i9 = i3 & 127;
        int i10 = this.f26443d;
        int i11 = (i3 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f26440a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j9 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = (((long) i9) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i11) & i10;
                if (this.f26441b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i3) {
        int i9 = this.f26443d;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26440a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j9 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i10 + (java.lang.Long.numberOfTrailingZeros(j9) >> 3)) & i9;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    public final java.lang.Object d(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = java.lang.Long.hashCode(j) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i9 = i3 & 127;
        int i10 = this.f26443d;
        int i11 = (i3 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f26440a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j9 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = (((long) i9) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i11) & i10;
                if (this.f26441b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f26442c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void e(int i3) {
        long[] jArr;
        int iMax = i3 > 0 ? java.lang.Math.max(7, p136q.P.c(i3)) : 0;
        this.f26443d = iMax;
        if (iMax == 0) {
            jArr = p136q.P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p078i6.m.j0(jArr, -9187201950435737472L);
        }
        this.f26440a = jArr;
        int i9 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j)) | j;
        this.f26445f = p136q.P.a(this.f26443d) - this.f26444e;
        this.f26441b = new long[iMax];
        this.f26442c = new java.lang.Object[iMax];
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z6;
        long[] jArr;
        boolean z9;
        long[] jArr2;
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p136q.z)) {
            return false;
        }
        p136q.z zVar = (p136q.z) obj;
        if (zVar.f26444e != this.f26444e) {
            return false;
        }
        long[] jArr3 = this.f26441b;
        java.lang.Object[] objArr = this.f26442c;
        long[] jArr4 = this.f26440a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        loop0: while (true) {
            long j = jArr4[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((255 & j) < 128) {
                        int i11 = (i3 << 3) + i10;
                        z9 = z10;
                        jArr2 = jArr3;
                        long j9 = jArr2[i11];
                        java.lang.Object obj2 = objArr[i11];
                        if (obj2 == null) {
                            if (zVar.d(j9) != null || !zVar.b(j9)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(zVar.d(j9))) {
                            return false;
                        }
                    } else {
                        z9 = z10;
                        jArr2 = jArr3;
                    }
                    j >>= 8;
                    i10++;
                    z10 = z9;
                    jArr3 = jArr2;
                }
                z6 = z10;
                jArr = jArr3;
                if (i9 != 8) {
                    return z6;
                }
            } else {
                z6 = z10;
                jArr = jArr3;
            }
            if (i3 == length) {
                return z6;
            }
            i3++;
            z10 = z6;
            jArr3 = jArr;
        }
        return false;
    }

    public final void f(long j, java.lang.Object obj) {
        long j9;
        int i3;
        int i9;
        long j10;
        int iNumberOfTrailingZeros;
        long[] jArr;
        java.lang.Object[] objArr;
        long[] jArr2;
        int i10 = -862048943;
        int iHashCode = java.lang.Long.hashCode(j) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f26443d;
        int i15 = i12 & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f26440a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j11 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j12 = i13;
            int i20 = i16;
            int i21 = 0;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                iNumberOfTrailingZeros = (i15 + (java.lang.Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                int i22 = i10;
                if (this.f26441b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j14 &= j14 - 1;
                i10 = i22;
            }
            int i23 = i10;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iC = c(i12);
                if (this.f26445f != 0 || ((this.f26440a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j9 = j12;
                    i3 = 0;
                    i9 = 1;
                    j10 = 128;
                } else {
                    int i24 = this.f26443d;
                    if (i24 > 8) {
                        char c9 = 7;
                        if (java.lang.Long.compare((((long) this.f26444e) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f26440a;
                            int i25 = this.f26443d;
                            long[] jArr5 = this.f26441b;
                            java.lang.Object[] objArr2 = this.f26442c;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            j10 = 128;
                            while (i27 < i26) {
                                char c10 = c9;
                                long j15 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j15) + (j15 >>> c10));
                                i27++;
                                c9 = c10;
                                i19 = i19;
                                i21 = i21;
                                j12 = j12;
                            }
                            char c11 = c9;
                            j9 = j12;
                            i3 = i21;
                            int i28 = i19;
                            int iP0 = p078i6.m.p0(jArr4);
                            int i29 = iP0 - 1;
                            long j16 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iP0] = jArr4[i3];
                            int i30 = i3;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j17 = (jArr4[i31] >> i32) & 255;
                                if (j17 != 128 && j17 == 254) {
                                    int iHashCode2 = java.lang.Long.hashCode(jArr5[i30]) * i23;
                                    int i33 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i34 = i33 >>> 7;
                                    int iC2 = c(i34);
                                    int i35 = i34 & i25;
                                    char c12 = c11;
                                    if (((iC2 - i35) & i25) / 8 == ((i30 - i35) & i25) / 8) {
                                        int i36 = i28;
                                        long j18 = j16;
                                        jArr4[i31] = (((long) (i33 & 127)) << i32) | (jArr4[i31] & (~(255 << i32)));
                                        jArr4[jArr4.length - i36] = (jArr4[i3] & j18) | Long.MIN_VALUE;
                                        i30++;
                                        i28 = i36;
                                        c11 = c12;
                                        j16 = j18;
                                    } else {
                                        int i37 = i28;
                                        long j19 = j16;
                                        int i38 = iC2 >> 3;
                                        long j20 = jArr4[i38];
                                        int i39 = (iC2 & 7) << 3;
                                        if (((j20 >> i39) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i38] = (j20 & (~(255 << i39))) | (((long) (i33 & 127)) << i39);
                                            jArr4[i31] = (jArr4[i31] & (~(255 << i32))) | (128 << i32);
                                            jArr2[iC2] = jArr2[i30];
                                            jArr2[i30] = 0;
                                            objArr[iC2] = objArr[i30];
                                            objArr[i30] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr2 = jArr5;
                                            jArr4[i38] = (((long) (i33 & 127)) << i39) | (j20 & (~(255 << i39)));
                                            long j21 = jArr2[iC2];
                                            jArr2[iC2] = jArr2[i30];
                                            jArr2[i30] = j21;
                                            java.lang.Object obj2 = objArr[iC2];
                                            objArr[iC2] = objArr[i30];
                                            objArr[i30] = obj2;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i3] & j19) | Long.MIN_VALUE;
                                        i30++;
                                        jArr5 = jArr2;
                                        i28 = i37;
                                        c11 = c12;
                                        j16 = j19;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            i9 = i28;
                            this.f26445f = p136q.P.a(this.f26443d) - this.f26444e;
                        }
                        iC = c(i12);
                    }
                    j9 = j12;
                    i3 = 0;
                    i9 = 1;
                    j10 = 128;
                    int iB = p136q.P.b(this.f26443d);
                    long[] jArr6 = this.f26440a;
                    long[] jArr7 = this.f26441b;
                    java.lang.Object[] objArr3 = this.f26442c;
                    int i40 = this.f26443d;
                    e(iB);
                    long[] jArr8 = this.f26440a;
                    long[] jArr9 = this.f26441b;
                    java.lang.Object[] objArr4 = this.f26442c;
                    int i41 = this.f26443d;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr6[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < 128) {
                            long j22 = jArr7[i42];
                            int iHashCode3 = java.lang.Long.hashCode(j22) * i23;
                            int i43 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC3 = c(i43 >>> 7);
                            jArr = jArr8;
                            long j23 = i43 & 127;
                            int i44 = iC3 >> 3;
                            int i45 = (iC3 & 7) << 3;
                            long j24 = (jArr[i44] & (~(255 << i45))) | (j23 << i45);
                            jArr[i44] = j24;
                            jArr[(((iC3 - 7) & i41) + (i41 & 7)) >> 3] = j24;
                            jArr9[iC3] = j22;
                            objArr4[iC3] = objArr3[i42];
                        } else {
                            jArr = jArr8;
                        }
                        i42++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iC = c(i12);
                }
                iNumberOfTrailingZeros = iC;
                this.f26444e++;
                int i46 = this.f26445f;
                long[] jArr10 = this.f26440a;
                int i47 = iNumberOfTrailingZeros >> 3;
                long j25 = jArr10[i47];
                int i48 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j25 >> i48) & 255) == j10) {
                    i3 = i9;
                }
                this.f26445f = i46 - i3;
                int i49 = this.f26443d;
                long j26 = (j25 & (~(255 << i48))) | (j9 << i48);
                jArr10[i47] = j26;
                jArr10[(((iNumberOfTrailingZeros - 7) & i49) + (i49 & 7)) >> 3] = j26;
                break;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
            i10 = i23;
        }
        this.f26441b[iNumberOfTrailingZeros] = j;
        this.f26442c[iNumberOfTrailingZeros] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f26441b;
        java.lang.Object[] objArr = this.f26442c;
        long[] jArr2 = this.f26440a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128) {
                        int i11 = (i3 << 3) + i10;
                        long j9 = jArr[i11];
                        java.lang.Object obj = objArr[i11];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ java.lang.Long.hashCode(j9);
                    }
                    j >>= 8;
                }
                if (i9 != 8) {
                    return iHashCode;
                }
            }
            if (i3 == length) {
                return iHashCode;
            }
            i3++;
        }
    }

    public final java.lang.String toString() {
        int i3;
        int i9;
        if (this.f26444e == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        long[] jArr = this.f26441b;
        java.lang.Object[] objArr = this.f26442c;
        long[] jArr2 = this.f26440a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j = jArr2[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j) < 128) {
                            int i14 = (i10 << 3) + i13;
                            i9 = i10;
                            long j9 = jArr[i14];
                            java.lang.Object obj = objArr[i14];
                            sb.append(j9);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i11++;
                            if (i11 < this.f26444e) {
                                sb.append(", ");
                            }
                        } else {
                            i9 = i10;
                        }
                        j >>= 8;
                        i13++;
                        i10 = i9;
                    }
                    int i15 = i10;
                    if (i12 != 8) {
                        break;
                    }
                    i3 = i15;
                } else {
                    i3 = i10;
                }
                if (i3 == length) {
                    break;
                }
                i10 = i3 + 1;
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
