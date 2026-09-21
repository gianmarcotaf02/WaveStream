package D6;

/* JADX INFO: loaded from: classes4.dex */
public class e implements java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2459i;
    public final int j;

    public e(int i3, int i9, int i10) {
        if (i10 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2458h = i3;
        this.f2459i = com.google.crypto.tink.shaded.protobuf.AbstractC1911f.x(i3, i9, i10);
        this.j = i10;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof D6.e)) {
            return false;
        }
        if (isEmpty() && ((D6.e) obj).isEmpty()) {
            return true;
        }
        D6.e eVar = (D6.e) obj;
        return this.f2458h == eVar.f2458h && this.f2459i == eVar.f2459i && this.j == eVar.j;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2458h * 31) + this.f2459i) * 31) + this.j;
    }

    public boolean isEmpty() {
        int i3 = this.j;
        int i9 = this.f2459i;
        int i10 = this.f2458h;
        if (i3 > 0) {
            return i10 > i9;
        }
        return i10 < i9;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new D6.f(this.f2458h, this.f2459i, this.j);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i3 = this.f2459i;
        int i9 = this.f2458h;
        int i10 = this.j;
        if (i10 > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(i9);
            sb.append("..");
            sb.append(i3);
            sb.append(" step ");
            sb.append(i10);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(i9);
            sb.append(" downTo ");
            sb.append(i3);
            sb.append(" step ");
            sb.append(-i10);
        }
        return sb.toString();
    }
}
