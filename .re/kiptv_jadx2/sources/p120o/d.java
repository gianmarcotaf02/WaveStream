package p120o;

import java.util.Iterator;

public final class d extends e implements Iterator {

    public c f25957h;

    public boolean f25958i = true;
    public final f j;

    public d(f fVar) {
        this.j = fVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2 = this.f25957h;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f25956k;
            this.f25957h = cVar3;
            this.f25958i = cVar3 == null;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f25958i) {
            return this.j.f25959h != null;
        }
        c cVar = this.f25957h;
        return (cVar == null || cVar.j == null) ? false : true;
    }

    @Override
    public final Object next() {
        if (this.f25958i) {
            this.f25958i = false;
            this.f25957h = this.j.f25959h;
        } else {
            c cVar = this.f25957h;
            this.f25957h = cVar != null ? cVar.j : null;
        }
        return this.f25957h;
    }
}
