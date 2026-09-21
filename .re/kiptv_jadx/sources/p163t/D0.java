package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements p163t.InterfaceC2779x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p163t.InterfaceC2780y f27449c;

    public D0(int i3, p163t.InterfaceC2780y interfaceC2780y, int i9) {
        this(i3, 0, (i9 & 4) != 0 ? p163t.AbstractC2781z.f27737a : interfaceC2780y);
    }

    @Override // p163t.InterfaceC2766l
    public final p163t.G0 a(p163t.E0 e6) {
        return new D8.x(this.f27447a, this.f27448b, this.f27449c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p163t.D0) {
            p163t.D0 d4 = (p163t.D0) obj;
            if (d4.f27447a == this.f27447a && d4.f27448b == this.f27448b && kotlin.jvm.internal.m.a(d4.f27449c, this.f27449c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f27449c.hashCode() + (this.f27447a * 31)) * 31) + this.f27448b;
    }

    @Override // p163t.InterfaceC2779x, p163t.InterfaceC2766l
    public final p163t.I0 a(p163t.E0 e6) {
        return new D8.x(this.f27447a, this.f27448b, this.f27449c);
    }

    public D0(int i3, int i9, p163t.InterfaceC2780y interfaceC2780y) {
        this.f27447a = i3;
        this.f27448b = i9;
        this.f27449c = interfaceC2780y;
    }
}
