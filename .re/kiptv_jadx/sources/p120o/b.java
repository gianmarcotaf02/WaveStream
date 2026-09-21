package p120o;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p120o.e implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p120o.c f25952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p120o.c f25953i;
    public final /* synthetic */ int j;

    public b(p120o.c cVar, p120o.c cVar2, int i3) {
        this.j = i3;
        this.f25952h = cVar2;
        this.f25953i = cVar;
    }

    @Override // p120o.e
    public final void a(p120o.c cVar) {
        p120o.c cVar2;
        p120o.c cVarB = null;
        if (this.f25952h == cVar && cVar == this.f25953i) {
            this.f25953i = null;
            this.f25952h = null;
        }
        p120o.c cVar3 = this.f25952h;
        if (cVar3 == cVar) {
            switch (this.j) {
                case 0:
                    cVar2 = cVar3.f25956k;
                    break;
                default:
                    cVar2 = cVar3.j;
                    break;
            }
            this.f25952h = cVar2;
        }
        p120o.c cVar4 = this.f25953i;
        if (cVar4 == cVar) {
            p120o.c cVar5 = this.f25952h;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f25953i = cVarB;
        }
    }

    public final p120o.c b(p120o.c cVar) {
        switch (this.j) {
            case 0:
                return cVar.j;
            default:
                return cVar.f25956k;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25953i != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        p120o.c cVar = this.f25953i;
        p120o.c cVar2 = this.f25952h;
        this.f25953i = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
