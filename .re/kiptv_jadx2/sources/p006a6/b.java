package p006a6;

public final class b implements d {

    public static final Object f15411c = new Object();

    public volatile d f15412a;

    public volatile Object f15413b = f15411c;

    public b(d dVar) {
        this.f15412a = dVar;
    }

    public static b a(d dVar) {
        if (dVar instanceof b) {
            return (b) dVar;
        }
        dVar.getClass();
        return new b(dVar);
    }

    public static d b(d dVar) {
        return dVar instanceof b ? dVar : new b(dVar);
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f15413b;
        Object obj3 = f15411c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f15413b;
            if (obj == obj3) {
                obj = this.f15412a.get();
                Object obj4 = this.f15413b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f15413b = obj;
                this.f15412a = null;
            }
        }
        return obj;
    }
}
