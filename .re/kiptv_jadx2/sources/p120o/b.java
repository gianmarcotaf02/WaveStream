package p120o;

import java.util.Iterator;

public final class b extends e implements Iterator {

    public c f25952h;

    public c f25953i;
    public final int j;

    public b(c cVar, c cVar2, int i3) {
        this.j = i3;
        this.f25952h = cVar2;
        this.f25953i = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f25952h == cVar && cVar == this.f25953i) {
            this.f25953i = null;
            this.f25952h = null;
        }
        c cVar3 = this.f25952h;
        if (cVar3 == cVar) {
            switch (this.j) {
                case 0:
                    cVar2 = cVar3.f25956k;
                    break;
                default:
                    cVar2 = cVar3.j;
                    break;
            }
            this.f25952h = cVar2;
        }
        c cVar4 = this.f25953i;
        if (cVar4 == cVar) {
            c cVar5 = this.f25952h;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f25953i = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.j) {
            case 0:
                return cVar.j;
            default:
                return cVar.f25956k;
        }
    }

    @Override
    public final boolean hasNext() {
        return this.f25953i != null;
    }

    @Override
    public final Object next() {
        c cVar = this.f25953i;
        c cVar2 = this.f25952h;
        this.f25953i = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
