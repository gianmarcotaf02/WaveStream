package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p014b4.j {
    public final transient int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f17887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p014b4.j f17888l;

    public i(p014b4.j jVar, int i3, int i9) {
        this.f17888l = jVar;
        this.j = i3;
        this.f17887k = i9;
    }

    @Override // p014b4.f
    public final int e() {
        return this.f17888l.f() + this.j + this.f17887k;
    }

    @Override // p014b4.f
    public final int f() {
        return this.f17888l.f() + this.j;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        p014b4.AbstractC1659a.c(i3, this.f17887k);
        return this.f17888l.get(i3 + this.j);
    }

    @Override // p014b4.f
    public final java.lang.Object[] n() {
        return this.f17888l.n();
    }

    @Override // p014b4.j, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final p014b4.j subList(int i3, int i9) {
        p014b4.AbstractC1659a.f(i3, i9, this.f17887k);
        int i10 = this.j;
        return this.f17888l.subList(i3 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17887k;
    }
}
