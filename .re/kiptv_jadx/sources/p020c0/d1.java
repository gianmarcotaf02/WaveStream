package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements p129p0.c, java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p020c0.K0 f18237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18238i;
    public final p020c0.B0 j;

    public d1(p020c0.K0 k1, int i3, p020c0.N n3, p020c0.B0 b9) {
        this.f18237h = k1;
        this.f18238i = i3;
        this.j = b9;
        n3.getClass();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p020c0.d1)) {
            return false;
        }
        p020c0.d1 d1Var = (p020c0.d1) obj;
        return d1Var.f18238i == this.f18238i && d1Var.f18237h.equals(this.f18237h) && d1Var.j.equals(this.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.f18237h.hashCode() + (this.f18238i * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new p020c0.c1(this.f18237h, this.f18238i, null, this.j);
    }
}
