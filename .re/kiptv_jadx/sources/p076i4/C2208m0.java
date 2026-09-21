package p076i4;

/* JADX INFO: renamed from: i4.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2208m0 extends p076i4.AbstractC2214p0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f22921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p076i4.AbstractC2210n0 f22922l;

    public /* synthetic */ C2208m0(p076i4.AbstractC2210n0 abstractC2210n0, int i3) {
        this.f22921k = i3;
        this.f22922l = abstractC2210n0;
    }

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        switch (this.f22921k) {
            case 0:
                if (!(obj instanceof p076i4.M0)) {
                    return false;
                }
                p076i4.M0 m8 = (p076i4.M0) obj;
                return m8.a() > 0 && ((p076i4.Y0) this.f22922l).f22853l.b(m8.f22813a) == m8.a();
            default:
                return ((p076i4.Y0) this.f22922l).contains(obj);
        }
    }

    @Override // p076i4.W
    public final int e(java.lang.Object[] objArr, int i3) {
        return d().e(objArr, i3);
    }

    @Override // p076i4.AbstractC2214p0, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f22921k) {
            case 0:
                return this.f22922l.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // p076i4.W
    public final boolean p() {
        switch (this.f22921k) {
            case 0:
                this.f22922l.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override // p076i4.W
    /* JADX INFO: renamed from: q */
    public final p076i4.j1 iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f22921k) {
            case 0:
                return this.f22922l.r().size();
            default:
                return ((p076i4.Y0) this.f22922l).f22853l.f22819c;
        }
    }

    @Override // p076i4.AbstractC2214p0
    public final p076i4.AbstractC2186b0 u() {
        return new p076i4.C2216q0(this);
    }
}
