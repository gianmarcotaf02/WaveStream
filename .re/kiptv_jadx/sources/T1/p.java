package T1;

/* JADX INFO: loaded from: classes.dex */
public final class p implements T1.o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9699i = -1;
    public int j = -1;

    public p(int i3) {
        this.f9698h = i3;
    }

    @Override // T1.o
    public final boolean c(java.lang.CharSequence charSequence, int i3, int i9, T1.w wVar) {
        int i10 = this.f9698h;
        if (i3 > i10 || i10 >= i9) {
            return i9 <= i10;
        }
        this.f9699i = i3;
        this.j = i9;
        return false;
    }

    @Override // T1.o
    public final java.lang.Object e() {
        return this;
    }
}
