package p076i4;

import java.util.List;
import java.util.ListIterator;

public final class C2209n extends C2191e implements ListIterator {

    public final C2211o f22923l;

    public C2209n(C2211o c2211o) {
        super(c2211o);
        this.f22923l = c2211o;
    }

    @Override
    public final void add(Object obj) {
        C2211o c2211o = this.f22923l;
        boolean zIsEmpty = c2211o.isEmpty();
        b().add(obj);
        c2211o.f22926m.f22930m++;
        if (zIsEmpty) {
            c2211o.d();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f22886i;
    }

    @Override
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override
    public final Object previous() {
        return b().previous();
    }

    @Override
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b().set(obj);
    }

    public C2209n(C2211o c2211o, int i3) {
        super(c2211o, ((List) c2211o.f22918i).listIterator(i3));
        this.f22923l = c2211o;
    }
}
