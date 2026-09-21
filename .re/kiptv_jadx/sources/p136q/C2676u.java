package p136q;

/* JADX INFO: renamed from: q.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2676u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f26425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f26426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26429f;

    public C2676u(int i3) {
        this.f26424a = p136q.P.f26351a;
        int[] iArr = p136q.AbstractC2670n.f26403a;
        this.f26425b = iArr;
        this.f26426c = iArr;
        if (i3 >= 0) {
            e(p136q.P.d(i3));
        } else {
            p144r.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f26428e = 0;
        long[] jArr = this.f26424a;
        if (jArr != p136q.P.f26351a) {
            p078i6.m.j0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f26424a;
            int i3 = this.f26427d;
            int i9 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j)) | j;
        }
        this.f26429f = p136q.P.a(this.f26427d) - this.f26428e;
    }

    public final int b(int i3) {
        int i9 = this.f26427d;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26424a;
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

    public final int c(int i3) {
        int iHashCode = java.lang.Integer.hashCode(i3) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f26427d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f26424a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f26425b[iNumberOfTrailingZeros] == i3) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int d(int i3) {
        int iC = c(i3);
        if (iC >= 0) {
            return this.f26426c[iC];
        }
        return -1;
    }

    public final void e(int i3) {
        long[] jArr;
        int iMax = i3 > 0 ? java.lang.Math.max(7, p136q.P.c(i3)) : 0;
        this.f26427d = iMax;
        if (iMax == 0) {
            jArr = p136q.P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p078i6.m.j0(jArr, -9187201950435737472L);
        }
        this.f26424a = jArr;
        int i9 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j)) | j;
        this.f26429f = p136q.P.a(this.f26427d) - this.f26428e;
        this.f26425b = new int[iMax];
        this.f26426c = new int[iMax];
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z6;
        boolean z9 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p136q.C2676u)) {
            return false;
        }
        p136q.C2676u c2676u = (p136q.C2676u) obj;
        if (c2676u.f26428e != this.f26428e) {
            return false;
        }
        int[] iArr = this.f26425b;
        int[] iArr2 = this.f26426c;
        long[] jArr = this.f26424a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((255 & j) < 128) {
                        int i11 = (i3 << 3) + i10;
                        int i12 = iArr[i11];
                        int i13 = iArr2[i11];
                        int iC = c2676u.c(i12);
                        if (iC < 0 || i13 != c2676u.f26426c[iC]) {
                            break loop0;
                        }
                    }
                    j >>= 8;
                    i10++;
                    z9 = z9;
                }
                z6 = z9;
                if (i9 != 8) {
                    return z6;
                }
            } else {
                z6 = z9;
            }
            if (i3 == length) {
                return z6;
            }
            i3++;
            z9 = z6;
        }
        return false;
    }

    public final void f(int i3, int i9) {
        long j;
        int i10;
        int i11;
        long j9;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i12 = i3;
        int i13 = -862048943;
        int iHashCode = java.lang.Integer.hashCode(i12) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f26427d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f26424a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            int i23 = i19;
            int i24 = 0;
            long j10 = (((-i21) >> 63) & (jArr2[i20 + 1] << (64 - i21))) | (jArr2[i20] >>> i21);
            long j11 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
            while (j13 != 0) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j13) >> 3) + i18) & i17;
                int i25 = i13;
                if (this.f26425b[iNumberOfTrailingZeros] == i12) {
                    break loop0;
                }
                j13 &= j13 - 1;
                i13 = i25;
            }
            int i26 = i13;
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b(i15);
                if (this.f26429f != 0 || ((this.f26424a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = j11;
                    i10 = 1;
                    i11 = 0;
                    j9 = 128;
                } else {
                    int i27 = this.f26427d;
                    if (i27 > 8) {
                        char c9 = 7;
                        if (java.lang.Long.compare((((long) this.f26428e) * 32) ^ Long.MIN_VALUE, (((long) i27) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26424a;
                            int i28 = this.f26427d;
                            int[] iArr3 = this.f26425b;
                            int[] iArr4 = this.f26426c;
                            int i29 = (i28 + 7) >> 3;
                            int i30 = 0;
                            while (i30 < i29) {
                                char c10 = c9;
                                long j14 = jArr3[i30] & (-9187201950435737472L);
                                jArr3[i30] = (-72340172838076674L) & ((~j14) + (j14 >>> c10));
                                i30++;
                                c9 = c10;
                                j11 = j11;
                            }
                            char c11 = c9;
                            j = j11;
                            j9 = 128;
                            int iP0 = p078i6.m.p0(jArr3);
                            int i31 = iP0 - 1;
                            jArr3[i31] = (jArr3[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iP0] = jArr3[0];
                            int i32 = 0;
                            while (i32 != i28) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j15 = (jArr3[i33] >> i34) & 255;
                                if (j15 != 128 && j15 == 254) {
                                    int iHashCode2 = java.lang.Integer.hashCode(iArr3[i32]) * i26;
                                    int i35 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i36 = i35 >>> 7;
                                    int iB2 = b(i36);
                                    int i37 = i36 & i28;
                                    char c12 = c11;
                                    if (((iB2 - i37) & i28) / 8 == ((i32 - i37) & i28) / 8) {
                                        int i38 = i24;
                                        jArr3[i33] = (((long) (i35 & 127)) << i34) | (jArr3[i33] & (~(255 << i34)));
                                        jArr3[jArr3.length - 1] = (jArr3[i38] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32++;
                                        i22 = i22;
                                        c11 = c12;
                                        i24 = i38;
                                    } else {
                                        int i39 = i22;
                                        int i40 = i24;
                                        int i41 = iB2 >> 3;
                                        long j16 = jArr3[i41];
                                        int i42 = (iB2 & 7) << 3;
                                        if (((j16 >> i42) & 255) == 128) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i41] = ((~(255 << i42)) & j16) | (((long) (i35 & 127)) << i42);
                                            jArr3[i33] = (jArr3[i33] & (~(255 << i34))) | (128 << i34);
                                            iArr[iB2] = iArr[i32];
                                            iArr[i32] = i40;
                                            iArr2[iB2] = iArr2[i32];
                                            iArr2[i32] = i40;
                                        } else {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i41] = (((long) (i35 & 127)) << i42) | ((~(255 << i42)) & j16);
                                            int i43 = iArr[iB2];
                                            iArr[iB2] = iArr[i32];
                                            iArr[i32] = i43;
                                            int i44 = iArr2[iB2];
                                            iArr2[iB2] = iArr2[i32];
                                            iArr2[i32] = i44;
                                            i32--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i40] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32++;
                                        i22 = i39;
                                        c11 = c12;
                                        i24 = i40;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                    }
                                } else {
                                    i32++;
                                }
                            }
                            i10 = i22;
                            i11 = i24;
                            this.f26429f = p136q.P.a(this.f26427d) - this.f26428e;
                        }
                        iB = b(i15);
                    }
                    j = j11;
                    i10 = 1;
                    i11 = 0;
                    j9 = 128;
                    int iB3 = p136q.P.b(this.f26427d);
                    long[] jArr4 = this.f26424a;
                    int[] iArr5 = this.f26425b;
                    int[] iArr6 = this.f26426c;
                    int i45 = this.f26427d;
                    e(iB3);
                    long[] jArr5 = this.f26424a;
                    int[] iArr7 = this.f26425b;
                    int[] iArr8 = this.f26426c;
                    int i46 = this.f26427d;
                    int i47 = 0;
                    while (i47 < i45) {
                        if (((jArr4[i47 >> 3] >> ((i47 & 7) << 3)) & 255) < 128) {
                            int i48 = iArr5[i47];
                            int iHashCode3 = java.lang.Integer.hashCode(i48) * i26;
                            int i49 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i49 >>> 7);
                            jArr = jArr5;
                            long j17 = i49 & 127;
                            int i50 = iB4 >> 3;
                            int i51 = (iB4 & 7) << 3;
                            long j18 = (jArr[i50] & (~(255 << i51))) | (j17 << i51);
                            jArr[i50] = j18;
                            jArr[(((iB4 - 7) & i46) + (i46 & 7)) >> 3] = j18;
                            iArr7[iB4] = i48;
                            iArr8[iB4] = iArr6[i47];
                        } else {
                            jArr = jArr5;
                        }
                        i47++;
                        jArr5 = jArr;
                    }
                    iB = b(i15);
                }
                this.f26428e++;
                int i52 = this.f26429f;
                long[] jArr6 = this.f26424a;
                int i53 = iB >> 3;
                long j19 = jArr6[i53];
                int i54 = (iB & 7) << 3;
                if (((j19 >> i54) & 255) == j9) {
                    i11 = i10;
                }
                this.f26429f = i52 - i11;
                int i55 = this.f26427d;
                long j20 = (j19 & (~(255 << i54))) | (j << i54);
                jArr6[i53] = j20;
                jArr6[(((iB - 7) & i55) + (i55 & 7)) >> 3] = j20;
                iNumberOfTrailingZeros = ~iB;
                break;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i12 = i3;
            i13 = i26;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f26425b[iNumberOfTrailingZeros] = i3;
        this.f26426c[iNumberOfTrailingZeros] = i9;
    }

    public final int hashCode() {
        int[] iArr = this.f26425b;
        int[] iArr2 = this.f26426c;
        long[] jArr = this.f26424a;
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
                        int i12 = iArr[i11];
                        iHashCode += java.lang.Integer.hashCode(iArr2[i11]) ^ java.lang.Integer.hashCode(i12);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final java.lang.String toString() {
        if (this.f26428e == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        int[] iArr = this.f26425b;
        int[] iArr2 = this.f26426c;
        long[] jArr = this.f26424a;
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
                            int i13 = iArr[i12];
                            int i14 = iArr2[i12];
                            sb.append(i13);
                            sb.append("=");
                            sb.append(i14);
                            i9++;
                            if (i9 < this.f26428e) {
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

    public /* synthetic */ C2676u() {
        this(6);
    }
}
