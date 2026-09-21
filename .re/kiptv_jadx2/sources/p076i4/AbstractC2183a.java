package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class AbstractC2183a extends j1 implements ListIterator {

    public final int f22863h;

    public int f22864i;

    public AbstractC2183a(int i3, int i9) {
        AbstractC1864o0.V(i9, i3);
        this.f22863h = i3;
        this.f22864i = i9;
    }

    public abstract Object a(int i3);

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.f22864i < this.f22863h;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f22864i > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f22864i;
        this.f22864i = i3 + 1;
        return a(i3);
    }

    @Override
    public final int nextIndex() {
        return this.f22864i;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f22864i - 1;
        this.f22864i = i3;
        return a(i3);
    }

    @Override
    public final int previousIndex() {
        return this.f22864i - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
