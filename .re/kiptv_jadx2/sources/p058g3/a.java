package p058g3;

public final class a implements p061g6.a {

    public static final Object f21862c = new Object();

    public volatile b f21863a;

    public volatile Object f21864b;

    public static p061g6.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f21864b = f21862c;
        aVar.f21863a = bVar;
        return aVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f21864b;
        Object obj3 = f21862c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f21864b;
                if (obj == obj3) {
                    obj = this.f21863a.get();
                    Object obj4 = this.f21864b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f21864b = obj;
                    this.f21863a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
