package p136q;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p201y6.a;

public final class C2657a implements Iterator, a {

    public int f26369h;

    public int f26370i;
    public boolean j;

    public final int f26371k;

    public final Object f26372l;

    public C2657a(int i3) {
        this.f26369h = i3;
    }

    @Override
    public final boolean hasNext() {
        return this.f26370i < this.f26369h;
    }

    @Override
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f26370i;
        switch (this.f26371k) {
            case 0:
                objE = ((C2661e) this.f26372l).e(i3);
                break;
            case 1:
                objE = ((C2661e) this.f26372l).i(i3);
                break;
            default:
                objE = ((C2662f) this.f26372l).f26382i[i3];
                break;
        }
        this.f26370i++;
        this.j = true;
        return objE;
    }

    @Override
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i3 = this.f26370i - 1;
        this.f26370i = i3;
        switch (this.f26371k) {
            case 0:
                ((C2661e) this.f26372l).g(i3);
                break;
            case 1:
                ((C2661e) this.f26372l).g(i3);
                break;
            default:
                ((C2662f) this.f26372l).d(i3);
                break;
        }
        this.f26369h--;
        this.j = false;
    }

    public C2657a(C2662f c2662f) {
        this(c2662f.j);
        this.f26371k = 2;
        this.f26372l = c2662f;
    }

    public C2657a(C2661e c2661e, int i3) {
        this(c2661e.j);
        this.f26371k = i3;
        switch (i3) {
            case 1:
                this.f26372l = c2661e;
                this(c2661e.j);
                break;
            default:
                this.f26372l = c2661e;
                break;
        }
    }
}
