package p078i6;

import O7.k;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.y;
import p121o0.o;
import p121o0.w;
import p201y6.a;

public final class E implements ListIterator, a {

    public final int f23176h = 1;

    public final Object f23177i;
    public final Object j;

    public E(k kVar, int i3) {
        this.j = kVar;
        this.f23177i = ((List) kVar.f8052i).listIterator(o.W0(i3, kVar));
    }

    @Override
    public final void add(Object obj) {
        switch (this.f23176h) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f23177i;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.f23176h) {
            case 0:
                return ((ListIterator) this.f23177i).hasPrevious();
            case 1:
                return ((ListIterator) this.f23177i).hasPrevious();
            default:
                return ((y) this.f23177i).f24555h < ((w) this.j).f26030k - 1;
        }
    }

    @Override
    public final boolean hasPrevious() {
        switch (this.f23176h) {
            case 0:
                return ((ListIterator) this.f23177i).hasNext();
            case 1:
                return ((ListIterator) this.f23177i).hasNext();
            default:
                return ((y) this.f23177i).f24555h >= 0;
        }
    }

    @Override
    public final Object next() {
        switch (this.f23176h) {
            case 0:
                return ((ListIterator) this.f23177i).previous();
            case 1:
                return ((ListIterator) this.f23177i).previous();
            default:
                y yVar = (y) this.f23177i;
                int i3 = yVar.f24555h + 1;
                w wVar = (w) this.j;
                o.a(i3, wVar.f26030k);
                yVar.f24555h = i3;
                return wVar.get(i3);
        }
    }

    @Override
    public final int nextIndex() {
        switch (this.f23176h) {
            case 0:
                return p.A0((F) this.j) - ((ListIterator) this.f23177i).previousIndex();
            case 1:
                return p.A0((k) this.j) - ((ListIterator) this.f23177i).previousIndex();
            default:
                return ((y) this.f23177i).f24555h + 1;
        }
    }

    @Override
    public final Object previous() {
        switch (this.f23176h) {
            case 0:
                return ((ListIterator) this.f23177i).next();
            case 1:
                return ((ListIterator) this.f23177i).next();
            default:
                y yVar = (y) this.f23177i;
                int i3 = yVar.f24555h;
                w wVar = (w) this.j;
                o.a(i3, wVar.f26030k);
                yVar.f24555h = i3 - 1;
                return wVar.get(i3);
        }
    }

    @Override
    public final int previousIndex() {
        switch (this.f23176h) {
            case 0:
                return p.A0((F) this.j) - ((ListIterator) this.f23177i).nextIndex();
            case 1:
                return p.A0((k) this.j) - ((ListIterator) this.f23177i).nextIndex();
            default:
                return ((y) this.f23177i).f24555h;
        }
    }

    @Override
    public final void remove() {
        switch (this.f23176h) {
            case 0:
                ((ListIterator) this.f23177i).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override
    public final void set(Object obj) {
        switch (this.f23176h) {
            case 0:
                ((ListIterator) this.f23177i).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public E(F f9, int i3) {
        this.j = f9;
        this.f23177i = f9.f23178h.listIterator(o.W0(i3, f9));
    }

    public E(y yVar, w wVar) {
        this.f23177i = yVar;
        this.j = wVar;
    }
}
