package D6;

import java.util.NoSuchElementException;
import p078i6.A;

public final class f extends A {

    public final int f2460h;

    public final int f2461i;
    public boolean j;

    public int f2462k;

    public f(int i3, int i9, int i10) {
        this.f2460h = i10;
        this.f2461i = i9;
        boolean z6 = false;
        if (i10 <= 0 ? i3 >= i9 : i3 <= i9) {
            z6 = true;
        }
        this.j = z6;
        this.f2462k = z6 ? i3 : i9;
    }

    @Override
    public final int a() {
        int i3 = this.f2462k;
        if (i3 != this.f2461i) {
            this.f2462k = this.f2460h + i3;
            return i3;
        }
        if (!this.j) {
            throw new NoSuchElementException();
        }
        this.j = false;
        return i3;
    }

    @Override
    public final boolean hasNext() {
        return this.j;
    }
}
