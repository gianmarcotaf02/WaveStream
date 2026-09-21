package p120o;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p120o.e implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p120o.c f25957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25958i = true;
    public final /* synthetic */ p120o.f j;

    public d(p120o.f fVar) {
        this.j = fVar;
    }

    @Override // p120o.e
    public final void a(p120o.c cVar) {
        p120o.c cVar2 = this.f25957h;
        if (cVar == cVar2) {
            p120o.c cVar3 = cVar2.f25956k;
            this.f25957h = cVar3;
            this.f25958i = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f25958i) {
            return this.j.f25959h != null;
        }
        p120o.c cVar = this.f25957h;
        return (cVar == null || cVar.j == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f25958i) {
            this.f25958i = false;
            this.f25957h = this.j.f25959h;
        } else {
            p120o.c cVar = this.f25957h;
            this.f25957h = cVar != null ? cVar.j : null;
        }
        return this.f25957h;
    }
}
