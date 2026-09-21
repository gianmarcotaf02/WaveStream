package p076i4;

public final class Z0 extends AbstractC2214p0 {

    public static final Object[] f22856p;

    public static final Z0 f22857q;

    public final transient Object[] f22858k;

    public final transient int f22859l;

    public final transient Object[] f22860m;

    public final transient int f22861n;

    public final transient int f22862o;

    static {
        Object[] objArr = new Object[0];
        f22856p = objArr;
        f22857q = new Z0(0, 0, 0, objArr, objArr);
    }

    public Z0(int i3, int i9, int i10, Object[] objArr, Object[] objArr2) {
        this.f22858k = objArr;
        this.f22859l = i3;
        this.f22860m = objArr2;
        this.f22861n = i9;
        this.f22862o = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f22860m;
            if (objArr.length != 0) {
                int iW = AbstractC2230y.w(obj);
                while (true) {
                    int i3 = iW & this.f22861n;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iW = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int e(Object[] objArr, int i3) {
        Object[] objArr2 = this.f22858k;
        int i9 = this.f22862o;
        System.arraycopy(objArr2, 0, objArr, i3, i9);
        return i3 + i9;
    }

    @Override
    public final Object[] f() {
        return this.f22858k;
    }

    @Override
    public final int hashCode() {
        return this.f22859l;
    }

    @Override
    public final int n() {
        return this.f22862o;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final j1 iterator() {
        return d().listIterator(0);
    }

    @Override
    public final int size() {
        return this.f22862o;
    }

    @Override
    public final AbstractC2186b0 u() {
        return AbstractC2186b0.r(this.f22858k, this.f22862o);
    }
}
