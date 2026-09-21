package p076i4;

public final class R0 extends T {

    public static final R0 f22826p = new R0();

    public final transient Object f22827k;

    public final transient Object[] f22828l;

    public final transient int f22829m;

    public final transient int f22830n;

    public final transient R0 f22831o;

    public R0() {
        this.f22827k = null;
        this.f22828l = new Object[0];
        this.f22829m = 0;
        this.f22830n = 0;
        this.f22831o = this;
    }

    @Override
    public final U0 b() {
        return new U0(this, this.f22828l, this.f22829m, this.f22830n);
    }

    @Override
    public final V0 c() {
        return new V0(this, new W0(this.f22828l, this.f22829m, this.f22830n));
    }

    @Override
    public final Object get(Object obj) {
        Object objK = X0.k(this.f22827k, this.f22828l, this.f22830n, this.f22829m, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override
    public final int size() {
        return this.f22830n;
    }

    public R0(Object obj, Object[] objArr, int i3, R0 r9) {
        this.f22827k = obj;
        this.f22828l = objArr;
        this.f22829m = 1;
        this.f22830n = i3;
        this.f22831o = r9;
    }

    public R0(Object[] objArr, int i3) {
        this.f22828l = objArr;
        this.f22830n = i3;
        this.f22829m = 0;
        int iR = i3 >= 2 ? AbstractC2214p0.r(i3) : 0;
        Object objJ = X0.j(objArr, i3, iR, 0);
        if (!(objJ instanceof Object[])) {
            this.f22827k = objJ;
            Object objJ2 = X0.j(objArr, i3, iR, 1);
            if (!(objJ2 instanceof Object[])) {
                this.f22831o = new R0(objJ2, objArr, i3, this);
                return;
            }
            throw ((C2190d0) ((Object[]) objJ2)[2]).a();
        }
        throw ((C2190d0) ((Object[]) objJ)[2]).a();
    }
}
