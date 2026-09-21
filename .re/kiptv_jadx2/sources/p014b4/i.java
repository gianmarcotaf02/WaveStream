package p014b4;

public final class i extends j {
    public final transient int j;

    public final transient int f17887k;

    public final j f17888l;

    public i(j jVar, int i3, int i9) {
        this.f17888l = jVar;
        this.j = i3;
        this.f17887k = i9;
    }

    @Override
    public final int e() {
        return this.f17888l.f() + this.j + this.f17887k;
    }

    @Override
    public final int f() {
        return this.f17888l.f() + this.j;
    }

    @Override
    public final Object get(int i3) {
        AbstractC1659a.c(i3, this.f17887k);
        return this.f17888l.get(i3 + this.j);
    }

    @Override
    public final Object[] n() {
        return this.f17888l.n();
    }

    @Override
    public final j subList(int i3, int i9) {
        AbstractC1659a.f(i3, i9, this.f17887k);
        int i10 = this.j;
        return this.f17888l.subList(i3 + i10, i9 + i10);
    }

    @Override
    public final int size() {
        return this.f17887k;
    }
}
