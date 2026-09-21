package p064h0;

/* JADX INFO: loaded from: classes.dex */
public class e extends p064h0.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p089k0.i f22436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f22437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22439n;

    public e(p089k0.i iVar, p064h0.l[] lVarArr) {
        super(iVar.f24418i, lVarArr);
        this.f22436k = iVar;
        this.f22439n = iVar.f24419k;
    }

    public final void c(int i3, p064h0.k kVar, java.lang.Object obj, int i9) {
        int i10 = i9 * 5;
        p064h0.l[] lVarArr = this.f22434h;
        if (i10 <= 30) {
            int iT0 = 1 << com.google.common.util.concurrent.U.t0(i3, i10);
            if (kVar.h(iT0)) {
                lVarArr[i9].a(kVar.f22450d, java.lang.Integer.bitCount(kVar.f22447a) * 2, kVar.f(iT0));
                this.f22435i = i9;
                return;
            } else {
                int iT = kVar.t(iT0);
                p064h0.k kVarS = kVar.s(iT);
                lVarArr[i9].a(kVar.f22450d, java.lang.Integer.bitCount(kVar.f22447a) * 2, iT);
                c(i3, kVarS, obj, i9 + 1);
                return;
            }
        }
        p064h0.l lVar = lVarArr[i9];
        java.lang.Object[] objArr = kVar.f22450d;
        lVar.a(objArr, objArr.length, 0);
        while (true) {
            p064h0.l lVar2 = lVarArr[i9];
            if (kotlin.jvm.internal.m.a(lVar2.f22451h[lVar2.j], obj)) {
                this.f22435i = i9;
                return;
            } else {
                lVarArr[i9].j += 2;
            }
        }
    }

    @Override // p064h0.d, java.util.Iterator
    public final java.lang.Object next() {
        if (this.f22436k.f24419k != this.f22439n) {
            throw new java.util.ConcurrentModificationException();
        }
        if (!this.j) {
            throw new java.util.NoSuchElementException();
        }
        p064h0.l lVar = this.f22434h[this.f22435i];
        this.f22437l = lVar.f22451h[lVar.j];
        this.f22438m = true;
        return super.next();
    }

    @Override // p064h0.d, java.util.Iterator
    public final void remove() {
        if (!this.f22438m) {
            throw new java.lang.IllegalStateException();
        }
        boolean z6 = this.j;
        p089k0.i iVar = this.f22436k;
        if (!z6) {
            kotlin.jvm.internal.E.a(iVar).remove(this.f22437l);
        } else {
            if (!z6) {
                throw new java.util.NoSuchElementException();
            }
            p064h0.l lVar = this.f22434h[this.f22435i];
            java.lang.Object obj = lVar.f22451h[lVar.j];
            kotlin.jvm.internal.E.a(iVar).remove(this.f22437l);
            c(obj != null ? obj.hashCode() : 0, iVar.f24418i, obj, 0);
        }
        this.f22437l = null;
        this.f22438m = false;
        this.f22439n = iVar.f24419k;
    }
}
