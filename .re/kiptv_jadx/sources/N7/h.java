package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Iterator f7444i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f7445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N7.m f7446l;

    public h(N7.i iVar) {
        this.f7443h = 0;
        this.f7446l = iVar;
        this.f7444i = iVar.f7447a.iterator();
        this.j = -1;
    }

    public void a() {
        java.lang.Object next;
        N7.i iVar;
        do {
            java.util.Iterator it = this.f7444i;
            if (!it.hasNext()) {
                this.j = 0;
                return;
            } else {
                next = it.next();
                iVar = (N7.i) this.f7446l;
            }
        } while (((java.lang.Boolean) iVar.f7449c.invoke(next)).booleanValue() != iVar.f7448b);
        this.f7445k = next;
        this.j = 1;
    }

    public void b() {
        java.util.Iterator it = this.f7444i;
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) ((N7.c) this.f7446l).f7436c.invoke(next)).booleanValue()) {
                this.j = 1;
                this.f7445k = next;
                return;
            }
        }
        this.j = 0;
    }

    public boolean c() {
        java.util.Iterator it;
        java.util.Iterator it2 = (java.util.Iterator) this.f7445k;
        if (it2 != null && it2.hasNext()) {
            this.j = 1;
            return true;
        }
        do {
            java.util.Iterator it3 = this.f7444i;
            if (!it3.hasNext()) {
                this.j = 2;
                this.f7445k = null;
                return false;
            }
            java.lang.Object next = it3.next();
            N7.j jVar = (N7.j) this.f7446l;
            it = (java.util.Iterator) jVar.f7452c.invoke(jVar.f7451b.invoke(next));
        } while (!it.hasNext());
        this.f7445k = it;
        this.j = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7443h) {
            case 0:
                if (this.j == -1) {
                    a();
                }
                return this.j == 1;
            case 1:
                int i3 = this.j;
                if (i3 == 1) {
                    return true;
                }
                if (i3 == 2) {
                    return false;
                }
                return c();
            default:
                if (this.j == -1) {
                    b();
                }
                return this.j == 1;
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f7443h) {
            case 0:
                if (this.j == -1) {
                    a();
                }
                if (this.j == 0) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object obj = this.f7445k;
                this.f7445k = null;
                this.j = -1;
                return obj;
            case 1:
                int i3 = this.j;
                if (i3 == 2) {
                    throw new java.util.NoSuchElementException();
                }
                if (i3 == 0 && !c()) {
                    throw new java.util.NoSuchElementException();
                }
                this.j = 0;
                java.util.Iterator it = (java.util.Iterator) this.f7445k;
                kotlin.jvm.internal.m.b(it);
                return it.next();
            default:
                if (this.j == -1) {
                    b();
                }
                if (this.j == 0) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object obj2 = this.f7445k;
                this.f7445k = null;
                this.j = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7443h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(N7.j jVar) {
        this.f7443h = 1;
        this.f7446l = jVar;
        this.f7444i = jVar.f7450a.iterator();
    }

    public h(N7.c cVar) {
        this.f7443h = 2;
        this.f7446l = cVar;
        this.f7444i = cVar.f7435b.iterator();
        this.j = -1;
    }
}
