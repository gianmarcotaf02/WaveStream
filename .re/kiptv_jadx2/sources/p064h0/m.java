package p064h0;

public final class m extends l {

    public final int f22453k;

    @Override
    public final Object next() {
        switch (this.f22453k) {
            case 0:
                int i3 = this.j;
                this.j = i3 + 2;
                Object[] objArr = this.f22451h;
                return new a(objArr[i3], objArr[i3 + 1], 0);
            case 1:
                int i9 = this.j;
                this.j = i9 + 2;
                return this.f22451h[i9];
            default:
                int i10 = this.j;
                this.j = i10 + 2;
                return this.f22451h[i10 + 1];
        }
    }
}
