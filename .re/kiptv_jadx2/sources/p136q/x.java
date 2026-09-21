package p136q;

import p078i6.m;
import p144r.a;

public final class x {

    public long[] f26433a;

    public int[] f26434b;

    public int f26435c;

    public int f26436d;

    public int f26437e;

    public x(int i3) {
        this.f26433a = P.f26351a;
        this.f26434b = AbstractC2670n.f26403a;
        if (i3 >= 0) {
            d(P.d(i3));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(int i3) {
        boolean z6;
        long j;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int i9;
        int i10 = this.f26436d;
        int i11 = -862048943;
        int iHashCode = Integer.hashCode(i3) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f26435c;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f26433a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            boolean z9 = true;
            int i20 = i17;
            long j9 = (((-i19) >> 63) & (jArr2[i18 + 1] << (64 - i19))) | (jArr2[i18] >>> i19);
            long j10 = i14;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L);
            while (j12 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i16) & i15;
                int i21 = i11;
                if (this.f26434b[iNumberOfTrailingZeros] == i3) {
                    z6 = true;
                    break loop0;
                }
                j12 &= j12 - 1;
                i11 = i21;
            }
            int i22 = i11;
            long j13 = j9 & ((~j9) << 6) & (-9187201950435737472L);
            char c9 = '\b';
            if (j13 != 0) {
                int iC = c(i13);
                if (this.f26437e != 0 || ((this.f26433a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    z6 = true;
                    j = 128;
                } else {
                    int i23 = this.f26435c;
                    if (i23 > 8) {
                        char c10 = 7;
                        if (Long.compare((((long) this.f26436d) * 32) ^ Long.MIN_VALUE, (((long) i23) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f26433a;
                            int i24 = this.f26435c;
                            int[] iArr2 = this.f26434b;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
                            while (i26 < i25) {
                                char c11 = c9;
                                char c12 = c10;
                                long j14 = jArr3[i26] & (-9187201950435737472L);
                                jArr3[i26] = (-72340172838076674L) & ((~j14) + (j14 >>> c12));
                                i26++;
                                c10 = c12;
                                c9 = c11;
                            }
                            j = 128;
                            int iP0 = m.p0(jArr3);
                            int i27 = iP0 - 1;
                            jArr3[i27] = (jArr3[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iP0] = jArr3[0];
                            int i28 = 0;
                            while (i28 != i24) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j15 = (jArr3[i29] >> i30) & 255;
                                if (j15 != 128 && j15 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i28]) * i22;
                                    int i31 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i32 = i31 >>> 7;
                                    int iC2 = c(i32);
                                    int i33 = i32 & i24;
                                    boolean z10 = z9;
                                    if (((iC2 - i33) & i24) / 8 == ((i28 - i33) & i24) / 8) {
                                        iArr = iArr2;
                                        jArr3[i29] = ((~(255 << i30)) & jArr3[i29]) | (((long) (i31 & 127)) << i30);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                    } else {
                                        iArr = iArr2;
                                        int i34 = i28;
                                        int i35 = iC2 >> 3;
                                        long j16 = jArr3[i35];
                                        int i36 = (iC2 & 7) << 3;
                                        if (((j16 >> i36) & 255) == 128) {
                                            jArr3[i35] = (j16 & (~(255 << i36))) | (((long) (i31 & 127)) << i36);
                                            jArr3[i29] = (jArr3[i29] & (~(255 << i30))) | (128 << i30);
                                            iArr[iC2] = iArr[i34];
                                            iArr[i34] = 0;
                                            i9 = i34;
                                        } else {
                                            jArr3[i35] = (((long) (i31 & 127)) << i36) | (j16 & (~(255 << i36)));
                                            int i37 = iArr[iC2];
                                            iArr[iC2] = iArr[i34];
                                            iArr[i34] = i37;
                                            i9 = i34 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28 = i9 + 1;
                                    }
                                    iArr2 = iArr;
                                    z9 = z10;
                                } else {
                                    i28++;
                                }
                            }
                            z6 = z9;
                            this.f26437e = P.a(this.f26435c) - this.f26436d;
                        }
                        iC = c(i13);
                    }
                    z6 = true;
                    j = 128;
                    int iB = P.b(this.f26435c);
                    long[] jArr4 = this.f26433a;
                    int[] iArr3 = this.f26434b;
                    int i38 = this.f26435c;
                    d(iB);
                    long[] jArr5 = this.f26433a;
                    int[] iArr4 = this.f26434b;
                    int i39 = this.f26435c;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr4[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            int i41 = iArr3[i40];
                            int iHashCode3 = Integer.hashCode(i41) * i22;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC3 = c(i42 >>> 7);
                            jArr = jArr5;
                            long j17 = i42 & 127;
                            int i43 = iC3 >> 3;
                            int i44 = (iC3 & 7) << 3;
                            long j18 = (jArr[i43] & (~(255 << i44))) | (j17 << i44);
                            jArr[i43] = j18;
                            jArr[(((iC3 - 7) & i39) + (i39 & 7)) >> 3] = j18;
                            iArr4[iC3] = i41;
                        } else {
                            jArr = jArr5;
                        }
                        i40++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iC = c(i13);
                }
                iNumberOfTrailingZeros = iC;
                this.f26436d++;
                int i45 = this.f26437e;
                long[] jArr6 = this.f26433a;
                int i46 = iNumberOfTrailingZeros >> 3;
                long j19 = jArr6[i46];
                int i47 = (iNumberOfTrailingZeros & 7) << 3;
                this.f26437e = i45 - (((j19 >> i47) & 255) == j ? z6 : 0);
                int i48 = this.f26435c;
                long j20 = (j19 & (~(255 << i47))) | (j10 << i47);
                jArr6[i46] = j20;
                jArr6[(((iNumberOfTrailingZeros - 7) & i48) + (i48 & 7)) >> 3] = j20;
                break;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
            i11 = i22;
        }
        this.f26434b[iNumberOfTrailingZeros] = i3;
        if (this.f26436d != i10) {
            return z6;
        }
        return false;
    }

    public final boolean b(int i3) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i3) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f26435c;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f26433a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f26434b[iNumberOfTrailingZeros] == i3) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int c(int i3) {
        int i9 = this.f26435c;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26433a;
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

    public final void d(int i3) {
        long[] jArr;
        int iMax = i3 > 0 ? Math.max(7, P.c(i3)) : 0;
        this.f26435c = iMax;
        if (iMax == 0) {
            jArr = P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.j0(jArr, -9187201950435737472L);
        }
        this.f26433a = jArr;
        int i9 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j)) | j;
        this.f26437e = P.a(this.f26435c) - this.f26436d;
        this.f26434b = new int[iMax];
    }

