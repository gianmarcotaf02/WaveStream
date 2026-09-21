package p076i4;

public final class C2198h0 extends j1 {

    public final j1 f22903h;

    public j1 f22904i = C2221t0.f22938k;

    public C2198h0(C2188c0 c2188c0) {
        this.f22903h = c2188c0.f22876l.values().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.f22904i.hasNext() || this.f22903h.hasNext();
    }

    @Override
    public final Object next() {
        if (!this.f22904i.hasNext()) {
            this.f22904i = ((W) this.f22903h.next()).iterator();
        }
        return this.f22904i.next();
    }
}
