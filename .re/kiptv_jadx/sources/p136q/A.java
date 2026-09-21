package p136q;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f26286a = p136q.P.f26351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f26287b = p136q.AbstractC2673q.f26414a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26290e;

    public A(int i3) {
        if (i3 >= 0) {
            c(p136q.P.d(i3));
        } else {
            p144r.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = java.lang.Long.hashCode(j) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i9 = i3 & 127;
        int i10 = this.f26288c;
        int i11 = (i3 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f26286a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j9 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = (((long) i9) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i11) & i10;
                if (this.f26287b[iNumberOfTrailingZeros] == j) {
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

    public final int b(int i3) {
        int i9 = this.f26288c;
        int i10 = i3 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f26286a;
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

    public final void c(int i3) {
        long[] jArr;
        int iMax = i3 > 0 ? java.lang.Math.max(7, p136q.P.c(i3)) : 0;
        this.f26288c = iMax;
        if (iMax == 0) {
            jArr = p136q.P.f26351a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p078i6.m.j0(jArr, -9187201950435737472L);
        }
        this.f26286a = jArr;
        int i9 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j)) | j;
        this.f26290e = p136q.P.a(this.f26288c) - this.f26289d;
        this.f26287b = new long[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p136q.A)) {
            return false;
        }
        p136q.A a2 = (p136q.A) obj;
        if (a2.f26289d != this.f26289d) {
            return false;
        }
        long[] jArr = this.f26287b;
        long[] jArr2 = this.f26286a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128 && !a2.a(jArr[(i3 << 3) + i10])) {
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

    public final int hashCode() {
        long[] jArr = this.f26287b;
        long[] jArr2 = this.f26286a;
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
                        iHashCode = java.lang.Long.hashCode(jArr[(i3 << 3) + i10]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        long[] jArr = this.f26287b;
        long[] jArr2 = this.f26286a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((java.lang.CharSequence) "]");
            break;
        }
        int i3 = 0;
        int i9 = 0;
        loop0: while (true) {
            long j = jArr2[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        long j9 = jArr[(i3 << 3) + i11];
                        if (i9 == -1) {
                            sb.append((java.lang.CharSequence) "...");
                            break loop0;
                        }
                        if (i9 != 0) {
                            sb.append((java.lang.CharSequence) ", ");
                        }
                        sb.append(j9);
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
}
