package N7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p078i6.z;

public final class d implements Iterator, p201y6.a {

    public final int f7437h = 0;

    public int f7438i;
    public final Iterator j;

    public d(Iterator iterator) {
        kotlin.jvm.internal.m.e(iterator, "iterator");
        this.j = iterator;
    }

    @Override
    public final boolean hasNext() {
        Iterator it;
        switch (this.f7437h) {
            case 0:
                break;
            case 1:
                return this.f7438i > 0 && this.j.hasNext();
            default:
                return this.j.hasNext();
        }
        while (true) {
            int i3 = this.f7438i;
            it = this.j;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f7438i--;
            }
        }
        return it.hasNext();
    }

    @Override
    public final Object next() {
        Iterator it;
        switch (this.f7437h) {
            case 0:
                break;
            case 1:
                int i3 = this.f7438i;
                if (i3 == 0) {
                    throw new NoSuchElementException();
                }
                this.f7438i = i3 - 1;
                return this.j.next();
            default:
                int i9 = this.f7438i;
                this.f7438i = i9 + 1;
                if (i9 >= 0) {
                    return new z(i9, this.j.next());
                }
                p078i6.p.H0();
                throw null;
        }
        while (true) {
            int i10 = this.f7438i;
            it = this.j;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f7438i--;
            }
        }
        return it.next();
    }

    @Override
    public final void remove() {
        switch (this.f7437h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(e eVar, byte b9) {
        this.f7438i = eVar.f7441c;
        this.j = eVar.f7440b.iterator();
    }

    public d(e eVar) {
        this.j = eVar.f7440b.iterator();
        this.f7438i = eVar.f7441c;
    }
}
