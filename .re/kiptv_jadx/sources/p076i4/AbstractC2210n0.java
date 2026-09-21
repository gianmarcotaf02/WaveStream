package p076i4;

/* JADX INFO: renamed from: i4.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2210n0 extends p076i4.W implements p076i4.K0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f22924k = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient p076i4.S0 f22925i;
    public transient p076i4.AbstractC2214p0 j;

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return ((p076i4.Y0) this).f22853l.b(obj) > 0;
    }

    @Override // p076i4.W
    public final p076i4.AbstractC2186b0 d() {
        p076i4.S0 s9 = this.f22925i;
        if (s9 != null) {
            return s9;
        }
        p076i4.AbstractC2186b0 abstractC2186b0D = super.d();
        this.f22925i = (p076i4.S0) abstractC2186b0D;
        return abstractC2186b0D;
    }

    @Override // p076i4.W
    public final int e(java.lang.Object[] objArr, int i3) {
        p076i4.j1 it = s().iterator();
        while (it.hasNext()) {
            p076i4.M0 m8 = (p076i4.M0) it.next();
            java.util.Arrays.fill(objArr, i3, m8.a() + i3, m8.f22813a);
            i3 += m8.a();
        }
        return i3;
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p076i4.K0)) {
            return false;
        }
        p076i4.K0 k1 = (p076i4.K0) obj;
        p076i4.Y0 y9 = (p076i4.Y0) this;
        if (y9.size() != k1.size()) {
            return false;
        }
        p076i4.AbstractC2210n0 abstractC2210n0 = (p076i4.AbstractC2210n0) k1;
        if (s().size() != abstractC2210n0.s().size()) {
            return false;
        }
        for (p076i4.M0 m8 : abstractC2210n0.s()) {
            if (y9.f22853l.b(m8.f22813a) != m8.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return p076i4.AbstractC2230y.n(s());
    }

    @Override // p076i4.W
    /* JADX INFO: renamed from: q */
    public final p076i4.j1 iterator() {
        return new p076i4.C2204k0(s().iterator());
    }

    public abstract p076i4.AbstractC2214p0 r();

    public final p076i4.AbstractC2214p0 s() {
        p076i4.AbstractC2214p0 c2208m0 = this.j;
        if (c2208m0 == null) {
            c2208m0 = isEmpty() ? p076i4.Z0.f22857q : new p076i4.C2208m0(this, 0);
            this.j = c2208m0;
        }
        return c2208m0;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return s().toString();
    }
}
