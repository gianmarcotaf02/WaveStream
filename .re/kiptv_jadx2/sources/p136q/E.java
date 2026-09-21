package p136q;

import A0.b;
import androidx.media3.common.util.Log;
import java.util.Arrays;
import java.util.Collection;
import p078i6.m;
import p078i6.o;
import p144r.a;

public final class E {

    public long[] f26306a = P.f26351a;

    public Object[] f26307b = a.f26671c;

    public long[] f26308c = AbstractC2674s.f26419b;

    public int f26309d = Log.LOG_LEVEL_OFF;

    public int f26310e = Log.LOG_LEVEL_OFF;

    public int f26311f;
    public int g;

    public int f26312h;

    public E(int i3) {
        if (i3 >= 0) {
            f(P.d(i3));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i3 = this.g;
        int iD = d(obj);
        this.f26307b[iD] = obj;
        long[] jArr = this.f26308c;
        int i9 = this.f26309d;
        jArr[iD] = (((long) i9) & 2147483647L) | 4611686016279904256L;
        if (i9 != Integer.MAX_VALUE) {
            jArr[i9] = ((((long) iD) & 2147483647L) << 31) | (jArr[i9] & (-4611686016279904257L));
        }
        this.f26309d = iD;
        if (this.f26310e == Integer.MAX_VALUE) {
            this.f26310e = iD;
        }
        return this.g != i3;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.f26306a;
        if (jArr != P.f26351a) {
            m.j0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f26306a;
            int i3 = this.f26311f;
            int i9 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j)) | j;
        }
        m.h0(this.f26307b, null, 0, this.f26311f);
        m.j0(this.f26308c, 4611686018427387903L);
        this.f26309d = Log.LOG_LEVEL_OFF;
        this.f26310e = Log.LOG_LEVEL_OFF;
        this.f26312h = P.a(this.f26311f) - this.g;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i9 = i3 & 127;
        int i10 = this.f26311f;
        int i11 = (i3 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f26306a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (((long) i9) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (kotlin.jvm.internal.m.a(this.f26307b[iNumberOfTrailingZeros], obj)) {
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

    public final int d(Object obj) {
        int i3;
        long j;
        long j9;
        long j10;
        char c9;
        long[] jArr;
        int i9 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f26311f;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr2 = this.f26306a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr2[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr2[i16] >>> i17);
            long j12 = i12;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                int i18 = i9;
                if (kotlin.jvm.internal.m.a(this.f26307b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i9 = i18;
            }
            int i19 = i9;
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i11);
                long j15 = 255;
                if (this.f26312h != 0 || ((this.f26306a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i3 = 0;
                    j = j12;
                    j9 = 255;
                    j10 = 128;
                } else {
                    int i20 = this.f26311f;
                    if (i20 > 8) {
                        c9 = 31;
                        j10 = 128;
                        if (Long.compare((((long) this.g) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26306a;
                            if (jArr3 == null) {
                                i3 = 0;
                                j = j12;
                                j9 = 255;
                            } else {
                                int i21 = this.f26311f;
                                Object[] objArr = this.f26307b;
                                long[] jArr4 = this.f26308c;
                                long[] jArr5 = new long[i21];
                                Arrays.fill(jArr5, 0, i21, 9223372034707292159L);
                                i3 = 0;
                                int i22 = (i21 + 7) >> 3;
                                int i23 = 0;
                                while (i23 < i22) {
                                    long j16 = j15;
                                    long j17 = jArr3[i23] & (-9187201950435737472L);
                                    int i24 = i23;
                                    jArr3[i24] = ((~j17) + (j17 >>> 7)) & (-72340172838076674L);
                                    i23 = i24 + 1;
                                    j15 = j16;
                                }
                                j9 = j15;
                                int length = jArr3.length;
                                int i25 = length - 1;
                                int i26 = length - 2;
                                jArr3[i26] = (jArr3[i26] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i25] = jArr3[0];
                                int i27 = 0;
                                while (i27 != i21) {
                                    int i28 = i27 >> 3;
                                    int i29 = (i27 & 7) << 3;
                                    long j18 = (jArr3[i28] >> i29) & j9;
                                    if (j18 != 128 && j18 == 254) {
                                        Object obj2 = objArr[i27];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i19;
                                        int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i31 = i30 >>> 7;
                                        int iE2 = e(i31);
                                        int i32 = i31 & i21;
                                        if (((iE2 - i32) & i21) / 8 == ((i27 - i32) & i21) / 8) {
                                            int i33 = i21;
                                            Object[] objArr2 = objArr;
                                            jArr3[i28] = (jArr3[i28] & (~(j9 << i29))) | (((long) (i30 & 127)) << i29);
                                            if (jArr5[i27] == 9223372034707292159L) {
                                                long j19 = i27;
                                                jArr5[i27] = j19 | (j19 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i27++;
                                            i21 = i33;
                                            objArr = objArr2;
                                        } else {
                                            int i34 = i21;
                                            Object[] objArr3 = objArr;
                                            int i35 = iE2 >> 3;
                                            long j20 = jArr3[i35];
                                            int i36 = (iE2 & 7) << 3;
                                            if (((j20 >> i36) & j9) == 128) {
                                                jArr3[i35] = (j20 & (~(j9 << i36))) | (((long) (i30 & 127)) << i36);
                                                jArr3[i28] = (jArr3[i28] & (~(j9 << i29))) | (128 << i29);
                                                objArr3[iE2] = objArr3[i27];
                                                objArr3[i27] = null;
                                                jArr4[iE2] = jArr4[i27];
                                                jArr4[i27] = 4611686018427387903L;
                                                int i37 = (int) ((jArr5[i27] >> 32) & 4294967295L);
                                                int i38 = Log.LOG_LEVEL_OFF;
                                                if (i37 != Integer.MAX_VALUE) {
                                                    jArr5[i37] = ((long) iE2) | (jArr5[i37] & (-4294967296L));
                                                    jArr5[i27] = (jArr5[i27] & 4294967295L) | (-4294967296L);
                                                    i38 = Log.LOG_LEVEL_OFF;
                                                } else {
                                                    jArr5[i27] = (((long) Log.LOG_LEVEL_OFF) << 32) | ((long) iE2);
                                                }
                                                jArr5[iE2] = (((long) i27) << 32) | ((long) i38);
                                            } else {
                                                j12 = j12;
                                                jArr3[i35] = (((long) (i30 & 127)) << i36) | (j20 & (~(j9 << i36)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i27];
                                                objArr3[i27] = obj3;
                                                long j21 = jArr4[iE2];
                                                jArr4[iE2] = jArr4[i27];
                                                jArr4[i27] = j21;
                                                int i39 = (int) ((jArr5[i27] >> 32) & 4294967295L);
                                                if (i39 != Integer.MAX_VALUE) {
                                                    long j22 = iE2;
                                                    jArr5[i39] = (jArr5[i39] & (-4294967296L)) | j22;
                                                    jArr5[i27] = (jArr5[i27] & 4294967295L) | (j22 << 32);
                                                } else {
                                                    long j23 = iE2;
                                                    jArr5[i27] = j23 | (j23 << 32);
                                                    i39 = i27;
                                                }
                                                jArr5[iE2] = (((long) i39) << 32) | ((long) i27);
                                                i27--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i27++;
                                            i21 = i34;
                                            objArr = objArr3;
                                            j12 = j12;
                                        }
                                    } else {
                                        i27++;
                                    }
                                }
                                j = j12;
                                this.f26312h = P.a(this.f26311f) - this.g;
                                long[] jArr6 = this.f26308c;
                                int length2 = jArr6.length;
                                for (int i40 = 0; i40 < length2; i40++) {
                                    long j24 = jArr6[i40];
                                    int i41 = (int) ((j24 >> 31) & 2147483647L);
                                    int i42 = (int) (j24 & 2147483647L);
                                    jArr6[i40] = (((j24 & (-4611686018427387904L)) | ((long) (i41 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i41] & 4294967295L)))) << 31) | ((long) (i42 == Integer.MAX_VALUE ? Log.LOG_LEVEL_OFF : (int) (jArr5[i42] & 4294967295L)));
                                }
                                int i43 = this.f26309d;
                                if (i43 != Integer.MAX_VALUE) {
                                    this.f26309d = (int) (jArr5[i43] & 4294967295L);
                                }
                                int i44 = this.f26310e;
                                if (i44 != Integer.MAX_VALUE) {
                                    this.f26310e = (int) (jArr5[i44] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i11);
                    } else {
                        c9 = 31;
                        j10 = 128;
                    }
                    i3 = 0;
                    j = j12;
                    j9 = 255;
                    int iB = P.b(this.f26311f);
                    long[] jArr7 = this.f26306a;
                    Object[] objArr4 = this.f26307b;
                    long[] jArr8 = this.f26308c;
                    int i45 = this.f26311f;
                    int[] iArr = new int[i45];
                    f(iB);
                    long[] jArr9 = this.f26306a;
                    Object[] objArr5 = this.f26307b;
                    long[] jArr10 = this.f26308c;
                    int i46 = this.f26311f;
                    int i47 = 0;
                    while (i47 < i45) {
                        if (((jArr7[i47 >> 3] >> ((i47 & 7) << 3)) & 255) < j10) {
                            Object obj4 = objArr4[i47];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i19;
                            int i48 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i48 >>> 7);
                            jArr = jArr9;
                            long j25 = i48 & 127;
                            int i49 = iE3 >> 3;
                            int i50 = (iE3 & 7) << 3;
                            long j26 = (jArr[i49] & (~(255 << i50))) | (j25 << i50);
                            jArr[i49] = j26;
                            jArr[(((iE3 - 7) & i46) + (i46 & 7)) >> 3] = j26;
                            objArr5[iE3] = obj4;
                            jArr10[iE3] = jArr8[i47];
                            iArr[i47] = iE3;
                        } else {
                            jArr = jArr9;
                        }
                        i47++;
                        jArr7 = jArr7;
                        jArr9 = jArr;
                    }
                    long[] jArr11 = this.f26308c;
                    int length3 = jArr11.length;
                    for (int i51 = 0; i51 < length3; i51++) {
                        long j27 = jArr11[i51];
                        int i52 = (int) ((j27 >> c9) & 2147483647L);
                        int i53 = (int) (j27 & 2147483647L);
                        jArr11[i51] = (((j27 & (-4611686018427387904L)) | ((long) (i52 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i52]))) << c9) | ((long) (i53 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i53]));
                    }
                    int i54 = this.f26309d;
                    if (i54 != Integer.MAX_VALUE) {
                        this.f26309d = iArr[i54];
                    }
                    int i55 = this.f26310e;
                    if (i55 != Integer.MAX_VALUE) {
                        this.f26310e = iArr[i55];
                    }
                    iE = e(i11);
                }
                this.g++;
                int i56 = this.f26312h;
                long[] jArr12 = this.f26306a;
                int i57 = iE >> 3;
                long j28 = jArr12[i57];
                int i58 = (iE & 7) << 3;
                if (((j28 >> i58) & j9) == j10) {
                    i3 = 1;
                }
                this.f26312h = i56 - i3;
                int i59 = this.f26311f;
                long j29 = (j28 & (~(j9 << i58))) | (j << i58);
                jArr12[i57] = j29;
                jArr12[(((iE - 7) & i59) + (i59 & 7)) >> 3] = j29;
                return iE;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i9 = i19;
        }
    }

    public final int e(int i3) {
        int i9 = this.f26311f;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26306a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e6 = (E) obj;
        if (e6.g != this.g) {
            return false;
        }
        Object[] objArr = this.f26307b;
        long[] jArr = this.f26306a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128 && !e6.c(objArr[(i3 << 3) + i10])) {
                            return false;
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
        return true;
    }

    public final void f(int i3) {
        long[] jArr;
        long[] jArr2;
        int iMax = i3 > 0 ? Math.max(7, P.c(i3)) : 0;
        this.f26311f = iMax;
        if (iMax == 0) {
            jArr = P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.j0(jArr, -9187201950435737472L);
        }
        this.f26306a = jArr;
        int i9 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j)) | j;
        this.f26312h = P.a(this.f26311f) - this.g;
        this.f26307b = iMax == 0 ? a.f26671c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC2674s.f26419b;
        } else {
            jArr2 = new long[iMax];
            m.j0(jArr2, 4611686018427387903L);
        }
        this.f26308c = jArr2;
    }

    public final boolean g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i9 = i3 & 127;
        int i10 = this.f26311f;
        int i11 = (i3 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f26306a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (((long) i9) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (kotlin.jvm.internal.m.a(this.f26307b[iNumberOfTrailingZeros], obj)) {
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
            h(iNumberOfTrailingZeros);
        }
        return z6;
    }

    public final void h(int i3) {
        this.g--;
        long[] jArr = this.f26306a;
        int i9 = this.f26311f;
        int i10 = i3 >> 3;
        int i11 = (i3 & 7) << 3;
        long j = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j;
        jArr[(((i3 - 7) & i9) + (i9 & 7)) >> 3] = j;
        this.f26307b[i3] = null;
        long[] jArr2 = this.f26308c;
        long j9 = jArr2[i3];
        int i12 = (int) ((j9 >> 31) & 2147483647L);
        int i13 = (int) (j9 & 2147483647L);
        if (i12 != Integer.MAX_VALUE) {
            jArr2[i12] = (jArr2[i12] & (-2147483648L)) | (((long) i13) & 2147483647L);
        } else {
            this.f26309d = i13;
        }
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = ((((long) i12) & 2147483647L) << 31) | (jArr2[i13] & (-4611686016279904257L));
        } else {
            this.f26310e = i12;
        }
        jArr2[i3] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f26311f * 31) + this.g;
        Object[] objArr = this.f26307b;
        long[] jArr = this.f26306a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i10];
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

    public final boolean i(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Object[] objArr = this.f26307b;
        int i3 = this.g;
        long[] jArr = this.f26306a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j = jArr[i9];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i9 != length) {
                        break;
                        break;
                    }
                    i9++;
                } else {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i9 << 3) + i11;
                            if (!o.b1(elements, objArr[i12])) {
                                h(i12);
                            }
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i9 != length) {
                        break;
                    }
                    i9++;
                }
            }
        }
        return i3 != this.g;
    }

    public final String toString() {
        b bVar = new b(19, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f26307b;
        long[] jArr = this.f26308c;
        int i3 = this.f26310e;
        int i9 = 0;
        while (i3 != Integer.MAX_VALUE) {
            int i10 = (int) ((jArr[i3] >> 31) & 2147483647L);
            Object obj = objArr[i3];
            if (i9 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                return string;
            }
            if (i9 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) bVar.invoke(obj));
            i9++;
            i3 = i10;
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        kotlin.jvm.internal.m.d(string2, "toString(...)");
        return string2;
    }
}
