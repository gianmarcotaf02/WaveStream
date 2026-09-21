package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1821z2 implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.gms.internal.cast.C1821z2 j = new com.google.android.gms.internal.cast.C1821z2(com.google.android.gms.internal.cast.J2.f18780b);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19180h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f19181i;

    static {
        int i3 = com.google.android.gms.internal.cast.AbstractC1809w2.f19165a;
    }

    public C1821z2(byte[] bArr) {
        bArr.getClass();
        this.f19181i = bArr;
    }

    public static void n(int i3) {
        if (((i3 - 47) | 47) < 0) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.l(i3, "End index: 47 >= "));
        }
    }

    public byte d(int i3) {
        return this.f19181i[i3];
    }

    public byte e(int i3) {
        return this.f19181i[i3];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.cast.C1821z2) && f() == ((com.google.android.gms.internal.cast.C1821z2) obj).f()) {
            if (f() == 0) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.internal.cast.C1821z2)) {
                return obj.equals(this);
            }
            com.google.android.gms.internal.cast.C1821z2 c1821z2 = (com.google.android.gms.internal.cast.C1821z2) obj;
            int i3 = this.f19180h;
            int i9 = c1821z2.f19180h;
            if (i3 == 0 || i9 == 0 || i3 == i9) {
                int iF = f();
                if (iF > c1821z2.f()) {
                    throw new java.lang.IllegalArgumentException("Length too large: " + iF + f());
                }
                if (iF > c1821z2.f()) {
                    throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(iF, c1821z2.f(), "Ran off end of other: 0, ", ", "));
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < iF) {
                    if (this.f19181i[i10] == c1821z2.f19181i[i11]) {
                        i10++;
                        i11++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f19181i.length;
    }

    public final int hashCode() {
        int i3 = this.f19180h;
        if (i3 != 0) {
            return i3;
        }
        int iF = f();
        java.nio.charset.Charset charset = com.google.android.gms.internal.cast.J2.f18779a;
        int i9 = iF;
        for (int i10 = 0; i10 < iF; i10++) {
            i9 = (i9 * 31) + this.f19181i[i10];
        }
        int i11 = i9 != 0 ? i9 : 1;
        this.f19180h = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.C1497d(this);
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int iF = f();
        if (f() <= 50) {
            strConcat = com.google.android.gms.internal.cast.H.e(this);
        } else {
            n(f());
            strConcat = com.google.android.gms.internal.cast.H.e(new com.google.android.gms.internal.cast.C1813x2(this.f19181i)).concat("...");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iF);
        sb.append(" contents=\"");
        return Y6.f.m(sb, strConcat, "\">");
    }
}
