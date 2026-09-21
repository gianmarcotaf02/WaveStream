package p076i4;

/* JADX INFO: renamed from: i4.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2200i0 extends p076i4.W {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p076i4.C2188c0 f22908i;

    public C2200i0(p076i4.C2188c0 c2188c0) {
        this.f22908i = c2188c0;
    }

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return this.f22908i.b(entry.getKey(), entry.getValue());
    }

    @Override // p076i4.W
    /* JADX INFO: renamed from: q */
    public final p076i4.j1 iterator() {
        p076i4.C2188c0 c2188c0 = this.f22908i;
        c2188c0.getClass();
        return new p076i4.C2196g0(c2188c0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f22908i.f22877m;
    }
}
