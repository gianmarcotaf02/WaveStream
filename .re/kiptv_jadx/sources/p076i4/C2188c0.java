package p076i4;

/* JADX INFO: renamed from: i4.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2188c0 extends p076i4.AbstractC2226w implements p076i4.InterfaceC2227w0, java.io.Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient p076i4.X0 f22876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f22877m;

    public C2188c0(p076i4.X0 x9, int i3) {
        this.f22876l = x9;
        this.f22877m = i3;
    }

    @Override // p076i4.AbstractC2222u
    public final boolean c(java.lang.Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // p076i4.G0
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p076i4.AbstractC2222u
    public final java.util.Map d() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // p076i4.AbstractC2222u
    public final java.util.Collection e() {
        return new p076i4.C2200i0(this);
    }

    @Override // p076i4.AbstractC2222u, p076i4.G0
    public final java.util.Collection entries() {
        return (p076i4.W) super.entries();
    }

    @Override // p076i4.AbstractC2222u
    public final java.util.Set f() {
        throw new java.lang.AssertionError("unreachable");
    }

    @Override // p076i4.AbstractC2222u
    public final java.util.Collection g() {
        return new p076i4.C2202j0(this);
    }

    @Override // p076i4.AbstractC2222u
    public final java.util.Iterator h() {
        return new p076i4.C2196g0(this);
    }

    @Override // p076i4.AbstractC2222u, p076i4.G0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p076i4.AbstractC2194f0 a() {
        return this.f22876l;
    }

    @Override // p076i4.G0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final p076i4.AbstractC2186b0 get(java.lang.Object obj) {
        p076i4.AbstractC2186b0 abstractC2186b0 = (p076i4.AbstractC2186b0) this.f22876l.get(obj);
        if (abstractC2186b0 != null) {
            return abstractC2186b0;
        }
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    @Override // p076i4.AbstractC2222u, p076i4.G0
    public final java.util.Set keySet() {
        return this.f22876l.keySet();
    }

    @Override // p076i4.G0
    public final boolean put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p076i4.AbstractC2222u, p076i4.G0
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p076i4.G0
    public final int size() {
        return this.f22877m;
    }

    @Override // p076i4.AbstractC2222u, p076i4.G0
    public final java.util.Collection values() {
        return (p076i4.W) super.values();
    }
}
