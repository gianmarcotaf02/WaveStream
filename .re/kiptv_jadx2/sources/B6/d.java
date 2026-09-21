package B6;

import R8.i;
import Y6.f;
import kotlin.jvm.internal.m;
import p121o0.p;

public abstract class d {

    public static final c f817h = new c();

    public static final a f818i;

    static {
        Integer num = p151r6.a.f26885a;
        f818i = (num == null || num.intValue() >= 34) ? new C6.a() : new b();
    }

    public abstract int a(int i3);

    public void b(byte[] array) {
        m.e(array, "array");
        c(array, array.length);
    }

    public byte[] c(byte[] array, int i3) {
        m.e(array, "array");
        if (array.length < 0 || i3 < 0 || i3 > array.length) {
            throw new IllegalArgumentException(f.j(p.t(i3, "fromIndex (0) or toIndex (", ") are out of range: 0.."), array.length, '.').toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(f.f(i3, "fromIndex (0) must be not greater than toIndex (", ").").toString());
        }
        int i9 = i3 / 4;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int iD = d();
            array[i10] = (byte) iD;
            array[i10 + 1] = (byte) (iD >>> 8);
            array[i10 + 2] = (byte) (iD >>> 16);
            array[i10 + 3] = (byte) (iD >>> 24);
            i10 += 4;
        }
        int i12 = i3 - i10;
        int iA = a(i12 * 8);
        for (int i13 = 0; i13 < i12; i13++) {
            array[i10 + i13] = (byte) (iA >>> (i13 * 8));
        }
        return array;
    }

    public abstract int d();

    public int e(int i3) {
        return f(0, i3);
    }

    public int f(int i3, int i9) {
        int iD;
        int i10;
        int iA;
        if (i9 <= i3) {
            throw new IllegalArgumentException(i.g(Integer.valueOf(i3), Integer.valueOf(i9)).toString());
        }
        int i11 = i9 - i3;
        if (i11 > 0 || i11 == Integer.MIN_VALUE) {
            if (((-i11) & i11) == i11) {
                iA = a(31 - Integer.numberOfLeadingZeros(i11));
            } else {
                do {
                    iD = d() >>> 1;
                    i10 = iD % i11;
                } while ((i11 - 1) + (iD - i10) < 0);
                iA = i10;
            }
            return i3 + iA;
        }
        while (true) {
            int iD2 = d();
            if (i3 <= iD2 && iD2 < i9) {
                return iD2;
            }
        }
    }

    public long g() {
        return (((long) d()) << 32) + ((long) d());
    }

    public long h(long j) {
        return i(0L, j);
    }

    public long i(long j, long j9) {
        long jG;
        long j10;
        long jA;
        int iD;
        if (j9 <= j) {
            throw new IllegalArgumentException(i.g(Long.valueOf(j), Long.valueOf(j9)).toString());
        }
        long j11 = j9 - j;
        if (j11 > 0) {
            if (((-j11) & j11) == j11) {
                int i3 = (int) j11;
                int i9 = (int) (j11 >>> 32);
                if (i3 != 0) {
                    iD = a(31 - Integer.numberOfLeadingZeros(i3));
                } else if (i9 == 1) {
                    iD = d();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i9))) << 32) + (((long) d()) & 4294967295L);
                }
                jA = ((long) iD) & 4294967295L;
            } else {
                do {
                    jG = g() >>> 1;
                    j10 = jG % j11;
                } while ((j11 - 1) + (jG - j10) < 0);
                jA = j10;
            }
            return j + jA;
        }
        while (true) {
            long jG2 = g();
            if (j <= jG2 && jG2 < j9) {
                return jG2;
            }
        }
    }
}
