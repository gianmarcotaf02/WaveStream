package p076i4;

/* JADX INFO: renamed from: i4.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2198h0 extends p076i4.j1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p076i4.j1 f22903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p076i4.j1 f22904i = p076i4.C2221t0.f22938k;

    public C2198h0(p076i4.C2188c0 c2188c0) {
        this.f22903h = c2188c0.f22876l.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22904i.hasNext() || this.f22903h.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.f22904i.hasNext()) {
            this.f22904i = ((p076i4.W) this.f22903h.next()).iterator();
        }
        return this.f22904i.next();
    }
}
