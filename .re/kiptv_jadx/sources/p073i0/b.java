package p073i0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p078i6.AbstractC2259j implements p047f0.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p073i0.b f22743k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f22744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f22745i;
    public final p064h0.c j;

    static {
        p081j0.b bVar = p081j0.b.f23868a;
        f22743k = new p073i0.b(bVar, bVar, p064h0.c.j);
    }

    public b(java.lang.Object obj, java.lang.Object obj2, p064h0.c cVar) {
        this.f22744h = obj;
        this.f22745i = obj2;
        this.j = cVar;
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return this.j.containsKey(obj);
    }

    @Override // p078i6.AbstractC2250a
    public final int d() {
        p064h0.c cVar = this.j;
        cVar.getClass();
        return cVar.f22433i;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new N7.k(this.f22744h, this.j);
    }
}
