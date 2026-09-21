package p136q;

import p078i6.m;
import p144r.a;

public final class C {

    public long[] f26297a;

    public Object[] f26298b;

    public int[] f26299c;

    public int f26300d;

    public int f26301e;

    public int f26302f;

    public C(int i3) {
        this.f26297a = P.f26351a;
        this.f26298b = a.f26671c;
        this.f26299c = AbstractC2670n.f26403a;
        if (i3 >= 0) {
            e(P.d(i3));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f26301e = 0;
        long[] jArr = this.f26297a;
        if (jArr != P.f26351a) {
            m.j0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f26297a;
            int i3 = this.f26300d;
            int i9 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j)) | j;
        }
        m.h0(this.f26298b, null, 0, this.f26300d);
        this.f26302f = P.a(this.f26300d) - this.f26301e;
    }

    public final int b(int i3) {
        int i9 = this.f26300d;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26297a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j9 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i10 + (Long.numberOfTrailingZeros(j9) >> 3)) & i9;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    public final int c(Object obj) {
        long j;
        long j9;
        long j10;
        long[] jArr;
        Object[] objArr;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f26300d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr2 = this.f26297a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr2[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr2[i15] >>> i16);
            long j12 = i11;
            int i17 = i11;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j14) >> 3)) & i12;
                int i18 = i3;
                if (kotlin.jvm.internal.m.a(this.f26298b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i3 = i18;
            }
            int i19 = i3;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iB = b(i10);
                long j15 = 255;
                if (this.f26302f != 0 || ((this.f26297a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j9 = j12;
                    j10 = 128;
                } else {
                    int i20 = this.f26300d;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (Long.compare((((long) this.f26301e) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26297a;
                            int i22 = this.f26300d;
                            Object[] objArr2 = this.f26298b;
                            int[] iArr = this.f26299c;
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
                            int iP0 = m.p0(jArr3);
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
                                    Object obj2 = objArr2[i27];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i19;
                                    int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i31 = i30 >>> 7;
                                    int iB2 = b(i31);
                                    int i32 = i31 & i22;
                                    long j20 = j18;
                                    if (((iB2 - i32) & i22) / 8 == ((i27 - i32) & i22) / i25) {
                                        jArr3[i28] = (((long) (i30 & 127)) << i29) | (jArr3[i28] & (~(j << i29)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j20) | Long.MIN_VALUE;
                                        i27++;
                                        j18 = j20;
                                        i25 = i25;
                                    } else {
                                        int i33 = i25;
                                        int i34 = iB2 >> 3;
                                        long j21 = jArr3[i34];
                                        int i35 = (iB2 & 7) << 3;
                                        if (((j21 >> i35) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i34] = ((~(j << i35)) & j21) | (((long) (i30 & 127)) << i35);
                                            jArr3[i28] = (jArr3[i28] & (~(j << i29))) | (128 << i29);
                                            objArr[iB2] = objArr[i27];
                                            objArr[i27] = null;
                                            iArr[iB2] = iArr[i27];
                                            iArr[i27] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i34] = (((long) (i30 & 127)) << i35) | ((~(j << i35)) & j21);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i27];
                                            objArr[i27] = obj3;
                                            int i36 = iArr[iB2];
                                            iArr[iB2] = iArr[i27];
                                            iArr[i27] = i36;
                                            i27--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j20) | Long.MIN_VALUE;
                                        i27++;
                                        i22 = i22;
                                        j18 = j20;
                                        i25 = i33;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            this.f26302f = P.a(this.f26300d) - this.f26301e;
                        }
                        iB = b(i10);
                    }
                    j = 255;
                    j9 = j12;
                    j10 = 128;
                    int iB3 = P.b(this.f26300d);
                    long[] jArr4 = this.f26297a;
                    Object[] objArr3 = this.f26298b;
                    int[] iArr2 = this.f26299c;
                    int i37 = this.f26300d;
                    e(iB3);
                    long[] jArr5 = this.f26297a;
                    Object[] objArr4 = this.f26298b;
                    int[] iArr3 = this.f26299c;
                    int i38 = this.f26300d;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr4[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i19;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i40 >>> 7);
                            jArr = jArr5;
                            long j22 = i40 & 127;
                            int i41 = iB4 >> 3;
                            int i42 = (iB4 & 7) << 3;
                            long j23 = (jArr[i41] & (~(255 << i42))) | (j22 << i42);
                            jArr[i41] = j23;
                            jArr[(((iB4 - 7) & i38) + (i38 & 7)) >> 3] = j23;
                            objArr4[iB4] = obj4;
                            iArr3[iB4] = iArr2[i39];
                        } else {
                            jArr = jArr5;
                        }
                        i39++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iB = b(i10);
                }
                this.f26301e++;
                int i43 = this.f26302f;
                long[] jArr6 = this.f26297a;
                int i44 = iB >> 3;
                long j24 = jArr6[i44];
                int i45 = (iB & 7) << 3;
                this.f26302f = i43 - (((j24 >> i45) & j) == j10 ? 1 : 0);
                int i46 = this.f26300d;
                long j25 = (j24 & (~(j << i45))) | (j9 << i45);
                jArr6[i44] = j25;
                jArr6[(((iB - 7) & i46) + (i46 & 7)) >> 3] = j25;
                return ~iB;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i3 = i19;
        }
    }

    public final int d(Object obj) {
        int i3 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f26300d;
        int i12 = i9 >>> 7;
        while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f26297a;
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i13) & i11;
                if (kotlin.jvm.internal.m.a(this.f26298b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i12 = i13 + i3;
        }
    }

    public final void e(int i3) {
        long[] jArr;
        int iMax = i3 > 0 ? Math.max(7, P.c(i3)) : 0;
        this.f26300d = iMax;
        if (iMax == 0) {
            jArr = P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.j0(jArr, -9187201950435737472L);
        }
        this.f26297a = jArr;
        int i9 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j)) | j;
        this.f26302f = P.a(this.f26300d) - this.f26301e;
        this.f26298b = new Object[iMax];
        this.f26299c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z6;
        boolean z9 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        if (c9.f26301e != this.f26301e) {
            return false;
        }
        Object[] objArr = this.f26298b;
        int[] iArr = this.f26299c;
        long[] jArr = this.f26297a;
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
                        Object obj2 = objArr[i11];
                        int i12 = iArr[i11];
                        int iD = c9.d(obj2);
                        if (iD < 0 || i12 != c9.f26299c[iD]) {
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

    public final void f(int i3) {
        this.f26301e--;
        long[] jArr = this.f26297a;
        int i9 = this.f26300d;
        int i10 = i3 >> 3;
        int i11 = (i3 & 7) << 3;
        long j = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j;
        jArr[(((i3 - 7) & i9) + (i9 & 7)) >> 3] = j;
        this.f26298b[i3] = null;
    }

    public final void g(int i3, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f26298b[iC] = obj;
        this.f26299c[iC] = i3;
    }

    public final int hashCode() {
        Object[] objArr = this.f26298b;
        int[] iArr = this.f26299c;
        long[] jArr = this.f26297a;
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
                        Object obj = objArr[i11];
                        iHashCode += Integer.hashCode(iArr[i11]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final String toString() {
        if (this.f26301e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f26298b;
        int[] iArr = this.f26299c;
        long[] jArr = this.f26297a;
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
                            Object obj = objArr[i12];
                            int i13 = iArr[i12];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i13);
                            i9++;
                            if (i9 < this.f26301e) {
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
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public C() {
        this(6);
    }
}
