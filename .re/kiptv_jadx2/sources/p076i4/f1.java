package p076i4;

public final class f1 extends AbstractC2214p0 {

    public final transient Object f22896k;

    public f1(Object obj) {
        obj.getClass();
        this.f22896k = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f22896k.equals(obj);
    }

    @Override
    public final AbstractC2186b0 d() {
        return AbstractC2186b0.y(this.f22896k);
    }

    @Override
    public final int e(Object[] objArr, int i3) {
        objArr[i3] = this.f22896k;
        return i3 + 1;
    }

    @Override
    public final int hashCode() {
        return this.f22896k.hashCode();
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final j1 iterator() {
        return new C2225v0(this.f22896k);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return "[" + this.f22896k.toString() + ']';
    }
}
