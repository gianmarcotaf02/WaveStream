package p136q;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f26323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f26324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26327f;

    public H(int i3) {
        this.f26322a = p136q.P.f26351a;
        java.lang.Object[] objArr = p144r.a.f26671c;
        this.f26323b = objArr;
        this.f26324c = objArr;
        if (i3 >= 0) {
            h(p136q.P.d(i3));
        } else {
            p144r.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f26326e = 0;
        long[] jArr = this.f26322a;
        if (jArr != p136q.P.f26351a) {
            p078i6.m.j0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f26322a;
            int i3 = this.f26325d;
            int i9 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j)) | j;
        }
        p078i6.m.h0(this.f26324c, null, 0, this.f26325d);
        p078i6.m.h0(this.f26323b, null, 0, this.f26325d);
        this.f26327f = p136q.P.a(this.f26325d) - this.f26326e;
    }

    public final boolean b(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i9 = i3 & 127;
        int i10 = this.f26325d;
        int i11 = (i3 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f26322a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (((long) i9) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (kotlin.jvm.internal.m.a(this.f26323b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean c(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i9 = i3 & 127;
        int i10 = this.f26325d;
        int i11 = (i3 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f26322a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (((long) i9) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (kotlin.jvm.internal.m.a(this.f26323b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean d(java.lang.Object obj) {
        java.lang.Object[] objArr = this.f26324c;
        long[] jArr = this.f26322a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128 && kotlin.jvm.internal.m.a(obj, objArr[(i3 << 3) + i10])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i9 == 8) {
                        if (i3 != length) {
                            i3++;
                        }
                    }
                } else if (i3 != length) {
                    i3++;
                }
            }
        }
        return false;
    }

    public final int e(int i3) {
        int i9 = this.f26325d;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26322a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p136q.H)) {
            return false;
        }
        p136q.H h9 = (p136q.H) obj;
        if (h9.f26326e != this.f26326e) {
            return false;
        }
        java.lang.Object[] objArr = this.f26323b;
        java.lang.Object[] objArr2 = this.f26324c;
        long[] jArr = this.f26322a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128) {
                            int i11 = (i3 << 3) + i10;
                            java.lang.Object obj2 = objArr[i11];
                            java.lang.Object obj3 = objArr2[i11];
                            if (obj3 == null) {
                                if (h9.g(obj2) != null || !h9.c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(h9.g(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return true;
    }

    public final int f(java.lang.Object obj) {
        long j;
        long j9;
        long j10;
        long[] jArr;
        java.lang.Object[] objArr;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f26325d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr2 = this.f26322a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr2[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr2[i15] >>> i16);
            long j12 = i11;
            int i17 = i11;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = (i13 + (java.lang.Long.numberOfTrailingZeros(j14) >> 3)) & i12;
                int i18 = i3;
                if (kotlin.jvm.internal.m.a(this.f26323b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i3 = i18;
            }
            int i19 = i3;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iE = e(i10);
                long j15 = 255;
                if (this.f26327f != 0 || ((this.f26322a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j9 = j12;
                    j10 = 128;
                } else {
                    int i20 = this.f26325d;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (java.lang.Long.compare((((long) this.f26326e) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26322a;
                            int i22 = this.f26325d;
                            java.lang.Object[] objArr2 = this.f26323b;
                            java.lang.Object[] objArr3 = this.f26324c;
                            j10 = 128;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            while (i24 < i23) {
                                long j16 = j15;
                                long j17 = jArr3[i24] & (-9187201950435737472L);
                                jArr3[i24] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i24++;
                                i21 = i21;
                                j12 = j12;
                                j15 = j16;
                            }
                            j = j15;
                            j9 = j12;
                            int i25 = i21;
                            int iP0 = p078i6.m.p0(jArr3);
                            int i26 = iP0 - 1;
                            jArr3[i26] = (jArr3[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iP0] = jArr3[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j18 = (jArr3[i28] >> i29) & j;
                                if (j18 != 128 && j18 == 254) {
                                    java.lang.Object obj2 = objArr2[i27];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i19;
                                    int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i31 = i30 >>> 7;
                                    int iE2 = e(i31);
                                    int i32 = i31 & i22;
                                    if (((iE2 - i32) & i22) / i25 == ((i27 - i32) & i22) / i25) {
                                        jArr3[i28] = (((long) (i30 & 127)) << i29) | (jArr3[i28] & (~(j << i29)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i27++;
                                        i25 = i25;
                                    } else {
                                        int i33 = i25;
                                        int i34 = iE2 >> 3;
                                        long j19 = jArr3[i34];
                                        int i35 = (iE2 & 7) << 3;
                                        if (((j19 >> i35) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i34] = ((~(j << i35)) & j19) | (((long) (i30 & 127)) << i35);
                                            jArr3[i28] = (jArr3[i28] & (~(j << i29))) | (128 << i29);
                                            objArr[iE2] = objArr[i27];
                                            objArr[i27] = null;
                                            objArr3[iE2] = objArr3[i27];
                                            objArr3[i27] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i34] = (((long) (i30 & 127)) << i35) | ((~(j << i35)) & j19);
                                            java.lang.Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i27];
                                            objArr[i27] = obj3;
                                            java.lang.Object obj4 = objArr3[iE2];
                                            objArr3[iE2] = objArr3[i27];
                                            objArr3[i27] = obj4;
                                            i27--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i27++;
                                        i25 = i33;
                                        i22 = i22;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            this.f26327f = p136q.P.a(this.f26325d) - this.f26326e;
                        }
                        iE = e(i10);
                    }
                    j = 255;
                    j9 = j12;
                    j10 = 128;
                    int iB = p136q.P.b(this.f26325d);
                    long[] jArr4 = this.f26322a;
                    java.lang.Object[] objArr4 = this.f26323b;
                    java.lang.Object[] objArr5 = this.f26324c;
                    int i36 = this.f26325d;
                    h(iB);
                    long[] jArr5 = this.f26322a;
                    java.lang.Object[] objArr6 = this.f26323b;
                    java.lang.Object[] objArr7 = this.f26324c;
                    int i37 = this.f26325d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr4[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < 128) {
                            java.lang.Object obj5 = objArr4[i38];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i19;
                            int i39 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i39 >>> 7);
                            jArr = jArr5;
                            long j20 = i39 & 127;
                            int i40 = iE3 >> 3;
                            int i41 = (iE3 & 7) << 3;
                            long j21 = (jArr[i40] & (~(255 << i41))) | (j20 << i41);
                            jArr[i40] = j21;
                            jArr[(((iE3 - 7) & i37) + (i37 & 7)) >> 3] = j21;
                            objArr6[iE3] = obj5;
                            objArr7[iE3] = objArr5[i38];
                        } else {
                            jArr = jArr5;
                        }
                        i38++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i10);
                }
                this.f26326e++;
                int i42 = this.f26327f;
                long[] jArr6 = this.f26322a;
                int i43 = iE >> 3;
                long j22 = jArr6[i43];
                int i44 = (iE & 7) << 3;
                this.f26327f = i42 - (((j22 >> i44) & j) == j10 ? 1 : 0);
                int i45 = this.f26325d;
                long j23 = (j22 & (~(j << i44))) | (j9 << i44);
                jArr6[i43] = j23;
                jArr6[(((iE - 7) & i45) + (i45 & 7)) >> 3] = j23;
                return ~iE;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i3 = i19;
        }
    }

    public final java.lang.Object g(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i3 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f26325d;
        int i12 = i9 >>> 7;
        loop0: while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f26322a;
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j10) >> 3) + i13) & i11;
                if (kotlin.jvm.internal.m.a(this.f26323b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i3 += 8;
            i12 = i13 + i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f26324c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void h(int i3) {
        long[] jArr;
        int iMax = i3 > 0 ? java.lang.Math.max(7, p136q.P.c(i3)) : 0;
        this.f26325d = iMax;
        if (iMax == 0) {
            jArr = p136q.P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p078i6.m.j0(jArr, -9187201950435737472L);
            int i9 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i9] = (jArr[i9] & (~j)) | j;
        }
        this.f26322a = jArr;
        this.f26327f = p136q.P.a(this.f26325d) - this.f26326e;
        java.lang.Object[] objArr = p144r.a.f26671c;
        this.f26323b = iMax == 0 ? objArr : new java.lang.Object[iMax];
        if (iMax != 0) {
            objArr = new java.lang.Object[iMax];
        }
        this.f26324c = objArr;
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.f26323b;
        java.lang.Object[] objArr2 = this.f26324c;
        long[] jArr = this.f26322a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128) {
                        int i11 = (i3 << 3) + i10;
                        java.lang.Object obj = objArr[i11];
                        java.lang.Object obj2 = objArr2[i11];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.f26326e == 0;
    }

    public final boolean j() {
        return this.f26326e != 0;
    }

    public final java.lang.Object k(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i3 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f26325d;
        int i12 = i9 >>> 7;
        loop0: while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f26322a;
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j10) >> 3) + i13) & i11;
                if (kotlin.jvm.internal.m.a(this.f26323b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i3 += 8;
            i12 = i13 + i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return l(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final java.lang.Object l(int i3) {
        this.f26326e--;
        long[] jArr = this.f26322a;
        int i9 = this.f26325d;
        int i10 = i3 >> 3;
        int i11 = (i3 & 7) << 3;
        long j = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j;
        jArr[(((i3 - 7) & i9) + (i9 & 7)) >> 3] = j;
        this.f26323b[i3] = null;
        java.lang.Object[] objArr = this.f26324c;
        java.lang.Object obj = objArr[i3];
        objArr[i3] = null;
        return obj;
    }

    public final void m(java.lang.Object obj, java.lang.Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.f26323b[iF] = obj;
        this.f26324c[iF] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final java.lang.String toString() {
        if (i()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.Object[] objArr = this.f26323b;
        java.lang.Object[] objArr2 = this.f26324c;
        long[] jArr = this.f26322a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i9 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i3 << 3) + i11;
                            java.lang.Object obj = objArr[i12];
                            java.lang.Object obj2 = objArr2[i12];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i9++;
                            if (i9 < this.f26326e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ H() {
        this(6);
    }
}
