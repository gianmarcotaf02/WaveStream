package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25547a;

    public /* synthetic */ a(long j) {
        this.f25547a = j;
    }

    public static long a(int i3, long j, int i9, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i3 = j(j);
        }
        if ((i12 & 2) != 0) {
            i9 = h(j);
        }
        if ((i12 & 4) != 0) {
            i10 = i(j);
        }
        if ((i12 & 8) != 0) {
            i11 = g(j);
        }
        if (i9 < i3 || i11 < i10 || i3 < 0 || i10 < 0) {
            p113n1.j.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return p113n1.b.h(i3, i9, i10, i11);
    }

    public static final boolean b(long j, long j9) {
        return j == j9;
    }

    public static final boolean c(long j) {
        int i3 = (int) (3 & j);
        int i9 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        return (((int) (j >> (i9 + 46))) & ((1 << (18 - i9)) - 1)) != 0;
    }

    public static final boolean d(long j) {
        int i3 = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i3 = (int) (3 & j);
        int i9 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        int i10 = (1 << (18 - i9)) - 1;
        int i11 = ((int) (j >> (i9 + 15))) & i10;
        int i12 = ((int) (j >> (i9 + 46))) & i10;
        return i11 == (i12 == 0 ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : i12 - 1);
    }

    public static final boolean f(long j) {
        int i3 = (int) (3 & j);
        int i9 = (1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1;
        int i10 = ((int) (j >> 2)) & i9;
        int i11 = ((int) (j >> 33)) & i9;
        return i10 == (i11 == 0 ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : i11 - 1);
    }

    public static final int g(long j) {
        int i3 = (int) (3 & j);
        int i9 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        int i10 = ((int) (j >> (i9 + 46))) & ((1 << (18 - i9)) - 1);
        return i10 == 0 ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : i10 - 1;
    }

    public static final int h(long j) {
        int i3 = (int) (3 & j);
        int i9 = ((int) (j >> 33)) & ((1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1);
        return i9 == 0 ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : i9 - 1;
    }

    public static final int i(long j) {
        int i3 = (int) (3 & j);
        int i9 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        return ((int) (j >> (i9 + 15))) & ((1 << (18 - i9)) - 1);
    }

    public static final int j(long j) {
        int i3 = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1);
    }

    public static final boolean k(long j) {
        int i3 = (int) (3 & j);
        int i9 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i9 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i9 + 46))) & ((1 << (18 - i9)) - 1)) - 1 == 0);
    }

    public static java.lang.String l(long j) {
        int iH = h(j);
        java.lang.String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : java.lang.String.valueOf(iH);
        int iG = g(j);
        java.lang.String strValueOf2 = iG != Integer.MAX_VALUE ? java.lang.String.valueOf(iG) : "Infinity";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Constraints(minWidth = ");
        sb.append(j(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(i(j));
        sb.append(", maxHeight = ");
        return Y6.f.l(sb, strValueOf2, ')');
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p113n1.a) {
            return this.f25547a == ((p113n1.a) obj).f25547a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f25547a);
    }

    public final java.lang.String toString() {
        return l(this.f25547a);
    }
}
