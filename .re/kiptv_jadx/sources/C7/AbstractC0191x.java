package C7;

/* JADX INFO: renamed from: C7.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0191x implements O6.a, F7.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1612h;

    public abstract p180v7.o N();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7.AbstractC0191x)) {
            return false;
        }
        C7.AbstractC0191x abstractC0191x = (C7.AbstractC0191x) obj;
        if (v0() == abstractC0191x.v0()) {
            return C7.AbstractC0171c.y(D7.m.f2491h, x0(), abstractC0191x.x0());
        }
        return false;
    }

    @Override // O6.a
    public final O6.h getAnnotations() {
        return C7.AbstractC0177i.a(t0());
    }

    public final int hashCode() {
        int iHashCode;
        int i3 = this.f1612h;
        if (i3 != 0) {
            return i3;
        }
        if (C7.AbstractC0171c.j(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (v0() ? 1 : 0) + ((s0().hashCode() + (u0().hashCode() * 31)) * 31);
        }
        this.f1612h = iHashCode;
        return iHashCode;
    }

    public abstract java.util.List s0();

    public abstract C7.I t0();

    public abstract C7.M u0();

    public abstract boolean v0();

    public abstract C7.AbstractC0191x w0(D7.f fVar);

    public abstract C7.a0 x0();
}
