package p076i4;

public final class C2208m0 extends AbstractC2214p0 {

    public final int f22921k;

    public final AbstractC2210n0 f22922l;

    public C2208m0(AbstractC2210n0 abstractC2210n0, int i3) {
        this.f22921k = i3;
        this.f22922l = abstractC2210n0;
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f22921k) {
            case 0:
                if (!(obj instanceof M0)) {
                    return false;
                }
                M0 m8 = (M0) obj;
                return m8.a() > 0 && ((Y0) this.f22922l).f22853l.b(m8.f22813a) == m8.a();
            default:
                return ((Y0) this.f22922l).contains(obj);
        }
    }

    @Override
    public final int e(Object[] objArr, int i3) {
        return d().e(objArr, i3);
    }

    @Override
    public int hashCode() {
        switch (this.f22921k) {
            case 0:
                return this.f22922l.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override
    public final boolean p() {
        switch (this.f22921k) {
            case 0:
                this.f22922l.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override
    public final j1 iterator() {
        return d().listIterator(0);
    }

    @Override
    public final int size() {
        switch (this.f22921k) {
            case 0:
                return this.f22922l.r().size();
            default:
                return ((Y0) this.f22922l).f22853l.f22819c;
        }
    }

    @Override
    public final AbstractC2186b0 u() {
        return new C2216q0(this);
    }
}
