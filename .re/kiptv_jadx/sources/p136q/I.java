package p136q;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f26329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26332e;

    public I(int i3) {
        this.f26328a = p136q.P.f26351a;
        this.f26329b = p144r.a.f26671c;
        if (i3 >= 0) {
            f(p136q.P.d(i3));
        } else {
            p144r.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(java.lang.Object obj) {
        int i3 = this.f26331d;
        this.f26329b[d(obj)] = obj;
        return this.f26331d != i3;
    }

    public final void b() {
        this.f26331d = 0;
        long[] jArr = this.f26328a;
        if (jArr != p136q.P.f26351a) {
            p078i6.m.j0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f26328a;
            int i3 = this.f26330c;
            int i9 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j)) | j;
        }
        p078i6.m.h0(this.f26329b, null, 0, this.f26330c);
        this.f26332e = p136q.P.a(this.f26330c) - this.f26331d;
    }

    public final boolean c(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i9 = i3 & 127;
        int i10 = this.f26330c;
        int i11 = (i3 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f26328a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (((long) i9) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (kotlin.jvm.internal.m.a(this.f26329b[iNumberOfTrailingZeros], obj)) {
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

    public final int d(java.lang.Object obj) {
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
        int i12 = this.f26330c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr2 = this.f26328a;
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
                if (kotlin.jvm.internal.m.a(this.f26329b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i3 = i18;
            }
            int i19 = i3;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iE = e(i10);
                long j15 = 255;
                if (this.f26332e != 0 || ((this.f26328a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j9 = j12;
                    j10 = 128;
                } else {
                    int i20 = this.f26330c;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (java.lang.Long.compare((((long) this.f26331d) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26328a;
                            int i22 = this.f26330c;
                            java.lang.Object[] objArr2 = this.f26329b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            j10 = 128;
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
                            long j18 = 72057594037927935L;
                            jArr3[i26] = (jArr3[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iP0] = jArr3[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j19 = (jArr3[i28] >> i29) & j;
                                if (j19 != 128 && j19 == 254) {
                                    java.lang.Object obj2 = objArr2[i27];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i19;
                                    int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i31 = i30 >>> 7;
                                    int iE2 = e(i31);
                                    int i32 = i31 & i22;
                                    if (((iE2 - i32) & i22) / i25 == ((i27 - i32) & i22) / i25) {
                                        long j20 = j18;
                                        jArr3[i28] = (((long) (i30 & 127)) << i29) | ((~(j << i29)) & jArr3[i28]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j20) | Long.MIN_VALUE;
                                        i27++;
                                        j18 = j20;
                                    } else {
                                        long j21 = j18;
                                        int i33 = iE2 >> 3;
                                        long j22 = jArr3[i33];
                                        int i34 = (iE2 & 7) << 3;
                                        if (((j22 >> i34) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i33] = ((~(j << i34)) & j22) | (((long) (i30 & 127)) << i34);
                                            jArr3[i28] = (jArr3[i28] & (~(j << i29))) | (128 << i29);
                                            objArr[iE2] = objArr[i27];
                                            objArr[i27] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i33] = (((long) (i30 & 127)) << i34) | ((~(j << i34)) & j22);
                                            java.lang.Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i27];
                                            objArr[i27] = obj3;
                                            i27--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j21) | Long.MIN_VALUE;
                                        i27++;
                                        j18 = j21;
                                        i25 = i25;
                                        i22 = i22;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            this.f26332e = p136q.P.a(this.f26330c) - this.f26331d;
                        }
                        iE = e(i10);
                    }
                    j = 255;
                    j9 = j12;
                    j10 = 128;
                    int iB = p136q.P.b(this.f26330c);
                    long[] jArr4 = this.f26328a;
                    java.lang.Object[] objArr3 = this.f26329b;
                    int i35 = this.f26330c;
                    f(iB);
                    long[] jArr5 = this.f26328a;
                    java.lang.Object[] objArr4 = this.f26329b;
                    int i36 = this.f26330c;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr4[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < 128) {
                            java.lang.Object obj4 = objArr3[i37];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i19;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i38 >>> 7);
                            long j23 = i38 & 127;
                            int i39 = iE3 >> 3;
                            int i40 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j24 = (jArr5[i39] & (~(255 << i40))) | (j23 << i40);
                            jArr[i39] = j24;
                            jArr[(((iE3 - 7) & i36) + (i36 & 7)) >> 3] = j24;
                            objArr4[iE3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i37++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i10);
                }
                this.f26331d++;
                int i41 = this.f26332e;
                long[] jArr6 = this.f26328a;
                int i42 = iE >> 3;
                long j25 = jArr6[i42];
                int i43 = (iE & 7) << 3;
                this.f26332e = i41 - (((j25 >> i43) & j) == j10 ? 1 : 0);
                int i44 = this.f26330c;
                long j26 = (j25 & (~(j << i43))) | (j9 << i43);
                jArr6[i42] = j26;
                jArr6[(((iE - 7) & i44) + (i44 & 7)) >> 3] = j26;
                return iE;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i3 = i19;
        }
    }

    public final int e(int i3) {
        int i9 = this.f26330c;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26328a;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p136q.I)) {
            return false;
        }
        p136q.I i3 = (p136q.I) obj;
        if (i3.f26331d != this.f26331d) {
            return false;
        }
        java.lang.Object[] objArr = this.f26329b;
        long[] jArr = this.f26328a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j = jArr[i9];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && !i3.c(objArr[(i9 << 3) + i11])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i10 == 8) {
                        if (i9 != length) {
                            i9++;
                        }
                    }
                } else if (i9 != length) {
                    i9++;
                }
            }
        }
        return true;
    }

    public final void f(int i3) {
        long[] jArr;
        int iMax = i3 > 0 ? java.lang.Math.max(7, p136q.P.c(i3)) : 0;
        this.f26330c = iMax;
        if (iMax == 0) {
            jArr = p136q.P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p078i6.m.j0(jArr, -9187201950435737472L);
        }
        this.f26328a = jArr;
        int i9 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j)) | j;
        this.f26332e = p136q.P.a(this.f26330c) - this.f26331d;
        this.f26329b = iMax == 0 ? p144r.a.f26671c : new java.lang.Object[iMax];
    }

    public final boolean g() {
        return this.f26331d == 0;
    }

    public final boolean h() {
        return this.f26331d != 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f26330c * 31) + this.f26331d;
        java.lang.Object[] objArr = this.f26329b;
        long[] jArr = this.f26328a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i3 << 3) + i10];
                            if (!kotlin.jvm.internal.m.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        return iHashCode;
                    }
                }
                if (i3 != length) {
                    i3++;
                }
            }
        }
        return iHashCode;
    }

    public final void i(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i3 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f26330c;
        int i12 = i9 >>> 7;
        loop0: while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f26328a;
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j10) >> 3) + i13) & i11;
                if (kotlin.jvm.internal.m.a(this.f26329b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i3 += 8;
                i12 = i13 + i3;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    public final void j(java.lang.Object obj) {
        this.f26329b[d(obj)] = obj;
    }

    public final void k(p136q.I elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        java.lang.Object[] objArr = elements.f26329b;
        long[] jArr = elements.f26328a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128) {
                        j(objArr[(i3 << 3) + i10]);
                    }
                    j >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final boolean l(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i9 = i3 & 127;
        int i10 = this.f26330c;
        int i11 = (i3 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f26328a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (((long) i9) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (kotlin.jvm.internal.m.a(this.f26329b[iNumberOfTrailingZeros], obj)) {
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
        boolean z6 = iNumberOfTrailingZeros >= 0;
        if (z6) {
            m(iNumberOfTrailingZeros);
        }
        return z6;
    }

    public final void m(int i3) {
        this.f26331d--;
        long[] jArr = this.f26328a;
        int i9 = this.f26330c;
        int i10 = i3 >> 3;
        int i11 = (i3 & 7) << 3;
        long j = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j;
        jArr[(((i3 - 7) & i9) + (i9 & 7)) >> 3] = j;
        this.f26329b[i3] = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[DONT_INVERT, PHI: r8
  0x0067: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x002a, B:18:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[LOOP:0: B:5:0x001c->B:20:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[SYNTHETIC] */
    public final java.lang.String toString() {
        A0.b bVar = new A0.b(20, this);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.lang.Object[] objArr = this.f26329b;
        long[] jArr = this.f26328a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((java.lang.CharSequence) "]");
            break;
        }
        int i3 = 0;
        int i9 = 0;
        loop0: while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        java.lang.Object obj = objArr[(i3 << 3) + i11];
                        if (i9 == -1) {
                            sb.append((java.lang.CharSequence) "...");
                            break loop0;
                        }
                        if (i9 != 0) {
                            sb.append((java.lang.CharSequence) ", ");
                        }
                        sb.append((java.lang.CharSequence) bVar.invoke(obj));
                        i9++;
                    }
                    j >>= 8;
                }
                if (i10 == 8) {
                    if (i3 == length) {
                        i3++;
                    }
                }
                sb.append((java.lang.CharSequence) "]");
                break;
            }
            if (i3 == length) {
                sb.append((java.lang.CharSequence) "]");
                break;
            }
            i3++;
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ I() {
        this(6);
    }
}
