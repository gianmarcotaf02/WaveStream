package p058g3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p061g6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f21862c = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile p058g3.b f21863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile java.lang.Object f21864b;

    public static p061g6.a a(p058g3.b bVar) {
        if (bVar instanceof p058g3.a) {
            return bVar;
        }
        p058g3.a aVar = new p058g3.a();
        aVar.f21864b = f21862c;
        aVar.f21863a = bVar;
        return aVar;
    }

    @Override // p061g6.a
    public final java.lang.Object get() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.f21864b;
        java.lang.Object obj3 = f21862c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f21864b;
                if (obj == obj3) {
                    obj = this.f21863a.get();
                    java.lang.Object obj4 = this.f21864b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f21864b = obj;
                    this.f21863a = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
