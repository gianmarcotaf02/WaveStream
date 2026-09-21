package T1;

public final class p implements o {

    public final int f9698h;

    public int f9699i = -1;
    public int j = -1;

    public p(int i3) {
        this.f9698h = i3;
    }

    @Override
    public final boolean c(CharSequence charSequence, int i3, int i9, w wVar) {
        int i10 = this.f9698h;
        if (i3 > i10 || i10 >= i9) {
            return i9 <= i10;
        }
        this.f9699i = i3;
        this.j = i9;
        return false;
    }

    @Override
    public final Object e() {
        return this;
    }
}
