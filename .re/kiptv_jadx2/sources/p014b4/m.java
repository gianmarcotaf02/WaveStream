package p014b4;

import java.util.Objects;

public final class m extends j {

    public static final m f17893l = new m(new Object[0], 0);
    public final transient Object[] j;

    public final transient int f17894k;

    public m(Object[] objArr, int i3) {
        this.j = objArr;
        this.f17894k = i3;
    }

    @Override
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.j;
        int i3 = this.f17894k;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override
    public final int e() {
        return this.f17894k;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final Object get(int i3) {
        AbstractC1659a.c(i3, this.f17894k);
        Object obj = this.j[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final Object[] n() {
        return this.j;
    }

    @Override
    public final int size() {
        return this.f17894k;
    }
}