    public final boolean e(int i3) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i3) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f26435c;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f26433a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f26434b[iNumberOfTrailingZeros] == i3) {
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
        boolean z6 = iNumberOfTrailingZeros >= 0;
        if (z6) {
            f(iNumberOfTrailingZeros);
        }
        return z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f26436d != this.f26436d) {
            return false;
        }
        int[] iArr = this.f26434b;
        long[] jArr = this.f26433a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128 && !xVar.b(iArr[(i3 << 3) + i10])) {
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
        this.f26436d--;
        long[] jArr = this.f26433a;
        int i9 = this.f26435c;
        int i10 = i3 >> 3;
        int i11 = (i3 & 7) << 3;
        long j = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        jArr[i10] = j;
        jArr[(((i3 - 7) & i9) + (i9 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.f26434b;
        long[] jArr = this.f26433a;
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
                        iHashCode = Integer.hashCode(iArr[(i3 << 3) + i10]) + iHashCode;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f26434b;
        long[] jArr = this.f26433a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
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
                        int i12 = iArr[(i3 << 3) + i11];
                        if (i9 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i9 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i12);
                        i9++;
                    }
                    j >>= 8;
                }
                if (i10 == 8) {
                    if (i3 == length) {
                        i3++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i3 == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i3++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public x() {
        this(6);
    }
}
