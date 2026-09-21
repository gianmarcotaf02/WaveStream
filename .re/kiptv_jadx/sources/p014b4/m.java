package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p014b4.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p014b4.m f17893l = new p014b4.m(new java.lang.Object[0], 0);
    public final transient java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f17894k;

    public m(java.lang.Object[] objArr, int i3) {
        this.j = objArr;
        this.f17894k = i3;
    }

    @Override // p014b4.j, p014b4.f
    public final int d(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this.j;
        int i3 = this.f17894k;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // p014b4.f
    public final int e() {
        return this.f17894k;
    }

    @Override // p014b4.f
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        p014b4.AbstractC1659a.c(i3, this.f17894k);
        java.lang.Object obj = this.j[i3];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p014b4.f
    public final java.lang.Object[] n() {
        return this.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17894k;
    }
}
