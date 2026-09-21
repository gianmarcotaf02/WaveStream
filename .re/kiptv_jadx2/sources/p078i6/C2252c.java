package p078i6;

import D1.X;
import com.google.android.gms.internal.play_billing.M0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class C2252c extends X implements ListIterator {

    public final AbstractC2254e f23193k;

    public C2252c(AbstractC2254e abstractC2254e, int i3) {
        super(5, abstractC2254e);
        this.f23193k = abstractC2254e;
        int iD = abstractC2254e.d();
        if (i3 < 0 || i3 > iD) {
            throw new IndexOutOfBoundsException(M0.k(i3, iD, "index: ", ", size: "));
        }
        this.f1988i = i3;
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        return this.f1988i > 0;
    }

    @Override
    public final int nextIndex() {
        return this.f1988i;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f1988i - 1;
        this.f1988i = i3;
        return this.f23193k.get(i3);
    }

    @Override
    public final int previousIndex() {
        return this.f1988i - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
