package p076i4;

public final class C2202j0 extends W {

    public final transient C2188c0 f22910i;

    public C2202j0(C2188c0 c2188c0) {
        this.f22910i = c2188c0;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f22910i.c(obj);
    }

    @Override
    public final int e(Object[] objArr, int i3) {
        j1 it = this.f22910i.f22876l.values().iterator();
        while (it.hasNext()) {
            i3 = ((W) it.next()).e(objArr, i3);
        }
        return i3;
    }

    @Override
    public final j1 iterator() {
        C2188c0 c2188c0 = this.f22910i;
        c2188c0.getClass();
        return new C2198h0(c2188c0);
    }

    @Override
    public final int size() {
        return this.f22910i.f22877m;
    }
}
