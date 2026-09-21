package p064h0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p064h0.l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D0.G f22454k;

    public n(D0.G g) {
        this.f22454k = g;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i3 = this.j;
        this.j = i3 + 2;
        java.lang.Object[] objArr = this.f22451h;
        return new p064h0.b(this.f22454k, objArr[i3], objArr[i3 + 1]);
    }
}
