package D0;

import D1.X;
import java.util.Iterator;
import java.util.Map;

public final class G implements Iterator, p201y6.a {

    public final int f1809h = 0;

    public final Iterator f1810i;

    public G(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        this.f1810i = kotlin.jvm.internal.m.h(array);
    }

    @Override
    public final boolean hasNext() {
        switch (this.f1809h) {
            case 0:
                return this.f1810i.hasNext();
            case 1:
                return ((X) this.f1810i).hasNext();
            default:
                return ((p064h0.e) this.f1810i).j;
        }
    }

    @Override
    public final Object next() {
        switch (this.f1809h) {
            case 0:
                return (J) this.f1810i.next();
            case 1:
                return ((X) this.f1810i).next();
            default:
                return (Map.Entry) ((p064h0.e) this.f1810i).next();
        }
    }

    @Override
    public final void remove() {
        switch (this.f1809h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                ((p064h0.e) this.f1810i).remove();
                return;
        }
    }

    public G(p089k0.i iVar) {
        p064h0.l[] lVarArr = new p064h0.l[8];
        for (int i3 = 0; i3 < 8; i3++) {
            lVarArr[i3] = new p064h0.n(this);
        }
        this.f1810i = new p064h0.e(iVar, lVarArr);
    }

    public G(H h9) {
        this.f1810i = h9.f1819q.iterator();
    }
}
