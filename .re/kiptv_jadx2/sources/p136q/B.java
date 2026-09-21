package p136q;

import kotlin.jvm.internal.m;
import p144r.a;

public final class B {

    public long[] f26291a = P.f26351a;

    public Object[] f26292b = a.f26671c;

    public float[] f26293c = AbstractC2665i.f26394a;

    public int f26294d;

    public int f26295e;

    public int f26296f;

    public B(int i3) {
        if (i3 >= 0) {
            c(P.d(i3));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i3) {
        int i9 = this.f26294d;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26291a;
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

    public final int b(Object obj) {
        int i3 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f26294d;
        int i12 = i9 >>> 7;
        while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f26291a;
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i13) & i11;
                if (m.a(this.f26292b[iNumberOfTrailingZeros], obj)) {
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

    public final void c(int i3) {
        long[] jArr;
        int iMax = i3 > 0 ? Math.max(7, P.c(i3)) : 0;
        this.f26294d = iMax;
        if (iMax == 0) {
            jArr = P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p078i6.m.j0(jArr, -9187201950435737472L);
        }
        this.f26291a = jArr;
        int i9 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j)) | j;
        this.f26296f = P.a(this.f26294d) - this.f26295e;
        this.f26292b = new Object[iMax];
        this.f26293c = new float[iMax];
    }

    public final void d(String str, float f9) {
        long j;
        long j9;
        int i3;
        long[] jArr;
        Object[] objArr;
        String str2 = str;
        int i9 = -862048943;
        int iHashCode = (str2 != null ? str2.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f26294d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f26291a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            long j10 = ((jArr2[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr2[i16] >>> i17);
            long j11 = i12;
            int i19 = i12;
            int i20 = 0;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j14) >> 3)) & i13;
                int i21 = i9;
                if (m.a(this.f26292b[iNumberOfTrailingZeros], str2)) {
                    i3 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j14 &= j14 - 1;
                    i9 = i21;
                }
            }
            int i22 = i9;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iA = a(i11);
                long j15 = 255;
                if (this.f26296f != 0 || ((this.f26291a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j9 = 128;
                } else {
                    int i23 = this.f26294d;
                    if (i23 > 8) {
                        j9 = 128;
                        if (Long.compare((((long) this.f26295e) * 32) ^ Long.MIN_VALUE, (((long) i23) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26291a;
                            int i24 = this.f26294d;
                            Object[] objArr2 = this.f26292b;
                            float[] fArr = this.f26293c;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
                            while (i26 < i25) {
                                long j16 = j15;
                                long j17 = jArr3[i26] & j13;
                                jArr3[i26] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i26++;
                                j15 = j16;
                                j13 = -9187201950435737472L;
                            }
                            j = j15;
                            int iP0 = p078i6.m.p0(jArr3);
                            int i27 = iP0 - 1;
                            long j18 = 72057594037927935L;
                            jArr3[i27] = (jArr3[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iP0] = jArr3[0];
                            int i28 = 0;
                            while (i28 != i24) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j19 = (jArr3[i29] >> i30) & j;
                                if (j19 != 128 && j19 == 254) {
                                    Object obj = objArr2[i28];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i22;
                                    int i31 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i32 = i31 >>> 7;
                                    int iA2 = a(i32);
                                    int i33 = i32 & i24;
                                    long j20 = j18;
                                    if (((iA2 - i33) & i24) / 8 == ((i28 - i33) & i24) / 8) {
                                        objArr = objArr2;
                                        jArr3[i29] = ((~(j << i30)) & jArr3[i29]) | (((long) (i31 & 127)) << i30);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j20) | Long.MIN_VALUE;
                                    } else {
                                        objArr = objArr2;
                                        int i34 = iA2 >> 3;
                                        long j21 = jArr3[i34];
                                        int i35 = (iA2 & 7) << 3;
                                        if (((j21 >> i35) & j) == 128) {
                                            jArr3[i34] = ((~(j << i35)) & j21) | (((long) (i31 & 127)) << i35);
                                            jArr3[i29] = (jArr3[i29] & (~(j << i30))) | (128 << i30);
                                            objArr[iA2] = objArr[i28];
                                            objArr[i28] = null;
                                            fArr[iA2] = fArr[i28];
                                            fArr[i28] = 0.0f;
                                        } else {
                                            jArr3[i34] = (((long) (i31 & 127)) << i35) | ((~(j << i35)) & j21);
                                            Object obj2 = objArr[iA2];
                                            objArr[iA2] = objArr[i28];
                                            objArr[i28] = obj2;
                                            float f10 = fArr[iA2];
                                            fArr[iA2] = fArr[i28];
                                            fArr[i28] = f10;
                                            i28--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j20) | Long.MIN_VALUE;
                                    }
                                    i28++;
                                    i24 = i24;
                                    j18 = j20;
                                    objArr2 = objArr;
                                } else {
                                    i28++;
                                }
                            }
                            this.f26296f = P.a(this.f26294d) - this.f26295e;
                        }
                        iA = a(i11);
                    } else {
                        j9 = 128;
                    }
                    j = 255;
                    int iB = P.b(this.f26294d);
                    long[] jArr4 = this.f26291a;
                    Object[] objArr3 = this.f26292b;
                    float[] fArr2 = this.f26293c;
                    int i36 = this.f26294d;
                    c(iB);
                    long[] jArr5 = this.f26291a;
                    Object[] objArr4 = this.f26292b;
                    float[] fArr3 = this.f26293c;
                    int i37 = this.f26294d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr4[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < j9) {
                            Object obj3 = objArr3[i38];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : i20) * i22;
                            int i39 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i39 >>> 7);
                            int i40 = i39 & 127;
                            jArr = jArr5;
                            int i41 = iA3 >> 3;
                            int i42 = (iA3 & 7) << 3;
                            long j22 = (jArr[i41] & (~(255 << i42))) | (((long) i40) << i42);
                            jArr[i41] = j22;
                            jArr[(((iA3 - 7) & i37) + (i37 & 7)) >> 3] = j22;
                            objArr4[iA3] = obj3;
                            fArr3[iA3] = fArr2[i38];
                        } else {
                            jArr = jArr5;
                        }
                        i38++;
                        jArr5 = jArr;
                        i20 = 0;
                    }
                    iA = a(i11);
                }
                this.f26295e++;
                int i43 = this.f26296f;
                long[] jArr6 = this.f26291a;
                int i44 = iA >> 3;
                long j23 = jArr6[i44];
                int i45 = (iA & 7) << 3;
                if (((j23 >> i45) & j) != j9) {
                    i18 = 0;
                }
                this.f26296f = i43 - i18;
                int i46 = this.f26294d;
                long j24 = (j23 & (~(j << i45))) | (j11 << i45);
                jArr6[i44] = j24;
                jArr6[(((iA - 7) & i46) + (i46 & 7)) >> 3] = j24;
                i3 = ~iA;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            str2 = str;
            i12 = i19;
            i9 = i22;
        }
        if (i3 < 0) {
            i3 = ~i3;
        }
        this.f26292b[i3] = str;
        this.f26293c[i3] = f9;
    }

    public final boolean equals(Object obj) {
        boolean z6;
        boolean z9 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b9 = (B) obj;
        if (b9.f26295e != this.f26295e) {
            return false;
        }
        Object[] objArr = this.f26292b;
        float[] fArr = this.f26293c;
        long[] jArr = this.f26291a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((255 & j) < 128) {
                        int i11 = (i3 << 3) + i10;
                        Object obj2 = objArr[i11];
                        float f9 = fArr[i11];
                        int iB = b9.b(obj2);
                        if (iB < 0 || f9 != b9.f26293c[iB]) {
                            return false;
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
    }

    public final int hashCode() {
        Object[] objArr = this.f26292b;
        float[] fArr = this.f26293c;
        long[] jArr = this.f26291a;
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
                        iHashCode += Float.hashCode(fArr[i11]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f26295e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f26292b;
        float[] fArr = this.f26293c;
        long[] jArr = this.f26291a;
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
                            float f9 = fArr[i12];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f9);
                            i9++;
                            if (i9 < this.f26295e) {
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
        m.d(string, "toString(...)");
        return string;
    }
}
