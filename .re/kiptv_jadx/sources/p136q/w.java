package p136q;

/* JADX INFO: loaded from: classes.dex */
public final class w extends p136q.AbstractC2668l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26432f;

    public w(int i3) {
        this.f26397a = p136q.P.f26351a;
        this.f26398b = p136q.AbstractC2670n.f26403a;
        this.f26399c = p144r.a.f26671c;
        if (i3 >= 0) {
            f(p136q.P.d(i3));
        } else {
            p144r.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f26401e = 0;
        long[] jArr = this.f26397a;
        if (jArr != p136q.P.f26351a) {
            p078i6.m.j0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f26397a;
            int i3 = this.f26400d;
            int i9 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j)) | j;
        }
        p078i6.m.h0(this.f26399c, null, 0, this.f26400d);
        this.f26432f = p136q.P.a(this.f26400d) - this.f26401e;
    }

    public final int d(int i3) {
        int i9;
        long j;
        long[] jArr;
        long j9;
        int[] iArr;
        java.lang.Object[] objArr;
        int i10 = -862048943;
        int iHashCode = java.lang.Integer.hashCode(i3) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f26400d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f26397a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            int i21 = 0;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = (i15 + (java.lang.Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                int i22 = i10;
                int i23 = i21;
                if (this.f26398b[iNumberOfTrailingZeros] == i3) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i10 = i22;
                i21 = i23;
            }
            int i24 = i10;
            int i25 = i21;
            char c9 = '\b';
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iE = e(i12);
                if (this.f26432f != 0 || ((this.f26397a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i9 = 1;
                    j = 128;
                } else {
                    int i26 = this.f26400d;
                    if (i26 <= 8 || java.lang.Long.compare((((long) this.f26401e) * 32) ^ Long.MIN_VALUE, (((long) i26) * 25) ^ Long.MIN_VALUE) > 0) {
                        i9 = 1;
                        j = 128;
                        int iB = p136q.P.b(this.f26400d);
                        long[] jArr3 = this.f26397a;
                        int[] iArr2 = this.f26398b;
                        java.lang.Object[] objArr2 = this.f26399c;
                        int i27 = this.f26400d;
                        f(iB);
                        long[] jArr4 = this.f26397a;
                        int[] iArr3 = this.f26398b;
                        java.lang.Object[] objArr3 = this.f26399c;
                        int i28 = this.f26400d;
                        int i29 = i25;
                        while (i29 < i27) {
                            if (((jArr3[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < 128) {
                                int i30 = iArr2[i29];
                                int iHashCode2 = java.lang.Integer.hashCode(i30) * i24;
                                int i31 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i31 >>> 7);
                                jArr = jArr4;
                                long j15 = i31 & 127;
                                int i32 = iE2 >> 3;
                                int i33 = (iE2 & 7) << 3;
                                long j16 = (jArr[i32] & (~(255 << i33))) | (j15 << i33);
                                jArr[i32] = j16;
                                jArr[(((iE2 - 7) & i28) + (i28 & 7)) >> 3] = j16;
                                iArr3[iE2] = i30;
                                objArr3[iE2] = objArr2[i29];
                            } else {
                                jArr = jArr4;
                            }
                            i29++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.f26397a;
                        int i34 = this.f26400d;
                        int[] iArr4 = this.f26398b;
                        java.lang.Object[] objArr4 = this.f26399c;
                        int i35 = (i34 + 7) >> 3;
                        int i36 = i25;
                        while (i36 < i35) {
                            char c10 = c9;
                            long j17 = jArr5[i36] & j13;
                            jArr5[i36] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                            i36++;
                            i19 = i19;
                            c9 = c10;
                            j13 = -9187201950435737472L;
                        }
                        int i37 = i19;
                        j = 128;
                        int iP0 = p078i6.m.p0(jArr5);
                        int i38 = iP0 - 1;
                        long j18 = 72057594037927935L;
                        jArr5[i38] = (jArr5[i38] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[iP0] = jArr5[i25];
                        int i39 = i25;
                        while (i39 != i34) {
                            int i40 = i39 >> 3;
                            int i41 = (i39 & 7) << 3;
                            long j19 = (jArr5[i40] >> i41) & 255;
                            if (j19 != 128 && j19 == 254) {
                                int iHashCode3 = java.lang.Integer.hashCode(iArr4[i39]) * i24;
                                int i42 = iHashCode3 ^ (iHashCode3 << 16);
                                int i43 = i42 >>> 7;
                                int iE3 = e(i43);
                                int i44 = i43 & i34;
                                i37 = i37;
                                if (((iE3 - i44) & i34) / 8 == ((i39 - i44) & i34) / 8) {
                                    j9 = j18;
                                    jArr5[i40] = (((long) (i42 & 127)) << i41) | (jArr5[i40] & (~(255 << i41)));
                                    jArr5[jArr5.length - 1] = (jArr5[i25] & j9) | Long.MIN_VALUE;
                                    i39++;
                                } else {
                                    j9 = j18;
                                    int i45 = iE3 >> 3;
                                    long j20 = jArr5[i45];
                                    int i46 = (iE3 & 7) << 3;
                                    if (((j20 >> i46) & 255) == 128) {
                                        iArr = iArr4;
                                        objArr = objArr4;
                                        jArr5[i45] = ((~(255 << i46)) & j20) | (((long) (i42 & 127)) << i46);
                                        jArr5[i40] = (jArr5[i40] & (~(255 << i41))) | (128 << i41);
                                        iArr[iE3] = iArr[i39];
                                        iArr[i39] = i25;
                                        objArr[iE3] = objArr[i39];
                                        objArr[i39] = null;
                                    } else {
                                        iArr = iArr4;
                                        objArr = objArr4;
                                        jArr5[i45] = ((~(255 << i46)) & j20) | (((long) (i42 & 127)) << i46);
                                        int i47 = iArr[iE3];
                                        iArr[iE3] = iArr[i39];
                                        iArr[i39] = i47;
                                        java.lang.Object obj = objArr[iE3];
                                        objArr[iE3] = objArr[i39];
                                        objArr[i39] = obj;
                                        i39--;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[i25] & j9) | Long.MIN_VALUE;
                                    i39++;
                                    iArr4 = iArr;
                                    objArr4 = objArr;
                                }
                                j18 = j9;
                            } else {
                                i39++;
                            }
                        }
                        i9 = i37;
                        this.f26432f = p136q.P.a(this.f26400d) - this.f26401e;
                    }
                    iE = e(i12);
                }
                this.f26401e++;
                int i48 = this.f26432f;
                long[] jArr6 = this.f26397a;
                int i49 = iE >> 3;
                long j21 = jArr6[i49];
                int i50 = (iE & 7) << 3;
                if (((j21 >> i50) & 255) == j) {
                    i25 = i9;
                }
                this.f26432f = i48 - i25;
                int i51 = this.f26400d;
                long j22 = (j21 & (~(255 << i50))) | (j11 << i50);
                jArr6[i49] = j22;
                jArr6[(((iE - 7) & i51) + (i51 & 7)) >> 3] = j22;
                return iE;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
            i10 = i24;
        }
    }

    public final int e(int i3) {
        int i9 = this.f26400d;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26397a;
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

    public final void f(int i3) {
        long[] jArr;
        int iMax = i3 > 0 ? java.lang.Math.max(7, p136q.P.c(i3)) : 0;
        this.f26400d = iMax;
        if (iMax == 0) {
            jArr = p136q.P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p078i6.m.j0(jArr, -9187201950435737472L);
        }
        this.f26397a = jArr;
        int i9 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j)) | j;
        this.f26432f = p136q.P.a(this.f26400d) - this.f26401e;
        this.f26398b = new int[iMax];
        this.f26399c = new java.lang.Object[iMax];
    }

    public final java.lang.Object g(int i3) {
        int iNumberOfTrailingZeros;
        int iHashCode = java.lang.Integer.hashCode(i3) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f26400d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f26397a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f26398b[iNumberOfTrailingZeros] == i3) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f26401e--;
        long[] jArr2 = this.f26397a;
        int i16 = this.f26400d;
        int i17 = iNumberOfTrailingZeros >> 3;
        int i18 = (iNumberOfTrailingZeros & 7) << 3;
        long j11 = (jArr2[i17] & (~(255 << i18))) | (254 << i18);
        jArr2[i17] = j11;
        jArr2[(((iNumberOfTrailingZeros - 7) & i16) + (i16 & 7)) >> 3] = j11;
        java.lang.Object[] objArr = this.f26399c;
        java.lang.Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void h(int i3, java.lang.Object obj) {
        int iD = d(i3);
        this.f26398b[iD] = i3;
        this.f26399c[iD] = obj;
    }

    public /* synthetic */ w() {
        this(6);
    }
}
