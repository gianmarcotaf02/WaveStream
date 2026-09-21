package p056g0;

import java.util.NoSuchElementException;

public final class d extends a {
    public final int j = 1;

    public final Object f21752k;

    public d(Object[] objArr, int i3, int i9) {
        super(i3, i9);
        this.f21752k = objArr;
    }

    @Override
    public final Object next() {
        switch (this.j) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f21748h;
                this.f21748h = i3 + 1;
                return ((Object[]) this.f21752k)[i3];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f21748h++;
                return this.f21752k;
        }
    }

    @Override
    public final Object previous() {
        switch (this.j) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f21748h - 1;
                this.f21748h = i3;
                return ((Object[]) this.f21752k)[i3];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f21748h--;
                return this.f21752k;
        }
    }

    public d(int i3, Object obj) {
        super(i3, 1);
        this.f21752k = obj;
    }
}
