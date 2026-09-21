package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1500g implements java.lang.Iterable, java.io.Serializable {
    public static final androidx.datastore.preferences.protobuf.C1500g j = new androidx.datastore.preferences.protobuf.C1500g(androidx.datastore.preferences.protobuf.AbstractC1516x.f16268b);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.C1498e f16202k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16203h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f16204i;

    static {
        f16202k = androidx.datastore.preferences.protobuf.AbstractC1496c.a() ? new androidx.datastore.preferences.protobuf.C1498e(1) : new androidx.datastore.preferences.protobuf.C1498e(0);
    }

    public C1500g(byte[] bArr) {
        bArr.getClass();
        this.f16204i = bArr;
    }

    public static int e(int i3, int i9, int i10) {
        int i11 = i9 - i3;
        if ((i3 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i3 < 0) {
            throw new java.lang.IndexOutOfBoundsException(Y6.f.f(i3, "Beginning index: ", " < 0"));
        }
        if (i9 < i3) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Beginning index larger than ending index: ", ", "));
        }
        throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i9, i10, "End index: ", " >= "));
    }

    public static androidx.datastore.preferences.protobuf.C1500g f(byte[] bArr, int i3, int i9) {
        byte[] bArrCopyOfRange;
        e(i3, i3 + i9, bArr.length);
        switch (f16202k.f16193a) {
            case 0:
                bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i3, i9 + i3);
                break;
            default:
                bArrCopyOfRange = new byte[i9];
                java.lang.System.arraycopy(bArr, i3, bArrCopyOfRange, 0, i9);
                break;
        }
        return new androidx.datastore.preferences.protobuf.C1500g(bArrCopyOfRange);
    }

    public byte d(int i3) {
        return this.f16204i[i3];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.C1500g) || size() != ((androidx.datastore.preferences.protobuf.C1500g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.C1500g)) {
            return obj.equals(this);
        }
        androidx.datastore.preferences.protobuf.C1500g c1500g = (androidx.datastore.preferences.protobuf.C1500g) obj;
        int i3 = this.f16203h;
        int i9 = c1500g.f16203h;
        if (i3 != 0 && i9 != 0 && i3 != i9) {
            return false;
        }
        int size = size();
        if (size > c1500g.size()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1500g.size()) {
            java.lang.StringBuilder sbT = p121o0.p.t(size, "Ran off end of other: 0, ", ", ");
            sbT.append(c1500g.size());
            throw new java.lang.IllegalArgumentException(sbT.toString());
        }
        int iO = o() + size;
        int iO2 = o();
        int iO3 = c1500g.o();
        while (iO2 < iO) {
            if (this.f16204i[iO2] != c1500g.f16204i[iO3]) {
                return false;
            }
            iO2++;
            iO3++;
        }
        return true;
    }

    public final int hashCode() {
        int i3 = this.f16203h;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        int iO = o();
        int i9 = size;
        for (int i10 = iO; i10 < iO + size; i10++) {
            i9 = (i9 * 31) + this.f16204i[i10];
        }
        if (i9 == 0) {
            i9 = 1;
        }
        this.f16203h = i9;
        return i9;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.C1497d(this);
    }

    public void n(byte[] bArr, int i3) {
        java.lang.System.arraycopy(this.f16204i, 0, bArr, 0, i3);
    }

    public int o() {
        return 0;
    }

    public byte p(int i3) {
        return this.f16204i[i3];
    }

    public int size() {
        return this.f16204i.length;
    }

    public final java.lang.String toString() {
        androidx.datastore.preferences.protobuf.C1500g c1499f;
        java.lang.String string;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = E8.l.s(this);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int iE = e(0, 47, size());
            if (iE == 0) {
                c1499f = j;
            } else {
                c1499f = new androidx.datastore.preferences.protobuf.C1499f(this.f16204i, o(), iE);
            }
            sb.append(E8.l.s(c1499f));
            sb.append("...");
            string = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return Y6.f.m(sb2, string, "\">");
    }
}
