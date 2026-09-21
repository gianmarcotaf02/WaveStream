package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class K extends p076i4.O0 implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Comparator[] f22807h;

    public K(p076i4.C2228x c2228x, p076i4.C2228x c2228x2) {
        this.f22807h = new java.util.Comparator[]{c2228x, c2228x2};
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = 0;
        while (true) {
            java.util.Comparator[] comparatorArr = this.f22807h;
            if (i3 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i3].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i3++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p076i4.K) {
            return java.util.Arrays.equals(this.f22807h, ((p076i4.K) obj).f22807h);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f22807h);
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Ordering.compound("), java.util.Arrays.toString(this.f22807h), ")");
    }
}
