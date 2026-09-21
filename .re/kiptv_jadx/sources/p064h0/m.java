package p064h0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p064h0.l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f22453k;

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f22453k) {
            case 0:
                int i3 = this.j;
                this.j = i3 + 2;
                java.lang.Object[] objArr = this.f22451h;
                return new p064h0.a(objArr[i3], objArr[i3 + 1], 0);
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
