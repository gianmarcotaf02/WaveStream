package p056g0;

import java.util.NoSuchElementException;

public final class g extends a {
    public final Object[] j;

    public final j f21763k;

    public g(int i3, int i9, int i10, Object[] objArr, Object[] objArr2) {
        super(i3, i9);
        this.j = objArr2;
        int i11 = (i9 - 1) & (-32);
        this.f21763k = new j(objArr, i3 > i11 ? i11 : i3, i11, i10);
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f21763k;
        if (jVar.hasNext()) {
            this.f21748h++;
            return jVar.next();
        }
        int i3 = this.f21748h;
        this.f21748h = i3 + 1;
        return this.j[i3 - jVar.f21749i];
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f21748h;
        j jVar = this.f21763k;
        int i9 = jVar.f21749i;
        if (i3 <= i9) {
            this.f21748h = i3 - 1;
            return jVar.previous();
        }
        int i10 = i3 - 1;
        this.f21748h = i10;
        return this.j[i10 - i9];
    }
}
