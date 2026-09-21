package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p014b4.k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final java.lang.Object[] f17895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p014b4.n f17896q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object[] f17897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f17898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient java.lang.Object[] f17899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient int f17900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f17901o;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f17895p = objArr;
        f17896q = new p014b4.n(0, 0, 0, objArr, objArr);
    }

    public n(int i3, int i9, int i10, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        this.f17897k = objArr;
        this.f17898l = i3;
        this.f17899m = objArr2;
        this.f17900n = i9;
        this.f17901o = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        java.lang.Object[] objArr = this.f17899m;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) java.lang.Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i3 = iRotateLeft & this.f17900n;
            java.lang.Object obj2 = objArr[i3];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i3 + 1;
        }
    }

    @Override // p014b4.f
    public final int d(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this.f17897k;
        int i3 = this.f17901o;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // p014b4.f
    public final int e() {
        return this.f17901o;
    }

    @Override // p014b4.f
    public final int f() {
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f17898l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return q().listIterator(0);
    }

    @Override // p014b4.f
    public final java.lang.Object[] n() {
        return this.f17897k;
    }

    @Override // p014b4.k
    public final p014b4.j r() {
        return p014b4.j.p(this.f17897k, this.f17901o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17901o;
    }
}
