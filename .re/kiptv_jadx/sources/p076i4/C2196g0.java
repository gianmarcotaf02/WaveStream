package p076i4;

/* JADX INFO: renamed from: i4.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2196g0 extends p076i4.j1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p076i4.j1 f22899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f22900i = null;
    public p076i4.j1 j = p076i4.C2221t0.f22938k;

    public C2196g0(p076i4.C2188c0 c2188c0) {
        this.f22899h = c2188c0.f22876l.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j.hasNext() || this.f22899h.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.j.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.f22899h.next();
            this.f22900i = entry.getKey();
            this.j = ((p076i4.W) entry.getValue()).iterator();
        }
        java.lang.Object obj = this.f22900i;
        java.util.Objects.requireNonNull(obj);
        return new p076i4.X(obj, this.j.next());
    }
}
