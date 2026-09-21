package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7454i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f7455k;

    public k(java.lang.Object obj, java.util.Map map) {
        this.f7453h = 2;
        this.j = obj;
        this.f7455k = map;
    }

    public void a() {
        java.lang.Object objInvoke;
        int i3 = this.f7454i;
        N7.l lVar = (N7.l) this.f7455k;
        if (i3 == -2) {
            objInvoke = ((kotlin.jvm.functions.Function0) lVar.f7457b).invoke();
        } else {
            p194x6.j jVar = (p194x6.j) lVar.f7458c;
            java.lang.Object obj = this.j;
            kotlin.jvm.internal.m.b(obj);
            objInvoke = jVar.invoke(obj);
        }
        this.j = objInvoke;
        this.f7454i = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        N7.t tVar;
        java.util.Iterator it;
        switch (this.f7453h) {
            case 0:
                if (this.f7454i < 0) {
                    a();
                }
                return this.f7454i == 1;
            case 1:
                break;
            case 2:
                return this.f7454i < ((java.util.Map) this.f7455k).size();
            case 3:
                return ((N7.n) this.j).hasNext();
            default:
                return ((N7.n) this.j).hasNext();
        }
        while (true) {
            int i3 = this.f7454i;
            tVar = (N7.t) this.f7455k;
            int i9 = tVar.f7468b;
            it = (java.util.Iterator) this.j;
            if (i3 < i9 && it.hasNext()) {
                it.next();
                this.f7454i++;
            }
        }
        return this.f7454i < tVar.f7469c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        N7.t tVar;
        java.util.Iterator it;
        switch (this.f7453h) {
            case 0:
                if (this.f7454i < 0) {
                    a();
                }
                if (this.f7454i == 0) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object obj = this.j;
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f7454i = -1;
                return obj;
            case 1:
                break;
            case 2:
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object obj2 = this.j;
                this.f7454i++;
                java.lang.Object obj3 = ((java.util.Map) this.f7455k).get(obj2);
                if (obj3 != null) {
                    this.j = ((p073i0.a) obj3).f22742b;
                    return obj2;
                }
                throw new java.util.ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            case 3:
                return ((N7.n) this.j).next();
            default:
                return ((N7.n) this.j).next();
        }
        while (true) {
            int i3 = this.f7454i;
            tVar = (N7.t) this.f7455k;
            int i9 = tVar.f7468b;
            it = (java.util.Iterator) this.j;
            if (i3 < i9 && it.hasNext()) {
                it.next();
                this.f7454i++;
            }
        }
        int i10 = this.f7454i;
        if (i10 >= tVar.f7469c) {
            throw new java.util.NoSuchElementException();
        }
        this.f7454i = i10 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7453h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                int i3 = this.f7454i;
                if (i3 != -1) {
                    ((p136q.G) this.f7455k).f26321i.h(i3);
                    this.f7454i = -1;
                    return;
                }
                return;
            default:
                int i9 = this.f7454i;
                if (i9 != -1) {
                    ((p136q.K) this.f7455k).f26345i.m(i9);
                    this.f7454i = -1;
                    return;
                }
                return;
        }
    }

    public k(N7.t tVar) {
        this.f7453h = 1;
        this.f7455k = tVar;
        this.j = tVar.f7467a.iterator();
    }

    public k(N7.l lVar) {
        this.f7453h = 0;
        this.f7455k = lVar;
        this.f7454i = -2;
    }

    public k(p136q.K k9) {
        this.f7453h = 4;
        this.f7455k = k9;
        this.f7454i = -1;
        this.j = E8.d.T(new p136q.J(k9, this, null));
    }

    public k(p136q.G g) {
        this.f7453h = 3;
        this.f7455k = g;
        this.f7454i = -1;
        this.j = E8.d.T(new p136q.F(g, this, null));
    }
}
