package p136q;

/* JADX INFO: loaded from: classes.dex */
public final class U extends p078i6.A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p136q.T f26359i;

    public U(p136q.T t9) {
        this.f26359i = t9;
    }

    @Override // p078i6.A
    public final int a() {
        int i3 = this.f26358h;
        this.f26358h = i3 + 1;
        return this.f26359i.e(i3);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26358h < this.f26359i.g();
    }
}
