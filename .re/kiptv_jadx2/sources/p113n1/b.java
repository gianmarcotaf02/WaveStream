package p113n1;

import Y6.f;

public abstract class b {
    public static final long a(int i3, int i9, int i10, int i11) {
        if (!((i10 >= 0) & (i9 >= i3) & (i11 >= i10) & (i3 >= 0))) {
            j.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i3, i9, i10, i11);
    }

    public static long b(int i3, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i10 & 8) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        return a(0, i3, 0, i9);
    }

    public static final int c(int i3) {
        if (i3 < 8191) {
            return 13;
        }
        if (i3 < 32767) {
            return 15;
        }
        if (i3 < 65535) {
            return 16;
        }
        return i3 < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j9) {
        int i3 = (int) (j9 >> 32);
        int iJ = a.j(j);
        int iH = a.h(j);
        if (i3 < iJ) {
            i3 = iJ;
        }
        if (i3 <= iH) {
            iH = i3;
        }
        int i9 = (int) (j9 & 4294967295L);
        int i10 = a.i(j);
        int iG = a.g(j);
        if (i9 < i10) {
            i9 = i10;
        }
        if (i9 <= iG) {
            iG = i9;
        }
        return (((long) iH) << 32) | (((long) iG) & 4294967295L);
    }

    public static final long e(long j, long j9) {
        int iJ = a.j(j);
        int iH = a.h(j);
        int i3 = a.i(j);
        int iG = a.g(j);
        int iJ2 = a.j(j9);
        if (iJ2 < iJ) {
            iJ2 = iJ;
        }
        if (iJ2 > iH) {
            iJ2 = iH;
        }
        int iH2 = a.h(j9);
        if (iH2 >= iJ) {
            iJ = iH2;
        }
        if (iJ <= iH) {
            iH = iJ;
        }
        int i9 = a.i(j9);
        if (i9 < i3) {
            i9 = i3;
        }
        if (i9 > iG) {
            i9 = iG;
        }
        int iG2 = a.g(j9);
        if (iG2 >= i3) {
            i3 = iG2;
        }
        if (i3 <= iG) {
            iG = i3;
        }
        return a(iJ2, iH, i9, iG);
    }

    public static final int f(int i3, long j) {
        int i9 = a.i(j);
        int iG = a.g(j);
        if (i3 < i9) {
            i3 = i9;
        }
        return i3 > iG ? iG : i3;
    }

    public static final int g(int i3, long j) {
        int iJ = a.j(j);
        int iH = a.h(j);
        if (i3 < iJ) {
            i3 = iJ;
        }
        return i3 > iH ? iH : i3;
    }

    public static final long h(int i3, int i9, int i10, int i11) {
        int i12 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iC = c(i12);
        int i13 = i9 == Integer.MAX_VALUE ? i3 : i9;
        int iC2 = c(i13);
        if (iC + iC2 > 31) {
            j(i13, i12);
        }
        int i14 = i9 + 1;
        int i15 = i11 + 1;
        int i16 = iC2 - 13;
        return (((long) (i14 & (~(i14 >> 31)))) << 33) | ((long) ((i16 >> 1) + (i16 & 1))) | (((long) i3) << 2) | (((long) i10) << (iC2 + 2)) | (((long) (i15 & (~(i15 >> 31)))) << (iC2 + 33));
    }

    public static final long i(int i3, int i9, long j) {
        int iJ = a.j(j) + i3;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = a.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + i3) < 0) {
            iH = 0;
        }
        int i10 = a.i(j) + i9;
        if (i10 < 0) {
            i10 = 0;
        }
        int iG = a.g(j);
        return a(iJ, iH, i10, (iG == Integer.MAX_VALUE || (iG = iG + i9) >= 0) ? iG : 0);
    }

    public static final void j(int i3, int i9) {
        throw new IllegalArgumentException("Can't represent a width of " + i3 + " and height of " + i9 + " in Constraints");
    }

    public static final Void k(int i3) {
        throw new IllegalArgumentException(f.f(i3, "Can't represent a size of ", " in Constraints"));
    }
}
