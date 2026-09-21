package p076i4;

/* JADX INFO: renamed from: i4.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2204k0 extends p076i4.j1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f22914i;
    public final /* synthetic */ p076i4.j1 j;

    public C2204k0(p076i4.j1 j1Var) {
        this.j = j1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22913h > 0 || this.j.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f22913h <= 0) {
            p076i4.M0 m8 = (p076i4.M0) this.j.next();
            this.f22914i = m8.f22813a;
            this.f22913h = m8.a();
        }
        this.f22913h--;
        java.lang.Object obj = this.f22914i;
        java.util.Objects.requireNonNull(obj);
        return obj;
    }
}
