package p076i4;

/* JADX INFO: renamed from: i4.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2202j0 extends p076i4.W {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient p076i4.C2188c0 f22910i;

    public C2202j0(p076i4.C2188c0 c2188c0) {
        this.f22910i = c2188c0;
    }

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f22910i.c(obj);
    }

    @Override // p076i4.W
    public final int e(java.lang.Object[] objArr, int i3) {
        p076i4.j1 it = this.f22910i.f22876l.values().iterator();
        while (it.hasNext()) {
            i3 = ((p076i4.W) it.next()).e(objArr, i3);
        }
        return i3;
    }

    @Override // p076i4.W
    /* JADX INFO: renamed from: q */
    public final p076i4.j1 iterator() {
        p076i4.C2188c0 c2188c0 = this.f22910i;
        c2188c0.getClass();
        return new p076i4.C2198h0(c2188c0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f22910i.f22877m;
    }
}
