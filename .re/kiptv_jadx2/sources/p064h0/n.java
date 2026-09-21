package p064h0;

import D0.G;

public final class n extends l {

    public final G f22454k;

    public n(G g) {
        this.f22454k = g;
    }

    @Override
    public final Object next() {
        int i3 = this.j;
        this.j = i3 + 2;
        Object[] objArr = this.f22451h;
        return new b(this.f22454k, objArr[i3], objArr[i3 + 1]);
    }
}
