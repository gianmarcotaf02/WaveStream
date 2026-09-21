package p076i4;

public final class V0 extends AbstractC2214p0 {

    public final transient AbstractC2194f0 f22841k;

    public final transient W0 f22842l;

    public V0(AbstractC2194f0 abstractC2194f0, W0 w6) {
        this.f22841k = abstractC2194f0;
        this.f22842l = w6;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f22841k.get(obj) != null;
    }

    @Override
    public final AbstractC2186b0 d() {
        return this.f22842l;
    }

    @Override
    public final int e(Object[] objArr, int i3) {
        return this.f22842l.e(objArr, i3);
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final j1 iterator() {
        return this.f22842l.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f22841k.size();
    }
}
