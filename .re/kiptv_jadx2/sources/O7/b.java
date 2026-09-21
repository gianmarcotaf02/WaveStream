package O7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator, p201y6.a {

    public int f8028h = -1;

    public int f8029i;
    public int j;

    public D6.g f8030k;

    public int f8031l;

    public final c f8032m;

    public b(c cVar) {
        this.f8032m = cVar;
        cVar.getClass();
        int iS = r.s(0, 0, cVar.f8033a.length());
        this.f8029i = iS;
        this.j = iS;
    }

    public final void a() {
        p070h6.k kVar;
        int i3 = this.j;
        if (i3 < 0) {
            this.f8028h = 0;
            this.f8030k = null;
            return;
        }
        c cVar = this.f8032m;
        int i9 = cVar.f8034b;
        if (i9 > 0) {
            int i10 = this.f8031l + 1;
            this.f8031l = i10;
            if (i10 >= i9) {
                this.f8030k = new D6.g(this.f8029i, q.H0(cVar.f8033a), 1);
                this.j = -1;
            } else if (i3 > cVar.f8033a.length() && (kVar = (p070h6.k) cVar.f8035c.invoke(cVar.f8033a, Integer.valueOf(this.j))) != null) {
                int iIntValue = ((Number) kVar.f22539h).intValue();
                int iIntValue2 = ((Number) kVar.f22540i).intValue();
                this.f8030k = r.W(this.f8029i, iIntValue);
                int i11 = iIntValue + iIntValue2;
                this.f8029i = i11;
                this.j = i11 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f8030k = new D6.g(this.f8029i, q.H0(cVar.f8033a), 1);
                this.j = -1;
            }
        } else if (i3 > cVar.f8033a.length()) {
            this.f8030k = new D6.g(this.f8029i, q.H0(cVar.f8033a), 1);
            this.j = -1;
        } else {
            int iIntValue3 = ((Number) kVar.f22539h).intValue();
            int iIntValue4 = ((Number) kVar.f22540i).intValue();
            this.f8030k = r.W(this.f8029i, iIntValue3);
            int i12 = iIntValue3 + iIntValue4;
            this.f8029i = i12;
            this.j = i12 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f8028h = 1;
    }

    @Override
    public final boolean hasNext() {
        if (this.f8028h == -1) {
            a();
        }
        return this.f8028h == 1;
    }

    @Override
    public final Object next() {
        if (this.f8028h == -1) {
            a();
        }
        if (this.f8028h == 0) {
            throw new NoSuchElementException();
        }
        D6.g gVar = this.f8030k;
        kotlin.jvm.internal.m.c(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f8030k = null;
        this.f8028h = -1;
        return gVar;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
