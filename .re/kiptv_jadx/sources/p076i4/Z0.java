package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends p076i4.AbstractC2214p0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final java.lang.Object[] f22856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p076i4.Z0 f22857q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object[] f22858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f22859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient java.lang.Object[] f22860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f22861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f22862o;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f22856p = objArr;
        f22857q = new p076i4.Z0(0, 0, 0, objArr, objArr);
    }

    public Z0(int i3, int i9, int i10, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        this.f22858k = objArr;
        this.f22859l = i3;
        this.f22860m = objArr2;
        this.f22861n = i9;
        this.f22862o = i10;
    }

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.f22860m;
            if (objArr.length != 0) {
                int iW = p076i4.AbstractC2230y.w(obj);
                while (true) {
                    int i3 = iW & this.f22861n;
                    java.lang.Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iW = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // p076i4.W
    public final int e(java.lang.Object[] objArr, int i3) {
        java.lang.Object[] objArr2 = this.f22858k;
        int i9 = this.f22862o;
        java.lang.System.arraycopy(objArr2, 0, objArr, i3, i9);
        return i3 + i9;
    }

    @Override // p076i4.W
    public final java.lang.Object[] f() {
        return this.f22858k;
    }

    @Override // p076i4.AbstractC2214p0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f22859l;
    }

    @Override // p076i4.W
    public final int n() {
        return this.f22862o;
    }

    @Override // p076i4.W
    public final int o() {
        return 0;
    }

    @Override // p076i4.W
    public final boolean p() {
        return false;
    }

    @Override // p076i4.W
    /* JADX INFO: renamed from: q */
    public final p076i4.j1 iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22862o;
    }

    @Override // p076i4.AbstractC2214p0
    public final p076i4.AbstractC2186b0 u() {
        return p076i4.AbstractC2186b0.r(this.f22858k, this.f22862o);
    }
}
