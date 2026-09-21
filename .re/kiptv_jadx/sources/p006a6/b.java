package p006a6;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements p006a6.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f15411c = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile p006a6.d f15412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile java.lang.Object f15413b = f15411c;

    public b(p006a6.d dVar) {
        this.f15412a = dVar;
    }

    public static p006a6.b a(p006a6.d dVar) {
        if (dVar instanceof p006a6.b) {
            return (p006a6.b) dVar;
        }
        dVar.getClass();
        return new p006a6.b(dVar);
    }

    public static p006a6.d b(p006a6.d dVar) {
        return dVar instanceof p006a6.b ? dVar : new p006a6.b(dVar);
    }

    @Override // p061g6.a
    public final java.lang.Object get() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.f15413b;
        java.lang.Object obj3 = f15411c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f15413b;
            if (obj == obj3) {
                obj = this.f15412a.get();
                java.lang.Object obj4 = this.f15413b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f15413b = obj;
                this.f15412a = null;
            }
        }
        return obj;
    }
}
